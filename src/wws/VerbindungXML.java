/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wws;

import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import javax.xml.parsers.*;
import java.util.ArrayList;
import org.xml.sax.*;
import org.w3c.dom.*;
import java.io.*;

/**
 *
 * @author bfw
 */
public class VerbindungXML {
    
    static public boolean readXML(String xml) {
        ArrayList<String> rolev = new ArrayList<String>();
        Document dom;
        // Make an  instance of the DocumentBuilderFactory
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            // use the factory to take an instance of the document builder
            DocumentBuilder db = dbf.newDocumentBuilder();
            // parse using the builder to get the DOM mapping of the    
            // XML file
            dom = db.parse(xml);

            Element doc = dom.getDocumentElement();

            String url = "uu";
            url = getTextValue(url, doc, "url");

            String benutzer = "bb";
            benutzer = getTextValue(benutzer, doc, "benutzer");

            String passwort = "pp";
            passwort = getTextValue(passwort, doc, "passwort");

 //           System.out.println("u "+url+" b "+benutzer+" p "+passwort );
            return true;

        } catch (ParserConfigurationException pce) {
            System.out.println(pce.getMessage());
        } catch (SAXException se) {
            System.out.println(se.getMessage());
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }

        return false;
    }
    
    
    static private String getTextValue(String def, Element doc, String tag) {
    String value = def;
    NodeList nl;
    nl = doc.getElementsByTagName(tag);
    if (nl.getLength() > 0 && nl.item(0).hasChildNodes()) {
        for (int j=0;j<nl.getLength();j++) {
            System.out.println(j+nl.item(j).getFirstChild().getNodeValue());
        }
        nl.item(0).getAttributes();
//        value = nl.item(0).getFirstChild().getNodeValue();
//        System.out.println(nl.getLength()+" "+value);
    }
    return value;
}

    static public ArrayList<ObjVerbindung> getVerbindungenliste() {
        String ak_url;
        String ak_ben;
        String ak_pw;
        String ak_ak;
        String ak_text;
        ArrayList<ObjVerbindung> ak_ver = new ArrayList<>();
        Document dom;
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            dom = db.parse("db2.xml");

            
            Element doc = dom.getDocumentElement();
            NodeList nl = doc.getElementsByTagName("verbindung");

//                System.out.println(nl.getLength());
            for (int i = 0;i<nl.getLength();i++) {
                
//                System.out.println(i+" und "+nl.item(i).getNodeValue());
                NamedNodeMap nnm  =  nl.item(i).getAttributes();
  
                ak_url = nnm.getNamedItem("url").getNodeValue();    
                ak_ben = nnm.getNamedItem("benutzer").getNodeValue();
                ak_pw = nnm.getNamedItem("passwort").getNodeValue();
                ak_text = nl.item(i).getTextContent();
                ak_ak = nnm.getNamedItem("aktiv").getNodeValue();
                
                ak_ver.add(new ObjVerbindung(ak_url,ak_ben,ak_pw,ak_text,Boolean.parseBoolean(ak_ak)));                
            }
            return ak_ver;
                        
        } 
        catch (ParserConfigurationException pce) {
                System.out.println("3 "+pce.getMessage());
        } catch (SAXException se) {
                System.out.println("2 "+se.getMessage());
        } catch (IOException ioe) {
                System.err.println("1 "+ioe.getMessage());
        }
    
        ak_ver.add(new ObjVerbindung("aaa","bbb","ccc","ddd"));
        return ak_ver;        
    }
    
    static public ObjVerbindung getAktiveVerbindung() {
    
    //*
        String ak_url;
        String ak_ben;
        String ak_pw;
        String ak_text;
        ObjVerbindung ak_ver;
        
        ArrayList<ObjVerbindung> ov = getVerbindungenliste();
        for (int i = 0;i<ov.size();i++) {
            if (ov.get(i).getAktiv()) {
                ak_url = ov.get(i).getUrl();
                ak_ben = ov.get(i).getBenutzer();
                ak_pw = ov.get(i).getPasswort();
                ak_text = ov.get(i).getName();
                return new ObjVerbindung(ak_url,ak_ben,ak_pw,ak_text,true);
            }
        }        
        return  new ObjVerbindung("dummy_url","dummy_benutzer","dummy_passwort","dummy text");   
    }
    
    
public static void setVerbindung (String Name, String Url, String Benutzer, String Passwort ) {
    Document dom;
    Element e;


    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    try {
        DocumentBuilder db = dbf.newDocumentBuilder();
        dom = db.newDocument();
        
        ArrayList<ObjVerbindung> ov = getVerbindungenliste();
        
        
        Element rootEle = dom.createElement("verbindungenliste");

        for (int i=0;i<ov.size();i++) {
            e = dom.createElement("verbindung");
            e.setAttribute("passwort", ov.get(i).getPasswort());
            e.setAttribute("benutzer", ov.get(i).getBenutzer());
            e.setAttribute("url", ov.get(i).getUrl());
            e.setAttribute("aktiv", Boolean.toString(ov.get(i).getAktiv()));

            e.appendChild(dom.createTextNode(ov.get(i).getName()));
            rootEle.appendChild(e);            
        }
        // create data elements and place them under root

            e = dom.createElement("verbindung");
            e.setAttribute("passwort", Passwort);
            e.setAttribute("benutzer", Benutzer);
            e.setAttribute("url", Url);
            e.setAttribute("aktiv", "false");

            e.appendChild(dom.createTextNode(Name));
            rootEle.appendChild(e);                    


        dom.appendChild(rootEle);

        try {
            Transformer tr = TransformerFactory.newInstance().newTransformer();
            tr.setOutputProperty(OutputKeys.INDENT, "yes");
            tr.setOutputProperty(OutputKeys.METHOD, "xml");
            tr.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
//            tr.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM, "roles.dtd");
//            tr.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

            // send DOM to file
            tr.transform(new DOMSource(dom),  new StreamResult(new FileOutputStream("db2.xml")));

        } catch (TransformerException te) {
            System.out.println(te.getMessage());
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        } catch (ParserConfigurationException pce) {
        System.out.println("UsersXML: Error trying to instantiate DocumentBuilder " + pce);
    }
}



    public static void main(String args[]) {

//    readXML("db.xml");    
        ObjVerbindung v =  getAktiveVerbindung();
        System.out.println("aktive "+v.getBenutzer());

        ArrayList<ObjVerbindung> ov = getVerbindungenliste();
        for (int i = 0;i<ov.size();i++) {
            System.out.println(i+" "+ov.get(i).getUrl()+" "+ov.get(i).getAktiv());            
        }
//        setVerbindung();
        
    }
    
}
