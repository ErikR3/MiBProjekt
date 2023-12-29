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
 * @author hanna
 */
public class AndraRasPaAlien extends javax.swing.JFrame {

    private static InfDB idb;
    /**
     * Creates new form AndraRasPaAlien
     */
    public AndraRasPaAlien(InfDB idb) {
        initComponents();
        this.idb = idb;
    }

    private void fyllRaser() {
        cbRas.removeAllItems();
        cbRas.addItem("Boglodite");
        cbRas.addItem("Squid");
        cbRas.addItem("Worm"); 
    }
    private String hittaRasen() {
        String ras = "";
        try {
            String epost = tfEpost.getText();
            String alienID = idb.fetchSingle("select alien_id from alien where epost = '" + epost + "'");
            Boolean hittad = false;
            
            ArrayList<String> rasIDBog = idb.fetchColumn("select alien_ID from boglodite");
            for (String id : rasIDBog){
                if (alienID.equals(id)) {
                    ras = "Boglodite";
                    hittad = true;
                }
            }
            
            if (!hittad) {
                ArrayList<String> rasIDSquid = idb.fetchColumn("select alien_ID from squid");
                for (String id : rasIDSquid){
                    if (alienID.equals(id)) {
                        ras = "Squid";
                    }
                }
            }
            if (!hittad) {
                ArrayList<String> rasIDWorm = idb.fetchColumn("select alien_ID from worm");
                for (String id : rasIDWorm){
                    if (alienID.equals(id)) {
                        ras = "Worm";
                    }
                }
            }
        } catch (InfException ex) {
            Logger.getLogger(AndraRasPaAlien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ras;
    }
    
    private void taBortRas() {
        try {
        String epost = tfEpost.getText();
        String alienID = idb.fetchSingle("select alien_id from alien where epost = '" + epost + "'");
        if (!hittaRasen().isEmpty()){
          idb.delete("delete from "+hittaRasen()+" where alien_id ="+alienID);
        }
        } catch (InfException ex) {
            Logger.getLogger(AndraRasPaAlien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void kollaRas() {
        
        cbRas.removeAllItems();
        tfRasAttribut.setText("");
        lblPrefix.setText("");
        lblRas.setText("Den har:");
        String attribut = "";
        try {
            String epost = tfEpost.getText();
            String ras = "";
            String alienID = idb.fetchSingle("select alien_id from alien where epost = '" + epost + "'");
            Boolean hittad = false;
            
            ArrayList<String> rasIDBog = idb.fetchColumn("select alien_ID from boglodite");
            for (String id : rasIDBog){
            if (alienID.equals(id)) {
            ras = "Boglodite";
            hittad = true;
            }
            }
            
            if (!hittad) {
            ArrayList<String> rasIDSquid = idb.fetchColumn("select alien_ID from squid");
            for (String id : rasIDSquid){
            if (alienID.equals(id)) {
            ras = "Squid";
            }
            }  
            }
            if (!hittad) {
            ArrayList<String> rasIDWorm = idb.fetchColumn("select alien_ID from worm");
            for (String id : rasIDWorm){
            if (alienID.equals(id)) {
            ras = "Worm";
            }
            }  
            }
            
            switch (ras) {
                case "Boglodite":
                    cbRas.addItem(ras);
                    lblPrefix.setText("boogies");
                    attribut = idb.fetchSingle("select Antal_boogies from boglodite where Alien_ID ="+alienID);
                    tfRasAttribut.setText(attribut);
                    break;
                case "Squid":
                    cbRas.addItem(ras);
                    lblPrefix.setText("armar");
                    attribut = idb.fetchSingle("select antal_armar from squid where Alien_ID ="+alienID);
                    tfRasAttribut.setText(attribut);
                    break;
                case "Worm":
                     cbRas.addItem(ras);
                     lblRas.setText("Den har längden");
                     lblPrefix.setText("meter");
                     attribut = idb.fetchSingle("select langd from worm where Alien_ID ="+alienID);
                     tfRasAttribut.setText(attribut);
                     break;
                default:
                     JOptionPane.showMessageDialog(null,"OBS denna alien tillhör ingen ras.");                                  
            }
        } catch (InfException ex) {
            Logger.getLogger(AndraRasPaAlien.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfEpost = new javax.swing.JTextField();
        lblAngeEpost = new javax.swing.JLabel();
        btnSok = new javax.swing.JButton();
        tfRasAttribut = new javax.swing.JTextField();
        lblDennaRas = new javax.swing.JLabel();
        lblRas = new javax.swing.JLabel();
        lblPrefix = new javax.swing.JLabel();
        cbRas = new javax.swing.JComboBox<>();
        btnAndraInfo = new javax.swing.JButton();
        btnAvbryt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblAngeEpost.setText("Ange alien epost:");

        btnSok.setText("Sök");
        btnSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokActionPerformed(evt);
            }
        });

        tfRasAttribut.setEditable(false);

        lblDennaRas.setText("Denna alien tillhör rasen:");

        lblRas.setText("Den har:");

        btnAndraInfo.setText("Ändra ras");
        btnAndraInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraInfoActionPerformed(evt);
            }
        });

        btnAvbryt.setText("Avbryt");
        btnAvbryt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvbrytActionPerformed(evt);
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
                        .addComponent(lblAngeEpost)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfEpost)
                                .addGap(18, 18, 18)
                                .addComponent(btnSok))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblDennaRas)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblRas)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(tfRasAttribut, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPrefix, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 100, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAndraInfo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAvbryt)))))
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lblAngeEpost)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSok))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDennaRas)
                    .addComponent(cbRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfRasAttribut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRas)
                    .addComponent(lblPrefix, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAvbryt)
                    .addComponent(btnAndraInfo))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokActionPerformed
        // TODO add your handling code here:
        kollaRas();
    }//GEN-LAST:event_btnSokActionPerformed

    private void btnAvbrytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvbrytActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnAvbrytActionPerformed

    private void btnAndraInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraInfoActionPerformed
        // TODO add your handling code here:       
        // Lagra titlar
        String epost = tfEpost.getText();
        String knappText = btnAndraInfo.getText();
        String valdText = "Ändra ras";
        //Om man trycker på "ändra" sätter det rutorna till förändringsbara
        if (knappText.equals(valdText)) {      
            btnAndraInfo.setText("Spara ändringar");
            tfRasAttribut.setEditable(true);
            fyllRaser();
            lblPrefix.setText("");
        }
        else {
            try {
                //hämta ny info och alien ID
                String rasAttribut = tfRasAttribut.getText();
                String rasNamn = cbRas.getSelectedItem().toString();
                String alienID = idb.fetchSingle("SELECT alien_ID FROM alien where epost = '"+epost+"'");
                boolean hittad = false;
                switch (rasNamn) {
                    case "Boglodite":
                        taBortRas();
                        idb.insert("insert into boglodite (Alien_ID, Antal_Boogies) values ("+alienID+","+rasAttribut+")");                                                                        
                        break;
                    case "Squid":
                        taBortRas();
                        idb.insert("insert into squid (Alien_ID, Antal_Armar) values ("+alienID+","+rasAttribut+")");
                        break;
                    case "Worm":
                        taBortRas();
                        idb.insert("insert into worm (Alien_ID, Langd) values ("+alienID+","+rasAttribut+")");                        
                        break;
                    default:
                        break;
                }               
                //Ändra tillbaka till oförändringsbart och fyller boxarna med ett värde igen
                btnAndraInfo.setText(valdText);
                tfRasAttribut.setEditable(false);
                    
                
            } catch (InfException ex) {
                Logger.getLogger(SokEfterEnAlien.class.getName()).log(Level.SEVERE, null, ex);
            }          
        }
    }//GEN-LAST:event_btnAndraInfoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraInfo;
    private javax.swing.JButton btnAvbryt;
    private javax.swing.JButton btnSok;
    private javax.swing.JComboBox<String> cbRas;
    private javax.swing.JLabel lblAngeEpost;
    private javax.swing.JLabel lblDennaRas;
    private javax.swing.JLabel lblPrefix;
    private javax.swing.JLabel lblRas;
    private javax.swing.JTextField tfEpost;
    private javax.swing.JTextField tfRasAttribut;
    // End of variables declaration//GEN-END:variables
}