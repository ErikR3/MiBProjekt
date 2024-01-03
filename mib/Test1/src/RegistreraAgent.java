import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

 
/**
 *
 * @author johan
 */
public class RegistreraAgent extends javax.swing.JFrame {
    private InfDB idb;
   
    
    public RegistreraAgent(InfDB idb) {
        initComponents();
        this.idb = idb;
        FyllPlats();
       
    }
//    Fyller combobox med områden
    private void FyllPlats() {
    try {
            String fraga ="select Benamning from plats";
            ArrayList<String> namnLista = idb.fetchColumn(fraga);
            for (String namn :namnLista){
                cbOmrade.addItem(namn);
            }
        } catch (InfException ex) {
            Logger.getLogger(RegistreraNyAlien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        lblNamn = new javax.swing.JLabel();
        lblTelefonnummer = new javax.swing.JLabel();
        lblAnstallningnummer = new javax.swing.JLabel();
        txtAnstallningsDatum = new javax.swing.JTextField();
        lblEpost = new javax.swing.JLabel();
        txtEpost = new javax.swing.JTextField();
        lblLosenord = new javax.swing.JLabel();
        lblOmrade = new javax.swing.JLabel();
        btnRegistrera = new javax.swing.JButton();
        pfLosenord = new javax.swing.JPasswordField();
        txtNamn = new javax.swing.JTextField();
        txtTelefonnummer = new javax.swing.JTextField();
        cbOmrade = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblNamn.setText("Namn");

        lblTelefonnummer.setText("Telefonnummer");

        lblAnstallningnummer.setText("Anställningsdatum");

        lblEpost.setText("Epost");

        lblLosenord.setText("Lösenord");

        lblOmrade.setText("Område");

        btnRegistrera.setText("Registrera");
        btnRegistrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNamn)
                    .addComponent(lblTelefonnummer)
                    .addComponent(lblAnstallningnummer)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefonnummer, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnstallningsDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrera)
                    .addComponent(lblOmrade)
                    .addComponent(lblLosenord)
                    .addComponent(txtEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEpost)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pfLosenord, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbOmrade, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamn)
                    .addComponent(lblEpost))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefonnummer)
                    .addComponent(lblLosenord))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pfLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtTelefonnummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnstallningnummer)
                    .addComponent(lblOmrade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnstallningsDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btnRegistrera)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    Skapar en ny rad i agent tabellen och stoppar in informationen från textfälten
//    Alla nya agenter startar utan adminstatus
    
    private void btnRegistreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraActionPerformed
//        Kontrollera så att inga rutor är toma
        if (Validering.textFaltHarVarde(txtNamn) && Validering.textFaltHarVarde(txtEpost) && Validering.textFaltHarVarde(txtTelefonnummer) && Validering.textFaltHarVarde(pfLosenord) && Validering.textFaltHarVarde(txtAnstallningsDatum)) {
        
       try {
        String id = idb.getAutoIncrement("agent", "Agent_ID");
        String namn = txtNamn.getText();
        String telefon = txtTelefonnummer.getText();
        String datum = txtAnstallningsDatum.getText();
        String epost = txtEpost.getText();
        char[] losenordChar = pfLosenord.getPassword();
        String losenord = new String (losenordChar);
        String omrade = cbOmrade.getSelectedItem().toString();
        
        if (!Validering.agentEpostFinns(epost) && Validering.isDatum(datum)) {
        
        
        String fragaPlats = "select Plats_ID from plats where benamning = '" + omrade + "'";
        String omradeID = idb.fetchSingle(fragaPlats);
        
        String fraga = "Insert into agent (Agent_ID,Namn,Telefon,Anstallningsdatum,Administrator,Epost,Losenord,Omrade) ";
        String values = "Values ("+id + ",'" + namn + "','" + telefon + "','" + datum + "','N','" + epost + "','" + losenord + "'," + omradeID + ")";
        String sql = fraga + values;
        idb.insert (sql);
        JOptionPane.showMessageDialog(rootPane, "En ny agent har nu lagts till");
        }
      }
        catch (InfException ex){
            Logger.getLogger(RegistreraAgent.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    }//GEN-LAST:event_btnRegistreraActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrera;
    private javax.swing.JComboBox<String> cbOmrade;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAnstallningnummer;
    private javax.swing.JLabel lblEpost;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblOmrade;
    private javax.swing.JLabel lblTelefonnummer;
    private javax.swing.JPasswordField pfLosenord;
    private javax.swing.JTextField txtAnstallningsDatum;
    private javax.swing.JTextField txtEpost;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtTelefonnummer;
    // End of variables declaration//GEN-END:variables
}
