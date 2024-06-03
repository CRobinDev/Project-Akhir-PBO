package Implementasi_GUI.Class;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;

public class Admin extends Karyawan {
    private String divisi;
    public Admin(){
        super();
        this.divisi = "";
    }
    public Admin(String nama, String alamat, String nomorHp, String jenisKelamin, String divisi) {
        super(nama, alamat, nomorHp, jenisKelamin);
        this.divisi = divisi;
    }

    public String getDivisi() {
        return divisi;
    }

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public String getAlamat() {
        return super.getAlamat();
    }

    @Override
    public String getNoHP() {
        return super.getNoHP();
    }

    @Override
    public String getJenisKelamin() {
        return super.getJenisKelamin();
    }
    @Override
    public void setNama(String nama) {
        super.setNama(nama);
    }

    @Override
    public void setJenisKelamin(String jenisKelamin) {
        super.setJenisKelamin(jenisKelamin);
    }

    @Override
    public void setNomorHp(String nomorHp) {
        super.setNomorHp(nomorHp);
    }

    @Override
    public void setAlamat(String alamat) {
        super.setAlamat(alamat);
    }

    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }

    public void saveData() {
        try (FileWriter writer = new FileWriter("admin.txt", true);
             FileWriter writer2 = new FileWriter("karyawan.txt", true)) {

            writer.write("Nama          : " + getNama() + "\n");
            writer.write("Alamat        : " + getAlamat() + "\n");
            writer.write("Nomor HP      : " + getNoHP() + "\n");
            writer.write("Jenis Kelamin : " + getJenisKelamin() + "\n");
            writer.write("Divisi        : " + divisi + "\n\n");

            writer2.write("Nama          : " + getNama() + "\n");
            writer2.write("Alamat        : " + getAlamat() + "\n");
            writer2.write("Nomor HP      : " + getNoHP() + "\n");
            writer2.write("Jenis Kelamin : " + getJenisKelamin() + "\n");
            writer2.write("Divisi        : " + divisi + "\n\n");

        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Gagal menyimpan biodata admin.");
        }
    }
}