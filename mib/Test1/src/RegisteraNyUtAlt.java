/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sarajosefinahansson
 */
public class RegisteraNyUtAlt extends javax.swing.JFrame {

    /**
     * Creates new form RegisteraNyUtAlt
     */
    public RegisteraNyUtAlt() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnLaggTillNyUtrustning1 = new javax.swing.JButton();
        btnLaggTillNyUtrustning2 = new javax.swing.JButton();
        btnLaggtillNyUtrustning3 = new javax.swing.JButton();
        txtRegisteraNyUtrustning1 = new javax.swing.JTextField();
        txtRegisteraNyUtrutning2 = new javax.swing.JTextField();
        txtRegistreraNyUtrustning3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Registera ny utrustning");

        btnLaggTillNyUtrustning1.setText("Lägg till");
        btnLaggTillNyUtrustning1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillNyUtrustning1ActionPerformed(evt);
            }
        });

        btnLaggTillNyUtrustning2.setText("Lägg till");
        btnLaggTillNyUtrustning2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillNyUtrustning2ActionPerformed(evt);
            }
        });

        btnLaggtillNyUtrustning3.setText("Lägg till");
        btnLaggtillNyUtrustning3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggtillNyUtrustning3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRegistreraNyUtrustning3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegisteraNyUtrutning2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegisteraNyUtrustning1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnLaggtillNyUtrustning3)
                    .addComponent(btnLaggTillNyUtrustning2)
                    .addComponent(btnLaggTillNyUtrustning1))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRegisteraNyUtrustning1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLaggTillNyUtrustning1)
                .addGap(8, 8, 8)
                .addComponent(txtRegisteraNyUtrutning2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLaggTillNyUtrustning2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtRegistreraNyUtrustning3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLaggtillNyUtrustning3)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    Varje knapp lägger till en ny utrustning i en lista. Det negativa är att man får uppfattningen
//    om att det endast är 3 nya utrustningar som går att lägga till. Det är därför som denna JFrame
//    heter "alt"
    
    
    
    private void btnLaggTillNyUtrustning1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillNyUtrustning1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLaggTillNyUtrustning1ActionPerformed

    private void btnLaggTillNyUtrustning2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillNyUtrustning2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLaggTillNyUtrustning2ActionPerformed

    private void btnLaggtillNyUtrustning3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggtillNyUtrustning3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLaggtillNyUtrustning3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisteraNyUtAlt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisteraNyUtAlt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisteraNyUtAlt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisteraNyUtAlt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisteraNyUtAlt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLaggTillNyUtrustning1;
    private javax.swing.JButton btnLaggTillNyUtrustning2;
    private javax.swing.JButton btnLaggtillNyUtrustning3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtRegisteraNyUtrustning1;
    private javax.swing.JTextField txtRegisteraNyUtrutning2;
    private javax.swing.JTextField txtRegistreraNyUtrustning3;
    // End of variables declaration//GEN-END:variables
}
