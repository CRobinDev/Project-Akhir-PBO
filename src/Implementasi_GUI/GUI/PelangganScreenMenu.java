package Implementasi_GUI.GUI;
import Implementasi_GUI.Class.Pelanggan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import Implementasi_GUI.Class.RuteTravel;

public class PelangganScreenMenu extends javax.swing.JFrame {
    private Pelanggan pesananPelanggan;
    private Map<String, ArrayList<String>> ruteToSopirMap;
    private Map<String, ArrayList<String>> jenisToKendaraanMap;
    private String username;
    private Map<String, String> nomorPlatToJenisMap = new HashMap<>();
    public PelangganScreenMenu(PelangganLoginMenu akunPelanggan){
        setTitle("Pemesanan");
        initComponents();
        this.username = akunPelanggan.getUsername();
        setLocationRelativeTo(null);
        jenisToKendaraanMap = new HashMap<>();
        readKendaraanData();
        updateKendaraanComboBox();
        ruteToSopirMap = new HashMap<>();
        readSopirData();
        updateSopirComboBox();
    }
    public PelangganScreenMenu(String username){
        setTitle("Pemesanan");
        initComponents();
        this.username = username;
        setLocationRelativeTo(null);
        jenisToKendaraanMap = new HashMap<>();
        readKendaraanData();
        updateKendaraanComboBox();
        ruteToSopirMap = new HashMap<>();
        readSopirData();
        updateSopirComboBox();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        labelPemesanan = new javax.swing.JLabel();
        labelFilkomTour = new javax.swing.JLabel();
        labelPilihSopir = new javax.swing.JLabel();
        pelangganPilihRute = new javax.swing.JComboBox<>();
        BackButton = new javax.swing.JButton();
        PesananButton = new javax.swing.JButton();
        SubmitButton = new javax.swing.JButton();
        labelPilihRute = new javax.swing.JLabel();
        SopirBox = new javax.swing.JComboBox<>();
        labelLamaSewa = new javax.swing.JLabel();
        TanggalSewa = new javax.swing.JTextField();
        labelHari = new javax.swing.JLabel();
        labelTglPenyewaan = new javax.swing.JLabel();
        LamaSewa = new javax.swing.JTextField();
        jenisMobil = new javax.swing.JComboBox<>();
        jenisMobilLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelPemesanan.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 24));
        labelPemesanan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPemesanan.setText("Pemesanan");

        labelFilkomTour.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 24));
        labelFilkomTour.setText("Filkom Tour & Travel");

        jenisMobilLabel.setFont(new java.awt.Font("ITF Devanagari", 1, 18));
        jenisMobilLabel.setText("Pilih Mobil");
        jenisMobil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Mobil Pribadi", "Mini Bus", "Bus" }));
        jenisMobil.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14));

        labelPilihSopir.setFont(new java.awt.Font("ITF Devanagari", 1, 18));
        labelPilihSopir.setText("Pilih Sopir");

        BackButton.setFont(new java.awt.Font("ITF Devanagari", 1, 14));
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PelangganLoginMenu(evt);
            }
        });

        PesananButton.setFont(new java.awt.Font("ITF Devanagari", 1, 14));
        PesananButton.setText("Pesanan Anda");

        PesananButton.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                pesananButtonActionPerformed(evt);
            }
        });

        SubmitButton.setFont(new java.awt.Font("ITF Devanagari", 1, 14));
        SubmitButton.setText("Submit");

        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonPerformed(evt);
            }
        });

        labelPilihRute.setFont(new java.awt.Font("ITF Devanagari", 1, 18));
        labelPilihRute.setText("Pilih Rute");

        pelangganPilihRute.addItem("-");
        String[] ruteArray = new String[RuteTravel.values().length];
        for (int i = 0; i < RuteTravel.values().length; i++) {
            ruteArray[i] = RuteTravel.values()[i].toString();
            pelangganPilihRute.addItem(ruteArray[i]);
        }
        pelangganPilihRute.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 13));
        pelangganPilihRute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pelangganPilihRuteActionPerformed(evt);
            }
        });

        labelLamaSewa.setFont(new java.awt.Font("ITF Devanagari", 1, 18));
        labelLamaSewa.setText("Lama Sewa");

        TanggalSewa.setFont(new java.awt.Font("ITF Devanagari", 1, 14));
        TanggalSewa.setText("DD/MM/YYYY");
        TanggalSewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TanggalSewaActionPerformed(evt);
            }
        });

        labelHari.setFont(new java.awt.Font("ITF Devanagari", 1, 18));
        labelHari.setText("Hari");

        labelTglPenyewaan.setFont(new java.awt.Font("ITF Devanagari", 1, 18));
        labelTglPenyewaan.setText("Tanggal Penyewaan");

        LamaSewa.setFont(new java.awt.Font("ITF Devanagari", 1, 14));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(BackButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PesananButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SubmitButton)
                                .addGap(8, 8, 8))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelTglPenyewaan)
                                        .addComponent(labelLamaSewa)
                                        .addComponent(labelPilihSopir)
                                        .addComponent(labelPilihRute)
                                        .addComponent(jenisMobilLabel))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(LamaSewa, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(labelHari)
                                                                .addGap(42, 42, 42))
                                                        .addComponent(SopirBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(TanggalSewa))
                                                .addGap(30, 30, 30))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(pelangganPilihRute, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jenisMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelFilkomTour)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addComponent(labelPemesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(labelPemesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(labelFilkomTour, javax.swing.GroupLayout.PREFERRED_SIZE, 33, Short.MAX_VALUE)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelPilihRute)
                                        .addComponent(pelangganPilihRute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jenisMobilLabel)
                                        .addComponent(jenisMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelPilihSopir)
                                        .addComponent(SopirBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelLamaSewa)
                                        .addComponent(labelHari)
                                        .addComponent(LamaSewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelTglPenyewaan)
                                        .addComponent(TanggalSewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(BackButton)
                                        .addComponent(PesananButton)
                                        .addComponent(SubmitButton))
                                .addContainerGap())
        );

        labelFilkomTour.getAccessibleContext().setAccessibleDescription("");

        pack();
    }
    private void pesananButtonActionPerformed(java.awt.event.ActionEvent evt) {
        setUsername(username);
        pesananPelanggan = new Pelanggan(this.username);
        PesananPelanggan pesanan = new PesananPelanggan(pesananPelanggan);
        pesanan.setVisible(true);
        this.dispose();
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
    private void SubmitButtonPerformed(java.awt.event.ActionEvent evt){
        savePemesananData();
        pelangganPilihRute.setSelectedIndex(0);
        LamaSewa.setText("");
        TanggalSewa.setText("DD/MM/YYYY");
        PelangganScreenMenu screenMenu = new PelangganScreenMenu(new PelangganLoginMenu(username));
        screenMenu.setVisible(true);
        this.dispose();
    }
    private void PelangganLoginMenu(java.awt.event.ActionEvent evt) {
        PelangganLoginMenu plgLgMenu = new PelangganLoginMenu();
        plgLgMenu.setVisible(true);
        this.dispose();
    }

    private void TanggalSewaActionPerformed(java.awt.event.ActionEvent evt) {}

    private void readSopirData() {
        try (BufferedReader reader = new BufferedReader(new FileReader("sopir.txt"))) {
            String line;
            String nama = null;
            String rute = null;
            String status = null; // Add status variable
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Nama          :")) {
                    nama = line.split(":")[1].trim();
                } else if (line.startsWith("Rute          :")) {
                    rute = line.split(":")[1].trim();
                } else if (line.startsWith("Status        :")) {
                    status = line.split(":")[1].trim();
                } else if (nama != null && rute != null && status != null && status.equals("Available")) {
                    ruteToSopirMap.computeIfAbsent(rute, k -> new ArrayList<>()).add(nama);
                    nama = null;
                    rute = null;
                    status = null;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Gagal membaca data sopir.");
        }
    }
    private void readKendaraanData() {
        try (BufferedReader reader = new BufferedReader(new FileReader("kendaraan.txt"))) {
            String line;
            String rute = null;
            String jenis = null;
            String merk = null;
            String nomorPlat = null;
            String status = null;

            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Jenis         :")) {
                    jenis = line.split(":")[1].trim();
                } else if (line.startsWith("Merk          :")) {
                    merk = line.split(":")[1].trim();
                } else if (line.startsWith("Nomor Plat    :")) {
                    nomorPlat = line.split(":")[1].trim();
                } else if (line.startsWith("Status        :")) {
                    status = line.split(":")[1].trim();
                } else if (line.startsWith("Rute          :")) {
                    rute = line.split(":")[1].trim();
                } else if (jenis != null && merk != null && nomorPlat != null && status != null && status.equals("Available")) {
                    String jenisMerk = jenis + " " + merk;
                    jenisToKendaraanMap.computeIfAbsent(rute, k -> new ArrayList<>()).add(jenisMerk + " - " + nomorPlat);
                    nomorPlatToJenisMap.put(nomorPlat, jenisMerk);
                    rute = null;
                    jenis = null;
                    merk = null;
                    nomorPlat = null;
                    status = null;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal membaca data kendaraan.");
        }
    }


    private void pelangganPilihRuteActionPerformed(java.awt.event.ActionEvent evt) {
        updateKendaraanComboBox();
        updateSopirComboBox();
    }
    private void updateKendaraanComboBox() {
        jenisMobil.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 13));
        String selectedRute = (String) pelangganPilihRute.getSelectedItem();
        ArrayList<String> kendaraanList = jenisToKendaraanMap.getOrDefault(selectedRute, new ArrayList<>());
        jenisMobil.removeAllItems();
        for (String kendaraan : kendaraanList) {
            jenisMobil.addItem(kendaraan);
        }
    }
    private void updateSopirComboBox() {
        SopirBox.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 13));
        String selectedRute = (String) pelangganPilihRute.getSelectedItem();
        ArrayList<String> sopirList = ruteToSopirMap.getOrDefault(selectedRute, new ArrayList<>());
        SopirBox.removeAllItems();
        for (String sopir : sopirList) {
            SopirBox.addItem(sopir);
        }
    }
    private void updateDriverStatus(String driverName) {
        try (BufferedReader reader = new BufferedReader(new FileReader("sopir.txt"))) {
            StringBuilder fileContent = new StringBuilder();
            String line;
            boolean isDriverFound = false;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Nama          :") && line.contains(driverName)) {
                    isDriverFound = true;
                }

                if (isDriverFound && line.startsWith("Status") && line.contains("Available")) {
                    line = line.replace("Available", "Unavailable");
                    isDriverFound = false;
                }
                fileContent.append(line).append("\n");
            }


            try (FileWriter writer = new FileWriter("sopir.txt", false)) {
                writer.write(fileContent.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal memperbarui status sopir.");
        }
    }
    private void updateKendaraanStatus(String nomorPlat) {
        try (BufferedReader reader = new BufferedReader(new FileReader("kendaraan.txt"))) {
            StringBuilder fileContent = new StringBuilder();
            String line;
            boolean isKendaraanFound = false;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Nomor Plat    :") && line.contains(nomorPlat)) {
                    isKendaraanFound = true;
                }

                if (isKendaraanFound && line.startsWith("Status") && line.contains("Available")) {
                    line = line.replace("Available", "Unavailable");
                    isKendaraanFound = false;
                }
                fileContent.append(line).append("\n");
            }

            try (FileWriter writer = new FileWriter("kendaraan.txt", false)) {
                writer.write(fileContent.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal memperbarui status kendaraan.");
        }
    }

    private void savePemesananData() {
        String nama = SopirBox.getSelectedItem().toString();
        String lamaSewa = LamaSewa.getText();
        String tanggalPenyewaan = TanggalSewa.getText();
        String rute = pelangganPilihRute.getSelectedItem().toString();
        String kendaraanInfo = jenisMobil.getSelectedItem().toString();
        String[] kendaraanParts = kendaraanInfo.split(" - ");
        String jenisMerk = kendaraanParts[0];
        String nomorPlat = kendaraanParts[1];
        updateDriverStatus(nama);
        updateKendaraanStatus(nomorPlat);
        try (FileWriter writer = new FileWriter(username + ".txt", true)) {
            writer.write("Username         : " + username + "\n");
            writer.write("Nama Sopir       : " + nama + "\n");
            writer.write("Jenis Mobil      : " + jenisMerk + "\n");
            writer.write("Nomor Plat       : " + nomorPlat + "\n");
            writer.write("Rute             : " + rute + "\n");
            writer.write("Lama Sewa        : " + lamaSewa + " hari\n");
            writer.write("Tanggal Penyewaan: " + tanggalPenyewaan + "\n\n");

            JOptionPane.showMessageDialog(this, "Data pemesanan berhasil disimpan.");

        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal menyimpan data pemesanan.");
        }
    }

    public static void main(String args[]) {

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
    }

    private javax.swing.JButton PesananButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JComboBox<String> SopirBox;
    private javax.swing.JLabel labelPemesanan;
    private javax.swing.JLabel labelHari;
    private javax.swing.JLabel labelTglPenyewaan;
    private javax.swing.JLabel labelFilkomTour;
    private javax.swing.JLabel labelPilihSopir;
    private javax.swing.JLabel labelPilihRute;
    private javax.swing.JLabel labelLamaSewa;
    private javax.swing.JComboBox<String> pelangganPilihRute;
    private javax.swing.JTextField TanggalSewa;
    private javax.swing.JTextField LamaSewa;
    private javax.swing.JLabel jenisMobilLabel;
    private javax.swing.JComboBox<String> jenisMobil;
}
