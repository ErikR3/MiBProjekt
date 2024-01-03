
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author johan
 */
public class AndraAdmin extends javax.swing.JFrame {
    private InfDB idb;
    
    public AndraAdmin(InfDB idb) {
        initComponents();
        this.idb = idb;
        FyllAgent();
    }

    private void FyllAgent() {
        try {
            String Fraga ="Select Namn from Agent";
            ArrayList<String> namnLista = idb.fetchColumn(Fraga);
            for (String agent : namnLista){
                cbGeAdmin.addItem(agent);
                cbTaAdmin.addItem(agent);
                
            }
                
        }
        catch (InfException ex){
            Logger.getLogger(AndraChef.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblGeAdmin = new javax.swing.JLabel();
        cbGeAdmin = new javax.swing.JComboBox<>();
        lblDashGe = new javax.swing.JLabel();
        btnGeOK = new javax.swing.JButton();
        cbTaAdmin = new javax.swing.JComboBox<>();
        lblTaAdmin = new javax.swing.JLabel();
        lblDashTA = new javax.swing.JLabel();
        btnTaOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblGeAdmin.setText("Ge agenter adminstatus");

        lblDashGe.setText("-");

        btnGeOK.setText("OK");
        btnGeOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeOKActionPerformed(evt);
            }
        });

        lblTaAdmin.setText("Ta bort adminstatus från agenter");

        lblDashTA.setText("-");

        btnTaOK.setText("OK");
        btnTaOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTaAdmin)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbTaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDashTA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTaOK))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbGeAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDashGe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGeOK))
                    .addComponent(lblGeAdmin))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(lblGeAdmin)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbGeAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDashGe)
                    .addComponent(btnGeOK))
                .addGap(20, 20, 20)
                .addComponent(lblTaAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDashTA)
                    .addComponent(btnTaOK))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGeOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeOKActionPerformed
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
    }//GEN-LAST:event_btnGeOKActionPerformed

    private void btnTaOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaOKActionPerformed
                try {
//            Hämtar den valda agentens ID och en sql fråga som sätter adminstatus till N
        String Agent = cbTaAdmin.getSelectedItem().toString();
        String AgentID = idb.fetchSingle("Select Agent_ID from agent where Namn = '" + Agent + "'");
        
        String Fraga = "Update agent set Administrator = 'N' where Agent_ID = '" + AgentID + "'";
        
//        kontrollerare ifall den angivna agenten har samma agentID som den inloggade
        if (AgentID.equals(Validering.getIDInloggning()) ) {
            JOptionPane.showMessageDialog(rootPane, "Du får inte ta bort din egna Adminstatus");
        }
        else {
            idb.update(Fraga);
            JOptionPane.showMessageDialog(rootPane, Agent + " har nu inte längre Adminstatus");
        }
       }
       catch (InfException ex){
           
       }
    }//GEN-LAST:event_btnTaOKActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGeOK;
    private javax.swing.JButton btnTaOK;
    private javax.swing.JComboBox<String> cbGeAdmin;
    private javax.swing.JComboBox<String> cbTaAdmin;
    private javax.swing.JLabel lblDashGe;
    private javax.swing.JLabel lblDashTA;
    private javax.swing.JLabel lblGeAdmin;
    private javax.swing.JLabel lblTaAdmin;
    // End of variables declaration//GEN-END:variables
}
