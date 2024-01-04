
import oru.inf.InfDB;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import oru.inf.InfException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Erik
 */
public class DataBasFragor {
    
    private static InfDB idb;
    
    public DataBasFragor(InfDB idb){
        this.idb = idb;
    }
    
        public static int getRadAntal(int index)
    {
        int antal = 0;
        String nyFraga = dataEntitet(index);
        if (Validering.isRatt(nyFraga)){
            try{
                ArrayList<String> kolumnnamn = idb.fetchColumn(nyFraga);
                antal = kolumnnamn.size();
            } catch (InfException E){
                E.printStackTrace();
            }
        }
        JOptionPane.showMessageDialog(null, antal);
        return antal;
    }
    
        private static String dataEntitet(int index)
    {
        String fraga;
        if(index == 0){
            fraga = "SELECT * FROM agent";
        } else if (index == 1){
            fraga = "SELECT * FROM alien";
        } else if (index == 2){
            fraga = "SELECT * FROM utrustning";
        } else {
            fraga = "";
        }
        return fraga;
    }
        
        private static ArrayList<String> getKolumnerFran(String tabellNamn) throws InfException{
            String fraga = "SELECT * FROM " + tabellNamn;
            
            return idb.fetchColumn(fraga);
        }
        
        //Hämtar alla värden från första kolumnen
        public static void getID(String tabellNamn){
            try{
                ArrayList<String> allaKolumner = getKolumnerFran(tabellNamn);
                //Här händer något med listan av en specifik kolumn, hämtas genom denna funktion
                for (String kolumn : allaKolumner){
                    JOptionPane.showMessageDialog(null, kolumn);
                } 
            } catch(InfException e){
                        e.printStackTrace();
                };
        }
        
        public static String[] getKolumnNamn(String tabellNamn){
            String[] kolumnnamn = null;
            HashMap<String, String> agent = new HashMap<>();
            try{
                agent = idb.fetchRow("SELECT * FROM " + tabellNamn);   
            } catch(InfException e){
                e.printStackTrace();
            }
            
            kolumnnamn = agent.keySet().toArray(new String[0]);
            for(String s : kolumnnamn){
                JOptionPane.showMessageDialog(null, s);
            }
            
            return kolumnnamn;
            
        }
        
        public static ArrayList<HashMap<String, String>> getRadVarde(String tabellNamn){
            int index = 0;
            ArrayList<HashMap<String, String>> allaVarden = new ArrayList<>();
            try{
                allaVarden = idb.fetchRows(dataEntitet(index));
            } catch(InfException e){
                e.printStackTrace();
            }
            
            return allaVarden;
        }
        
        
        public static ArrayList<String> getPlats(String omradeID){
            ArrayList<String> platsID = null;
            
            try{
                platsID = idb.fetchColumn("Select Plats_ID from plats where Finns_i like '" + omradeID + "'");
            } catch (InfException e){
                e.printStackTrace();
            }
            
            return platsID;
        }
        
        
        //select COUNT(DISTINCT Ansvarig_Agent) from alien
        public static ArrayList<HashMap<String, String>> getAntalAliens(String omrade)
        {
            String omradesID = getOmradesID(omrade);
            ArrayList<String> platsID = getPlats(omradesID);
            ArrayList<HashMap<String, String>> raknadeAliens = null;
            StringBuilder allaPlatser = new StringBuilder();
            
            
            for(String s : platsID){
                allaPlatser.append("'" + s + "'").append(", ");
            }
                allaPlatser.setLength(allaPlatser.length() - 2);
            
            try{
            raknadeAliens = idb.fetchRows("select Ansvarig_Agent, count(Ansvarig_Agent) as row_count from alien where plats in (" + allaPlatser + ") group by Ansvarig_Agent order by row_count DESC");
            } catch (InfException e){
                e.printStackTrace();
            }
            System.out.println(allaPlatser);
            System.out.println(raknadeAliens);
                
            return raknadeAliens;
        }
        
