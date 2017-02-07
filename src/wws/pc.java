
package wws;

public class pc {
    
    private int wws_barcode;
    private int bfw_barcode;
    private String hersteller;
    private String modell;
    
    public pc(int WWS_BARCODE, int BFW_BARCODE, String HERSTELLER, String MODELL)
    {        
        this.wws_barcode = WWS_BARCODE;
        this.bfw_barcode = BFW_BARCODE;
        this.hersteller = HERSTELLER;
        this.modell = MODELL;
    }
    
    public int getWWS_Barcode()
    {        
        return wws_barcode;
    }
     
    public int getBFW_Barcode()
    {        
        return bfw_barcode;
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
