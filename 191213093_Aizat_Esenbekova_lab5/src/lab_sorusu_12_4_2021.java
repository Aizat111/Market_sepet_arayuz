
import java.awt.Color;
import javax.swing.DefaultListModel;

public class lab_sorusu_12_4_2021 extends javax.swing.JFrame {
DefaultListModel model1,model2;
   String []veriler={"MeyveSebze/Domates",
"MeyveSebze/Patates",
"MeyveSebze/Elma",
"Günlük/Süt",
"Günlük/Ekmek"};
    public lab_sorusu_12_4_2021() {
        initComponents();
        this.setTitle("Esenbekova MARKET");
        model2=new DefaultListModel();
        ae93_jList2.setModel(model2);
        model1=new DefaultListModel();
        ae93_jList1.setModel(model1);
        for(int i=0;i<5;i++)
        {
            model2.addElement(veriler[i]);
        }
       
    }

         
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ae93_jColorChooser1 = new javax.swing.JColorChooser();
        ae93_jDialog1 = new javax.swing.JDialog();
        ae93_jTextField1 = new javax.swing.JTextField();
        ae93_jButton2 = new javax.swing.JButton();
        ae93_jButton3 = new javax.swing.JButton();
        ae93_jButton4 = new javax.swing.JButton();
        ae93_jPopupMenu1 = new javax.swing.JPopupMenu();
        ae93_jMenuItem1 = new javax.swing.JMenuItem();
        ae93_jPopupMenu2 = new javax.swing.JPopupMenu();
        ae93_jMenuItem2 = new javax.swing.JMenuItem();
        ae93_jMenuItem3 = new javax.swing.JMenuItem();
        ae93_jlabel1 = new javax.swing.JLabel();
        ae93_jButton1 = new javax.swing.JButton();
        ae93_jlabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ae93_jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        ae93_jList2 = new javax.swing.JList<>();

        ae93_jDialog1.setBounds(new java.awt.Rectangle(400, 400, 350, 250));

        ae93_jButton2.setText("Market İsmini Değiştir");
        ae93_jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ae93_jButton2ActionPerformed(evt);
            }
        });

        ae93_jButton3.setText("Listelerin Yazı Rengini Değiştir");
        ae93_jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ae93_jButton3ActionPerformed(evt);
            }
        });

        ae93_jButton4.setText("Dialog Penceresini Kapat");
        ae93_jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ae93_jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ae93_jDialog1Layout = new javax.swing.GroupLayout(ae93_jDialog1.getContentPane());
        ae93_jDialog1.getContentPane().setLayout(ae93_jDialog1Layout);
        ae93_jDialog1Layout.setHorizontalGroup(
            ae93_jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ae93_jDialog1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(ae93_jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ae93_jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addGroup(ae93_jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ae93_jTextField1)
                        .addComponent(ae93_jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ae93_jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        ae93_jDialog1Layout.setVerticalGroup(
            ae93_jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ae93_jDialog1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(ae93_jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ae93_jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ae93_jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ae93_jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        ae93_jMenuItem1.setText("Sepete Ekle");
        ae93_jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ae93_jMenuItem1ActionPerformed(evt);
            }
        });
        ae93_jPopupMenu1.add(ae93_jMenuItem1);

        ae93_jMenuItem2.setText("Sepetten Cikar");
        ae93_jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ae93_jMenuItem2ActionPerformed(evt);
            }
        });
        ae93_jPopupMenu2.add(ae93_jMenuItem2);

        ae93_jMenuItem3.setText("Sepeti Temizle");
        ae93_jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ae93_jMenuItem3ActionPerformed(evt);
            }
        });
        ae93_jPopupMenu2.add(ae93_jMenuItem3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ae93_jlabel1.setText("Esenbekova MARKET");

        ae93_jButton1.setText("Ayarları Değiştir");
        ae93_jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ae93_jButton1ActionPerformed(evt);
            }
        });

        ae93_jlabel2.setText("SEPET");

        ae93_jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ae93_jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ae93_jList1);

        ae93_jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "MeyveSebze/Domates", "MeyveSebze/Patates", "MeyveSebze/Elma", "Günlük/Süt", "Günlük/Ekmek" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ae93_jList2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ae93_jList2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ae93_jList2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ae93_jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ae93_jlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ae93_jlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(29, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ae93_jlabel1)
                    .addComponent(ae93_jlabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(ae93_jButton1)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
String secim;
String []data=new String [2];
    private void ae93_jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ae93_jMenuItem1ActionPerformed
        secim=String.valueOf(model2.getElementAt(ae93_jList2.getSelectedIndex()));
        data=secim.split("/");
        model1.addElement(data[1]);
    }//GEN-LAST:event_ae93_jMenuItem1ActionPerformed

    private void ae93_jList2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ae93_jList2MouseClicked
        ae93_jList2.setComponentPopupMenu(ae93_jPopupMenu1);
    }//GEN-LAST:event_ae93_jList2MouseClicked

    private void ae93_jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ae93_jList1MouseClicked
        ae93_jList1.setComponentPopupMenu(ae93_jPopupMenu2);
    }//GEN-LAST:event_ae93_jList1MouseClicked

    private void ae93_jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ae93_jButton1ActionPerformed
        ae93_jDialog1.setVisible(true);
    }//GEN-LAST:event_ae93_jButton1ActionPerformed

    private void ae93_jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ae93_jButton4ActionPerformed
        ae93_jDialog1.setVisible(false);
    }//GEN-LAST:event_ae93_jButton4ActionPerformed

    private void ae93_jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ae93_jButton2ActionPerformed
        String name=ae93_jTextField1.getText();
        this.setTitle(name+" MARKET");
        ae93_jlabel1.setText(name+" MARKET");
    }//GEN-LAST:event_ae93_jButton2ActionPerformed

    private void ae93_jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ae93_jButton3ActionPerformed
        Color renk=ae93_jColorChooser1.showDialog(null,"Renk Basligi",Color.BLACK);
        ae93_jList1.setForeground(renk);
        ae93_jList2.setForeground(renk);
    }//GEN-LAST:event_ae93_jButton3ActionPerformed

    private void ae93_jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ae93_jMenuItem2ActionPerformed
        model1.remove(ae93_jList1.getSelectedIndex());
    }//GEN-LAST:event_ae93_jMenuItem2ActionPerformed

    private void ae93_jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ae93_jMenuItem3ActionPerformed
        model1.removeAllElements();
    }//GEN-LAST:event_ae93_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(lab_sorusu_12_4_2021.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lab_sorusu_12_4_2021.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lab_sorusu_12_4_2021.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lab_sorusu_12_4_2021.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lab_sorusu_12_4_2021().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ae93_jButton1;
    private javax.swing.JButton ae93_jButton2;
    private javax.swing.JButton ae93_jButton3;
    private javax.swing.JButton ae93_jButton4;
    private javax.swing.JColorChooser ae93_jColorChooser1;
    private javax.swing.JDialog ae93_jDialog1;
    private javax.swing.JList<String> ae93_jList1;
    private javax.swing.JList<String> ae93_jList2;
    private javax.swing.JMenuItem ae93_jMenuItem1;
    private javax.swing.JMenuItem ae93_jMenuItem2;
    private javax.swing.JMenuItem ae93_jMenuItem3;
    private javax.swing.JPopupMenu ae93_jPopupMenu1;
    private javax.swing.JPopupMenu ae93_jPopupMenu2;
    private javax.swing.JTextField ae93_jTextField1;
    private javax.swing.JLabel ae93_jlabel1;
    private javax.swing.JLabel ae93_jlabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
