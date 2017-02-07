/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wws;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author bfw
 */
public class DBConnection {
  //--- statisches Datenbankverbindungsobjekt;    

  public static Connection myConnection = null;

  //--- Benutzername Passwort
  public static String sUsername = "";
  public static int nUserId = 0;

  public static Connection getConnection2() {
    if (myConnection == null) {
      try {
        myConnection = DriverManager.getConnection("jdbc:mysql://192.168.151.123/Projekt_WWS", "IT1601", "IT1601");
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    return myConnection;
  }

  /*
       public static Connection getConnection() {
           
           Connection DBConnection;
           try {
               DBConnection = DriverManager.getConnection("jdbc:mysql://192.168.151.123/Projekt_WWS", "IT1601", "IT1601");
               //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projekt_wws", "root", "");
               return DBConnection;
           } catch (Exception e) {
               e.printStackTrace();
               return null;
           }
       }*/
}

//  public static void main(String[] args) {
// TODO code application logic here
//  }

