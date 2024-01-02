
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addContainerGap(218, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOmradeOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOmradeOKActionPerformed
       try {
           
       
        String Agent = cbAgent.getSelectedItem().toString();
        String Omrade = cbOmrade.getSelectedItem().toString();
        
        String HamtaOID = "Select Omrades_ID from omrade where Benamning = '" + Omrade + "'";
        String OID = idb.fetchSingle(HamtaOID);
        
        String HamtaAID = "Select Agent_ID from agent where Namn = '" + Agent + "'";
        String AID = idb.fetchSingle(HamtaAID);
        
        idb.update("update omradeschef set Agent_ID = " + AID + " where Omrade = " + OID);
        
        JOptionPane.showMessageDialog(rootPane, Agent + " är nu områdes chef för " + Omrade);
        }
       catch (InfException ex) {
           JOptionPane.showMessageDialog(rootPane, "Något har gått fel!");
       }
    }//GEN-LAST:event_btnOmradeOKActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOmradeOK;
    private javax.swing.JComboBox<String> cbAgent;
    private javax.swing.JComboBox<String> cbOmrade;
    private javax.swing.JLabel lblAgent;
    private javax.swing.JLabel lblAndraOmrade;
    private javax.swing.JLabel lblDash;
    private javax.swing.JLabel lblOmrade;
    // End of variables declaration//GEN-END:variables
}
