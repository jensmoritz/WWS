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
    
    private String url;
    private String benutzer;
    private String passwort;
    
    public ObjVerbindung (String URL, String BENUTZER, String PASSWORT) {
        this.url = URL;
        this.benutzer = BENUTZER;
        this.passwort = PASSWORT;
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
}
