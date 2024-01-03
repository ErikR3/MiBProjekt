
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author hanna
 */
public class Validering {
    
    private static String AgentID;
    private static boolean adminStatus;
    private static InfDB idb;
    private static String mittOmrade;
    
    public Validering(InfDB idb){
        this.idb = idb;
    }

    //Metod för att kontrollera om ett textfält är tomt
    public static boolean textFaltHarVarde(JTextField rutaAttKolla) {
        boolean resultat = true;

        if (rutaAttKolla.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Inmatningsrutan är tom!");
            resultat = false;
            rutaAttKolla.requestFocus();
        }
        return resultat;
    }

    //Metod för att kontrollera om en aliens epost finns i systemet
    public static boolean alienEpostFinns(JTextField rutaAttKolla) {
            boolean resultat = false;
        try {         
            String epost = rutaAttKolla.getText();
            ArrayList<String> eposts = idb.fetchColumn("select epost from alien"); 
            for (String enEpost : eposts) {
                if (enEpost.equals(epost)) {               
                resultat = true;
                }
            }
            if (!resultat) {
               JOptionPane.showMessageDialog(null, "Det finns ingen alien med denna Epost"); 
            }
        } catch (InfException ex) {
            Logger.getLogger(Validering.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultat;
    } 

    //Metod för att kontrollera om ett värde är ett heltal
    public static boolean isHeltal(JTextField rutaAttKolla) {
        boolean resultat = true;

        try {
            String inStrang = rutaAttKolla.getText();
            Integer.parseInt(inStrang);
            rutaAttKolla.requestFocus();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Var god ange ett heltal!");
            resultat = false;
        }
        return resultat;
    }
    
     //Metod för att kontrollera om ett värde är av typen double
    public static boolean isDouble(JTextField rutaAttKolla) {
        boolean resultat = true;
        try {
            String inStrang = rutaAttKolla.getText();
            Double.parseDouble(inStrang);
            rutaAttKolla.requestFocus();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Var god ange ett tal. Vid decimaler använd . för att skilja");
            resultat = false;
        }
        return resultat;
    }
    
    //Metod för att kolla ifall något går fel när man försöker instansiera en lista
    public static boolean isRatt(String i)
    {
        boolean resultat = true;
        if(i.isEmpty()){
            JOptionPane.showMessageDialog(null, "Inmatningen är fel!");
            resultat = false;
        }
        return resultat;
    }
    
    public static void setAgentInloggning(String index)
    {
        AgentID = index;
    }
    
    public static String getAgentInloggning()
    {
        return AgentID;
    }
    
    public static void setAdminStatus(boolean index){
        adminStatus = index;
    }
    
    public static boolean getAdminStatus(){
        return adminStatus;
    }
    
    public static void setOmrade(String s){
        mittOmrade = s;
        System.out.println(mittOmrade);
    }
    
    public static String getOmrade(){
        return mittOmrade;
    }
    
    public static boolean notOmrade(JTextField checkaDenna){
        boolean resultat = true;
        String omradetest = null;
        String omrade = checkaDenna.getText();
        
        try{
            omradetest = idb.fetchSingle("select Benamning from omrade where Benamning like '" + omrade + "'");
        } catch (InfException e){
            e.printStackTrace();
        }
        
        if(omradetest == null){
            resultat = false;
            JOptionPane.showMessageDialog(null, "Omradet finns ej.");
        }
        
        return resultat;
    }
    
    public boolean isDatum(String s){
        boolean resultat = true;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        try{
            LocalDate date = LocalDate.parse(s, formatter);
        } catch (DateTimeParseException e){
            resultat = false;
        }
        
        return resultat;
    }
}
