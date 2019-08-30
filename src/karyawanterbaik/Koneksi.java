/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karyawanterbaik;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author dani
 */
public class Koneksi {
    public Connection Koneksi;
    public Connection kon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Koneksi Berhasil");
        }catch (ClassNotFoundException e){
            System.out.println("Koneksi Gagal");
        }
        String url = "jdbc:mysql://localhost:3306/dbkp";
        try{
            Koneksi = DriverManager.getConnection(url, "root", "");
            System.out.println("Terhubung Ke Database");
        }catch (SQLException se){
            System.out.println("Tidak Terhubung Ke Database " + se);
        }
        return Koneksi;
    }
}
