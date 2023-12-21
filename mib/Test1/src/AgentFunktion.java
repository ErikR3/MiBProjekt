
import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author johan
 */
public class AgentFunktion {
    
    private static InfDB idb;
    
    public AgentFunktion(InfDB idb) {
        
        this.idb = idb;
    }
            
    
    public void registreraNyAgent(String namn, String telefon, String datum,String epost,String losenord,String omrade)
    {
        try {
        String fraga = "Insert into agent (Namn,Telefon,Anstallningsdatum,Administrator,Epost,Losenord,Omrade) ";
        String values = "Values ('" + namn + "','" + telefon + "','" + datum + "','N','" + epost + "','" + losenord + "','" + omrade + ",)";
        String sql = fraga + values;
        idb.insert (sql);
        }
        catch (InfException ex){
           Logger.getLogger(AgentFunktion.class.getName()).log(Level.SEVERE, null, ex);
        
    }
    
    /**
     *
     * @param nyttLosenord
     */
   
            
    
            }
}