/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;

public class TabellKlass extends JFrame {
    private JTable tabell;
    
    
    //Här tar koden in olika variabler som "namnger" de olika variablerna i tabellen
    public TabellKlass(int kolumnAntal, String[] kolumnensNamn, String tabellNamn){
        setTitle(tabellNamn);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Här isntansieras tabellen
        tabell = new JTable(new DefaultTableModel());
        
        //Behövs för att man ska kunna se den
        JScrollPane x = new JScrollPane(tabell);
        add(x);
        
        //Kallar på skapaTabell metoden(kom inte på bättre namn)(samma med dataRader)
        //Skapar en instans av DefaultTableModel
        //Överför kolumnantalet och en array av kolumnnamn
        DefaultTableModel serUtSahar = skapaTabell(kolumnAntal, kolumnensNamn);
        
        //Den här kodraden gör så att tabellen ser ut värdena i serUtSahar anger
        tabell.setModel(serUtSahar);
        
        //Object[] rad1 = {"Erik", 20, "Stockholm"};
        
        //Den här instansierar objekten i en till objekt array
        //Så rad1, rad2, rad3 och deras värden är själva objekt men nu även deras objekt en del av en array
        //(jag är för trött för att förklara det här så man förstår)
        //laggTillInfo(new Object[][]{rad1, rad2, rad3});
        
        //visa
        setVisible(true);
    }
    private DefaultTableModel skapaTabell(int kolumnAntal, String[] kolumnensNamn) 
    {   
       //Först instansierar jag en Vector, lagrar kolumnnamnen(strängar)
       Vector<String> forKolumn = new Vector<>();
       
       //Här itererar jag igenom alla kolumners namn för att lägga till i vectorn
       for (String kolumnNamn : kolumnensNamn){
           forKolumn.add(kolumnNamn);
       }
       
       //kommer behöva en vector för att lagra rader och deras data
       Vector<Vector<Object>> dataVector = new Vector<>();
       
       //här returnerar jag kolumnnamnen(forKolumn) och en för rader(dataVector)
       return new DefaultTableModel(dataVector, forKolumn);
    }
    
    //Lägger till värden inom tabellen
    private void laggTillInfo(ArrayList<HashMap<String, String>> rader){
        Object[] radVärden = null;
        //Vi returnerar tabellen som är instansierad nu
    DefaultTableModel nyTabell = (DefaultTableModel) tabell.getModel();
        
    //Denna loop itererar igenom raderna och lägger till raden inuti arrayen radvärden
    for(HashMap<String, String> hm : rader){
        hm.keySet().toArray(radVärden);
    }
}
    //Kort kod för att påbörja instansieringen av en tabell
    //Parametervärderna är i rätt ordning: antalet kolumner, vilka namn på kolumnerna och namnet på tabellen
    public void displayTabell(int hurMangaKolumn, String[] namnenPaKolumn, String namnPaTabell){
        SwingUtilities.invokeLater(() -> new TabellKlass(hurMangaKolumn, namnenPaKolumn, namnPaTabell));
    }
    
    
}
