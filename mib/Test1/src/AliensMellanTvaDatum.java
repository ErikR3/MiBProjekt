
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Erik
 */
public class AliensMellanTvaDatum extends javax.swing.JFrame {
    
    private DefaultTableModel tabellModell;
    private ArrayList<String> aliens;
    private String startdatum;
    private String slutdatum;

    /**
     * Creates new form AliensMellanTvåDatum
     */
    public AliensMellanTvaDatum(ArrayList<String> aliens, String startdatum, String slutdatum) {
        this.aliens = aliens;
        this.startdatum = startdatum;
        this.slutdatum = slutdatum;
        initComponents();
    }
    
    public DefaultTableModel sattTabellModell(ArrayList<String> aliensLista, String datumstart, String datumslut){
        Object[][] data = new Object[aliensLista.size()][1];
        String[] kolumner = {"Aliens registrerade mellan " + datumstart + " - " + datumslut};
        
        for(int i = 0; i < aliensLista.size(); i++){
            String alienID = aliensLista.get(i);
            
            Object[] rad = {alienID};
            data[i] = rad;   
        }
        
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

        jTable1.setModel(sattTabellModell(aliens, startdatum, slutdatum));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
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
