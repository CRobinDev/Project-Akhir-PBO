package Implementasi_GUI.GUI;

import java.io.*;
import javax.swing.*;
import java.awt.*;
import Implementasi_GUI.Class.Sopir;

public class ListSopirAvailable extends javax.swing.JFrame {
    public Sopir sopir;
    private int currentIndex;

    public ListSopirAvailable() {
        initComponents();
        sopir = new Sopir();
        sopir.readDataSopir();
        displaySopirData();
        setLocationRelativeTo(null);
        setTitle("List Sopir yang Tersedia");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        NextButton = new javax.swing.JButton();
        PrevButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackButton.setFont(new java.awt.Font("ITF Devanagari", 1, 14)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButton(evt);
            }
        });

        NextButton.setFont(new java.awt.Font("ITF Devanagari", 1, 14)); // NOI18N
        NextButton.setText(">");
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButton(evt);
            }
        });

        PrevButton.setFont(new java.awt.Font("ITF Devanagari", 1, 14)); // NOI18N
        PrevButton.setText("<");
        PrevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrevButton(evt);
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
                                .addComponent(BackButton)
                                .addGap(100, 100, 100)
                                .addComponent(PrevButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NextButton)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(BackButton)
                                        .addComponent(NextButton)
                                        .addComponent(PrevButton))
                                .addGap(18, 18, 18))
        );

        pack();
        setSize(400, 340);
    }// </editor-fold>//GEN-END:initComponents

    private void BackButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButton
        AdminScreenMenu adminMenu = new AdminScreenMenu();
        adminMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButton

    private void NextButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButton
        currentIndex++;
        if (currentIndex >= sopir.getSopirData().length) {
            currentIndex = 0;
        }
        displaySopirData();
    }//GEN-LAST:event_NextButton

    private void PrevButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrevButton
        currentIndex--;
        if (currentIndex < 0) {
            currentIndex = sopir.getSopirData().length - 1;
        }
        displaySopirData();
    }//GEN-LAST:event_PrevButton

    private void displaySopirData() {
        if (sopir.getSopirData() != null && sopir.getSopirData().length > 0) {
            String[] dataLines = sopir.getSopirData()[currentIndex].split("<br>");
            StringBuilder formattedData = new StringBuilder("<html><h2>Data Sopir</h2><pre>");
            for (String line : dataLines) {
                formattedData.append(line).append("\n");
            }
            formattedData.append("</pre></html>");
            Label.setText(formattedData.toString());
            Label.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 15));
        } else {
            Label.setText("<html><h2>Data Sopir Kosong</h2></html>");
        }
    }

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListSopirAvailable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NextButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton PrevButton;
    private javax.swing.JLabel Label;
    // End of variables declaration//GEN-END:variables
}
