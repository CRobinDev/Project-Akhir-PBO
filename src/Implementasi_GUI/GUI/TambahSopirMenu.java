/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Implementasi_GUI.GUI;
import Implementasi_GUI.Class.RuteTravel;
import Implementasi_GUI.Class.Sopir;
import javax.swing.*;
public class TambahSopirMenu extends javax.swing.JFrame {
    private javax.swing.JButton TombolSubmit;
    private javax.swing.JButton TombolBack;
    private javax.swing.JComboBox<String> tmbhSopirKelamin;
    private javax.swing.JComboBox<String> tmbhJenisMobil;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelAlamat;
    private javax.swing.JLabel labelBiodataSupir;
    private javax.swing.JLabel labelNoHp;
    private javax.swing.JLabel labelGender;
    private javax.swing.JLabel labelLisensi;
    private javax.swing.JLabel labelJenisMobil;
    private javax.swing.JLabel labelRute;
    private javax.swing.JTextField tmbhSupirRC3;
    private javax.swing.JTextField tmbhSopirAlamat;
    private javax.swing.JTextField tmbhSopirLisensi;
    private javax.swing.JTextField tmbhSopirNama;
    private javax.swing.JTextField tmbhSopirNoHP;
    private javax.swing.JComboBox<String> RuteTmbhSopir ;
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
        labelNama = new javax.swing.JLabel();
        labelAlamat = new javax.swing.JLabel();
        labelBiodataSupir = new javax.swing.JLabel();
        labelNoHp = new javax.swing.JLabel();
        labelGender = new javax.swing.JLabel();
        labelLisensi = new javax.swing.JLabel();
        labelJenisMobil = new javax.swing.JLabel();
        tmbhSopirKelamin = new javax.swing.JComboBox<>();
        tmbhSopirNama = new javax.swing.JTextField();
        tmbhSopirAlamat = new javax.swing.JTextField();
        tmbhSopirNoHP = new javax.swing.JTextField();
        tmbhSopirLisensi = new javax.swing.JTextField();
        TombolSubmit = new javax.swing.JButton();
        TombolBack = new javax.swing.JButton();
        labelRute = new javax.swing.JLabel();
        tmbhJenisMobil = new javax.swing.JComboBox<>();
        RuteTmbhSopir = new javax.swing.JComboBox<>();

        tmbhSupirRC3.setFont(new java.awt.Font("ITF Devanagari", 1, 14));
        tmbhSupirRC3.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelNama.setFont(new java.awt.Font("ITF Devanagari", 1, 18));
        labelNama.setText("Nama");

        labelAlamat.setFont(new java.awt.Font("ITF Devanagari", 1, 18));
        labelAlamat.setText("Alamat");

        labelBiodataSupir.setFont(new java.awt.Font("ITF Devanagari", 1, 24));
        labelBiodataSupir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBiodataSupir.setText("Biodata Sopir");

        labelNoHp.setFont(new java.awt.Font("ITF Devanagari", 1, 18));
        labelNoHp.setText("Nomor HP");

        labelGender.setFont(new java.awt.Font("ITF Devanagari", 1, 18));
        labelGender.setText("Jenis Kelamin");

        labelLisensi.setFont(new java.awt.Font("ITF Devanagari", 1, 18));
        labelLisensi.setText("Lisensi");

        tmbhSopirKelamin.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14));
        tmbhSopirKelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Laki laki", "Perempuan" }));

        tmbhSopirNama.setFont(new java.awt.Font("ITF Devanagari", 1, 14));

        tmbhSopirAlamat.setFont(new java.awt.Font("ITF Devanagari", 1, 14));

        tmbhSopirNoHP.setFont(new java.awt.Font("ITF Devanagari", 1, 14));

        tmbhSopirLisensi.setFont(new java.awt.Font("ITF Devanagari", 1, 14));

        TombolSubmit.setFont(new java.awt.Font("ITF Devanagari", 1, 14));
        TombolSubmit.setText("Submit");

        TombolBack.setFont(new java.awt.Font("ITF Devanagari", 1, 14));
        TombolBack.setText("Back");
        TombolBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolBackActionPerformed(evt);
            }
        });

        labelJenisMobil.setFont(new java.awt.Font("ITF Devanagari", 1, 18));
        labelJenisMobil.setText("Jenis Mobil");

        tmbhJenisMobil.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14));
        tmbhJenisMobil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Mobil Pribadi", "Travel"}));
        tmbhJenisMobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbhJenisMobilActionPerformed(evt);
            }
        });

        labelRute.setFont(new java.awt.Font("ITF Devanagari", 1, 18));
        labelRute.setText("Rute");

        RuteTmbhSopir.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 13));
        RuteTmbhSopir.addItem("-");
        String[] ruteArray = new String[RuteTravel.values().length];
        for (int i = 0; i < RuteTravel.values().length; i++) {
            ruteArray[i] = RuteTravel.values()[i].toString();
            RuteTmbhSopir.addItem(ruteArray[i]);
        }

        labelRute.setVisible(false);
        RuteTmbhSopir.setVisible(false);

        TombolSubmit.setFont(new java.awt.Font("ITF Devanagari", 1, 14));
        TombolSubmit.setText("Submit");
        TombolSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(labelBiodataSupir, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 109, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(TombolBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TombolSubmit)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(labelAlamat, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(labelNama, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(labelGender)
                                                        .addComponent(labelNoHp, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(labelLisensi, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGap(18, 43, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(tmbhSopirKelamin, 0, 168, Short.MAX_VALUE)
                                                        .addComponent(tmbhSopirNoHP, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(tmbhSopirAlamat, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(tmbhSopirNama, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(tmbhSopirLisensi)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(labelJenisMobil)
                                                        .addComponent(labelRute))
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
                                .addComponent(labelBiodataSupir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelNama)
                                        .addComponent(tmbhSopirNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelAlamat)
                                        .addComponent(tmbhSopirAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelNoHp)
                                        .addComponent(tmbhSopirNoHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelGender)
                                        .addComponent(tmbhSopirKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelLisensi)
                                        .addComponent(tmbhSopirLisensi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelJenisMobil)
                                        .addComponent(tmbhJenisMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelRute)
                                        .addComponent(RuteTmbhSopir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TombolBack)
                                        .addComponent(TombolSubmit))
                                .addContainerGap())
        );

        pack();
    }
    private void TombolSubmitActionPerformed(java.awt.event.ActionEvent evt) {
        saveDriverData();
        JOptionPane.showMessageDialog(this, "Biodata Sopir berhasil disimpan !!!");
        AdminScreenMenu adminMenu = new AdminScreenMenu();
        adminMenu.setVisible(true);
        this.dispose();
    }
    private void TombolBackActionPerformed(java.awt.event.ActionEvent evt) {
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
    }

    private void tmbhJenisMobilActionPerformed(java.awt.event.ActionEvent evt) {
            labelRute.setVisible(true);
            RuteTmbhSopir.setVisible(true);
        }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahSopirMenu().setVisible(true);
            }
        });
    }
}