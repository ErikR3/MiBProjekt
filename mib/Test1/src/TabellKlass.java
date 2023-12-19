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
    
    public TabellKlass(int kolumnAntal, String[] kolumnensNamn){
        setTitle("");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        tabell = new JTable(new DefaultTableModel());
        
        JScrollPane x = new JScrollPane(tabell);
        
        add(x);
        
        DefaultTableModel serUtSahar = skapaTabell(kolumnAntal, kolumnensNamn);
        tabell.setModel(serUtSahar);
        
        
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
    
    public static void main(String[] args){
        
        SwingUtilities.invokeLater(() -> new TabellKlass(3, new String[]{"Namn", "Ålder", "Stad", "Hol"}));
    }

}
