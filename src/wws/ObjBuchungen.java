
package wws;

public class ObjBuchungen {
    
    private int bestandsID;
    private int menge;
    private String bezeichnung;    
    private int benutzerID;
    private String buchungsDatum;
    
    
    public ObjBuchungen(int bestandsID, int menge, String bezeichnung, int benutzerID, String buchungsDatum)
    {  
      
      this.bestandsID = bestandsID;
      this.menge = menge;
      this.bezeichnung = bezeichnung;
      this.benutzerID = benutzerID;
      this.buchungsDatum = buchungsDatum;
    }
    
    public int getbestandsID()
    {        
        return bestandsID;
    }
    
    public String getbuchungsDatum()
    {        
        return buchungsDatum;
    }
  
    public int getmenge()
    {        
        return menge;
    }

    public String getbezeichnung()
    {        
        return bezeichnung;
    }

    public int getbenutzerID()
    {        
        return benutzerID;
    }    
}
