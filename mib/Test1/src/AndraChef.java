    
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author johan
 */
public class AndraChef extends javax.swing.JFrame {
    private InfDB idb;
    
    
    public AndraChef(InfDB idb) {
        this.idb = idb;
        initComponents();
        FyllAgent();
        FyllOmrade();
        
    }

    private void FyllAgent() {
        try {
            String Fraga ="Select Namn from Agent";
            ArrayList<String> namnLista = idb.fetchColumn(Fraga);
            for (String agent : namnLista){
                cbAgent.addItem(agent);
                cbKontorChef.addItem(agent);
            }
                
        }
        catch (InfException ex){
            Logger.getLogger(AndraChef.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void FyllOmrade() {
        try {
            String Fraga = "Select Benamning from Omrade";
            ArrayList<String> omradeLista = idb.fetchColumn(Fraga);
            for (String omrade : omradeLista) {
                cbOmrade.addItem(omrade);
            }
        }
        catch (InfException ex) {
            Logger.getLogger(AndraChef.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
   
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAndraOmrade = new javax.swing.JLabel();
        cbAgent = new javax.swing.JComboBox<>();
        lblAgent = new javax.swing.JLabel();
        lblDash = new javax.swing.JLabel();
        lblOmrade = new javax.swing.JLabel();
        cbOmrade = new javax.swing.JComboBox<>();
        btnOmradeOK = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbKontorChef = new javax.swing.JComboBox<>();
        lblKontorChef = new javax.swing.JLabel();
        lblDash4 = new javax.swing.JLabel();
        btnKontorChef = new javax.swing.JButton();
        btnGaTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblAndraOmrade.setText("Ändra områdeschef");

        lblAgent.setText("Agent");

        lblDash.setText("-");

        lblOmrade.setText("Område");

        btnOmradeOK.setText("OK");
        btnOmradeOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOmradeOKActionPerformed(evt);
            }
        });

        lblKontorChef.setText("Ändra kontorschef på Örebrokontoret");

        lblDash4.setText("-");

        btnKontorChef.setText("OK");
        btnKontorChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKontorChefActionPerformed(evt);
            }
        });

        btnGaTillbaka.setText("Gå tillbaka");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAndraOmrade)
                            .addComponent(lblKontorChef)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblDash, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblAgent))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblOmrade)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnOmradeOK)))))
                        .addContainerGap(118, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbKontorChef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDash4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKontorChef)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGaTillbaka)
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblAndraOmrade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOmrade)
                    .addComponent(lblAgent))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDash)
                                    .addComponent(btnOmradeOK))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblKontorChef)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbKontorChef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDash4)
                                    .addComponent(btnKontorChef))))
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGaTillbaka)
                        .addGap(16, 16, 16))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOmradeOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOmradeOKActionPerformed
       try {
           
//       gör om comborutor till text
        String Agent = cbAgent.getSelectedItem().toString();
        String Omrade = cbOmrade.getSelectedItem().toString();
        
//        Hämtar omrdåes ID utirfrån namnet på området
        String HamtaOID = "Select Omrades_ID from omrade where Benamning = '" + Omrade + "'";
        String OID = idb.fetchSingle(HamtaOID);
        
//        Hämtar agent ID utifrån namnet på agenten
        String HamtaAID = "Select Agent_ID from agent where Namn = '" + Agent + "'";
        String AID = idb.fetchSingle(HamtaAID);
        
//        Ändrar i databasen för vem som är chef i ett område utifrån dessa IDn
        idb.update("update omradeschef set Agent_ID = " + AID + " where Omrade = " + OID);
        
        JOptionPane.showMessageDialog(rootPane, Agent + " är nu områdes chef för " + Omrade);
        }
       catch (InfException ex) {
           JOptionPane.showMessageDialog(rootPane, "Något har gått fel!");
       }
    }//GEN-LAST:event_btnOmradeOKActionPerformed

    private void btnKontorChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKontorChefActionPerformed
        try {
            String Agent = cbKontorChef.getSelectedItem().toString();
            String AgentID = idb.fetchSingle("Select Agent_ID from agent where Namn = '" + Agent + "'");
            
            String Fraga = "Update kontorschef set Agent_ID = " + AgentID + " where Kontorsbeteckning = 'Örebrokontoret'";
            idb.update(Fraga);
            JOptionPane.showMessageDialog(rootPane, Agent + " är nu chef över Örebrokontoret!");
        }
        catch (InfException ex){
            
        }
    }//GEN-LAST:event_btnKontorChefActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGaTillbaka;
    private javax.swing.JButton btnKontorChef;
    private javax.swing.JButton btnOmradeOK;
    private javax.swing.JComboBox<String> cbAgent;
    private javax.swing.JComboBox<String> cbKontorChef;
    private javax.swing.JComboBox<String> cbOmrade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAgent;
    private javax.swing.JLabel lblAndraOmrade;
    private javax.swing.JLabel lblDash;
    private javax.swing.JLabel lblDash4;
    private javax.swing.JLabel lblKontorChef;
    private javax.swing.JLabel lblOmrade;
    // End of variables declaration//GEN-END:variables
}
