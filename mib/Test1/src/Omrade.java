
import java.util.HashMap;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author erikr
 */
public class Omrade extends javax.swing.JFrame {

    /**
     * Creates new form Område
     */
    public Omrade() {
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

        lblOmradeChef = new javax.swing.JLabel();
        btnSeChefOmrade = new javax.swing.JButton();
        tfOmradeChef = new javax.swing.JTextField();
        lblOmradeAgenter = new javax.swing.JLabel();
        btnSeAgenter = new javax.swing.JButton();
        tfOmradeAgenter = new javax.swing.JTextField();
        lblMinChef = new javax.swing.JLabel();
        btnSeChef = new javax.swing.JButton();
        btnGaTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblOmradeChef.setText("Område chef");

        btnSeChefOmrade.setText("Se chef");
        btnSeChefOmrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeChefOmradeActionPerformed(evt);
            }
        });

        tfOmradeChef.setText("(Område här)");
        tfOmradeChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfOmradeChefActionPerformed(evt);
            }
        });

        lblOmradeAgenter.setText("Topp 3 agenter ansvariga för aliens på viss plats");

        btnSeAgenter.setText("Se agenter");
        btnSeAgenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeAgenterActionPerformed(evt);
            }
        });

        tfOmradeAgenter.setText("(Område här)");
        tfOmradeAgenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfOmradeAgenterActionPerformed(evt);
            }
        });

        lblMinChef.setText("Min områdeschef");

        btnSeChef.setText("Se min områdeschef");
        btnSeChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeChefActionPerformed(evt);
            }
        });

        btnGaTillbaka.setText("Gå tillbaka");
        btnGaTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGaTillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOmradeAgenter)
                            .addComponent(btnSeChefOmrade)
                            .addComponent(tfOmradeAgenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(110, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOmradeChef)
                            .addComponent(tfOmradeChef, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(lblMinChef))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSeChef)
                                .addGap(71, 71, 71))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSeAgenter, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGaTillbaka)
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOmradeChef)
                    .addComponent(lblMinChef))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfOmradeChef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeChef))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSeChefOmrade)
                .addGap(62, 62, 62)
                .addComponent(lblOmradeAgenter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfOmradeAgenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnSeAgenter)
                        .addContainerGap(49, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGaTillbaka)
                        .addGap(34, 34, 34))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeAgenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeAgenterActionPerformed
        // TODO add your handling code here:
        if(Validering.textFaltHarVarde(tfOmradeAgenter) && Validering.notOmrade(tfOmradeAgenter)){
        String omradeNamn = tfOmradeAgenter.getText();
        VisaTopp3Agent topp3agent = new VisaTopp3Agent(DataBasFragor.getAntalAliens(omradeNamn));
        topp3agent.setVisible(true);
        }
    }//GEN-LAST:event_btnSeAgenterActionPerformed

    private void tfOmradeAgenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfOmradeAgenterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfOmradeAgenterActionPerformed

    private void tfOmradeChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfOmradeChefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfOmradeChefActionPerformed

    private void btnSeChefOmradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeChefOmradeActionPerformed
        // TODO add your handling code here:
        if(Validering.textFaltHarVarde(tfOmradeChef) && Validering.notOmrade(tfOmradeChef)){
        String omradeNamn = tfOmradeChef.getText();
        String chef = DataBasFragor.getOmradesChefNamn(omradeNamn);
        JOptionPane.showMessageDialog(null, chef);
        }
    }//GEN-LAST:event_btnSeChefOmradeActionPerformed

    private void btnSeChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeChefActionPerformed
        // TODO add your handling code here:
        String omrade = Validering.getOmrade();
        String omradesChef = DataBasFragor.getOmradesChefID(omrade);
        HashMap<String, String> HM = DataBasFragor.getAlltOmEnAgent(omradesChef);
        new VisaTabellAgent(HM).setVisible(true);
    }//GEN-LAST:event_btnSeChefActionPerformed

    private void btnGaTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGaTillbakaActionPerformed
        dispose();
    }//GEN-LAST:event_btnGaTillbakaActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGaTillbaka;
    private javax.swing.JButton btnSeAgenter;
    private javax.swing.JButton btnSeChef;
    private javax.swing.JButton btnSeChefOmrade;
    private javax.swing.JLabel lblMinChef;
    private javax.swing.JLabel lblOmradeAgenter;
    private javax.swing.JLabel lblOmradeChef;
    private javax.swing.JTextField tfOmradeAgenter;
    private javax.swing.JTextField tfOmradeChef;
    // End of variables declaration//GEN-END:variables
}