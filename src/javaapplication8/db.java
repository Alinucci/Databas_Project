/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
/**
 *
 * @author мечта
 */
public class db {
    Connection conn = null;
    public static Connection java_db(){
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "ali", "ali");
            return conn;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
