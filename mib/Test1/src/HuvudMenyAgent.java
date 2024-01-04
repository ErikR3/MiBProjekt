
import javax.swing.SwingUtilities;
import oru.inf.InfDB;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author hanna
 */
public class HuvudMenyAgent extends javax.swing.JFrame {

    private InfDB idb;
    /**
     * Creates new form Inlogg
     */
    public HuvudMenyAgent(InfDB idb) {
        initComponents();
        this.idb = idb;
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgent = new javax.swing.JButton();
        btnAlien = new javax.swing.JButton();
        btnUtrustning = new javax.swing.JButton();
        btnOmrådePlats = new javax.swing.JButton();
        btnBytLosen = new javax.swing.JButton();
        btnLoggaUt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnAgent.setText("Agent");
        btnAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgentActionPerformed(evt);
            }
        });

        btnAlien.setText("Alien");
        btnAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlienActionPerformed(evt);
            }
        });

        btnUtrustning.setText("Gå till utrustning");
        btnUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUtrustningActionPerformed(evt);
            }
        });

        btnOmrådePlats.setText("Område/plats");
        btnOmrådePlats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOmrådePlatsActionPerformed(evt);
            }
        });

        btnBytLosen.setText("Byt lösenord");
        btnBytLosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBytLosenActionPerformed(evt);
            }
        });

        btnLoggaUt.setText("Logga ut");
        btnLoggaUt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaUtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBytLosen)
                    .addComponent(btnOmrådePlats)
                    .addComponent(btnAlien)
                    .addComponent(btnUtrustning)
                    .addComponent(btnAgent))
                .addContainerGap(237, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLoggaUt)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnAgent)
                .addGap(18, 18, 18)
                .addComponent(btnAlien)
                .addGap(18, 18, 18)
                .addComponent(btnOmrådePlats)
                .addGap(18, 18, 18)
                .addComponent(btnUtrustning)
                .addGap(18, 18, 18)
                .addComponent(btnBytLosen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLoggaUt)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgentActionPerformed
      new Agent(idb).setVisible(true);
    }//GEN-LAST:event_btnAgentActionPerformed

    private void btnUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUtrustningActionPerformed
        // TODO add your handling code here:
        new Utrustning(idb).setVisible(true);
    }//GEN-LAST:event_btnUtrustningActionPerformed

    private void btnBytLosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBytLosenActionPerformed
        new BytLosenord(idb).setVisible(true);
    }//GEN-LAST:event_btnBytLosenActionPerformed

    private void btnOmrådePlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOmrådePlatsActionPerformed
        new Område().setVisible(true);
    }//GEN-LAST:event_btnOmrådePlatsActionPerformed

    private void btnAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlienActionPerformed
        // TODO add your handling code here:
        new AlienAlt(idb).setVisible(true);
    }//GEN-LAST:event_btnAlienActionPerformed

    private void btnLoggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaUtActionPerformed
        dispose();
    }//GEN-LAST:event_btnLoggaUtActionPerformed
     
        /**
     * @param args the command line arguments
     */   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgent;
    private javax.swing.JButton btnAlien;
    private javax.swing.JButton btnBytLosen;
    private javax.swing.JButton btnLoggaUt;
    private javax.swing.JButton btnOmrådePlats;
    private javax.swing.JButton btnUtrustning;
    // End of variables declaration//GEN-END:variables
}
