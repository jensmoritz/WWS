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
public class ObjVerbindung {
    
    private String name;
    private String url;
    private String benutzer;
    private String passwort;
    private boolean aktiv = false;
    
    public ObjVerbindung (String URL, String BENUTZER, String PASSWORT, String NAME) {
        this.url = URL;
        this.benutzer = BENUTZER;
        this.passwort = PASSWORT;
        this.name = NAME;
    }
    
    public ObjVerbindung (String URL, String BENUTZER, String PASSWORT, String NAME, boolean AKTIV) {
        this.url = URL;
        this.benutzer = BENUTZER;
        this.passwort = PASSWORT;
        this.name = NAME;
        this.aktiv = AKTIV;
    }  
    
    public String getUrl() {
        return url;
    }

    public String getBenutzer() {
        return benutzer;
    }
    
    public String getPasswort() {
        return passwort;
    }
    
    public boolean getAktiv() {
        return aktiv;
    }
    
    public String getName() {
        return name;
    }
}
