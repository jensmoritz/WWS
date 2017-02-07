
package wws;

public class Geraete {
    
    private int KlassenID;
    private String Bezeichnung;
    
    public Geraete(int GERAETE_KLASSENID, String GERAETE_BEZEICHNUNG)
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
