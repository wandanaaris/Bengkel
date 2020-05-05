/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author PUSIKNAS POLRI
 */
public class koneksidb {
private static Connection cn;
   
    public static Connection getKoneksi() {
        if (cn == null) {
            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                cn = DriverManager.getConnection("jdbc:mysql://localhost/bengkel", "root", "");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return cn;
    }
}
