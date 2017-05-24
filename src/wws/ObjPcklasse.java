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
public class ObjPcklasse {

    private int id;
    private String hersteller;
    private String modell;
    
    public ObjPcklasse(int ID, String HERSTELLER, String MODELL)
    {        

        this.id = ID;
        this.hersteller = HERSTELLER;
        this.modell = MODELL;
    }
    

    
    public int getID() {
        return id;
    }
    
    public String getHersteller()
    {        
        return hersteller;
    }
    
    public String getModell()
    {        
        return modell;
    }



    
}
