/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Implementasi_GUI.GUI;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import Implementasi_GUI.Class.Karyawan;
public class ListSemuaKaryawan extends javax.swing.JFrame {
    private Karyawan karyawan;
    private int currentIndex;

    public ListSemuaKaryawan() {
        initComponents();
        karyawan = new Karyawan();
        karyawan.readDataKaryawan();
        displayDataKaryawan();
        setLocationRelativeTo(null);
        setTitle("List Semua Karyawan");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        labelDataKryawan = new javax.swing.JLabel();
        TombolBack = new javax.swing.JButton();
        TombolNextKryawan = new javax.swing.JButton();
        TombolBackKryawan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelDataKryawan.setFont(new java.awt.Font("ITF Devanagari", 1, 24));
        labelDataKryawan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        TombolNextKryawan.setFont(new java.awt.Font("ITF Devanagari", 1, 14));
        TombolNextKryawan.setText(">");
        TombolNextKryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButton(evt);
            }
        });

        TombolBackKryawan.setFont(new java.awt.Font("ITF Devanagari", 1, 14));
        TombolBackKryawan.setText("<");
        TombolBackKryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrevButton(evt);
            }
        });


        TombolBack.setFont(new java.awt.Font("ITF Devanagari", 1, 14));
        TombolBack.setText("Back");
        TombolBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButton(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(labelDataKryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(50, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(TombolBack)
                                .addGap(100, 100, 100)
                                .addComponent(TombolBackKryawan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TombolNextKryawan)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(labelDataKryawan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TombolBack)
                                        .addComponent(TombolNextKryawan)
                                        .addComponent(TombolBackKryawan))
                                .addGap(18, 18, 18))
        );
        pack();
        setSize(400,340);
    }

    private void BackButton(java.awt.event.ActionEvent evt) {
        AdminScreenMenu adminMenu = new AdminScreenMenu();
        adminMenu.setVisible(true);
        this.dispose();
    }

    private void NextButton(java.awt.event.ActionEvent evt) {
        currentIndex++;
        if (currentIndex >= karyawan.getDataKaryawan().length) {
            currentIndex = 0;
        }
        displayDataKaryawan();
    }

    private void PrevButton(java.awt.event.ActionEvent evt) {
        currentIndex--;
        if (currentIndex < 0) {
            currentIndex = karyawan.getDataKaryawan().length - 1;
        }
        displayDataKaryawan();
    }

    private void displayDataKaryawan() {
        if (karyawan.getDataKaryawan() != null && karyawan.getDataKaryawan().length > 0) {
            String[] dataLines = karyawan.getDataKaryawan()[currentIndex].split("<br>");
            StringBuilder formattedData = new StringBuilder("<html><h2>Data Karyawan</h2><pre>");
            for (String line : dataLines) {
                formattedData.append(line).append("\n");
            }
            formattedData.append("</pre></html>");
            labelDataKryawan.setText(formattedData.toString());
            labelDataKryawan.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 15));
        } else {
            labelDataKryawan.setText("<html><h2>Data Karyawan Kosong</h2></html>");
        }
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListSemuaKaryawan().setVisible(true);
            }
        });
    }

    private javax.swing.JButton TombolBack;
    private javax.swing.JButton TombolNextKryawan;
    private javax.swing.JButton TombolBackKryawan;
    private javax.swing.JLabel labelDataKryawan;
}