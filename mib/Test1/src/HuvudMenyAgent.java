
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

        lblAgent = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAgent = new javax.swing.JButton();
        btnAlien = new javax.swing.JButton();
        btnPlanet = new javax.swing.JButton();
        btnUtrustning = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnOmrådePlats = new javax.swing.JButton();
        lblBytLosen = new javax.swing.JLabel();
        btnBytLosen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblAgent.setText("Agent");

        jLabel2.setText("Alien");

        jLabel3.setText("Planeter");

        jLabel4.setText("Utrustning");

        btnAgent.setText("jButton1");
        btnAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgentActionPerformed(evt);
            }
        });

        btnAlien.setText("jButton2");
        btnAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlienActionPerformed(evt);
            }
        });

        btnPlanet.setText("jButton3");

        btnUtrustning.setText("Gå till utrustning");
        btnUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUtrustningActionPerformed(evt);
            }
        });

        jLabel5.setText("Område/plats");

        btnOmrådePlats.setText("jButton5");
        btnOmrådePlats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOmrådePlatsActionPerformed(evt);
            }
        });

        lblBytLosen.setText("Byt lösenord");

        btnBytLosen.setText("jButton6");
        btnBytLosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBytLosenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlien)
                    .addComponent(btnPlanet)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAgent)
                            .addComponent(btnAgent)
                            .addComponent(jLabel4)
                            .addComponent(btnUtrustning))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBytLosen)
                            .addComponent(lblBytLosen)
                            .addComponent(btnOmrådePlats)
                            .addComponent(jLabel5))))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgent)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgent)
                    .addComponent(btnOmrådePlats))
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlien)
                .addGap(1, 1, 1)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPlanet)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblBytLosen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUtrustning)
                    .addComponent(btnBytLosen))
                .addContainerGap(47, Short.MAX_VALUE))
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
        new AlienAlt().setVisible(true);
    }//GEN-LAST:event_btnAlienActionPerformed
    
        /**
     * @param args the command line arguments
     */   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgent;
    private javax.swing.JButton btnAlien;
    private javax.swing.JButton btnBytLosen;
    private javax.swing.JButton btnOmrådePlats;
    private javax.swing.JButton btnPlanet;
    private javax.swing.JButton btnUtrustning;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblAgent;
    private javax.swing.JLabel lblBytLosen;
    // End of variables declaration//GEN-END:variables
}
