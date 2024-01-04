
import java.awt.Color;
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
 * @author hanna
 */
public class TaBortAlien extends javax.swing.JFrame {

    private InfDB idb;

    /**
     * Creates new form TaBortAlien
     */
    public TaBortAlien(InfDB idb) {
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

        btnTaBortAlien = new javax.swing.JToggleButton();
        lblAngeEpost = new javax.swing.JLabel();
        tfSoktEpost = new javax.swing.JTextField();
        cbTaBort = new javax.swing.JCheckBox();
        btnAvbryt = new javax.swing.JButton();
        taVarningsruta = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnTaBortAlien.setText("Ta bort alien");
        btnTaBortAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortAlienActionPerformed(evt);
            }
        });

        lblAngeEpost.setText("Vänligen ange epost för den alien du vill ta bort:");

        cbTaBort.setText("Jag förstår");
        cbTaBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTaBortActionPerformed(evt);
            }
        });

        btnAvbryt.setText("Gå tillbaka");
        btnAvbryt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvbrytActionPerformed(evt);
            }
        });

        taVarningsruta.setEditable(false);
        taVarningsruta.setColumns(20);
        taVarningsruta.setRows(5);
        taVarningsruta.setText("OBS!\nAtt ta bort en alien innebär att all dens \ndata försvinner från systemet. Denna \ninformation går inte att återfå.");
        taVarningsruta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(btnTaBortAlien)
                        .addGap(82, 82, 82)
                        .addComponent(btnAvbryt))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(cbTaBort))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(tfSoktEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(lblAngeEpost)))
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(taVarningsruta, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblAngeEpost)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSoktEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addComponent(cbTaBort)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTaBortAlien)
                    .addComponent(btnAvbryt))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(taVarningsruta, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Knapp som tar bort en alien ur systemet
    private void btnTaBortAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortAlienActionPerformed
        if (cbTaBort.isSelected()) {
        //Kör en validering på att eposten finns och rutan inte är tom
        if (Validering.textFaltHarVarde(tfSoktEpost) && Validering.alienEpostFinnsSok(tfSoktEpost)) {
        try {
        //hämtar epost från rutan
        String valdEpost = tfSoktEpost.getText();
        //skapar en fråga
        String fraga = "delete from alien where epost = '" + valdEpost + "'";
        //Tar först bort alien från sin eventuella ras
        DataBasFragor.taBortRas(valdEpost);
        //tar bort en alien
        idb.delete(fraga);
        JOptionPane.showMessageDialog(null, "Alien har tagits bort.");
        } catch(InfException ex){
          Logger.getLogger(TaBortAlien.class.getName()).log(Level.SEVERE, null, ex);
    } 
    }
        }
        else {
            JOptionPane.showMessageDialog(this, "Du måste klicka i rutan för att kunna ta bort");
        }
    }//GEN-LAST:event_btnTaBortAlienActionPerformed

    private void cbTaBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTaBortActionPerformed
        // Ändrar färg på "ta bort" knappen ifall rutan är intryckt
        if (cbTaBort.isSelected()) {
            btnTaBortAlien.setForeground(Color.red);
        }
        else {
            btnTaBortAlien.setForeground(Color.black);
        }
    }//GEN-LAST:event_cbTaBortActionPerformed

    private void btnAvbrytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvbrytActionPerformed
        // Stänger fönstret
        dispose();
    }//GEN-LAST:event_btnAvbrytActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvbryt;
    private javax.swing.JToggleButton btnTaBortAlien;
    private javax.swing.JCheckBox cbTaBort;
    private javax.swing.JLabel lblAngeEpost;
    private javax.swing.JTextArea taVarningsruta;
    private javax.swing.JTextField tfSoktEpost;
    // End of variables declaration//GEN-END:variables
}
