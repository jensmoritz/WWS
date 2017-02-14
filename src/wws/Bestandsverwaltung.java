
package wws;


import java.sql.*;
import java.text.SimpleDateFormat; 
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class Bestandsverwaltung extends javax.swing.JFrame {

    public Bestandsverwaltung() {
        initComponents();
        Show_Geraete_In_JTable();
    }

    public ArrayList<Geraete> getGeraeteList()
    {
        ArrayList<Geraete> getGeraeteList = new ArrayList<Geraete>();
    //    Connection connection = getConnection();
        Connection connection = DBConnection.getConnection2();
        
        
        String query = "SELECT * FROM `Geraeteklasse` ORDER BY KlassenID";
    //  String query = "SELECT * FROM `Geraeteklasse`  LEFT JOIN  ORDER BY KlassenID";
        Statement st;
        ResultSet rs;
        
        try
        {
            st = connection.createStatement();
            //rs = st.executeQuery(query);
            rs = st.executeQuery(query);
            Geraete GERAETE;
            
            while(rs.next())
            {
                GERAETE = new Geraete(rs.getInt("KlassenID"), rs.getString("Bezeichnung"));
                getGeraeteList.add(GERAETE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return getGeraeteList;
    }
    
    // Zeigt Daten in Tabelle an
    
    public void Show_Geraete_In_JTable()
    {
        ArrayList<Geraete> list = getGeraeteList();
        
        DefaultTableModel model = (DefaultTableModel)jTable_Display_Geraete.getModel();
        Object[] row = new Object[2];
        for(int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getKlassenID();
            row[1] = list.get(i).getBezeichnung();
   /*         row[2] = list.get(i).getHersteller();
            row[3] = list.get(i).getModell();
   */         
            model.addRow(row);
        }
    }
    
    //Zegit markierte Zeile in Eingabefeld
    
    public void executeSQLQuery(String query, String message)
    {
        Connection conn = DBConnection.getConnection2();
        Statement st;
        try
        {
            st = conn.createStatement();
            if((st.executeUpdate(query)) == 1)
            {
                // refresh jtable data
                
                DefaultTableModel model = (DefaultTableModel)jTable_Display_Geraete.getModel();
                model.setRowCount(0);
                Show_Geraete_In_JTable();
                
                JOptionPane.showMessageDialog(null, "Data "+message+" Succefully");
            } else{
                JOptionPane.showMessageDialog(null, "Data Not "+message);    
            }
        }catch(Exception ex) 
        {
            
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

    jLabel1 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jTextField_klassenid = new javax.swing.JTextField();
    jTextField_bezeichnung = new javax.swing.JTextField();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTable_Display_Geraete = new javax.swing.JTable();
    jButton_insert = new javax.swing.JButton();
    jButton_update = new javax.swing.JButton();
    jButton_delete = new javax.swing.JButton();
    menueaufruf = new javax.swing.JButton();
    jTextField_zubuchen = new javax.swing.JTextField();
    jTextField_abbuchen = new javax.swing.JTextField();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
    jLabel1.setText("KlassenID");

    jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
    jLabel3.setText("Bezeichnung");

    jTextField_klassenid.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

    jTextField_bezeichnung.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
    jTextField_bezeichnung.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextField_bezeichnungActionPerformed(evt);
      }
    });

    jTable_Display_Geraete.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "KlassenID", "Bezeichnung"
      }
    ));
    jTable_Display_Geraete.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jTable_Display_GeraeteMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(jTable_Display_Geraete);

    jButton_insert.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
    jButton_insert.setText("Clear");
    jButton_insert.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton_insertActionPerformed(evt);
      }
    });

    jButton_update.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
    jButton_update.setText("Update");
    jButton_update.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton_updateActionPerformed(evt);
      }
    });

    jButton_delete.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
    jButton_delete.setText("Delete");
    jButton_delete.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton_deleteActionPerformed(evt);
      }
    });

    menueaufruf.setText("Menü");
    menueaufruf.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menueaufrufActionPerformed(evt);
      }
    });

    jTextField_zubuchen.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
    jTextField_zubuchen.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextField_zubuchenActionPerformed(evt);
      }
    });

    jTextField_abbuchen.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
    jTextField_abbuchen.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextField_abbuchenActionPerformed(evt);
      }
    });

    jButton1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
    jButton1.setText("Eingang");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jButton2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
    jButton2.setText("Ausgang");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(65, 65, 65)
            .addComponent(menueaufruf, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton_update, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton_delete))
          .addGroup(layout.createSequentialGroup()
            .addGap(37, 37, 37)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jTextField_klassenid, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jTextField_bezeichnung, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addComponent(jButton_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jTextField_zubuchen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jTextField_abbuchen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97)))))
        .addGap(18, 18, 18)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(28, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(94, 94, 94)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jTextField_klassenid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jTextField_bezeichnung))
            .addGap(34, 34, 34)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jTextField_zubuchen)
              .addComponent(jButton1))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jTextField_abbuchen)
              .addComponent(jButton2))
            .addGap(20, 20, 20)
            .addComponent(jButton_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jButton_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jButton_update, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(106, 106, 106))
          .addGroup(layout.createSequentialGroup()
            .addGap(50, 50, 50)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        .addComponent(menueaufruf, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(87, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents


  
  
    private void jButton_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_insertActionPerformed
        
      this.dispose();
      Bestandsverwaltung mm = new Bestandsverwaltung();
      mm.show();
        
    }//GEN-LAST:event_jButton_insertActionPerformed

        static String printSimpleDateFormat() { 
        SimpleDateFormat formatter = new SimpleDateFormat( 
                "yyyy-MM-dd HH:mm:ss"); 
        Date currentTime = new Date();
        return formatter.format(currentTime);
    //    System.out.println(formatter.format(currentTime));        // 2012.04.14 - 21:34:07  
    } 
    
    
    private void jButton_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_updateActionPerformed
        
        String query = "UPDATE `Geraeteklasse` SET `Bezeichnung`='"+jTextField_bezeichnung.getText()+"' WHERE KlassenID="+jTextField_klassenid.getText();
        
        executeSQLQuery(query, "Updated");
    }//GEN-LAST:event_jButton_updateActionPerformed

    private void jButton_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deleteActionPerformed
        
        String query = "DELETE FROM `Geraeteklasse` WHERE KlassenID = "+jTextField_klassenid.getText();
        
        executeSQLQuery(query, "Deleted");
    }//GEN-LAST:event_jButton_deleteActionPerformed

    private void jTable_Display_GeraeteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Display_GeraeteMouseClicked
        // Zeigt ausgwählte Zeile in Eingabefeldern
        int i = jTable_Display_Geraete.getSelectedRow();
        TableModel model = jTable_Display_Geraete.getModel();
        jTextField_klassenid.setText(model.getValueAt(i,0).toString());
        jTextField_bezeichnung.setText(model.getValueAt(i,1).toString());
    }//GEN-LAST:event_jTable_Display_GeraeteMouseClicked

    private void menueaufrufActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menueaufrufActionPerformed

        this.dispose();
        menue mm = new menue();
        mm.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_menueaufrufActionPerformed

  private void jTextField_bezeichnungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_bezeichnungActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jTextField_bezeichnungActionPerformed

  private void jTextField_zubuchenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_zubuchenActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jTextField_zubuchenActionPerformed

  private void jTextField_abbuchenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_abbuchenActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jTextField_abbuchenActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    String query = "INSERT INTO `Bestand`(`KlassenID`,`BenutzerID`,`Zubuchung`,`Datum`) VALUES ('"+jTextField_klassenid.getText()+"','"+DBConnection.nUserId+"','"+jTextField_zubuchen.getText()+"','"+printSimpleDateFormat()+"')";

    executeSQLQuery(query, "Inserted");
    // TODO add your handling code here:
  }//GEN-LAST:event_jButton1ActionPerformed

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    String query = "INSERT INTO `Bestand`(`KlassenID`,`BenutzerID`,`Abbuchung`,`Datum`) VALUES ('"+jTextField_klassenid.getText()+"','"+DBConnection.nUserId+"','"+jTextField_abbuchen.getText()+"','"+printSimpleDateFormat()+"')";

    executeSQLQuery(query, "Inserted");
    // TODO add your handling code here:
  }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bestandsverwaltung().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton_delete;
  private javax.swing.JButton jButton_insert;
  private javax.swing.JButton jButton_update;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable jTable_Display_Geraete;
  private javax.swing.JTextField jTextField_abbuchen;
  private javax.swing.JTextField jTextField_bezeichnung;
  private javax.swing.JTextField jTextField_klassenid;
  private javax.swing.JTextField jTextField_zubuchen;
  private javax.swing.JButton menueaufruf;
  // End of variables declaration//GEN-END:variables

    private Object DBConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
