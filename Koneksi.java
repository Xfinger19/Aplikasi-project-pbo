/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasi.penjualan.rumah;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author CATURWARGA COMPUTER
 */
public class Koneksi {
    Connection Koneksi = null;
    public static Connection KoneksiDb(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection Koneksi = DriverManager.getConnection("jdbc:mysql://localhost/db_apprumah","root","");
            return Koneksi;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
}
