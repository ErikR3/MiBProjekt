
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
public class BytLosenord extends javax.swing.JFrame {

    private InfDB idb;
    
    public BytLosenord(InfDB idb) {
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

        pfGamla = new javax.swing.JPasswordField();
        pfNya = new javax.swing.JPasswordField();
        lblGamla = new javax.swing.JLabel();
        lblNya = new javax.swing.JLabel();
        btnBytLosen = new javax.swing.JButton();
        btnGaTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblGamla.setText("Ditt gamla lösenord");

        lblNya.setText("Ditt nya lösenord");

        btnBytLosen.setText("Byt lösenord");
        btnBytLosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBytLosenActionPerformed(evt);
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
                .addGap(149, 149, 149)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblGamla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pfGamla)
                    .addComponent(pfNya)
                    .addComponent(btnBytLosen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNya, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(146, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGaTillbaka)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(lblGamla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfGamla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(lblNya)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfNya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnBytLosen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGaTillbaka)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// 
//      Kontrollerar att användare kan sitt lösenord med hjälp av valideringsklassen
////    och updaterar databasen med dett nya lösenordet
            
    private void btnBytLosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBytLosenActionPerformed
       try {    
           //Kontroll på eventuellt tomma inmatningar
        if (Validering.textFaltHarVarde(pfGamla) && Validering.textFaltHarVarde(pfNya)) {       
        char[] gamlaLosenChar = pfGamla.getPassword();
        String gamlaLosen = new String(gamlaLosenChar);
        char[] nyaLosenChar = pfNya.getPassword();
        String nyaLosen = new String(nyaLosenChar);
        String sqlHamta;
        //Kontroll på längden av dde tnya lösenordet
        if (Validering.isLosenRattLangd(nyaLosen)) {            
        if(!Validering.getAlienStatus()) {
            sqlHamta= idb.fetchSingle("select Losenord from agent where Agent_ID = " + Validering.getIDInloggning());
        } else {
            sqlHamta= idb.fetchSingle("select Losenord from alien where Alien_ID = " + Validering.getIDInloggning());
        }
        
        if (!Validering.getAlienStatus() && gamlaLosen.equals(sqlHamta)){
            idb.update("update agent set Losenord = '" + nyaLosen + "' where Agent_ID = " + Validering.getIDInloggning());
            JOptionPane.showMessageDialog(rootPane, "Ditt lösenord är nu bytt!");
        } else if (gamlaLosen.equals(sqlHamta) && Validering.getAlienStatus()){
            idb.update("update alien set Losenord = '" + nyaLosen + "' where Alien_ID = " + Validering.getIDInloggning());
            JOptionPane.showMessageDialog(null, "Ditt lösenord är nu bytt!");
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Lösenordet du angivit stämmer ej överens med ditt gamla");
        }
       }
       }
       }
       catch (InfException ex) {
           Logger.getLogger(BytLosenord.class.getName()).log(Level.SEVERE, null, ex);
       }            
    }//GEN-LAST:event_btnBytLosenActionPerformed

    private void btnGaTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGaTillbakaActionPerformed
        dispose();
    }//GEN-LAST:event_btnGaTillbakaActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBytLosen;
    private javax.swing.JButton btnGaTillbaka;
    private javax.swing.JLabel lblGamla;
    private javax.swing.JLabel lblNya;
    private javax.swing.JPasswordField pfGamla;
    private javax.swing.JPasswordField pfNya;
    // End of variables declaration//GEN-END:variables
}
