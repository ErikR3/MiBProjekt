
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
public class AgentInfo extends javax.swing.JFrame {
    private InfDB idb;
    
    
    public AgentInfo(InfDB idb) {
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
                cbGeAdmin.addItem(agent);
                cbTaAdmin.addItem(agent);
            }
                
        }
        catch (InfException ex){
            Logger.getLogger(AgentInfo.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(AgentInfo.class.getName()).log(Level.SEVERE, null, ex);
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
        lblGeAdmin = new javax.swing.JLabel();
        cbGeAdmin = new javax.swing.JComboBox<>();
        btnGeOk = new javax.swing.JButton();
        lblDash2 = new javax.swing.JLabel();
        cbTaAdmin = new javax.swing.JComboBox<>();
        lblTaAdmin = new javax.swing.JLabel();
        btnTaOk = new javax.swing.JButton();
        lblDash3 = new javax.swing.JLabel();

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

        lblGeAdmin.setText("Ge agenter adminstatus");

        btnGeOk.setText("OK");
        btnGeOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeOkActionPerformed(evt);
            }
        });

        lblDash2.setText("-");

        lblTaAdmin.setText("Ta bort adminstatus från agenter");

        btnTaOk.setText("OK");
        btnTaOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaOkActionPerformed(evt);
            }
        });

        lblDash3.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTaAdmin)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbTaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDash3)
                        .addGap(7, 7, 7)
                        .addComponent(btnTaOk))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbGeAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDash2)
                        .addGap(7, 7, 7)
                        .addComponent(btnGeOk))
                    .addComponent(lblGeAdmin)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAgent)
                        .addGap(58, 58, 58)
                        .addComponent(lblOmrade))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDash, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnOmradeOK))
                    .addComponent(lblAndraOmrade))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblAndraOmrade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgent)
                    .addComponent(lblOmrade))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDash)
                            .addComponent(btnOmradeOK))))
                .addGap(18, 18, 18)
                .addComponent(lblGeAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbGeAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGeOk)
                    .addComponent(lblDash2))
                .addGap(18, 18, 18)
                .addComponent(lblTaAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTaOk)
                    .addComponent(lblDash3))
                .addContainerGap(92, Short.MAX_VALUE))
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

    private void btnGeOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeOkActionPerformed
       try {
//           Hämtar den valda agentens ID och sätter dennes adminstatus till J
        String Agent = cbGeAdmin.getSelectedItem().toString();
        String AgentID = idb.fetchSingle("Select Agent_ID from agent where Namn = '" + Agent + "'");
       
        String Fraga = "Update agent set Administrator = 'J' where Agent_ID = '" + AgentID + "'";
        
        idb.update(Fraga);
        JOptionPane.showMessageDialog(rootPane, Agent + " har nu adminstatus");
       }
       catch (InfException ex) {
           
       }
    }//GEN-LAST:event_btnGeOkActionPerformed

    private void btnTaOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaOkActionPerformed
        try {
//            Hämtar den valda agentens ID och en sql fråga som sätter adminstatus till N
        String Agent = cbTaAdmin.getSelectedItem().toString();
        String AgentID = idb.fetchSingle("Select Agent_ID from agent where Namn = '" + Agent + "'");
        
        String Fraga = "Update agent set Administrator = 'N' where Agent_ID = '" + AgentID + "'";
        
//        kontrollerare ifall den angivna agenten har samma agentID som den inloggade
        if (AgentID.equals(Validering.getAgentInloggning()) ) {
            JOptionPane.showMessageDialog(rootPane, "Du får inte ta bort din egna Adminstatus");
        }
        else {
            idb.update(Fraga);
            JOptionPane.showMessageDialog(rootPane, Agent + " har nu inte längre Adminstatus");
        }
       }
       catch (InfException ex){
           
       }
    }//GEN-LAST:event_btnTaOkActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGeOk;
    private javax.swing.JButton btnOmradeOK;
    private javax.swing.JButton btnTaOk;
    private javax.swing.JComboBox<String> cbAgent;
    private javax.swing.JComboBox<String> cbGeAdmin;
    private javax.swing.JComboBox<String> cbOmrade;
    private javax.swing.JComboBox<String> cbTaAdmin;
    private javax.swing.JLabel lblAgent;
    private javax.swing.JLabel lblAndraOmrade;
    private javax.swing.JLabel lblDash;
    private javax.swing.JLabel lblDash2;
    private javax.swing.JLabel lblDash3;
    private javax.swing.JLabel lblGeAdmin;
    private javax.swing.JLabel lblOmrade;
    private javax.swing.JLabel lblTaAdmin;
    // End of variables declaration//GEN-END:variables
}
