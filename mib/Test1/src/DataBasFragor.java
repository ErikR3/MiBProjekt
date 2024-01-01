
import oru.inf.InfDB;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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
            
            for(String s : platsID){
            try{
            raknadeAliens = idb.fetchRows("select Ansvarig_Agent, count(Ansvarig_Agent) as row_count from alien where plats like '" + s + "' group by Ansvarig_Agent order by row_count DESC");
            } catch (InfException e){
                e.printStackTrace();
            }
            }
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
        
        public static String getOmradesChef(String Omrade){
            String omradesID = "0";
            String chef = "0";
            String chefNamn = "0";
            
            omradesID = getOmradesID(Omrade);
            
            try{
                chef = idb.fetchSingle("select Agent_ID from omradeschef where Omrade like '" + omradesID + "'");
            } catch (InfException ex){
                ex.printStackTrace();
            }
            
            try{
                chefNamn = idb.fetchSingle("select Namn from agent where Agent_ID like '" + chef + "'");
            } catch(InfException exc){
                exc.printStackTrace();
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
}
