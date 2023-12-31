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
 * @author sarajosefinahansson
 */
public class RaderaAllUtrustningAdmin extends javax.swing.JFrame {

        private InfDB idb;
    /**
     * Creates new form RaderaAllUtrustningAdmin
     */
    public RaderaAllUtrustningAdmin(InfDB idb) {
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

        iblUtrustningRaderaAdmin = new javax.swing.JLabel();
        btnRadera = new javax.swing.JButton();
        txtRaderaUtrustning = new javax.swing.JTextField();
        btnGaTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        iblUtrustningRaderaAdmin.setText("Radera utrustning från systemet");

        btnRadera.setText("Radera");
        btnRadera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaderaActionPerformed(evt);
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
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRaderaUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRadera)
                    .addComponent(iblUtrustningRaderaAdmin))
                .addContainerGap(161, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGaTillbaka)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(iblUtrustningRaderaAdmin)
                .addGap(10, 10, 10)
                .addComponent(txtRaderaUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRadera, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(btnGaTillbaka)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    //Denna kanpp kommer endast Admin åt via sin inloggning. Klickar man på knappen
    //kommer all utrustning som finns i systemet att raderas. 
    private void btnRaderaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaderaActionPerformed
            //Valideringen sker via valideringsklassen. Den kontrollerar att den inloggade användaren faktiskt är administratör.
            // Om användaren inte är administratör, se kommentrar längre ner. 
            if(Validering.getAdminStatus()){
            String utrustningNamn = txtRaderaUtrustning.getText();
            
            boolean hittad = false;
            try{
                ArrayList<String> utrustning = idb.fetchColumn("SELECT Benamning FROM Utrustning");
                
                //Denna validering kontrollerar att textfältet för att radera utrustningen inte är tom. Om ja, se kommentar längre ner. 
                //Den kontrollerar sedan att utrustningen är registerad, om inte, se kommentar längre ner. 
                if (Validering.textFaltHarVarde(txtRaderaUtrustning)) {
                    for (String namn : utrustning) {      
                        if (utrustningNamn.equals(namn)) {
                            hittad = true;
                        }               
                    }   
                    //Denna if-sats kontrollerar följande:
                    if (hittad) {
                        //Finns den utrustningen admin vill ta bort i databsen?
                        //Tar först bort utrustning från tabellen "innehar_utrustning" ifall den finns där
                        DataBasFragor.taBortKvitteradUtrustning(utrustningNamn);
                        //Tar sedan bort utrustning ur sin kategori ifall den finns där
                        DataBasFragor.taBortUtrustningFranKategori(utrustningNamn);
                        //Tar sedan bort utrustning ur systemet
                        String raderaUtrustning = ("DELETE FROM Utrustning WHERE Benamning = '"+ utrustningNamn + "'");
                    idb.delete(raderaUtrustning);
                    // Om utrustningen finns i Databasen får man upp en dialogruta som svar:
                        JOptionPane.showMessageDialog(null, "Utrustningen har blivit borttagen från systemet.");
                    } else if (!hittad) { 
                        //Om utrustningen inte finns i systemet får man upp en dialogruta som svar:
                        JOptionPane.showMessageDialog(null, "Utrustningen hittades inte i systemet.");
                    }
                    else {
                        //Om inmatningsrutan är tom får man upp en dialogruta som svar:
                    JOptionPane.showMessageDialog(null, "Inmatningsrutan är tom!");
                    }
                } 
            } catch (InfException ex) {
                Logger.getLogger(RaderaAllUtrustningAdmin.class.getName()).log(Level.SEVERE, null, ex);  
            }
    
    }//GEN-LAST:event_btnRaderaActionPerformed
            // Skulle man som agent eller alien logga in och försöka att ta bort utrustning, kommer man få upp följade dialogruta.
            //Det är endast administratörer som kan ta bort utrusning, där av valideringen i första if-satsen. (se kommentar längre upp)
            else {
                    JOptionPane.showMessageDialog(null, "Du är ej behörig att ta bort utrustning");
                }
 }        
    
    
    private void btnGaTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGaTillbakaActionPerformed
        //Denna knapp gör att du kommer tillbaka till Utrustningsmenyn
        dispose();
    }//GEN-LAST:event_btnGaTillbakaActionPerformed
            

    
    
    
   /**
     * @param args the command line arguments
     */
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGaTillbaka;
    private javax.swing.JButton btnRadera;
    private javax.swing.JLabel iblUtrustningRaderaAdmin;
    private javax.swing.JTextField txtRaderaUtrustning;
    // End of variables declaration//GEN-END:variables
}
