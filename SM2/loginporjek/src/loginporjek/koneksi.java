/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginporjek;


import java.sql.*;
import javax.swing.*;


public class koneksi {
    Connection con;
    private static final String URL = "jdbc:mysql://localhost:3306/loh";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
    public static void main(String args[]) {
        try (Connection conn= getConnection()){
            System.out.println("Koneksi berhasil");
        } catch (Exception e) {
            System.out.println("Koneksi gagal" + e.getMessage());
        }
}
    
}
