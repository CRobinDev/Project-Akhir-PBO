package Implementasi_GUI.Class;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Karyawan {
    private String nama;
    private String alamat;
    private String nomorHp;
    private String jenisKelamin;
    private String[] dataKaryawan;
    public Karyawan(){
        this.nama = "";
        this.alamat = "";
        this.nomorHp = "";
        this.jenisKelamin = "";
    }
    public Karyawan(String nama, String alamat, String nomorHp, String jenisKelamin) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorHp = nomorHp;
        this.jenisKelamin = jenisKelamin;
    }
    public String getNama() {
        return nama;
    }


    public String getAlamat() {
        return alamat;
    }

    public String getNoHP() {
        return nomorHp;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNomorHp(String nomorHp) {
        this.nomorHp = nomorHp;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String[] getDataKaryawan() {
        return dataKaryawan;
    }

    public void readDataKaryawan() {
        try (BufferedReader reader = new BufferedReader(new FileReader("Karyawan.txt"))) {
            StringBuilder sopir = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("Status")) {
                    continue;
                }
                if (line.isEmpty()) {
                    addDataKaryawan(sopir.toString());
                    sopir = new StringBuilder();
                } else {
                    sopir.append(line).append("<br>");
                }
            }
            if (!sopir.isEmpty()) {
                addDataKaryawan(sopir.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Gagal membaca data sopir.");
        }
    }

    private void addDataKaryawan(String data) {
        if (dataKaryawan == null) {
            dataKaryawan = new String[]{data};
        } else {
            String[] newData = new String[dataKaryawan.length + 1];
            System.arraycopy(dataKaryawan, 0, newData, 0, dataKaryawan.length);
            newData[dataKaryawan.length] = data;
            dataKaryawan = newData;
        }
    }
}
