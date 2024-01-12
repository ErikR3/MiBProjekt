
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
public class TaBortAgent extends javax.swing.JFrame {

    private InfDB idb;
    /**
     * Creates new form TaBortAgent
     */
    public TaBortAgent(InfDB idb) {
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

        jCheckBox1 = new javax.swing.JCheckBox();
        lblAngeEpost = new javax.swing.JLabel();
        tfSoktEpost = new javax.swing.JTextField();
        cbTaBort = new javax.swing.JCheckBox();
        btnTaBortAgent = new javax.swing.JButton();
        btnAvbryt = new javax.swing.JButton();
        taVarningsruta = new javax.swing.JTextArea();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblAngeEpost.setText("Vänligen ange epost för den agent du vill ta bort:");

        cbTaBort.setText("Jag förstår");
        cbTaBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTaBortActionPerformed(evt);
            }
        });

        btnTaBortAgent.setText("Ta bort agent");
        btnTaBortAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortAgentActionPerformed(evt);
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
        taVarningsruta.setText("OBS!\nAtt ta bort en agent innebär att all dens \ndata försvinner från systemet. Denna \ninformation går inte att återfå.");
        taVarningsruta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        taVarningsruta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnTaBortAgent)
                .addGap(61, 61, 61)
                .addComponent(btnAvbryt)
                .addGap(90, 90, 90))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAngeEpost)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(tfSoktEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(cbTaBort)))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(taVarningsruta, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(lblAngeEpost)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSoktEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(cbTaBort)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTaBortAgent)
                    .addComponent(btnAvbryt))
                .addGap(42, 42, 42))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(taVarningsruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAvbrytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvbrytActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnAvbrytActionPerformed

    private void cbTaBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTaBortActionPerformed
        // Ändrar färg på "ta bort" knappen ifall rutan är intryckt
        if (cbTaBort.isSelected()) {
            btnTaBortAgent.setForeground(Color.red);
        }
        else {
            btnTaBortAgent.setForeground(Color.black);
        }
    }//GEN-LAST:event_cbTaBortActionPerformed

    private void btnTaBortAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortAgentActionPerformed
        // TODO add your handling code here:
        if (cbTaBort.isSelected()) {
        //Kör en validering på att eposten finns och rutan inte är tom
        if (Validering.textFaltHarVarde(tfSoktEpost) && Validering.agentEpostFinnsSok(tfSoktEpost)) {
        try {
        //hämtar epost från rutan
        String valdEpost = tfSoktEpost.getText();
        //skapar en fråga
        String fraga = "delete from agent where epost = '" + valdEpost + "'";
        //Hämtar eposten från det inloggade kontot
        String inloggatID = Validering.getIDInloggning();
        String inloggadEpost = idb.fetchSingle("select epost from agent where agent_id ="+inloggatID);
        //Kontrollerar om agenten är någon form av chef eller det inloggade kontot
        if (!inloggadEpost.equals(valdEpost)) {
        if (!DataBasFragor.hittaChef(valdEpost)){
        //Tar bort agenten från eventuell fältagentposition och från listan med eventuell inhavd utrustning
        DataBasFragor.taBortFaltagent(valdEpost);
        DataBasFragor.taBortUtrustningForEnAgent(valdEpost);
        //tar bort agenten
        idb.delete(fraga);
        JOptionPane.showMessageDialog(null, "Agenten har tagits bort.");
        }
        }
        else if (inloggadEpost.equals(valdEpost)){
            JOptionPane.showMessageDialog(null, "Du kan inte ta bort dig själv!");
        }
        } catch(InfException ex){
          Logger.getLogger(TaBortAlien.class.getName()).log(Level.SEVERE, null, ex);
    } 
    }
        }
        else {
            JOptionPane.showMessageDialog(this, "Du måste klicka i rutan för att kunna ta bort");
        }
    }//GEN-LAST:event_btnTaBortAgentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvbryt;
    private javax.swing.JButton btnTaBortAgent;
    private javax.swing.JCheckBox cbTaBort;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel lblAngeEpost;
    private javax.swing.JTextArea taVarningsruta;
    private javax.swing.JTextField tfSoktEpost;
    // End of variables declaration//GEN-END:variables
}
