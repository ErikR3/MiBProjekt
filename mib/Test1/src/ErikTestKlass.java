
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
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
 * @author Erik
 */
public class ErikTestKlass extends javax.swing.JFrame {

    private static InfDB idb;
    
    /**
     * Creates new form ErikTestKlass
     */
    public ErikTestKlass() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabellTest = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        kolNamnKnapp = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabellTest.setText("Hämta radantal");
        tabellTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabellTestActionPerformed(evt);
            }
        });

        jButton1.setText("Hämta kolumnantal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        kolNamnKnapp.setText("Kolumnnamn");
        kolNamnKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolNamnKnappActionPerformed(evt);
            }
        });

        jButton2.setText("topp3Agent");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(kolNamnKnapp)
                    .addComponent(jButton1)
                    .addComponent(tabellTest))
                .addContainerGap(233, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(tabellTest)
                .addGap(58, 58, 58)
                .addComponent(jButton1)
                .addGap(33, 33, 33)
                .addComponent(kolNamnKnapp)
                .addGap(37, 37, 37)
                .addComponent(jButton2)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabellTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabellTestActionPerformed
       DataBasFragor.getRadAntal(1);
    }//GEN-LAST:event_tabellTestActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DataBasFragor.getID("agent");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void kolNamnKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolNamnKnappActionPerformed
        // TODO add your handling code here:
        System.out.println(DataBasFragor.getKolumnNamn("agent"));
        
    }//GEN-LAST:event_kolNamnKnappActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Topp3Agent kallaPaKonst = new Topp3Agent(DataBasFragor.getAntalAliens());
        kallaPaKonst.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ErikTestKlass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ErikTestKlass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ErikTestKlass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ErikTestKlass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new ErikTestKlass().setVisible(true);
            }
        });
        /* Create and display the form */
         try {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
        } catch (InfException ex) {
            Logger.getLogger(Inloggning.class.getName()).log(Level.SEVERE, null, ex);
        }
        new DataBasFragor(idb);
                String e = "J";
                String i = null;
                String epost = "ao@mib.net";
        try{
        
        i = idb.fetchSingle("Select Administrator from agent where Epost like '" + epost + "'");
        } catch (InfException ex){
           ex.printStackTrace();
        }
        System.out.println(e);
        if(i.trim().equals(e.trim())){
        System.out.println(i);
        }
        getAntalAliens();
    }
            public static ArrayList<HashMap<String, String>> getAntalAliens()
        {
            ArrayList<HashMap<String, String>> raknadeAliens = null;
            try{
            raknadeAliens = idb.fetchRows("select Ansvarig_Agent, count(Ansvarig_Agent) as row_count from alien group by Ansvarig_Agent order by row_count DESC");
            } catch (InfException e){
                e.printStackTrace();
            }
            for(HashMap<String, String> HM : raknadeAliens){
                System.out.println("ID: " + HM.get("Ansvarig_Agent") + ", Antal Aliens: " + HM.get("row_count"));
            }
            return raknadeAliens;
        }

    



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton kolNamnKnapp;
    private javax.swing.JButton tabellTest;
    // End of variables declaration//GEN-END:variables
}
