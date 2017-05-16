/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wws;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bfw
 */
public class BuchungRechner extends javax.swing.JFrame {

    /**
     * Creates new form BuchungRechner
     */
    
    private static int aktuellPCKlasse;
    private static ArrayList<Integer> PCKlassenIDsListe = new ArrayList<>();

    
    
    public BuchungRechner() {
        initComponents();
        fillComboBoxItems();
        Show_PcBestand_In_JTable();
    }

    

    
    private int getMaxWWSNr() {

        
        Connection connection = DBConnection.getConnection2();        
        String query = "SELECT MAX(WWS_Nr) FROM PC_Bestand ";
        Statement st;
        ResultSet rs;

        int MaxWWSNr = 0;
        
        try
        {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            
            while(rs.next())
            {
                MaxWWSNr = rs.getInt("max(WWS_Nr)");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "getMax " + e.getMessage());
        }
        return MaxWWSNr;
    }
   
    
    private ArrayList<pcklasse> getPcList()
    {
        ArrayList<pcklasse> pcList = new ArrayList<>();
    //    Connection connection = getConnection();
        Connection connection = DBConnection.getConnection2();
        
        
        String query = "SELECT * FROM `PCKlasse` ";
        Statement st;
        ResultSet rs;
        
        try
        {
            st = connection.createStatement();
            //rs = st.executeQuery(query);
            rs = st.executeQuery(query);
            pcklasse PCKlasse;
            
            while(rs.next())
            {
                PCKlasse = new pcklasse(rs.getInt("PCKlassenID"), rs.getString("Hersteller"), rs.getString("Modell"));
                pcList.add(PCKlasse);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return pcList;
    }  
    
    private ArrayList<pcbestand> getPCBestand () {

        ArrayList<pcbestand> BestandList = new ArrayList<>();
    //    Connection connection = getConnection();
        Connection connection = DBConnection.getConnection2();
        
        
        String query = "SELECT * FROM PC_Bestand, PCKlasse where PC_Bestand.PCKlassenID = PCKlasse.PCKlassenID order by 1";
        Statement st;
        ResultSet rs;
        
        try
        {
            st = connection.createStatement();
            //rs = st.executeQuery(query);
            rs = st.executeQuery(query);
            pcbestand PCBestand;
            
            while(rs.next())
            {
                PCBestand = new pcbestand(rs.getInt("WWS_Nr"), rs.getInt("PCKlassenID"),rs.getString("Hersteller"),rs.getString("Modell"), rs.getBoolean("Aktuell_im_Lager"));
                BestandList.add(PCBestand);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return BestandList;

        
    }
            
            

    private boolean executeSQLQuery(String query, String message)
    {
        Connection conn = DBConnection.getConnection2();
        Statement st;
        try
        {
            st = conn.createStatement();
            if((st.executeUpdate(query)) == 1)
            {
                 
//                DefaultTableModel model = (DefaultTableModel)jTable_PCBestand.getModel();
//                model.setRowCount(0);
                Show_PcBestand_In_JTable();
                
//                JOptionPane.showMessageDialog(null, "Data "+message+" Succefully");
                return true;
            } else{
                JOptionPane.showMessageDialog(null, "Data Not "+message);    
                return false;
            }
        }catch(Exception ex) 
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }
        
    }


    
    private void fillComboBoxItems() {
        
        ArrayList<pcklasse> pcListe = getPcList();
        int anzahl = pcListe.size();

        String[] itemListe = new String[anzahl];
//        System.out.println(anzahl);
        for (int i = 0; i < anzahl; i++) {
            itemListe[i] = pcListe.get(i).getHersteller() + pcListe.get(i).getModell();
            PCKlassenIDsListe.add(pcListe.get(i).getID());
           
                   
        }        
        PCKlappliste.setModel(new javax.swing.DefaultComboBoxModel<>(itemListe));
    }
    
    
    private void Show_PcBestand_In_JTable()
    {
        ArrayList<pcbestand> BestandList = getPCBestand();
        
        DefaultTableModel model = (DefaultTableModel)jTable_PCBestand.getModel();
        model.setRowCount(0);
        Object[] row = new Object[3];
        for(int i = 0; i < BestandList.size(); i++)
        {
            row[0] = BestandList.get(i).get_WWS_Nr();
            row[1] = BestandList.get(i).get_Hersteller() + BestandList.get(i).get_Modell();
            row[2] = BestandList.get(i).get_Aktuell_im_Lager();
            
            model.addRow(row);
        }
    }    
    
    
    
   

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menueaufruf = new javax.swing.JButton();
        PCKlappliste = new javax.swing.JComboBox<>();
        EingabeAnzahl = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        DruckenButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_PCBestand = new javax.swing.JTable();
        jButtonDelete = new javax.swing.JButton();
        jTextField_Delete = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScanEingabe = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menueaufruf.setText("Menü");
        menueaufruf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menueaufrufActionPerformed(evt);
            }
        });

