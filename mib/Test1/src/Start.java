import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hanna
 */
public class Start {

    private static InfDB idb;

    public static void main(String[] args) {

        try {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
        } catch (InfException ex) {
            Logger.getLogger(Huvudfonster.class.getName()).log(Level.SEVERE, null, ex);
        }
        new Huvudfonster(idb).setVisible(true);
    }
}
