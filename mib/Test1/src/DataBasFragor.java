
import oru.inf.InfDB;
import java.util.ArrayList;
import java.util.HashMap;
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
            int i = 0;
            String[] kolumnnamn = null;
            HashMap<String, String> agent1 = new HashMap<>();
            try{
                agent1 = idb.fetchRow("SELECT * FROM " + tabellNamn);   
            } catch(InfException e){
                e.printStackTrace();
            }
            
            String[] kolumnamn = agent1.keySet().toArray(new String[0]);
            
            return kolumnnamn;
            
        }
}
