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
public class ObjPcbestand {
    
    private int WWS_Nr;
    private int PCKlassenID;
    private boolean Aktuell_im_Lager;
    private String Hersteller;
    private String Modell;
    //Datum
    //Fremd_Nr
    
    public ObjPcbestand (int WWSNR, int PCKLASSENID, boolean LAGER) {
        this.WWS_Nr = WWSNR;
        this.PCKlassenID = PCKLASSENID;
        this.Aktuell_im_Lager = LAGER;        
    }
    
    public ObjPcbestand (int WWSNR, int PCKLASSENID, String HERSTELLER, String MODELL, boolean LAGER) {
        this.WWS_Nr = WWSNR;
        this.PCKlassenID = PCKLASSENID;
        this.Aktuell_im_Lager = LAGER;        
        this.Hersteller = HERSTELLER;
        this.Modell = MODELL;
    }    
    
    
    
    public int get_WWS_Nr () {
        return WWS_Nr;
    }
    
    public int get_PCKlassenID () {
        return PCKlassenID;
    }
    
    public boolean get_Aktuell_im_Lager () {
        return Aktuell_im_Lager;
    }
    
    public String get_Hersteller () {
        return Hersteller;    
    }    
    
    public String get_Modell () {
        return Modell;
    }
    
}
