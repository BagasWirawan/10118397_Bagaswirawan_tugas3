/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;
import java.*;
import static java.lang.System.exit;
/**
 *
 * @author Asus
 */
public class kalkulator extends javax.swing.JFrame {
String bil="";
String bilangan;
double jumlah,bil1,bil2;
int pilih;
    /**
     * Creates new form kalkulator
     */
    public kalkulator() {
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

        bt_1 = new javax.swing.JButton();
        bt_2 = new javax.swing.JButton();
        bt_3 = new javax.swing.JButton();
        bt_4 = new javax.swing.JButton();
        bt_5 = new javax.swing.JButton();
        bt_6 = new javax.swing.JButton();
        bt_7 = new javax.swing.JButton();
        bt_8 = new javax.swing.JButton();
        bt_9 = new javax.swing.JButton();
        bt_0 = new javax.swing.JButton();
        bt_hasil = new javax.swing.JButton();
        bt_hapus = new javax.swing.JButton();
        txt_hasil = new javax.swing.JTextField();
        bt_tambah = new javax.swing.JButton();
        bt_kurang = new javax.swing.JButton();
        bt_kali = new javax.swing.JButton();
        bt_bagi = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bt_exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_1.setText("1");
        bt_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_1ActionPerformed(evt);
            }
        });

        bt_2.setText("2");
        bt_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_2ActionPerformed(evt);
            }
        });

        bt_3.setText("3");
        bt_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_3ActionPerformed(evt);
            }
        });

        bt_4.setText("4");
        bt_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_4ActionPerformed(evt);
            }
        });

        bt_5.setText("5");
        bt_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_5ActionPerformed(evt);
            }
        });

        bt_6.setText("6");
        bt_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_6ActionPerformed(evt);
            }
        });

        bt_7.setText("7");
        bt_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_7ActionPerformed(evt);
            }
        });

        bt_8.setText("8");
        bt_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_8ActionPerformed(evt);
            }
        });

        bt_9.setText("9");
        bt_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_9ActionPerformed(evt);
            }
        });

        bt_0.setText("0");
        bt_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_0ActionPerformed(evt);
            }
        });

        bt_hasil.setText("=");
        bt_hasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_hasilActionPerformed(evt);
            }
        });

        bt_hapus.setText("c");
        bt_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_hapusActionPerformed(evt);
            }
        });

        txt_hasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hasilActionPerformed(evt);
            }
        });

        bt_tambah.setText("+");
        bt_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_tambahActionPerformed(evt);
            }
        });

        bt_kurang.setText("-");
        bt_kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_kurangActionPerformed(evt);
            }
        });

        bt_kali.setText("*");
        bt_kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_kaliActionPerformed(evt);
            }
        });

        bt_bagi.setText("/");
        bt_bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_bagiActionPerformed(evt);
            }
        });

        jLabel2.setText("KALKULATOR");

        bt_exit.setText("EXIT");
        bt_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bt_hapus)
                                    .addComponent(bt_7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bt_8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bt_0, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bt_9)
                                    .addComponent(bt_hasil))
                                .addGap(48, 48, 48))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bt_4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bt_5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bt_6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(bt_exit)))
                                .addGap(50, 50, 50)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(bt_kurang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt_bagi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt_kali))
                            .addComponent(bt_tambah)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt_hasil, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(bt_1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bt_2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bt_3))))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_hasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_1)
                    .addComponent(bt_2)
                    .addComponent(bt_3)
                    .addComponent(bt_tambah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_4)
                    .addComponent(bt_5)
                    .addComponent(bt_6)
                    .addComponent(bt_kurang))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_7)
                    .addComponent(bt_8)
                    .addComponent(bt_9)
                    .addComponent(bt_kali))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_0)
                    .addComponent(bt_hapus)
                    .addComponent(bt_hasil)
                    .addComponent(bt_bagi))
                .addGap(18, 18, 18)
                .addComponent(bt_exit))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_7ActionPerformed
        // TODO add your handling code here:
         bil +="7"; // nilai ganti dengan angka 0, 1, 1         
        txt_hasil.setText(bil); // menampilkan angka kedalam jTextField
    }//GEN-LAST:event_bt_7ActionPerformed

    private void bt_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_tambahActionPerformed
        // TODO add your handling code here:
         bil1 =Double.valueOf(txt_hasil.getText());
        txt_hasil.setText("+");
        bil="";
        pilih=1; 
    }//GEN-LAST:event_bt_tambahActionPerformed

    private void bt_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_0ActionPerformed
        // TODO add your handling code here:
         bil +="0"; // nilai ganti dengan angka 0, 1, 1         
        txt_hasil.setText(bil); // menampilkan angka kedalam jTextField
      
    }//GEN-LAST:event_bt_0ActionPerformed

    private void txt_hasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hasilActionPerformed
        // TODO add your handling code here:
             
    }//GEN-LAST:event_txt_hasilActionPerformed

    private void bt_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_1ActionPerformed
        // TODO add your handling code here:
         bil +="1"; // nilai ganti dengan angka 0, 1, 1         
        txt_hasil.setText(bil); // menampilkan angka kedalam jTextField
    }//GEN-LAST:event_bt_1ActionPerformed

    private void bt_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_2ActionPerformed
        // TODO add your handling code here:
         bil +="2"; // nilai ganti dengan angka 0, 1, 1         
        txt_hasil.setText(bil); // menampilkan angka kedalam jTextField
    }//GEN-LAST:event_bt_2ActionPerformed

    private void bt_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_3ActionPerformed
        // TODO add your handling code here:
         bil +="3"; // nilai ganti dengan angka 0, 1, 1         
        txt_hasil.setText(bil); // menampilkan angka kedalam jTextField
    }//GEN-LAST:event_bt_3ActionPerformed

    private void bt_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_4ActionPerformed
        // TODO add your handling code here:
         bil +="4"; // nilai ganti dengan angka 0, 1, 1         
        txt_hasil.setText(bil); // menampilkan angka kedalam jTextField
    }//GEN-LAST:event_bt_4ActionPerformed

    private void bt_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_5ActionPerformed
        // TODO add your handling code here:
         bil +="5"; // nilai ganti dengan angka 0, 1, 1         
        txt_hasil.setText(bil); // menampilkan angka kedalam jTextField
    }//GEN-LAST:event_bt_5ActionPerformed

    private void bt_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_6ActionPerformed
        // TODO add your handling code here:
         bil +="6"; // nilai ganti dengan angka 0, 1, 1         
        txt_hasil.setText(bil); // menampilkan angka kedalam jTextField
    }//GEN-LAST:event_bt_6ActionPerformed

    private void bt_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_8ActionPerformed
        // TODO add your handling code here:
         bil +="8"; // nilai ganti dengan angka 0, 1, 1         
        txt_hasil.setText(bil); // menampilkan angka kedalam jTextField
    }//GEN-LAST:event_bt_8ActionPerformed

    private void bt_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_9ActionPerformed
        // TODO add your handling code here:
         bil +="9"; // nilai ganti dengan angka 0, 1, 1         
        txt_hasil.setText(bil); // menampilkan angka kedalam jTextField
    }//GEN-LAST:event_bt_9ActionPerformed

    private void bt_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_hapusActionPerformed
        // TODO add your handling code here:
         txt_hasil.setText(null);
        bil1=0;
        bil2=0;
        jumlah=0;
       
        bil="";
    }//GEN-LAST:event_bt_hapusActionPerformed

    private void bt_hasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_hasilActionPerformed
        // TODO add your handling code here:
        switch(pilih){
        case 1:
            bil2 = Double.parseDouble(String.valueOf(txt_hasil.getText()));
            jumlah = bil1+bil2;
            bilangan = Double.toString(jumlah);            
            break;
        case 2:
            bil2 =Double.parseDouble(String.valueOf(txt_hasil.getText()));
            jumlah = bil1 - bil2;
            bilangan = Double.toString(jumlah);            
            break;
        case 3:
            bil2 = Double.parseDouble(String.valueOf(txt_hasil.getText()));
            jumlah = bil1 * bil2;
            bilangan = Double.toString(jumlah);            
            break;
        case 4:
            bil2 = Double.parseDouble(String.valueOf(txt_hasil.getText()));
            jumlah = bil1 / bil2;
            bilangan = Double.toString(jumlah);            
            break;            
        } 
        txt_hasil.setText(bilangan);
    }//GEN-LAST:event_bt_hasilActionPerformed

    private void bt_kurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_kurangActionPerformed
        // TODO add your handling code here:
        bil1 =Double.parseDouble(bilangan);
        txt_hasil.setText("-");
        bil="";
        pilih=2;
    }//GEN-LAST:event_bt_kurangActionPerformed

    private void bt_kaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_kaliActionPerformed
        // TODO add your handling code here:
        bil1 =Double.parseDouble(bil);
        txt_hasil.setText("*");
        bil="";
        pilih=3;
    }//GEN-LAST:event_bt_kaliActionPerformed

    private void bt_bagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_bagiActionPerformed
        // TODO add your handling code here:
        bil1 =Double.parseDouble(bil);
        txt_hasil.setText("/");
        bil="";
        pilih=4;
    }//GEN-LAST:event_bt_bagiActionPerformed

    private void bt_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_exitActionPerformed
        // TODO add your handling code here:
        exit(0);
    }//GEN-LAST:event_bt_exitActionPerformed

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
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_0;
    private javax.swing.JButton bt_1;
    private javax.swing.JButton bt_2;
    private javax.swing.JButton bt_3;
    private javax.swing.JButton bt_4;
    private javax.swing.JButton bt_5;
    private javax.swing.JButton bt_6;
    private javax.swing.JButton bt_7;
    private javax.swing.JButton bt_8;
    private javax.swing.JButton bt_9;
    private javax.swing.JButton bt_bagi;
    private javax.swing.JButton bt_exit;
    private javax.swing.JButton bt_hapus;
    private javax.swing.JButton bt_hasil;
    private javax.swing.JButton bt_kali;
    private javax.swing.JButton bt_kurang;
    private javax.swing.JButton bt_tambah;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txt_hasil;
    // End of variables declaration//GEN-END:variables
}