        public static String getOmradesID(String omrade){
            String omradesID = "0";
            try {
                omradesID = idb.fetchSingle("select Omrades_ID from omrade where Benamning like '" + omrade + "'");
            } catch (InfException e){
                e.printStackTrace();
            }
            return omradesID;
        }
        
        public static String getOmradesChefID(String Omrade){
            String omradesID = "0";
            String chef = "0";
            
            omradesID = getOmradesID(Omrade);
            
            try{
                chef = idb.fetchSingle("select Agent_ID from omradeschef where Omrade like '" + omradesID + "'");
            } catch (InfException ex){
                ex.printStackTrace();
            }

            
            return chef;
        }
        
        public static String getOmradesChefNamn(String omrade){
            String chefNamn = "";
            String id = getOmradesChefID(omrade);
            
            try{
                chefNamn = idb.fetchSingle("Select Namn from agent where Agent_ID like '" + id + "'");
            } catch(InfException e){
                e.printStackTrace();
            }
            
            return chefNamn;
        }
        
        public static ArrayList<String> getAllaAliensPaEnPlats(String platsNamn){
             ArrayList<String> aliens = new ArrayList<>();
             String platsID = null;
             
             
             try{
                 platsID = idb.fetchSingle("select Plats_ID from plats where Benamning like '" + platsNamn + "'");
             } catch (InfException e){
                 e.printStackTrace();
             }
             try{
                 aliens = idb.fetchColumn("select Alien_ID from alien where plats = '" + platsID + "'");
             } catch (InfException ex){
                 ex.printStackTrace();
             }
             
             System.out.println(aliens);
             return aliens;
        }
        
        public static ArrayList<String> getAllaAliensAvRas(String rasNamn){
            ArrayList<String> aliens = new ArrayList<>();
            try{
                aliens = idb.fetchColumn("select Alien_ID from " + rasNamn);
            } catch (InfException e){
                e.printStackTrace();
            }
            
            return aliens;
        }
        
        public static ArrayList<String> getAllaAliensMellanDatum(String startdatum, String slutdatum){
            ArrayList<String> aliens = new ArrayList<>();
            try{
                aliens = idb.fetchColumn("select Alien_ID from alien where Registreringsdatum between '" + startdatum + "' and '" + slutdatum + "'");
            } catch (InfException e){
                e.printStackTrace();
            }
            
            return aliens;
        }
        
        public static String getAgentID(String index){
            String ID = null;
            
            try{
                ID = idb.fetchSingle("Select Agent_ID from agent where Namn like '" + index + "'");
            } catch (InfException e){
                e.printStackTrace();
            }
            return ID;
        }
        
        public static HashMap<String, String> getAlltOmEnAgent(String id){
            HashMap<String, String> HM = new HashMap<>();
                    
            try{
                HM = idb.fetchRow("select Agent_ID, Namn, Telefon, Anstallningsdatum, Administrator, Epost, Omrade from agent where Agent_ID like '" + id + "'");
            } catch (InfException e){
                e.printStackTrace();
            }
            System.out.println(HM);
            
            return HM;
        }
        
        public static ArrayList<HashMap<String, String>> getUtkvitteradUtrustning(String agentID){
            ArrayList<HashMap<String, String>> AL = new ArrayList<>();
            String[] utrustningNamn;
            
            try{
                AL = idb.fetchRows("select innehar_utrustning.Utrustnings_ID, utrustning.Benamning from innehar_utrustning\n" +
                                   "inner join utrustning on innehar_utrustning.Utrustnings_ID = utrustning.Utrustnings_ID\n" +
                                   "where Agent_ID like '" + agentID + "'");
            } catch (InfException e){
                e.printStackTrace();
            }
            
            return AL;
        }
        