        EingabeAnzahl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EingabeAnzahlActionPerformed(evt);
            }
        });

        jLabel1.setText("Anzahl");

        DruckenButton.setText("Drucken");
        DruckenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DruckenButtonActionPerformed(evt);
            }
        });

        jTable_PCBestand.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "WWS Nr", "PC ID", "im Lager"
            }
        ));
        jTable_PCBestand.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(jTable_PCBestand);
        jTable_PCBestand.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jScanEingabe.setColumns(20);
        jScanEingabe.setRows(5);
        jScrollPane2.setViewportView(jScanEingabe);

        jButton1.setText("Einlagern");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menueaufruf)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonDelete)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PCKlappliste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EingabeAnzahl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DruckenButton)
                                .addGap(157, 157, 157))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PCKlappliste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EingabeAnzahl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(33, 33, 33)
                        .addComponent(DruckenButton)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonDelete)
                            .addComponent(jTextField_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addGap(44, 44, 44))
                            .addComponent(menueaufruf, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        menueaufruf.getAccessibleContext().setAccessibleName("menueaufruf");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menueaufrufActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menueaufrufActionPerformed
// TODO add your handling code here:
        this.dispose();
        menue mm = new menue();
        mm.setVisible(true);
//        mm.show();        

    }//GEN-LAST:event_menueaufrufActionPerformed

    private void DruckenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DruckenButtonActionPerformed
 
        int cbm = PCKlappliste.getSelectedIndex();
        String cbmInhalt = PCKlappliste.getItemAt(cbm);

        //  noch zu machen:
        // überprüfung, führende Leerzeichen weg etc.
        //  java.lang.NumberFormatException abfangen bei falscher Eingabe!!
        int ZahlderLabel = Integer.parseInt(EingabeAnzahl.getText());

        String EinzelQuery = " INSERT INTO PC_Bestand (PCKlassenID) VALUE (" + PCKlassenIDsListe.get(cbm) + ");";
        boolean ok;
        String Label;
        
        for (int i = 0; i < ZahlderLabel; i++) {

            ok = executeSQLQuery(EinzelQuery, "Inserted");       
            if (ok) {
                int j = getMaxWWSNr();
                if (j>0) {
                    Label = machLabel (j,PCKlassenIDsListe.get(cbm));
//                    System.out.println(Label);
                    drucken.druckStart(Label);
                    
                }
            }
            
        }


    }//GEN-LAST:event_DruckenButtonActionPerformed

    private void EingabeAnzahlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EingabeAnzahlActionPerformed

        System.out.println("oops");
    }//GEN-LAST:event_EingabeAnzahlActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed

        String query = "DELETE FROM PC_Bestand WHERE WWS_Nr = "+jTextField_Delete.getText();
        executeSQLQuery(query, "Deleted");        
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String s = jScanEingabe.getText();
        String[]ss = s.split("\\s");
        for (int i=0;i<ss.length;i++) {

        String s1 = ss[i].substring(6);
        String s2 = ss[i].substring(0,6);
        int z1 = Integer.parseInt(s1);
        int z2 = Integer.parseInt(s2);
        System.out.println(z1 + " und "+z2); 
        }

    }//GEN-LAST:event_jButton1ActionPerformed


    private String machLabel (int pcnr, int pctyp) {
        
        String LabelNr;
        String LabelPc;
        if (pcnr < 10) {
            LabelNr = "00000"+pcnr;
        } else if (pcnr <100) {
            LabelNr = "0000"+pcnr;
        } else if (pcnr<1000) {
            LabelNr = "000"+pcnr;
        } else if (pcnr<10000) {
            LabelNr = "00"+pcnr;
        } else if (pcnr<100000) {
            LabelNr = "0"+pcnr;
        } else {
            LabelNr = String.valueOf(pcnr);
        }
        
        if (pctyp<10) {
            LabelPc = "00"+pctyp;
        } else if (pctyp<100) {
            LabelPc = "0"+pctyp;
        } else {
            LabelPc = String.valueOf(pctyp);
        }

        String Label = LabelNr + LabelPc;
        return Label;
    }

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BuchungRechner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuchungRechner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuchungRechner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuchungRechner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuchungRechner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DruckenButton;
    private javax.swing.JTextField EingabeAnzahl;
    private javax.swing.JComboBox<String> PCKlappliste;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextArea jScanEingabe;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_PCBestand;
    private javax.swing.JTextField jTextField_Delete;
    private javax.swing.JButton menueaufruf;
    // End of variables declaration//GEN-END:variables
}
