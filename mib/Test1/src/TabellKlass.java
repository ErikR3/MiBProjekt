/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Vector;

public class TabellKlass extends JFrame {
    private JTable tabell;
    
    public TabellKlass(int kolumnAntal, String[] kolumnensNamn, String tabellNamn){
        setTitle(tabellNamn);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        tabell = new JTable(new DefaultTableModel());
        
        JScrollPane x = new JScrollPane(tabell);
        
        add(x);
        
        DefaultTableModel serUtSahar = skapaTabell(kolumnAntal, kolumnensNamn);
        tabell.setModel(serUtSahar);
        
        Object[] rad1 = {"Alice", 25, "Stockholm", "Ja"};
        Object[] rad2 = {"Henrik", 35, "Örebro", "Nej"};
        Object[] rad3 = {"Charlie", 22, "Malmö", "Ja"};
        
        laggTillRader(new Object[][]{rad1, rad2, rad3});
        
        setVisible(true);
    }
    
    
    private DefaultTableModel skapaTabell(int kolumnAntal, String[] kolumnensNamn) 
    {   
       Vector<String> forKolumn = new Vector<>();
       for (String kolumnNamn : kolumnensNamn){
           forKolumn.add(kolumnNamn);
       }
       
       //kommer behöva en vector för rader
       Vector<Vector<Object>> dataVector = new Vector<>();
       
       return new DefaultTableModel(dataVector, forKolumn);
    }
    
        private void laggTillRader(Object[][] rader){
        DefaultTableModel nyTabell = (DefaultTableModel) tabell.getModel();
        
        for (Object[] rad : rader){
            nyTabell.addRow(rad);
        }
    }
    
    public static void main(String[] args){
        
        SwingUtilities.invokeLater(() -> new TabellKlass(3, new String[]{"Namn", "Ålder", "Stad", "Hol"}, "REEE"));
    }
}
