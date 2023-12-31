
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
    
    private static String allmanID;
    private static boolean adminStatus;
    private static InfDB idb;
    private static String mittOmrade;
    private static boolean alienStatus = false;
    
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
    
    //Metod för att kontrolla att inmatat värde för namn inte är större än vad databasen tillåter
    public static boolean isNamnRattLangd(String namn) {
        boolean resultat = false;
        if (namn.length()<=20) {
        resultat = true;   
        }  
        else {
          JOptionPane.showMessageDialog(null, "Ett namn får max bestå av 20 tecken.");  
        }
        return resultat;
    }
    
    //Metod för att kontrolla att inmatat värde för epost inte är större än vad databasen tillåter
    public static boolean isEpostRattLangd(String epost) {
        boolean resultat = false;
        if (epost.length()<=20) {
        resultat = true;   
        }  
        else {
          JOptionPane.showMessageDialog(null, "En Epost får max bestå av 20 tecken.");  
        }
        return resultat;
    }
    
    //Metod för att kontrolla att inmatat värde för lösenord inte är större än vad databasen tillåter
    public static boolean isLosenRattLangd(String losen) {
        boolean resultat = false;
        if (losen.length()<=6) {
        resultat = true;   
        }  
        else {
          JOptionPane.showMessageDialog(null, "Ett lösenord får max bestå av 6 tecken.");  
        }
        return resultat;
    }
    
    //Metod för att kontrolla att inmatat värde för telefonnummer inte är större än vad databasen tillåter
    public static boolean isTelefonRattLangd(String nummer) {
        boolean resultat = false;
        if (nummer.length()<=30) {
        resultat = true;   
        }  
        else {
          JOptionPane.showMessageDialog(null, "Ett telefonnummer får max bestå av 30 tecken.");  
        }
        return resultat;
    }
    
    //Metod för att kontrolla att inmatat värde för kontorsbetäckning inte är större än vad databasen tillåter
    public static boolean isKontorBetackningRattLangd(String namn) {
        boolean resultat = false;
        if (namn.length()<=25) {
        resultat = true;   
        }  
        else {
          JOptionPane.showMessageDialog(null, "Kontorsbetäckningen får max bestå av 25 tecken.");  
        }
        return resultat;
    }
    
    //Metod för att kontrollera om en alienEpost redan finns
    public static boolean alienEpostFinns(String textAttKolla) {
   boolean resultat = false;
        try {         
            ArrayList<String> eposts = idb.fetchColumn("select epost from alien"); 
            for (String enEpost : eposts) {
                if (enEpost.equals(textAttKolla)) {               
                resultat = true;
                JOptionPane.showMessageDialog(null, "Det finns redan en alien med denna Epost!"); 
                }
            }
        } catch (InfException ex) {
            Logger.getLogger(Validering.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultat;
        }

    //Metod för att kontrollera om en agents epost finns i systemet
    public static boolean agentEpostFinnsSok(JTextField rutaAttKolla) {
            boolean resultat = false;
        try {         
            String epost = rutaAttKolla.getText();
            ArrayList<String> eposts = idb.fetchColumn("select epost from agent"); 
            for (String enEpost : eposts) {
                if (enEpost.equals(epost)) {               
                resultat = true;
                }
            }
            if (!resultat) {
               JOptionPane.showMessageDialog(null, "Det finns ingen agent med denna Epost"); 
            }
        } catch (InfException ex) {
            Logger.getLogger(Validering.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultat;
    } 
    
    //Metod för att kontrollera om en aliens epost finns i systemet
    public static boolean alienEpostFinnsSok(JTextField rutaAttKolla) {
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
    
    public static void setIDInloggning(String index)
    {
        allmanID = index;
    }
    
    public static String getIDInloggning()
    {
        return allmanID;
    }
    
    public static void setAdminStatus(boolean index){
        adminStatus = index;
    }
    
    public static boolean getAdminStatus(){
        return adminStatus;
    }
    
    public static void setOmrade(String s){
        mittOmrade = s;
    }
    
    public static String getOmrade(){
        return mittOmrade;
    }
    
    public static void setAlienStatus(boolean x){
        alienStatus = x; 
    }
    
    public static boolean getAlienStatus(){
        return alienStatus;
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
    
    public static boolean isDatum(String s){
        boolean resultat = true;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        try{
            LocalDate date = LocalDate.parse(s, formatter);
            String kollaFebruari;
            
            if(s.length() == 10){
                kollaFebruari = s.substring(s.length() - 5);
                if(kollaFebruari.equals("02-29") || kollaFebruari.equals("02-30") ||kollaFebruari.equals("02-31")){
                    throw new DateTimeParseException("Ogiltigt datum i februari", s, 0);
                }
            }
        } catch (DateTimeParseException e){
            resultat = false;
            JOptionPane.showMessageDialog(null, "Datum måste skrivas i formatet: 'YYYY-MM-DD' och utan ogiltiga datum!");
        }
        
        return resultat;
    }
    public static boolean agentEpostFinns(String textAttKolla) {
   boolean resultat = false;
        try {         
            ArrayList<String> eposts = idb.fetchColumn("select Epost from agent"); 
            for (String enEpost : eposts) {
                if (enEpost.equals(textAttKolla)) {               
                resultat = true;
                JOptionPane.showMessageDialog(null, "Det finns redan en agent med denna Epost!"); 
                }
            }
        } catch (InfException ex) {
            Logger.getLogger(Validering.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultat;
        }
    
//    Kollar om ett textfält är tomt utan att ge felmeddelande
    public static boolean textFaltHarVardeUtanMsg(JTextField rutaAttKolla) {
        boolean resultat = true;

        if (rutaAttKolla.getText().isEmpty()) {
            resultat = false;
        }
        return resultat;
    }
}
