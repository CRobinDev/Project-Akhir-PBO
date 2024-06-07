package Implementasi_GUI.GUI;
import Implementasi_GUI.Class.CetakInfo;
import Implementasi_GUI.Class.Pelanggan;

import java.awt.*;
import javax.swing.*;

public class PesananPelanggan extends javax.swing.JFrame implements CetakInfo {
    private int currentIndex;
    private Pelanggan pelanggan;
    private javax.swing.JLabel Label;

    public PesananPelanggan(PelangganScreenMenu screenMenu) {
        initComponents();
        displayInfo();
        setLocationRelativeTo(null);
        setTitle("List Pesanan Anda");
        screenMenu.setVisible(true);
    }
    public PesananPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
        initComponents();
        displayInfo();
        setLocationRelativeTo(null);
        setTitle("List Pesanan Anda");
    }

    private void initComponents() {
        Label = new javax.swing.JLabel();
        JButton back = new JButton();
        JButton next = new JButton();
        JButton prev = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        next.setFont(new java.awt.Font("ITF Devanagari", 1, 14));
        next.setText(">");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });

        prev.setFont(new java.awt.Font("ITF Devanagari", 1, 14));
        prev.setText("<");
        prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrevActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("ITF Devanagari", 1, 14));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
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
                                .addComponent(back)
                                .addGap(100, 100, 100)
                                .addComponent(prev)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(next)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(back)
                                        .addComponent(next)
                                        .addComponent(prev))
                                .addGap(18, 18, 18))
        );
        pack();
    }
    private void NextActionPerformed(java.awt.event.ActionEvent evt) {
        currentIndex++;
        if (currentIndex >= pelanggan.getDataPesanan().length) {
            currentIndex = 0;
        }
        displayInfo();
    }
    private void PrevActionPerformed(java.awt.event.ActionEvent evt) {
        currentIndex--;
        if (currentIndex < 0) {
            currentIndex = pelanggan.getDataPesanan().length - 1;
        }
        displayInfo();
    }
    private void BackActionPerformed(java.awt.event.ActionEvent evt) {
        new PelangganScreenMenu(pelanggan.getUsername()).setVisible(true);
        this.dispose();
    }

     public void displayInfo() {
        if (pelanggan.getDataPesanan() != null && pelanggan.getDataPesanan().length > 0) {
            String[] dataLines = pelanggan.getDataPesanan()[currentIndex].split("<br>");
            StringBuilder formattedData = new StringBuilder("<html><h2>Data Pesanan</h2><pre>");
            for (String line : dataLines) {
                formattedData.append(line).append("\n");
            }
            formattedData.append("</pre></html>");
            Label.setText(formattedData.toString());
            Label.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 15));
        } else {
            Label.setText("<html><h2>Data Pesanan Kosong</h2></html>");
        }
    }


    public static void main(String args[]) {
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

        PelangganLoginMenu loginMenu = new PelangganLoginMenu();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                loginMenu.setVisible(true);
            }
        });
        PelangganScreenMenu screenMenu = new PelangganScreenMenu(loginMenu);

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                screenMenu.setVisible(true);
            }
        });

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PelangganScreenMenu screenMenu = new PelangganScreenMenu(loginMenu);
                screenMenu.setVisible(true);
                PesananPelanggan pesanan = new PesananPelanggan(screenMenu);
                pesanan.setVisible(true);
            }
        });

    }


}
