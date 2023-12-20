/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author johan
 */
public class AgentFunktion {
    
    
    public static void registreraNyAgent(String namn, String telefon, String datum,String epost,String losenord,String omrade)
    {
        String fraga = "Insert into agent (Namn,Telefon,Anstallningsdatum,Administrator,Epost,Losenord,Omrade) ";
        String values = "Values ('" + namn + "','" + telefon + "','" + datum + "','N','" + epost + "','" + losenord + "','" + omrade + ",)";
        String sql = fraga + values;
        
    }
    
    /**
     *
     * @param nyttLosenord
     */
   
            
    
            }