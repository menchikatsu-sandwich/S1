/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginporjek;


import java.sql.*;
import javax.swing.*;


/**
 *
 * @author PIUS W S
 */
public class koneksi {
    Connection con;
    
    Connection getConnection(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/loh","root","");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal");
        }
        return con;
    }
}
