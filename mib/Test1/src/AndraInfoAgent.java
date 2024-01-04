
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
 * @author johan
 */
public class AndraInfoAgent extends javax.swing.JFrame {
    InfDB idb;
    /**
     * Creates new form AndraInfoAgent
     */
    public AndraInfoAgent(InfDB idb) {
        initComponents();
        this.idb = idb;
        FyllOmrade();
    }
    
    private void FyllOmrade() {
        try {
            String Fraga = "Select Benamning from Omrade";
            ArrayList<String> omradeLista = idb.fetchColumn(Fraga);
            for (String omrade : omradeLista) {
                cbOmrade.addItem(omrade);
            }
        }
        catch (InfException ex) {
            Logger.getLogger(AndraChef.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSokEpost = new javax.swing.JLabel();
        txtAngeAgent = new javax.swing.JTextField();
        lblNamn = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        lblTelefon = new javax.swing.JLabel();
        txtTelefon = new javax.swing.JTextField();
        txtDatum = new javax.swing.JTextField();
        lblDatum = new javax.swing.JLabel();
        lblOmrade = new javax.swing.JLabel();
        cbOmrade = new javax.swing.JComboBox<>();
        btnAndraInfo = new javax.swing.JButton();
        btnGaTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblSokEpost.setText("Ange agent att ändra (epost)");

        lblNamn.setText("Namn");

        lblTelefon.setText("Telefonnummer");

        lblDatum.setText("Anställningsdatum");

        lblOmrade.setText("Område");

        cbOmrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj område" }));

        btnAndraInfo.setText("Ändra info");
        btnAndraInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraInfoActionPerformed(evt);
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
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefon)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblSokEpost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAngeAgent))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNamn)
                            .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOmrade)
                            .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDatum)
                            .addComponent(btnAndraInfo))))
                .addContainerGap(108, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGaTillbaka)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblSokEpost)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAngeAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamn)
                    .addComponent(lblDatum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefon)
                    .addComponent(lblOmrade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnAndraInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGaTillbaka)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//        Uppdaterar databasen om ett fält är ifyllt med information och ignorerar 
//          de toma fälten
    private void btnAndraInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraInfoActionPerformed
       
        String namn = txtNamn.getText();
        String telefon = txtTelefon.getText();
        String datum = txtDatum.getText();
        
        if (Validering.isNamnRattLangd(namn) && Validering.isTelefonRattLangd(telefon))
        try {
            String epost = txtAngeAgent.getText();
            String omrade = cbOmrade.getSelectedItem().toString();
            int index = 0;
            
            if (Validering.agentEpostFinnsSok(txtAngeAgent)){
                
                if (Validering.textFaltHarVardeUtanMsg(txtNamn)){
                    idb.update("Update agent set Namn = '" + namn + "' where Epost = '" + epost + "'");
                    index = 1;
                }
                if (Validering.textFaltHarVardeUtanMsg(txtTelefon)){
                    idb.update("Update agent set Telefon = '" + telefon + "' where Epost = '" + epost + "'");
                    index = 1;
                }
                if (Validering.textFaltHarVardeUtanMsg(txtDatum) && Validering.isDatum(txtDatum.getText())){
                    idb.update("Update agent set Anstallningsdatum = '" + datum + "' where Epost = '" + epost + "'");
                    index = 1;
                }
                if (!omrade.equals("Välj område")) {
                    String omradeID = DataBasFragor.getOmradesID(omrade);
                    idb.update("Update agent set Omrade = '" + omradeID + "' where Epost = '" + epost + "'");
                    index = 1;
                }
            }
            if (index == 1) {
                JOptionPane.showMessageDialog(rootPane, "Informationen har nu uppdaterats!");
            }
        }
        catch (InfException ex) {
            
        }
    }//GEN-LAST:event_btnAndraInfoActionPerformed

    private void btnGaTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGaTillbakaActionPerformed

        dispose();

        // TODO add your handling code here:

    }//GEN-LAST:event_btnGaTillbakaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraInfo;
    private javax.swing.JButton btnGaTillbaka;
    private javax.swing.JComboBox<String> cbOmrade;
    private javax.swing.JLabel lblDatum;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblOmrade;
    private javax.swing.JLabel lblSokEpost;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JTextField txtAngeAgent;
    private javax.swing.JTextField txtDatum;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
