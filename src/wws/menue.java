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
public class menue extends javax.swing.JFrame {

    /**
     * Creates new form menue
     */
    public menue() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    menue_rechnerverwaltung = new javax.swing.JButton();
    menue_etikettendruck = new javax.swing.JButton();
    menue_geratepruppenverwaltung = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    menue_rechnerverwaltung1 = new javax.swing.JButton();
    jLabel4 = new javax.swing.JLabel();
    menue_rechnerverwaltung2 = new javax.swing.JButton();
    menue_rechnerverwaltung3 = new javax.swing.JButton();
    menue_rechnerverwaltung4 = new javax.swing.JButton();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    menue_etikettendruck1 = new javax.swing.JButton();
    menue_etikettendruck2 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setPreferredSize(new java.awt.Dimension(1024, 768));

    menue_rechnerverwaltung.setText("Verwaltung (Eingang/Ausgang)");
    menue_rechnerverwaltung.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menue_rechnerverwaltungActionPerformed(evt);
      }
    });

    menue_etikettendruck.setText("> Buchungen anzeigen <");
    menue_etikettendruck.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menue_etikettendruckActionPerformed(evt);
      }
    });

    menue_geratepruppenverwaltung.setText("Peripheriegruppen verwalten");
    menue_geratepruppenverwaltung.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menue_geratepruppenverwaltungActionPerformed(evt);
      }
    });

    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel1.setText("Benutzer");

    jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel2.setText("Label drucken");

    jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel3.setText("ohne Barcode");

    menue_rechnerverwaltung1.setText("> aus Bestandslist <");
    menue_rechnerverwaltung1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menue_rechnerverwaltung1ActionPerformed(evt);
      }
    });

    jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel4.setText("mit Barcode");

    menue_rechnerverwaltung2.setText("> Drucken <");
    menue_rechnerverwaltung2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menue_rechnerverwaltung2ActionPerformed(evt);
      }
    });

    menue_rechnerverwaltung3.setText("> Suchen <");
    menue_rechnerverwaltung3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menue_rechnerverwaltung3ActionPerformed(evt);
      }
    });

    menue_rechnerverwaltung4.setText("> Neue / Eingang <");
    menue_rechnerverwaltung4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menue_rechnerverwaltung4ActionPerformed(evt);
      }
    });

    jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel5.setText("(Rechner)");

    jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel6.setText("(Peripheriegeräte)");

    menue_etikettendruck1.setText("Peripherie - Ein-/Ausgang");
    menue_etikettendruck1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menue_etikettendruck1ActionPerformed(evt);
      }
    });

    menue_etikettendruck2.setText("Buchungen anzeigen");
    menue_etikettendruck2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menue_etikettendruck2ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(126, 126, 126)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGap(189, 189, 189)
            .addComponent(jLabel5)))
        .addGap(292, 292, 292)
        .addComponent(jLabel6)
        .addGap(0, 0, Short.MAX_VALUE))
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
            .addGap(126, 126, 126)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jLabel2)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(menue_rechnerverwaltung4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menue_rechnerverwaltung1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))))
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
            .addGap(60, 60, 60)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(menue_rechnerverwaltung)
              .addComponent(menue_rechnerverwaltung2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(47, 47, 47)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(menue_rechnerverwaltung3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(menue_etikettendruck, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(96, 96, 96)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(menue_geratepruppenverwaltung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(menue_etikettendruck1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(menue_etikettendruck2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addGap(181, 181, 181)
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(97, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(26, 26, 26)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(77, 77, 77)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(menue_rechnerverwaltung3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(menue_rechnerverwaltung, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(menue_rechnerverwaltung2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(menue_etikettendruck, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(68, 68, 68)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(57, 57, 57)
            .addComponent(menue_rechnerverwaltung4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(menue_rechnerverwaltung1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(42, 42, 42)
            .addComponent(menue_etikettendruck1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(menue_geratepruppenverwaltung, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(menue_etikettendruck2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(164, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void menue_etikettendruckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menue_etikettendruckActionPerformed
        // TODO add your handling code here:

        
    }//GEN-LAST:event_menue_etikettendruckActionPerformed

    private void menue_rechnerverwaltungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menue_rechnerverwaltungActionPerformed

        this.dispose();
        NewJFrame mm = new NewJFrame();
        mm.show();

        // TODO add your handling code here:
    }//GEN-LAST:event_menue_rechnerverwaltungActionPerformed

  private void menue_geratepruppenverwaltungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menue_geratepruppenverwaltungActionPerformed
                    this.dispose();
                    Gruppenverwaltung mm = new Gruppenverwaltung();
                    mm.show();
// TODO add your handling code here:
  }//GEN-LAST:event_menue_geratepruppenverwaltungActionPerformed

  private void menue_rechnerverwaltung1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menue_rechnerverwaltung1ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_menue_rechnerverwaltung1ActionPerformed

  private void menue_rechnerverwaltung2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menue_rechnerverwaltung2ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_menue_rechnerverwaltung2ActionPerformed

  private void menue_rechnerverwaltung3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menue_rechnerverwaltung3ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_menue_rechnerverwaltung3ActionPerformed

  private void menue_rechnerverwaltung4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menue_rechnerverwaltung4ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_menue_rechnerverwaltung4ActionPerformed

  private void menue_etikettendruck1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menue_etikettendruck1ActionPerformed

    this.dispose();
    Bestandsverwaltung mm = new Bestandsverwaltung();
    mm.show();
  }//GEN-LAST:event_menue_etikettendruck1ActionPerformed

  private void menue_etikettendruck2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menue_etikettendruck2ActionPerformed
    // TODO add your handling code here:
    this.dispose();
    BuchungenPeripherie mm = new BuchungenPeripherie();
    mm.show();            
    
    
  }//GEN-LAST:event_menue_etikettendruck2ActionPerformed

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
            java.util.logging.Logger.getLogger(menue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menue().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JButton menue_etikettendruck;
  private javax.swing.JButton menue_etikettendruck1;
  private javax.swing.JButton menue_etikettendruck2;
  private javax.swing.JButton menue_geratepruppenverwaltung;
  private javax.swing.JButton menue_rechnerverwaltung;
  private javax.swing.JButton menue_rechnerverwaltung1;
  private javax.swing.JButton menue_rechnerverwaltung2;
  private javax.swing.JButton menue_rechnerverwaltung3;
  private javax.swing.JButton menue_rechnerverwaltung4;
  // End of variables declaration//GEN-END:variables
}
