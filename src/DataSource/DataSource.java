/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataSource; 
import java.sql.*;
import javafx.scene.control.ComboBox; 
import java.util.*;

/**
 *
 * @author Arbia
 */
public class DataSource {

/**
 *
 * @author Arbia
 */
     private static DataSource data;
    static String username="root";
    static String password="root";
    static String url="jdbc:mysql://localhost:3306/cupcake";
    static Connection con; 
     
     

    public Connection getConnection() {
           return con;
    }
    
    public DataSource() {
        try { 
        
            con=DriverManager.getConnection(url, username, password);
            System.out.println("connection retablie");       
            
        
        } catch (SQLException ex) {
                System.out.println(ex);
        } 
        
    }
    
    public static DataSource getInstance(){
        if(data==null){
            data=new DataSource();
        }
      return data;
    }
}
