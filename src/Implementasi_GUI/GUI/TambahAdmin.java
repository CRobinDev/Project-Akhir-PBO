/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Implementasi_GUI.GUI;
import javax.swing.*;
import java.io.*;
import Implementasi_GUI.Class.Admin;
public class TambahAdmin extends javax.swing.JFrame {
    private javax.swing.JButton TombolSubmit;
    private javax.swing.JButton TombolBack;
    private javax.swing.JComboBox<String> ComboGender;
    private javax.swing.JComboBox<String> ComboDivisi;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelNama2;
    private javax.swing.JLabel labelBiodataAdmin;
    private javax.swing.JLabel labelAlamat;
    private javax.swing.JLabel labelNoHP;
    private javax.swing.JLabel labelGender;
    private javax.swing.JLabel labelDivisi;
    private javax.swing.JTextField namaField;
    private javax.swing.JTextField alamatField;
    private javax.swing.JTextField nomorField;
    private Admin admin;
    public TambahAdmin() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Biodata Admin");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        labelNama = new javax.swing.JLabel();
        TombolBack = new javax.swing.JButton();
        labelBiodataAdmin = new javax.swing.JLabel();
        labelNama2 = new javax.swing.JLabel();
        namaField = new javax.swing.JTextField();
        labelAlamat = new javax.swing.JLabel();
        labelNoHP = new javax.swing.JLabel();
        labelGender = new javax.swing.JLabel();
        alamatField = new javax.swing.JTextField();
        nomorField = new javax.swing.JTextField();
        ComboGender = new javax.swing.JComboBox<>();
        TombolSubmit = new javax.swing.JButton();
        labelDivisi = new javax.swing.JLabel();
        ComboDivisi = new javax.swing.JComboBox<>();

        labelNama.setFont(new java.awt.Font("ITF Devanagari", 1, 18));
        labelNama.setText("Nama");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TombolBack.setFont(new java.awt.Font("ITF Devanagari", 1, 14));
        TombolBack.setText("Back");
        TombolBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolBackActionPerformed(evt);
            }
        });

        labelBiodataAdmin.setFont(new java.awt.Font("ITF Devanagari", 1, 24));
        labelBiodataAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBiodataAdmin.setText("Biodata Admin");

        labelNama2.setFont(new java.awt.Font("ITF Devanagari", 1, 18));
        labelNama2.setText("Nama");

        namaField.setFont(new java.awt.Font("ITF Devanagari", 1, 14));
        alamatField.setFont(new java.awt.Font("ITF Devanagari", 1, 14));
        nomorField.setFont(new java.awt.Font("ITF Devanagari", 1, 14));

        labelAlamat.setFont(new java.awt.Font("ITF Devanagari", 1, 18));
        labelAlamat.setText("Alamat");

        labelNoHP.setFont(new java.awt.Font("ITF Devanagari", 1, 18));
        labelNoHP.setText("Nomor HP");

        labelGender.setFont(new java.awt.Font("ITF Devanagari", 1, 18));
        labelGender.setText("Jenis Kelamin");

        ComboGender.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14));
        ComboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Laki laki", "Perempuan" }));

        TombolSubmit.setFont(new java.awt.Font("ITF Devanagari", 1, 14));
        TombolSubmit.setText("Submit");
        TombolSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolSubmitActionPerformed(evt);
            }
        });

        labelDivisi.setFont(new java.awt.Font("ITF Devanagari", 1, 18));
        labelDivisi.setText("Divisi");

        ComboDivisi.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14));
        ComboDivisi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Customer Service", "Administrasi", "Penjadwalan", "Arsip Data" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelBiodataAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(TombolBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TombolSubmit)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelDivisi)
                                                .addGap(84, 84, 84)
                                                .addComponent(ComboDivisi, 0, 180, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelGender)
                                                .addGap(18, 18, 18)
                                                .addComponent(ComboGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(labelNoHP)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(nomorField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(labelAlamat)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(alamatField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelNama2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(namaField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(labelBiodataAdmin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelNama2)
                                        .addComponent(namaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelAlamat)
                                        .addComponent(alamatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelNoHP)
                                        .addComponent(nomorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelGender)
                                        .addComponent(ComboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelDivisi)
                                        .addComponent(ComboDivisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TombolBack)
                                        .addComponent(TombolSubmit))
                                .addContainerGap())
        );

        pack();
    }

    private void TombolBackActionPerformed(java.awt.event.ActionEvent evt) {
        AdminScreenMenu adminMenu = new AdminScreenMenu();
        adminMenu.setVisible(true);
        this.dispose();
    }

    private void TombolSubmitActionPerformed(java.awt.event.ActionEvent evt) {
        saveAdminData();
        JOptionPane.showMessageDialog(this, "Biodata Admin berhasil disimpan !!!");
        AdminScreenMenu adminMenu = new AdminScreenMenu();
        adminMenu.setVisible(true);
        this.dispose();
    }
    private void saveAdminData() {
        String nama = namaField.getText();
        String alamat = alamatField.getText();
        String nomorHp = nomorField.getText();
        String jenisKelamin = ComboGender.getSelectedItem().toString();
        String divisi = ComboDivisi.getSelectedItem().toString();

        admin = new Admin(nama, alamat, nomorHp, jenisKelamin, divisi);
        admin.saveData();

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahAdmin().setVisible(true);
            }
        });
    }
}