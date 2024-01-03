import java.util.ArrayList;
import java.util.HashMap;
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
 * @author sarajosefinahansson
 */  
public class Utrustning extends javax.swing.JFrame {

    private InfDB idb;
    
    /**
     * Creates new form Utrustning
     */
    public Utrustning(InfDB idb) {
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

        utrusning = new javax.swing.JLabel();
        visaUtrustning = new javax.swing.JLabel();
        btnVisaAktivUtrustning = new javax.swing.JButton();
        regiNyUtrustning = new javax.swing.JLabel();
        btnRegistreraNyUtrustning = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnRaderaUtrustning = new javax.swing.JButton();
        btnGaTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        utrusning.setText("Utrustning");

        visaUtrustning.setText("Visa min aktiva utrustning");

        btnVisaAktivUtrustning.setText("Visa");
        btnVisaAktivUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaAktivUtrustningActionPerformed(evt);
            }
        });

        regiNyUtrustning.setText("Registrera Ny Utrustning");

        btnRegistreraNyUtrustning.setText("Visa");
        btnRegistreraNyUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraNyUtrustningActionPerformed(evt);
            }
        });

        jLabel1.setText("Radera utrustning");

        btnRaderaUtrustning.setText("Visa");
        btnRaderaUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaderaUtrustningActionPerformed(evt);
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
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(visaUtrustning)
                    .addComponent(utrusning)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(regiNyUtrustning)
                            .addComponent(btnVisaAktivUtrustning)
                            .addComponent(btnRegistreraNyUtrustning)
                            .addComponent(jLabel1)
                            .addComponent(btnRaderaUtrustning))))
                .addContainerGap(235, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGaTillbaka)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(utrusning)
                .addGap(18, 18, 18)
                .addComponent(visaUtrustning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVisaAktivUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(regiNyUtrustning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistreraNyUtrustning)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRaderaUtrustning)
                .addGap(18, 18, 18)
                .addComponent(btnGaTillbaka)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Denna knapp visar aktiv utrustning som agenter har just nu.
    //VisaAktivUtrusning är kopplad till klassen VisaMinUtkvitteradeUtrisning som skickar
    //användaren vidare till klassen "VisaMinUtkvitteradeUtrustning. 
    private void btnVisaAktivUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaAktivUtrustningActionPerformed
        //new VisaAktivUtrustning(idb).setVisible(true);
        String mittID = Validering.getAgentInloggning();
        ArrayList<HashMap<String, String>> AL = new ArrayList<>();
        AL = DataBasFragor.getUtkvitteradUtrustning(mittID);
        new VisaMinUtkvitteradeUtrustning(AL).setVisible(true);
    }//GEN-LAST:event_btnVisaAktivUtrustningActionPerformed
//    Via denna knapp kan man registera ny utrustning.
//    Man blir slussad till ett formulär som ger användaren möjlighet att
//    skriva in ny utrustning.  
    private void btnRegistreraNyUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraNyUtrustningActionPerformed
        new RegisteraNyUtrustning(idb).setVisible(true);
    }//GEN-LAST:event_btnRegistreraNyUtrustningActionPerformed

    //RaderaAllUtrustning gör det möjligt för administratörer att ta bort utrusning från systemet. 
    //via knappen skickas administratörer vidare till en ny klass "RaderaAllUtrustningAdmin" som gör det möjligt att ta bort
    //utrustning som inte ska vara kvar i systemet. 
    private void btnRaderaUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaderaUtrustningActionPerformed
        new RaderaAllUtrustningAdmin(idb).setVisible(true);
    }//GEN-LAST:event_btnRaderaUtrustningActionPerformed

    private void btnGaTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGaTillbakaActionPerformed
        //Denna knapp gör så du kommer tillbaka till menyn igen.
        dispose();
    }//GEN-LAST:event_btnGaTillbakaActionPerformed

    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGaTillbaka;
    private javax.swing.JButton btnRaderaUtrustning;
    private javax.swing.JButton btnRegistreraNyUtrustning;
    private javax.swing.JButton btnVisaAktivUtrustning;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel regiNyUtrustning;
    private javax.swing.JLabel utrusning;
    private javax.swing.JLabel visaUtrustning;
    // End of variables declaration//GEN-END:variables

   
   
}
