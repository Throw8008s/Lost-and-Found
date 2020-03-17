/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asset.management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Christopher Rateng
 */
public class AssetManagement {

   Connection conn;
   Statement st;
   
    //public static Connection connectdb(){
    public void main(String[] args) {
        //String sql = "jdbc:derby://localhost:1527/Application", "CRATENG", "0000";
        try{
          conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Application","crateng","0000");  
        }
        catch (Exception e){
            return;
        }
    }
    
}
