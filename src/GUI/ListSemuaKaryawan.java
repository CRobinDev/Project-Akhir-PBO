/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import java.awt.*;
import java.io.*;
import javax.swing.*;
/**
 *
 * @author dhani
 */
public class ListSemuaKaryawan extends javax.swing.JFrame {
    private String[] dataKaryawan; // Array untuk menyimpan data sopir
    private int currentIndex; // Indeks data sopir yang sedang ditampilkan

    /**
     * Creates new form ListSemuaKaryawan
     */
    public ListSemuaKaryawan() {
        initComponents();
        readDataKaryawan();
        displayDataKaryawan();
        setLocationRelativeTo(null);
        setTitle("List Semua Karyawan");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("ITF Devanagari", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton1.setFont(new java.awt.Font("ITF Devanagari", 1, 14)); // NOI18N
        jButton1.setText(">");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("ITF Devanagari", 1, 14)); // NOI18N
        jButton3.setText("<");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });


        jButton2.setFont(new java.awt.Font("ITF Devanagari", 1, 14)); // NOI18N
        jButton2.setText("Back");
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
                                .addGap(50, 50, 50)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(50, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton2)
                                .addGap(100, 100, 100)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton2)
                                        .addComponent(jButton1)
                                        .addComponent(jButton3))
                                .addGap(18, 18, 18))
        );

        pack();
        setSize(400,340);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        AdminScreenMenu adminMenu = new AdminScreenMenu();
        adminMenu.setVisible(true);
        this.dispose();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        currentIndex++; // Pindah ke data sopir berikutnya
        if (currentIndex >= dataKaryawan.length) {
            currentIndex = 0; // Kembali ke awal jika sudah mencapai data terakhir
        }
        displayDataKaryawan(); // Menampilkan data sopir terbaru
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        currentIndex--; // Pindah ke data sopir sebelumnya
        if (currentIndex < 0) {
            currentIndex = dataKaryawan.length - 1; // Kembali ke akhir jika sudah mencapai data pertama
        }
        displayDataKaryawan(); // Menampilkan data sopir terbaru
    }

    private void readDataKaryawan() {
        try (BufferedReader reader = new BufferedReader(new FileReader("Karyawan.txt"))) {
            StringBuilder sopir = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.isEmpty()) {
                    // Jika menemukan baris kosong, simpan data sopir sebelumnya
                    addDataKaryawan(sopir.toString());
                    sopir = new StringBuilder(); // Bersihkan StringBuilder untuk data sopir baru
                } else {
                    sopir.append(line).append("<br>");
                }
            }
            // Simpan data sopir terakhir setelah keluar dari loop
            if (sopir.length() > 0) {
                addDataKaryawan(sopir.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal membaca data sopir.");
        }
    }

    private void addDataKaryawan(String data) {
        // Menambahkan data sopir ke array dataKaryawan
        if (dataKaryawan == null) {
            dataKaryawan = new String[]{data};
        } else {
            String[] newData = new String[dataKaryawan.length + 1];
            System.arraycopy(dataKaryawan, 0, newData, 0, dataKaryawan.length);
            newData[dataKaryawan.length] = data;
            dataKaryawan = newData;
        }
    }

    private void displayDataKaryawan() {
        if (dataKaryawan != null && dataKaryawan.length > 0) {
            String[] dataLines = dataKaryawan[currentIndex].split("<br>");
            StringBuilder formattedData = new StringBuilder("<html><h2>Data Karyawan</h2><pre>");
            for (String line : dataLines) {
                formattedData.append(line).append("\n");
            }
            formattedData.append("</pre></html>");
            jLabel3.setText(formattedData.toString());
            jLabel3.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 16));
        } else {
            jLabel3.setText("<html><h2>Data Karyawan Kosong</h2></html>");
        }
    }
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
            java.util.logging.Logger.getLogger(ListSemuaKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListSemuaKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListSemuaKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListSemuaKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListSemuaKaryawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration                   
}