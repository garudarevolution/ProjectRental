/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataPeminjam;

import Koneksi.Koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Serildawn
 */
public class Pengembalian extends javax.swing.JFrame {
    
    Koneksi connect = new Koneksi();

      DateFormat dateFormat;
      Date date;
      
    public Pengembalian() {
        initComponents();
        ambil_data_alat();
        dateFormat = new SimpleDateFormat("ddMMyy");
        date = new Date();
    }
    private void ambil_data_alat(){
        connect.buka_koneksi();
        Statement statement;
        try {
            statement = Koneksi.getKoneksi().createStatement();
            String sql = "SELECT jenisps FROM ps";
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()) {
                String[] o = new String[1];
                jenisps.addItem(o[0] = resultSet.getString("jenisps"));
            }
            resultSet.close();
            statement.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Terjadi Kesalahan "+ex.getMessage());
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

        jalamat = new javax.swing.JTextField();
        jnohp = new javax.swing.JTextField();
        btnkeluar = new javax.swing.JButton();
        btnsimpan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnhapus = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jenisps = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jnama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTanggal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jnohp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnohpActionPerformed(evt);
            }
        });

        btnkeluar.setText("Keluar");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        jLabel1.setText("Data Pengembalian");

        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        jLabel3.setText("Nama");

        jLabel5.setText("Alamat");

        jLabel4.setText("PS");

        jLabel6.setText("No.HP");

        jenisps.setSelectedIndex(-1);
        jenisps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenispsActionPerformed(evt);
            }
        });

        jTextField1.setEnabled(false);

        jLabel2.setText("Tanggal Kembali");

        jLabel7.setText("Tanggal Pinjam");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jnohp)
                            .addComponent(jnama)
                            .addComponent(jalamat)
                            .addComponent(jTextField1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnsimpan)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnhapus)
                                        .addGap(26, 26, 26)
                                        .addComponent(btnkeluar))
                                    .addComponent(jenisps, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTanggal))))
                .addGap(142, 142, 142))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jenisps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jnohp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnkeluar)
                    .addComponent(btnsimpan)
                    .addComponent(btnhapus))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jnohpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnohpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnohpActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null,"Anda Yakin?","Confirmation Dialog",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        sb.append("Tanggal Pengembalian: ").append(dateFormat.format(date)).append("\n");
        sb.append("Tanggal Peminjaman: ").append(jTanggal.getText()).append("\n");
        sb.append("Nama : ").append(jnama.getText()).append("\n");

        if (jenisps.getSelectedItem()=="PS 2"){
            sb.append("PS : PS2").append("\n");
        }if (jenisps.getSelectedItem()=="PS 3") {
            sb.append("PS : PS3").append("\n");
        }if (jenisps.getSelectedItem()=="PS 4") {
            sb.append("PS : PS4").append("\n");
        }
        sb.append("Alamat : ").append(jalamat.getText()).append("\n");
        sb.append("No.Hp : ").append(jnohp.getText()).append("\n");


        JOptionPane.showMessageDialog(this, sb, "Data Peminjam", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(rootPane,"Data Tersimpan");

    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // TODO add your handling code here:
        jTanggal.setText("");
        jnama.setText("");
        jalamat.setText("");
        jenisps.setSelectedIndex(-1);
        jnohp.setText("");
    }//GEN-LAST:event_btnhapusActionPerformed

    private void jenispsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenispsActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jenispsActionPerformed

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
            java.util.logging.Logger.getLogger(Pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pengembalian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTanggal;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jalamat;
    private javax.swing.JComboBox<String> jenisps;
    private javax.swing.JTextField jnama;
    private javax.swing.JTextField jnohp;
    // End of variables declaration//GEN-END:variables
}