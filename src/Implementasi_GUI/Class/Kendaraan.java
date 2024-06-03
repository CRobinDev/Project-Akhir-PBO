package Implementasi_GUI.Class;

import java.io.*;
import javax.swing.JOptionPane;

public class Kendaraan {
    private String jenis;
    private String nomorPlat;
    private String merk;
    private String warna;
    private String tahun;
    private String rute;
    private boolean status;
    private String[] dataKendaraan;
    public Kendaraan(){
        this.jenis = "";
        this.nomorPlat = "";
        this.merk = "";
        this.warna = "";
        this.tahun = "";
        this.rute = "";
        this.status = true;
    }
    public Kendaraan(String jenis, String nomorPlat, String merk, String warna, String tahun, String rute, boolean status) {
        this.jenis = jenis;
        this.nomorPlat = nomorPlat;
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
        this.rute = rute;
        this.status = true;
    }

    public void setRute(String rute) {
        this.rute = rute;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setNomorPlat(String nomorPlat) {
        this.nomorPlat = nomorPlat;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String[] getDataKendaraan() {
        return dataKendaraan;
    }

    public void saveDataKendaraan() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("kendaraan.txt", true))) {
            writer.write("Jenis         : " + jenis + "\n");
            writer.write("Nomor Plat    : " + nomorPlat + "\n");
            writer.write("Merk          : " + merk + "\n");
            writer.write("Warna         : " + warna + "\n");
            writer.write("Tahun         : " + tahun + "\n");
            writer.write("Rute          : " + rute + "\n");
            writer.write("Status        : " + (status ? "Available" : "Not Available") + "\n\n");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Gagal menyimpan data kendaraan.");
        }
    }
    public void readDataKendaraan() {
        try (BufferedReader reader = new BufferedReader(new FileReader("kendaraan.txt"))) {
            StringBuilder kendaraan = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.isEmpty()) {
                    // Jika menemukan baris kosong, simpan data kendaraan sebelumnya
                    addKendaraanIfAvailable(kendaraan.toString());
                    kendaraan = new StringBuilder(); // Bersihkan StringBuilder untuk data kendaraan baru
                } else {
                    kendaraan.append(line).append("<br>");
                }
            }
            // Simpan data kendaraan terakhir setelah keluar dari loop
            if (!kendaraan.isEmpty()) {
                addKendaraanIfAvailable(kendaraan.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Gagal membaca data kendaraan.");
        }
    }
    private void addKendaraanIfAvailable(String data) {
        if (data.contains("Status        : Available")) {
            addDataKendaraan(data);
        }
    }

    private void addDataKendaraan(String data) {

        if (dataKendaraan == null) {
            dataKendaraan = new String[]{data};
        } else {
            String[] newData = new String[dataKendaraan.length + 1];
            System.arraycopy(dataKendaraan, 0, newData, 0, dataKendaraan.length);
            newData[dataKendaraan.length] = data;
            dataKendaraan = newData;
        }
    }
}

