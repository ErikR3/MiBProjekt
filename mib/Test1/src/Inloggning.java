
import java.util.HashSet;
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
public class Inloggning extends javax.swing.JFrame {
   
    private InfDB idb;
    private boolean isAlien;
    /**
     * Creates new form Huvudfonster
     */
    public Inloggning(InfDB idb) {
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

        jPasswordField1 = new javax.swing.JPasswordField();
        btnLoggaIn = new javax.swing.JButton();
        tfEpost = new javax.swing.JTextField();
        pfLosen = new javax.swing.JPasswordField();
        lblEpost = new javax.swing.JLabel();
        lblLosen = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLoggaIn.setText("Logga in");
        btnLoggaIn.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnLoggaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaInActionPerformed(evt);
            }
        });

        tfEpost.setToolTipText("");
        tfEpost.setActionCommand("<Not Set>");

        lblEpost.setText("Ange din epost:");

        lblLosen.setText("Ange ditt lösenord:");

        jToggleButton1.setText("Alien");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEpost)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLoggaIn)
                        .addGap(37, 37, 37)
                        .addComponent(jToggleButton1))
                    .addComponent(tfEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pfLosen, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblLosen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(lblEpost)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEpost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLosen)
                .addGap(4, 4, 4)
                .addComponent(pfLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoggaIn)
                    .addComponent(jToggleButton1))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoggaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaInActionPerformed
        String epost = tfEpost.getText();
        String fraga = "select losenord from agent where Epost = '" + epost + "'";
        String fraga1 = "select losenord from alien where Epost = '" + epost + "'";
        
        try {
            String losen;
            if(!isAlien){
                losen = idb.fetchSingle(fraga);
            } else {
                losen = idb.fetchSingle(fraga1);
            }
            String i = idb.fetchSingle("Select Administrator from agent where Epost like '" + epost + "'");
            String e = "J";
            
            char[] losenordChar = pfLosen.getPassword();
            String losenord = new String(losenordChar);
                    
            if(losenord.equals(losen)){    
            if(!isAlien){
            new HuvudMenyAgent(idb).setVisible(true);
            } else {
                new HuvudMenyAlien().setVisible(true);
            }
            new DataBasFragor(idb);
            new Validering(idb);
            setVisible(false);
            
            if(!isAlien){           
                Validering.setOmrade(idb.fetchSingle("select Benamning from omrade where Omrades_ID in (select Omrade from agent where Epost like '" + epost + "')"));
                Validering.setAgentInloggning(idb.fetchSingle("Select Agent_ID from agent where Epost like '" + epost + "'"));
                    if(i.trim().equals(e.trim())){
                        Validering.setAdminStatus(true);
                    }
                } else {
                Validering.setOmrade(idb.fetchSingle("select Benamning from omrade where Omrades_ID in (select Finns_i from plats where Plats_ID in (select Plats from alien where Epost like '" + epost + "'))"));
                Validering.setAdminStatus(false);
            }
            }
            else if (losen == null ) {
                JOptionPane.showMessageDialog(null, "Fel epost!");
            }
            else {
                JOptionPane.showMessageDialog(null, "Fel Lösenord!");
            }
        }
        catch (InfException ex) {
            Logger.getLogger(Inloggning.class.getName()).log(Level.SEVERE, null, ex);           
        }
        
        
    }//GEN-LAST:event_btnLoggaInActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        if(!isAlien){
             isAlien = true;
        } else if (isAlien){
            isAlien = false;
        } else {
            isAlien = true;
        }

    }//GEN-LAST:event_jToggleButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoggaIn;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblEpost;
    private javax.swing.JLabel lblLosen;
    private javax.swing.JPasswordField pfLosen;
    private javax.swing.JTextField tfEpost;
    // End of variables declaration//GEN-END:variables
}
