/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratikumsinta1.java;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author PC-12
 */
public class latihan1 {
  static final String DB_Url = "jdbc:mysql://localhost:3306/db_sinta";
  
  private static Connection Test_Konek;
  public static Connection DB_Konek() throws SQLException,ClassNotFoundException {
      try { 
          Driver myDriver = new com.mysql.jdbc.Driver();
          DriverManager.registerDriver(myDriver);
          System.out.println("Proses Deteksi Driver Berhasil");
          final java.sql.Connection tersambung = DriverManager.getConnection(DB_Url, "root","");
          System.out.println("Koneksi Database Berhasil");
      } catch (final SQLException ex) {
          System.out.println("Koneksi Database gagal");
      }
    return Test_Konek; }
    }
public static void main (String[] args) {
}

