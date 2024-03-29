
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author erikr
 */

public class VisaTopp3Agent extends javax.swing.JFrame {
    /**
     * Creates new form VisaTopp3Agent
     */
    
    //konstruktorns parameter är viktig.
    //Den tar emot en arraylist av hashmaps som kommer vara viktiga senare.
    private ArrayList<HashMap<String, String>> AL;
    
    public VisaTopp3Agent(ArrayList<HashMap<String, String>> AL) {
        this.AL = AL;
        initComponents();
    }
    
    public DefaultTableModel sattTabellModell(ArrayList<HashMap<String, String>> rader){
        //För att tabellen ska bli högst 3 rader lång finns denna variabel.
        //Ifall det är färre rader så får e samma värde som radantalets storlek.
        Integer e = 0;
        if(rader.size() > 3){
            e = 3;
        } else {
            e = rader.size();
        }
        
        //Här instansieras ett 2 dimensionellt objekt där e är antalet rader
        //och 2 antalets kolumner
        Object[][] data = new Object[e][2];
        //Kolumnnamn
        String[] kolumner ={"Agent ID", "Antal Aliens"};
        
        
        //En traditionell for-loop som endast itererar när i är under e:s värde
        for (int i = 0; i < e; i++){
            //Hämtar hashmap från nuvarande index ur arraylist
            HashMap<String, String> HM = rader.get(i);
            //Hämtar agentid från nyckeln
            String agentID = HM.get("Ansvarig_Agent");
            //Hämtar aliens från radantal
            String antalAliens = HM.get("row_count");
            
            //Ett till objekt instansieras innehållande värdena från agentid och antalaliens
            Object[] rad = {agentID, antalAliens};
            //Objektet som nyss instansierats lägg till i arrayen rad
            data[i] = rad;
        }
        
        //Här returneras en tabellmodell av data och kolumner
        //I initComponents() funktionen så kallar setmodel() funktionen på denna funktion
        return new DefaultTableModel(data, kolumner);
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(sattTabellModell(AL));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