        public static String hittaRasen (String epost) {
        //Metod för att hitta rasen som en alien tillhör
        String ras = "";
        try {
            String alienID = idb.fetchSingle("select alien_id from alien where epost = '" + epost + "'");
            Boolean hittad = false;
            
            //Söker förts igenom rasen boglodite, ifall hittad söker den inte igenom fler, annars fortsätter den söka i nästa
            ArrayList<String> rasIDBog = idb.fetchColumn("select alien_ID from boglodite");
            for (String id : rasIDBog){
                if (alienID.equals(id)) {
                    ras = "Boglodite";
                    hittad = true;
                }
            }
            //Söker igenom squid
            if (!hittad) {
                ArrayList<String> rasIDSquid = idb.fetchColumn("select alien_ID from squid");
                for (String id : rasIDSquid){
                    if (alienID.equals(id)) {
                        ras = "Squid";
                        hittad = true;
                    }
                }
            }
            //Söker igenom worm
            if (!hittad) {
                ArrayList<String> rasIDWorm = idb.fetchColumn("select alien_ID from worm");
                for (String id : rasIDWorm){
                    if (alienID.equals(id)) {
                        ras = "Worm";
                    }
                }
            }
        } catch (InfException ex) {
            Logger.getLogger(AndraRasPaAlien.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Returnerar den hittade rasen, om ingen ras hittad är grundvärdet en tom sträng
        return ras;
    }
    
    public static void taBortRas(String epost) {
        try {
        String alienID = idb.fetchSingle("select alien_id from alien where epost = '" + epost + "'");
        //Hämtar den tillhörande rasen, finns det en så tas den bort ur systemet.
        if (!hittaRasen(epost).isEmpty()){
          idb.delete("delete from "+hittaRasen(epost)+" where alien_id ="+alienID);
        }
        } catch (InfException ex) {
            Logger.getLogger(AndraRasPaAlien.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public static boolean hittaChef(String epost) {
        //Metod för att hitta olika chefspositioner som en agent kan tillhöra 
        boolean hittad = false;
        try {
            //hämta agentID
            String agentID = idb.fetchSingle("select agent_id from agent where epost = '" + epost + "'");
           
            //Söker igenom områdeschef och ger meddelande om agenten finns där      
            ArrayList<String> omradesChefIDs = idb.fetchColumn("select agent_ID from omradeschef");
            for (String id : omradesChefIDs){
                if (agentID.equals(id)) {
                    String omrade = idb.fetchSingle("select benamning from omrade join omradeschef on omrade = omrades_id where agent_id = "+id);
                    JOptionPane.showMessageDialog(null, "OBS! Agenten är chef över "+omrade+", en ny agent måste tillsättas som chef innan agenten tas bort."); 
                    hittad = true;
                }
            }
            //Söker igenom kontorschef och ger meddelande om agenten finns där  
            ArrayList<String> kontorsChefIDS = idb.fetchColumn("select agent_ID from kontorschef");
            for (String id : kontorsChefIDS){
                if (agentID.equals(id)) {
                    JOptionPane.showMessageDialog(null, "OBS! Agenten är kontorschef, en ny agent måste tillsättas som chef innan agenten tas bort.");
                    hittad = true;
                }
            }
        } catch (InfException ex) {
            Logger.getLogger(AndraRasPaAlien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hittad;
    }
    
    public static void taBortFaltagent(String epost) {
        try {
            //hämta agentID
            String agentID = idb.fetchSingle("select agent_id from agent where epost = '" + epost + "'");
            
            //Söker först igenom fältagent och tar sedan bort om agenten finns där
            ArrayList<String> faltAgentIDs = idb.fetchColumn("select agent_ID from faltagent");
            for (String id : faltAgentIDs){
                if (agentID.equals(id)) {
                    idb.delete("delete from faltagent where agent_id ="+agentID); 
                }
            }
        } catch (InfException ex) {
            Logger.getLogger(DataBasFragor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void taBortUtrustningForEnAgent(String epost) {
        try {
            //hämta agentID
            String agentID = idb.fetchSingle("select agent_id from agent where epost = '" + epost + "'");
            
            //Söker först igenom "innehar_utrustning" och tar sedan bort, om agenten finns där
            ArrayList<String> utrustningAgentIDs = idb.fetchColumn("select agent_ID from innehar_utrustning");
            for (String id : utrustningAgentIDs){
                if (agentID.equals(id)) {
                    idb.delete("delete from innehar_utrustning where agent_id ="+agentID); 
                }
            }
        } catch (InfException ex) {
            Logger.getLogger(DataBasFragor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
