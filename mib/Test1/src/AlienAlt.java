
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
 * @author erikr
 */
public class AlienAlt extends javax.swing.JFrame {

    private InfDB idb;
    /**
     * Creates new form AlienAlt
     */
    public AlienAlt(InfDB idb) {
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

        jLabel1 = new javax.swing.JLabel();
        lblRegistreraAlien = new javax.swing.JLabel();
        btnRegistreraAlien = new javax.swing.JButton();
        btnSokEnAlien = new javax.swing.JButton();
        btnAndraRas = new javax.swing.JButton();
        btnTaBortAlien = new javax.swing.JButton();
        lblAdminFunktion = new javax.swing.JLabel();
        lblSeAliens = new javax.swing.JLabel();
        BtnAliensInomOmråde = new javax.swing.JButton();
        tfSeAliensOmrade = new javax.swing.JTextField();
        btnSeAliensAvRas = new javax.swing.JButton();
        lblSeAliensAvRas = new javax.swing.JLabel();
        tfSeAliensAvRas = new javax.swing.JTextField();
        lblListaAliens = new javax.swing.JLabel();
        tfDatum1 = new javax.swing.JTextField();
        tfDatum2 = new javax.swing.JTextField();
        lblStrack = new javax.swing.JLabel();
        btnListaAliens = new javax.swing.JButton();
        btnGaTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Information om aliens");

        lblRegistreraAlien.setText("Registrera ny Alien");

        btnRegistreraAlien.setText("Registrera ny alien");
        btnRegistreraAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraAlienActionPerformed(evt);
            }
        });

        btnSokEnAlien.setText("Sök efter en enskild alien // Ändra information om alien");
        btnSokEnAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokEnAlienActionPerformed(evt);
            }
        });

        btnAndraRas.setText("Ändra ras för en alien");
        btnAndraRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraRasActionPerformed(evt);
            }
        });

        btnTaBortAlien.setText("Ta bort en alien ur systemet");
        btnTaBortAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortAlienActionPerformed(evt);
            }
        });

        lblAdminFunktion.setText("Administratörfunktion");

        lblSeAliens.setText("Se alla aliens inom viss plats");

        BtnAliensInomOmråde.setText("Aliens inom denna plats");
        BtnAliensInomOmråde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAliensInomOmrådeActionPerformed(evt);
            }
        });

        tfSeAliensOmrade.setText("(skriv område här)");
        tfSeAliensOmrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSeAliensOmradeActionPerformed(evt);
            }
        });

        btnSeAliensAvRas.setText("Aliens av ras");
        btnSeAliensAvRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeAliensAvRasActionPerformed(evt);
            }
        });

        lblSeAliensAvRas.setText("Se aliens av ras");

        tfSeAliensAvRas.setText("(skriv ras här)");
        tfSeAliensAvRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSeAliensAvRasActionPerformed(evt);
            }
        });

        lblListaAliens.setText("Lista aliens registrerade mellan");

        tfDatum1.setText("(skriv datum här)");

        tfDatum2.setText("(skriv datum här)");

        lblStrack.setText("-");

        btnListaAliens.setText("Visa");
        btnListaAliens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaAliensActionPerformed(evt);
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
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(btnSokEnAlien))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAndraRas)
                            .addComponent(lblListaAliens)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnListaAliens, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(tfDatum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblStrack, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfDatum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tfSeAliensOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSeAliensAvRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSeAliensAvRas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGaTillbaka))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblSeAliens)
                                        .addGap(150, 150, 150))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BtnAliensInomOmråde)
                                            .addComponent(lblSeAliensAvRas))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblAdminFunktion)
                                        .addGap(59, 59, 59))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(lblRegistreraAlien)
                                            .addGap(28, 28, 28))
                                        .addComponent(btnRegistreraAlien))
                                    .addComponent(btnTaBortAlien))))
                        .addGap(62, 62, 62))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSokEnAlien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAndraRas)
                .addGap(18, 18, 18)
                .addComponent(lblListaAliens)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDatum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDatum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStrack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListaAliens)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSeAliens)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSeAliensOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnAliensInomOmråde)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSeAliensAvRas))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRegistreraAlien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistreraAlien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAdminFunktion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTaBortAlien)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSeAliensAvRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSeAliensAvRas)
                    .addComponent(btnGaTillbaka))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Knapp för att registrera en ny alien
    private void btnRegistreraAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraAlienActionPerformed
        new RegistreraNyAlien(idb).setVisible(true);
        
    }//GEN-LAST:event_btnRegistreraAlienActionPerformed

    //Öppnar en JFrame där en admin kan ta bort en redan existerande alien.
    private void btnTaBortAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortAlienActionPerformed

        //Kontrollerar om den inloggade agenten är admin
        if (Validering.getAdminStatus()) {
        //öppnar en ny "TaBortAlien" JFrame
        new TaBortAlien(idb).setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null, "Endast administratörer kan radera aliens.");
        }
    }//GEN-LAST:event_btnTaBortAlienActionPerformed

    private void btnSokEnAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokEnAlienActionPerformed
        // TODO add your handling code here:
        new SokEfterEnAlien(idb).setVisible(true);
    }//GEN-LAST:event_btnSokEnAlienActionPerformed

    private void btnAndraRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraRasActionPerformed
        // TODO add your handling code here:
        new AndraRasPaAlien(idb).setVisible(true);
    }//GEN-LAST:event_btnAndraRasActionPerformed

    private void BtnAliensInomOmrådeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAliensInomOmrådeActionPerformed
        // TODO add your handling code here:
        String plats = tfSeAliensOmrade.getText();
        ArrayList<String> aliens = new ArrayList<>();
        aliens = DataBasFragor.getAllaAliensPaEnPlats(plats);
        if(Validering.textFaltHarVarde(tfSeAliensOmrade) && !aliens.isEmpty()){
        new VisaListaOverAliensPaAngivenPlats(aliens, plats).setVisible(true);
        } else if (aliens.isEmpty()){
            JOptionPane.showMessageDialog(null, "Ange giltig plats");
        }
        
         
    }//GEN-LAST:event_BtnAliensInomOmrådeActionPerformed

    private void btnSeAliensAvRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeAliensAvRasActionPerformed
        // TODO add your handling code here:
        ArrayList<String> aliens = new ArrayList<>();
        String ras = tfSeAliensAvRas.getText(); 
        if(Validering.textFaltHarVarde(tfSeAliensAvRas) && DataBasFragor.getAllaAliensAvRas(ras) != null){
            aliens = DataBasFragor.getAllaAliensAvRas(ras);
            new VisaAliensAvRas(aliens, ras).setVisible(true);
        } 
        
    }//GEN-LAST:event_btnSeAliensAvRasActionPerformed

    private void tfSeAliensAvRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSeAliensAvRasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSeAliensAvRasActionPerformed

    private void btnListaAliensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaAliensActionPerformed
        // TODO add your handling code here:
        String startdatum = tfDatum1.getText();
        String slutdatum = tfDatum2.getText();
        System.out.println(startdatum + slutdatum);
        ArrayList<String> aliens = new ArrayList<>();
       
        if(Validering.isDatum(startdatum) && Validering.isDatum(slutdatum)){
        aliens = DataBasFragor.getAllaAliensMellanDatum(startdatum, slutdatum);
        
        new VisaAliensMellanTvaDatum(aliens, startdatum, slutdatum).setVisible(true);
        } 
        
        
    }//GEN-LAST:event_btnListaAliensActionPerformed

    private void tfSeAliensOmradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSeAliensOmradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSeAliensOmradeActionPerformed

    private void btnGaTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGaTillbakaActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnGaTillbakaActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAliensInomOmråde;
    private javax.swing.JButton btnAndraRas;
    private javax.swing.JButton btnGaTillbaka;
    private javax.swing.JButton btnListaAliens;
    private javax.swing.JButton btnRegistreraAlien;
    private javax.swing.JButton btnSeAliensAvRas;
    private javax.swing.JButton btnSokEnAlien;
    private javax.swing.JButton btnTaBortAlien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAdminFunktion;
    private javax.swing.JLabel lblListaAliens;
    private javax.swing.JLabel lblRegistreraAlien;
    private javax.swing.JLabel lblSeAliens;
    private javax.swing.JLabel lblSeAliensAvRas;
    private javax.swing.JLabel lblStrack;
    private javax.swing.JTextField tfDatum1;
    private javax.swing.JTextField tfDatum2;
    private javax.swing.JTextField tfSeAliensAvRas;
    private javax.swing.JTextField tfSeAliensOmrade;
    // End of variables declaration//GEN-END:variables
}
