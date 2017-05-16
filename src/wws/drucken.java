package wws;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import java.awt.print.*;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import javax.print.attribute.*;
import javax.print.attribute.standard.*;
import javax.print.attribute.standard.MediaSize.ISO;





       
public class drucken implements Printable {
    
    String data;
    drucken (){
                data = "HALLO";}
    drucken (String t) {
            data = t;
    }



    
    @Override
    public int print (Graphics g, PageFormat seitenformat, int anzahl) throws PrinterException {
    
//        System.out.println("funk print");
        
        
       if (anzahl > 0) {
            System.out.println (anzahl);
            return NO_SUCH_PAGE;
       }



       Graphics2D g2d = (Graphics2D)g;
       g2d.translate(seitenformat.getImageableX(), seitenformat.getImageableY());
       
       
    //code 128
//        String data = "WOW4IK";
        int width = 100;
        int height = 30;


        BufferedImage bild;
        
        try {
            MultiFormatWriter writer = new MultiFormatWriter();
            BitMatrix matrix = writer.encode(data, BarcodeFormat.CODE_128, width, height);
            bild = MatrixToImageWriter.toBufferedImage(matrix);
            g2d.drawImage(bild, null, 0, 0);

//            g2d.drawRect(0, 0, width, height);
//            g2d.setBackground(Color.gray);
            g2d.drawString(data, 50, 50);
            return PAGE_EXISTS;
        } catch (WriterException e) {
            System.out.print (e.getMessage());
        }


        return NO_SUCH_PAGE;               
    }
    
   
    
    public static void druckStart(String s) {
        
//        System.out.println("funk druckStart");
        
        PrinterJob job = PrinterJob.getPrinterJob();    
                
        PrintRequestAttributeSet aaset = new HashPrintRequestAttributeSet();        
        aaset.add(MediaSizeName.ISO_B9);

        PageFormat pf = job.getPageFormat(aaset);
        pf.setOrientation(1);        
        

//        job.setPrintable ( new drucken());            
        Book book = new Book();//java.awt.print.Book
        book.append(new drucken(s), pf);
        job.setPageable(book);
       


        boolean ok = true;         
        if (ok) {
            try     {
                job.print();
            } 
            catch (PrinterException ex) {
                System.out.println(ex.getMessage());
            }
        }

    
    }
    
    
    
    
    public static void main (String args[]) {
        
//        System.out.println("funk main");
        druckStart ("HM123");
    }
    
}

