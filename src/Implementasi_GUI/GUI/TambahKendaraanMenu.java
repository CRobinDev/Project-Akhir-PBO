/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Implementasi_GUI.GUI;
import javax.swing.*;
import Implementasi_GUI.Class.Kendaraan;
import Implementasi_GUI.Class.RuteTravel;
public class TambahKendaraanMenu extends javax.swing.JFrame {
    private javax.swing.JButton TombolSubmit;
    private javax.swing.JButton TombolBack;
    private javax.swing.JComboBox<String> ComboJenisMobil;
    private javax.swing.JLabel labelNoPlat;
    private javax.swing.JLabel labelMerk;
    private javax.swing.JLabel labelTambahkanKdr;
    private javax.swing.JLabel labelWarna;
    private javax.swing.JLabel labelTahun;
    private javax.swing.JLabel labelJenis;
    private javax.swing.JTextField merkField;
    private javax.swing.JTextField nomorPlatField;
    private javax.swing.JTextField warnaField;
    private javax.swing.JTextField tahunField;
    private javax.swing.JLabel RuteLabel;
    private javax.swing.JComboBox<String> Rute;
    public TambahKendaraanMenu() {
        setTitle("Informasi Kendaraan");
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTambahkanKdr = new javax.swing.JLabel();
        labelWarna = new javax.swing.JLabel();
        labelTahun = new javax.swing.JLabel();
        TombolBack = new javax.swing.JButton();
        ComboJenisMobil = new javax.swing.JComboBox<>();
        nomorPlatField = new javax.swing.JTextField();
        merkField = new javax.swing.JTextField();
        warnaField = new javax.swing.JTextField();
        tahunField = new javax.swing.JTextField();
        labelNoPlat = new javax.swing.JLabel();
        labelMerk = new javax.swing.JLabel();
        TombolSubmit = new javax.swing.JButton();
        labelJenis = new javax.swing.JLabel();
        Rute = new javax.swing.JComboBox<>();
        RuteLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RuteLabel.setFont(new java.awt.Font("ITF Devanagari",1,17));
        RuteLabel.setText("Rute");
        Rute.addItem("-");

        String[] ruteArray = new String[RuteTravel.values().length];
        for (int i = 0; i < RuteTravel.values().length; i++) {
            ruteArray[i] = RuteTravel.values()[i].toString();
            Rute.addItem(ruteArray[i]);
        }
        Rute.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14));

        labelTambahkanKdr.setFont(new java.awt.Font("ITF Devanagari", 1, 24));
        labelTambahkanKdr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTambahkanKdr.setText("Tambahkan Kendaraan");

        labelWarna.setFont(new java.awt.Font("ITF Devanagari", 1, 18));
        labelWarna.setText("Warna");

        labelTahun.setFont(new java.awt.Font("ITF Devanagari", 1, 18));
        labelTahun.setText("Tahun");

        TombolBack.setFont(new java.awt.Font("ITF Devanagari", 1, 14));
        TombolBack.setText("Back");
        TombolBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButton(evt);
            }
        });

        ComboJenisMobil.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14));
        ComboJenisMobil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mobil Pribadi", "Mini Bus", "Bus" }));

        nomorPlatField.setFont(new java.awt.Font("ITF Devanagari", 1, 14));

        merkField.setFont(new java.awt.Font("ITF Devanagari", 1, 14));

        warnaField.setFont(new java.awt.Font("ITF Devanagari", 1, 14));

        tahunField.setFont(new java.awt.Font("ITF Devanagari", 1, 14));

        labelNoPlat.setFont(new java.awt.Font("ITF Devanagari", 1, 17));
        labelNoPlat.setText("Nomor Plat");

        labelMerk.setFont(new java.awt.Font("ITF Devanagari", 1, 18));
        labelMerk.setText("Merk");

        TombolSubmit.setFont(new java.awt.Font("ITF Devanagari", 1, 14));
        TombolSubmit.setText("Submit");
        TombolSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButton(evt);
            }
        });

        labelJenis.setFont(new java.awt.Font("ITF Devanagari", 1, 18));
        labelJenis.setText("Jenis");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(labelTambahkanKdr, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(TombolBack)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(TombolSubmit))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(37, 37, 37)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(labelMerk)
                                                        .addComponent(labelNoPlat)
                                                        .addComponent(labelWarna)
                                                        .addComponent(labelJenis)
                                                        .addComponent(labelTahun)
                                                        .addComponent(RuteLabel))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(warnaField)
                                                        .addComponent(merkField, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(nomorPlatField, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(ComboJenisMobil, javax.swing.GroupLayout.Alignment.LEADING, 0, 208, Short.MAX_VALUE)
                                                        .addComponent(tahunField)
                                                        .addComponent(Rute, javax.swing.GroupLayout.Alignment.LEADING, 0, 208, Short.MAX_VALUE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(labelTambahkanKdr)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ComboJenisMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelJenis))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelNoPlat)
                                        .addComponent(nomorPlatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelMerk)
                                        .addComponent(merkField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(warnaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelWarna))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelTahun)
                                        .addComponent(tahunField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(RuteLabel)
                                        .addComponent(Rute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(TombolBack)
                                        .addComponent(TombolSubmit))
                                .addGap(21, 21, 21))
        );

        pack();
    }
    private void SubmitButton(java.awt.event.ActionEvent evt) {
        if (validateFields()) {
            saveKendaraanData();
            JOptionPane.showMessageDialog(this, "Data Kendaraan berhasil disimpan !!!");
            AdminScreenMenu adminMenu = new AdminScreenMenu();
            adminMenu.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Mohon isi semua kolom data.");
        }
    }

    private void BackButton(java.awt.event.ActionEvent evt) {
        AdminScreenMenu adminMenu = new AdminScreenMenu();
        adminMenu.setVisible(true);
        this.dispose();
    }

    private void saveKendaraanData() {
        String jenis = ComboJenisMobil.getSelectedItem().toString();
        String nomorPlat = nomorPlatField.getText();
        String merk = merkField.getText();
        String warna = warnaField.getText();
        String tahun = tahunField.getText();
        String rute = Rute.getSelectedItem().toString();
        boolean status = true;

        Kendaraan kendaraan = new Kendaraan(jenis, nomorPlat, merk, warna, tahun, rute, status);
        kendaraan.saveDataKendaraan();
    }

    private boolean validateFields() {
        return !nomorPlatField.getText().isEmpty() && !merkField.getText().isEmpty()
                && !warnaField.getText().isEmpty() && !tahunField.getText().isEmpty();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TambahKendaraanMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahKendaraanMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahKendaraanMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahKendaraanMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahKendaraanMenu().setVisible(true);
            }
        });
    }
}
