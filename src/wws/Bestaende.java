
package wws;

public class Bestaende {
    
    private int KlassenID;
    private String Bezeichnung;
    private int Summe;
    
    public Bestaende(int BESTAENDE_KLASSENID, String BESTAENDE_BEZEICHNUNG, int BESTAENDE_SUMME)
    {        
        this.KlassenID = BESTAENDE_KLASSENID;
        this.Bezeichnung = BESTAENDE_BEZEICHNUNG;
        this.Summe = BESTAENDE_SUMME;
    }
    
    public int getKlassenID2()
    {        
        return KlassenID;
    }
    
    public String getBezeichnung2()
    {        
        return Bezeichnung;
    }
    
    public int getSumme()
    {        
        return Summe;
    } 
}
