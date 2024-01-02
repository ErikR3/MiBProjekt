
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class RegistreraNyAlien extends javax.swing.JFrame {

    private InfDB idb;

    /**
     * Creates new form RegistreraNyAlien
     */
    public RegistreraNyAlien(InfDB idb) {
        initComponents();
        this.idb = idb;
        FyllPlats();
        FyllAgenter();
    }

    //Fyller combobox med platser
    private void FyllPlats() {
    try {
            String fraga ="select Benamning from plats";
            ArrayList<String> namnLista = idb.fetchColumn(fraga);
            for (String namn :namnLista){
                cbPlats.addItem(namn);
            }
        } catch (InfException ex) {
            Logger.getLogger(RegistreraNyAlien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //fyller combobox med agenter
    private void FyllAgenter() {
    try {
            String fraga ="select namn from agent";
            ArrayList<String> namnLista = idb.fetchColumn(fraga);
            for (String namn :namnLista){
                cbAnsvarigAgent.addItem(namn);
            }
        } catch (InfException ex) {
            Logger.getLogger(RegistreraNyAlien.class.getName()).log(Level.SEVERE, null, ex);
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

        tfNummer = new javax.swing.JTextField();
        tfNamn = new javax.swing.JTextField();
        lblNamn = new javax.swing.JLabel();
        lblNummer = new javax.swing.JLabel();
        lblEpost = new javax.swing.JLabel();
        lblRubrik = new javax.swing.JLabel();
        tfEpost = new javax.swing.JTextField();
        tfDatum = new javax.swing.JTextField();
        lblDatum = new javax.swing.JLabel();
        pfLosenord = new javax.swing.JPasswordField();
        lblLosenord = new javax.swing.JLabel();
        btnRegistreraNyAlien = new javax.swing.JButton();
        lblAnsvarigAgent = new javax.swing.JLabel();
        lblPlats = new javax.swing.JLabel();
        cbAnsvarigAgent = new javax.swing.JComboBox<>();
        cbPlats = new javax.swing.JComboBox<>();
        btnAvbryt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblNamn.setText("Namn:");

        lblNummer.setText("Telefonnummer:");

        lblEpost.setText("Epost:");

        lblRubrik.setText("Ny alien");

        lblDatum.setText("Datum:");

        lblLosenord.setText("Lösenord:");

        btnRegistreraNyAlien.setText("Registrera ny alien");
        btnRegistreraNyAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraNyAlienActionPerformed(evt);
            }
        });

        lblAnsvarigAgent.setText("Ansvarig agent:");

        lblPlats.setText("Plats:");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(lblRubrik))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRegistreraNyAlien)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNamn)
                                    .addComponent(lblNummer)
                                    .addComponent(lblEpost)
                                    .addComponent(lblLosenord))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNummer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfEpost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pfLosenord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDatum)
                                        .addGap(8, 8, 8)
                                        .addComponent(tfDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblAnsvarigAgent)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPlats)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(btnAvbryt)))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblRubrik)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNamn)
                            .addComponent(tfNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNummer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEpost)
                            .addComponent(tfEpost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLosenord)
                            .addComponent(pfLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDatum)
                            .addComponent(tfDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAnsvarigAgent)
                            .addComponent(cbAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPlats))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistreraNyAlien)
                    .addComponent(btnAvbryt))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Knapp som kommer lägge in en ny alien med informationen som är inskriven i de olika textfälten.
    private void btnRegistreraNyAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraNyAlienActionPerformed
        try {  
            //Kontrollera så ingen ruta är tom, annars felmeddelande "Alla fält måste vara ifyllda!"
            if (Validering.textFaltHarVarde(tfDatum)) {
            //Lagra all inskriven info
            String id = idb.getAutoIncrement("alien", "Alien_ID");
            String namn = tfNamn.getText();
            String nummer = tfNummer.getText();
            String epost = tfEpost.getText();
            String datum = tfDatum.getText();
            String platsNamn = cbPlats.getSelectedItem().toString();
            String ansvarigAgentNamn = cbAnsvarigAgent.getSelectedItem().toString();
            char[] losenChar = pfLosenord.getPassword();
            String losen = new String(losenChar);
            
            //ge rätt värde åt plats & ansvarig agent
            String fragaPlats = "select Plats_ID from plats where benamning = '" + platsNamn + "'";
            String fragaAgent = "select Agent_ID from agent where namn = '" + ansvarigAgentNamn + "'";
            String plats = idb.fetchSingle(fragaPlats);
            String ansvarigAgent = idb.fetchSingle(fragaAgent);
            
            //Kontrollera så emailen är unik, samt ev. även så den är i rätt format(?)
                              
            //Kontrollera alla fält så de är i rätt format. (typ string, int o.s.v)
            
            //formatera en fråga
            String nyAlien = id+",'"+namn+"',"+"'"+epost+"',"+"'"+nummer+"',"+"'"+losen+"',"+"'"+datum+"',"+plats+","+ansvarigAgent;
            String nyAlienFraga = "insert into alien (Alien_ID, Namn, Epost, Telefon, Losenord, Registreringsdatum, Plats, Ansvarig_Agent) values("+nyAlien+")";
            //Skapa den nya alien
            idb.insert(nyAlienFraga);
        
        }
        } catch (InfException ex) {
            Logger.getLogger(RegistreraNyAlien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegistreraNyAlienActionPerformed

    private void btnAvbrytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvbrytActionPerformed
        //Stänger ner fönstret
        dispose();
    }//GEN-LAST:event_btnAvbrytActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvbryt;
    private javax.swing.JButton btnRegistreraNyAlien;
    private javax.swing.JComboBox<String> cbAnsvarigAgent;
    private javax.swing.JComboBox<String> cbPlats;
    private javax.swing.JLabel lblAnsvarigAgent;
    private javax.swing.JLabel lblDatum;
    private javax.swing.JLabel lblEpost;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblNummer;
    private javax.swing.JLabel lblPlats;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JPasswordField pfLosenord;
    private javax.swing.JTextField tfDatum;
    private javax.swing.JTextField tfEpost;
    private javax.swing.JTextField tfNamn;
    private javax.swing.JTextField tfNummer;
    // End of variables declaration//GEN-END:variables
}
