/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author erikr
 */
public class Utrustning extends javax.swing.JFrame {

    /**
     * Creates new form Utrustning
     */
    public Utrustning() {
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

        utrusning = new javax.swing.JLabel();
        visaUtrustning = new javax.swing.JLabel();
        btnUtrustning = new javax.swing.JButton();
        regiNyUtrustning = new javax.swing.JLabel();
        btnRegi = new javax.swing.JButton();
        TaBortUtrustning = new javax.swing.JLabel();
        btnRaderaUtrustning = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        utrusning.setText("Utrustning");

        visaUtrustning.setText("Visa min aktiva utrustning");

        btnUtrustning.setText("Visa");
        btnUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUtrustningActionPerformed(evt);
            }
        });

        regiNyUtrustning.setText("Registera ny utrusnung");

        btnRegi.setText("Visa");
        btnRegi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegiActionPerformed(evt);
            }
        });

        TaBortUtrustning.setText("Ta bort all utrusning ur systemet");

        btnRaderaUtrustning.setText("Radera");
        btnRaderaUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaderaUtrustningActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(visaUtrustning)
                    .addComponent(utrusning)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(regiNyUtrustning)
                            .addComponent(btnUtrustning)
                            .addComponent(btnRegi)
                            .addComponent(TaBortUtrustning)
                            .addComponent(btnRaderaUtrustning))))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(utrusning)
                .addGap(18, 18, 18)
                .addComponent(visaUtrustning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(regiNyUtrustning)
                .addGap(18, 18, 18)
                .addComponent(btnRegi)
                .addGap(18, 18, 18)
                .addComponent(TaBortUtrustning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRaderaUtrustning)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Denna knapp visar aktiv utrustning som agenter har just nu. 
    private void btnUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUtrustningActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnUtrustningActionPerformed
//    Via denna knapp kan man registera ny utrustning.
//    Man blir slussad till ett formulär som ger användaren möjlighet att
//    skriva in ny utrustning.  
    private void btnRegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegiActionPerformed

    
    //Detta är en knapp som kommer ta bort all utrustning ifrån hela systemt
    private void btnRaderaUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaderaUtrustningActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnRaderaUtrustningActionPerformed

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
            java.util.logging.Logger.getLogger(Utrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Utrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Utrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Utrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Utrustning().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TaBortUtrustning;
    private javax.swing.JButton btnRaderaUtrustning;
    private javax.swing.JButton btnRegi;
    private javax.swing.JButton btnUtrustning;
    private javax.swing.JLabel regiNyUtrustning;
    private javax.swing.JLabel utrusning;
    private javax.swing.JLabel visaUtrustning;
    // End of variables declaration//GEN-END:variables
}
