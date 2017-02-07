
package wws;

public class Bestaende {
    
    private int KlassenID;
    private String Bezeichnung;
    
    public Bestaende(int GERAETE_KLASSENID, String GERAETE_BEZEICHNUNG)
    {        
        this.KlassenID = GERAETE_KLASSENID;
        this.Bezeichnung = GERAETE_BEZEICHNUNG;
    }
    
    public int getKlassenID()
    {        
        return KlassenID;
    }
    
    public String getBezeichnung()
    {        
        return Bezeichnung;
    }
}
