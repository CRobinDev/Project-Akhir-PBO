/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author dhani
 */

interface CetakInfo {
    void printInfo();
}

public class Karyawan implements CetakInfo {
    private final String nama;
    private final String alamat;
    private final String noHP;
    private final String jenisKelamin;
    private final String kategori;

    public Karyawan(String nama, String alamat, String noHP, String jenisKelamin, String kategori) {
        this.nama = nama;
        this.alamat = alamat;
        this.noHP = noHP;
        this.jenisKelamin = jenisKelamin;
        this.kategori = kategori;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNoHP() {
        return noHP;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getKategori() {
        return kategori;
    }

    @Override
    public void printInfo() {
        System.out.println("Nama                : " + this.nama);
        System.out.println("Alamat              : " + this.alamat);
        System.out.println("Nomor Telepon       : " + this.noHP);
        System.out.println("Jenis Kelamin       : " + this.jenisKelamin);
        System.out.println("Kategori Karyawan   : " + this.kategori);
    }
}
class Admin extends Karyawan {
    private final String divisi;

    public Admin(String nama, String alamat, String noHP, String jenisKelamin, String divisi) {
        super(nama, alamat, noHP, jenisKelamin, "Admin");
        this.divisi = divisi;
    }

    public String getDivisi() {
        return divisi;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Divisi              : " + this.divisi);
        System.out.println("--------------------------------------------------");
    }
}
class SupirRentcar extends Karyawan {
    private final String lisensiRentcar;

    public SupirRentcar(String nama, String alamat, String noHP, String jenisKelamin, String lisensiRentcar) {
        super(nama, alamat, noHP, jenisKelamin, "Supir Rentcar");
        this.lisensiRentcar = lisensiRentcar;
    }

    public String getLisensiRentcar() {
        return lisensiRentcar;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Lisensi Rentcar     : " + this.lisensiRentcar);
        System.out.println("--------------------------------------------------");
    }
}
class SupirTravel extends Karyawan {
    private final String lisensiTravel;

    public SupirTravel(String nama, String alamat, String noHP, String jenisKelamin, String lisensiTravel) {
        super(nama, alamat, noHP, jenisKelamin, "Supir Travel");
        this.lisensiTravel = lisensiTravel;
    }

    public String getLisensiTravel() {
        return lisensiTravel;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Lisensi Travel      : " + this.lisensiTravel);
        System.out.println("--------------------------------------------------");
    }
}