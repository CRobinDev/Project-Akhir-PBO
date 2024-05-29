package Kasus7_1;

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
