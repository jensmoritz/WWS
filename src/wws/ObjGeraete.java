
package wws;

//Testkommentar von Moritz

public class ObjGeraete {
    
    private int KlassenID;
    private String Bezeichnung;
    
    public ObjGeraete(int GERAETE_KLASSENID, String GERAETE_BEZEICHNUNG)
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
