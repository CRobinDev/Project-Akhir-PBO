/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Implementasi_GUI.GUI;
import Implementasi_GUI.Class.RuteTravel;
import Implementasi_GUI.Class.Sopir;

import javax.swing.*;
import java.io.*;
public class TambahSopirMenu extends javax.swing.JFrame {
    private Sopir sopir;
    public TambahSopirMenu() {
        setTitle("Biodata Sopir");
        initComponents();
        setLocationRelativeTo(null);
        sopir = new Sopir();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        tmbhSupirRC3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tmbhSopirKelamin = new javax.swing.JComboBox<>();
        tmbhSopirNama = new javax.swing.JTextField();
        tmbhSopirAlamat = new javax.swing.JTextField();
        tmbhSopirNoHP = new javax.swing.JTextField();
        tmbhSopirLisensi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tmbhJenisMobil = new javax.swing.JComboBox<>();
        RuteTmbhSopir = new javax.swing.JComboBox<>();

        tmbhSupirRC3.setFont(new java.awt.Font("ITF Devanagari", 1, 14)); // NOI18N
        tmbhSupirRC3.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("ITF Devanagari", 1, 18)); // NOI18N
        jLabel1.setText("Nama");

        jLabel2.setFont(new java.awt.Font("ITF Devanagari", 1, 18)); // NOI18N
        jLabel2.setText("Alamat");

        jLabel3.setFont(new java.awt.Font("ITF Devanagari", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Biodata Sopir");

        jLabel4.setFont(new java.awt.Font("ITF Devanagari", 1, 18)); // NOI18N
        jLabel4.setText("Nomor HP");

        jLabel5.setFont(new java.awt.Font("ITF Devanagari", 1, 18)); // NOI18N
        jLabel5.setText("Jenis Kelamin");

        jLabel6.setFont(new java.awt.Font("ITF Devanagari", 1, 18)); // NOI18N
        jLabel6.setText("Lisensi");

        tmbhSopirKelamin.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        tmbhSopirKelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Laki laki", "Perempuan" }));

        tmbhSopirNama.setFont(new java.awt.Font("ITF Devanagari", 1, 14)); // NOI18N

        tmbhSopirAlamat.setFont(new java.awt.Font("ITF Devanagari", 1, 14)); // NOI18N

        tmbhSopirNoHP.setFont(new java.awt.Font("ITF Devanagari", 1, 14)); // NOI18N

        tmbhSopirLisensi.setFont(new java.awt.Font("ITF Devanagari", 1, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("ITF Devanagari", 1, 14)); // NOI18N
        jButton1.setText("Submit");

        jButton2.setFont(new java.awt.Font("ITF Devanagari", 1, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("ITF Devanagari", 1, 18)); // NOI18N
        jLabel7.setText("Jenis Mobil");

        tmbhJenisMobil.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        tmbhJenisMobil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Mobil Pribadi", "Travel"}));
        tmbhJenisMobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbhJenisMobilActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("ITF Devanagari", 1, 18)); // NOI18N
        jLabel8.setText("Rute");

        RuteTmbhSopir.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 13));
        RuteTmbhSopir.addItem("-");
        String[] ruteArray = new String[RuteTravel.values().length];
        for (int i = 0; i < RuteTravel.values().length; i++) {
            ruteArray[i] = RuteTravel.values()[i].toString();
            RuteTmbhSopir.addItem(ruteArray[i]);
        }

        jLabel8.setVisible(false);
        RuteTmbhSopir.setVisible(false);

        jButton1.setFont(new java.awt.Font("ITF Devanagari", 1, 14));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 109, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGap(18, 43, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(tmbhSopirKelamin, 0, 168, Short.MAX_VALUE)
                                                        .addComponent(tmbhSopirNoHP, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(tmbhSopirAlamat, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(tmbhSopirNama, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(tmbhSopirLisensi)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel8))
                                                .addGap(63, 63, 63)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(RuteTmbhSopir, 0, 1, Short.MAX_VALUE)
                                                        .addComponent(tmbhJenisMobil, 0, 168, Short.MAX_VALUE))))
                                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(tmbhSopirNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(tmbhSopirAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(tmbhSopirNoHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(tmbhSopirKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(tmbhSopirLisensi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(tmbhJenisMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(RuteTmbhSopir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton2)
                                        .addComponent(jButton1))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        saveDriverData();
        JOptionPane.showMessageDialog(this, "Biodata Sopir berhasil disimpan !!!");
        AdminScreenMenu adminMenu = new AdminScreenMenu();
        adminMenu.setVisible(true);
        this.dispose();
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        AdminScreenMenu adminMenu = new AdminScreenMenu();
        adminMenu.setVisible(true);
        this.dispose();
    }
    private void saveDriverData(){
        String nama = tmbhSopirNama.getText();
        String alamat = tmbhSopirAlamat.getText();
        String nomorHp = tmbhSopirNoHP.getText();
        String jenisKelamin = tmbhSopirKelamin.getSelectedItem().toString();
        String lisensi = tmbhSopirLisensi.getText();
        String jenisMobil = tmbhJenisMobil.getSelectedItem().toString();
        String rute = RuteTmbhSopir.getSelectedItem().toString();

        sopir.setNama(nama);
        sopir.setAlamat(alamat);
        sopir.setNomorHp(nomorHp);
        sopir.setJenisKelamin(jenisKelamin);
        sopir.setLisensi(lisensi);
        sopir.setJenisMobil(jenisMobil);
        sopir.setRute(rute);

        sopir.saveDataSopir();

        AdminScreenMenu adminMenu = new AdminScreenMenu();
        adminMenu.setVisible(true);
        this.dispose();
    }

    private void tmbhJenisMobilActionPerformed(java.awt.event.ActionEvent evt) {
            jLabel8.setVisible(true);
            RuteTmbhSopir.setVisible(true);
        }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahSopirMenu().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> tmbhSopirKelamin;
    private javax.swing.JComboBox<String> tmbhJenisMobil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField tmbhSupirRC3;
    private javax.swing.JTextField tmbhSopirAlamat;
    private javax.swing.JTextField tmbhSopirLisensi;
    private javax.swing.JTextField tmbhSopirNama;
    private javax.swing.JTextField tmbhSopirNoHP;
    private javax.swing.JComboBox<String> RuteTmbhSopir ;
}