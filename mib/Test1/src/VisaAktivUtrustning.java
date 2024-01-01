import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import oru.inf.InfDB;
import oru.inf.InfException;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sarajosefinahansson
 */
public class VisaAktivUtrustning extends javax.swing.JFrame {

    private InfDB idb;
    /**
     * Creates new form VisaAktivUtrustning
     */
    public VisaAktivUtrustning(InfDB idb) {
        initComponents();
        this.idb = idb;
    }
         //String aktivUtrustning =  new tblAktivUtrustning;
         //boolean hittad = false; 
    
        //try {
                //ArrayList<String> utrustning = idb.fetchColumn("SELECT Benamning FROM Utrustning");

               // if (Validering.setAgentInloggning(tblAktivUtrustning) {
                   // for (String inlogg: aktiv) {      
                       // if (aktivUtrustning.equals(inlogg)) {
                            //hittad = true;
            
//                    if (Validering.textFaltHarVarde(txtRaderaUtrustning)) {
//                    for (String namn : utrustning) {      
//                        if (utrustningNamn.equals(namn)) {
//                        hittad = true;
            
//             if (!finnsRedan){
//                String id = idb.getAutoIncrement("utrustning", "Utrustnings_ID");
//                String nyUtrustning = id+",'"+utrustningNamn+"'";
//                String LaggTillFraga = "insert into utrustning (Utrustnings_ID, Benamning) values ("+nyUtrustning+")";
//                idb.insert(LaggTillFraga);
//                JOptionPane.showMessageDialog(null,"Ny utrustning har lagts till");
//            } else {
//                JOptionPane.showMessageDialog(null,"Utrustningen finns redan i systemet");    
//            }}
//             catch (InfException ex) {
//            Logger.getLogger(Inloggning.class.getName()).log(Level.SEVERE, null, ex);
//            }
           
          
            
            
            
            //String visaAktivUtrustning =  "SELECT Utrustning.Benamning, Innehar_Utrustning.Utrustnings_ID FROM Innehar_Utrustning JOIN Utrustning ON Innehar_Utrustning.Utrustnings_ID = Utrustning.Utrustnings_ID";
       // } catch (InfException ex) {
           // Logger.getLogger(VisaAktivUtrustning.class.getName()).log(Level.SEVERE, null, ex);
        //}
    

    // Validering till databsen för att hitta rätt agent
    // från valderingen ska det synas vilken agent som är inloggad
    // koden ska sedan ge vilken utrustning som agenten har tagit ut för stunden. 
    // en lista ska gås genom för att hitta rätt utrustning (for each) för rätt agentID
    // visa rätt utrustning. 
    // vid sökning av agent använd epost då denna ska användas som nyckel. 
    // lek med sql för att få fram rätt fråga 
    
       
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRubrik = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAktivUtrustning = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblRubrik.setText("Här visas din aktiva utrustning");

        tblAktivUtrustning.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Benämning", "Utrustning"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAktivUtrustning);
        if (tblAktivUtrustning.getColumnModel().getColumnCount() > 0) {
            tblAktivUtrustning.getColumnModel().getColumn(0).setResizable(false);
            tblAktivUtrustning.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(lblRubrik))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblRubrik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  public static void main(String args[]) {
   
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JTable tblAktivUtrustning;
    // End of variables declaration//GEN-END:variables

}

