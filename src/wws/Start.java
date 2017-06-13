
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wws;

/**
 *
 * @author bfw
 */
public class Start {

  /**
   * @param args the command line arguments
   */
  
  public static void main(String[] args) {
    //new loginpage(null, true).show();
    Login go = new Login(new javax.swing.JFrame(), true);
    go.setVisible(true);
    //go.show();

    //-- Falls der Benutzer eingeloggt ist, Menü anzeigen
    
    if (DBConnection.getnUserId() > 0) {
      menue mm = new menue();
//      mm.show();
        mm.setVisible(true);
    }

  }

}
