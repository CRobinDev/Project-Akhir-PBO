/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Implementasi_GUI.GUI;
import Implementasi_GUI.Class.Akun;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RegistrasiAkun extends javax.swing.JFrame {
    private Akun akun;
    public RegistrasiAkun() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {
        setTitle("Registrasi Akun");

        Judul = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        NameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        NameField.setFont(new java.awt.Font("ITF Devanagari", 1, 14));
        PasswordField.setFont(new java.awt.Font("ITF Devanagari", 1, 14));
        Judul.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 24));
        Judul.setText("Registrasi Akun");


        Submit.setFont(new java.awt.Font("ITF Devanagari", 1, 14));
        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        NameLabel.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14));
        NameLabel.setText("Username");

        PasswordLabel.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14));
        PasswordLabel.setText("Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Submit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Judul)
                                .addGap(113, 113, 113))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(NameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PasswordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(Judul, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(NameLabel)
                                        .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(PasswordLabel)
                                        .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(Submit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGap(32, 32, 32))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {
        String username = NameField.getText();
        String password = PasswordField.getText();
        akun = new Akun(username, password);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("akun.txt", true))) {
            writer.write(akun.getUsername() + "," + akun.getPassword());
            writer.newLine();
            JOptionPane.showMessageDialog(this, "Account registered successfully!");
            WelcomeScreen wlcome = new WelcomeScreen();
            wlcome.setVisible(true);
            this.dispose();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving account information.");
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrasiAkun().setVisible(true);
            }
        });
    }

    private javax.swing.JButton Submit;
    private javax.swing.JLabel Judul;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JTextField NameField;
    private javax.swing.JPasswordField PasswordField;
}
