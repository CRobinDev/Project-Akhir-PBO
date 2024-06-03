package Implementasi_GUI.GUI;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import Implementasi_GUI.Class.Kendaraan;

public class ListKendaraanAvailable extends javax.swing.JFrame {
    private Kendaraan kendaraan;
    private int currentIndex;

    /**
     * Creates new form ListKdrAvailable
     */
    public ListKendaraanAvailable() {
        initComponents();
        kendaraan = new Kendaraan();
        kendaraan.readDataKendaraan();
        displayDataKendaraan();
        setLocationRelativeTo(null);
        setTitle("List Kendaraan yang Tersedia");
    }

    private void initComponents() {
        Label = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        Next = new javax.swing.JButton();
        Prev = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Next.setFont(new java.awt.Font("ITF Devanagari", 1, 14)); // NOI18N
        Next.setText(">");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });

        Prev.setFont(new java.awt.Font("ITF Devanagari", 1, 14)); // NOI18N
        Prev.setText("<");
        Prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrevActionPerformed(evt);
            }
        });

        Back.setFont(new java.awt.Font("ITF Devanagari", 1, 14));
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(Label, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(50, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Back)
                                .addGap(100, 100, 100)
                                .addComponent(Prev)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Next)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Back)
                                        .addComponent(Next)
                                        .addComponent(Prev))
                                .addGap(18, 18, 18))
        );
        pack();
        setSize(400,340);

    }
    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        currentIndex++; // Pindah ke data sopir berikutnya
        if (currentIndex >= kendaraan.getDataKendaraan().length) {
            currentIndex = 0; // Kembali ke awal jika sudah mencapai data terakhir
        }
        displayDataKendaraan(); // Menampilkan data sopir terbaru
    }
    private void PrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrevActionPerformed
        currentIndex--; // Pindah ke data sopir sebelumnya
        if (currentIndex < 0) {
            currentIndex = kendaraan.getDataKendaraan().length - 1; // Kembali ke akhir jika sudah mencapai data pertama
        }
        displayDataKendaraan(); // Menampilkan data sopir terbaru
    }
    private void BackActionPerformed(java.awt.event.ActionEvent evt) {
        AdminScreenMenu adminMenu = new AdminScreenMenu();
        adminMenu.setVisible(true);
        this.dispose();
    }

    private void displayDataKendaraan() {
        if (kendaraan.getDataKendaraan() != null && kendaraan.getDataKendaraan().length > 0) {
            String[] dataLines = kendaraan.getDataKendaraan()[currentIndex].split("<br>");
            StringBuilder formattedData = new StringBuilder("<html><h2>Data Kendaraan</h2><pre>");
            for (String line : dataLines) {
                formattedData.append(line).append("\n");
            }
            formattedData.append("</pre></html>");
            Label.setText(formattedData.toString());
            Label.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 16));
        } else {
            Label.setText("<html><h2>Data Kendaraan Kosong</h2></html>");
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListKendaraanAvailable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ListKendaraanAvailable().setVisible(true);
        });
    }

    private javax.swing.JButton Back;

    private javax.swing.JButton Next;
    private javax.swing.JButton Prev;

    private javax.swing.JLabel Label;
}
