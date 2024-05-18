package Kasus2_1a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Karyawan {
    private String nama;
    private String alamat;
    private String noHP;
    private String jenisKelamin;
    private String kategori;

    public Karyawan(String nama, String alamat, String noHP, String jenisKelamin, String kategori) {
        this.nama = nama;
        this.alamat = alamat;
        this.noHP = noHP;
        this.jenisKelamin = jenisKelamin;
        this.kategori = kategori;
    }

    public void printInfo() {
        System.out.println("Nama                : " + this.nama);
        System.out.println("Alamat              : " + this.alamat);
        System.out.println("Nomor Telepon       : " + this.noHP);
        System.out.println("Jenis Kelamin       : " + this.jenisKelamin);
        System.out.println("Kategori Karyawan   : " + this.kategori);
        System.out.println("--------------------------------------------------");
    }
}

public class MainKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List <Karyawan> daftarKaryawan = new ArrayList<>();
        int counter = 1;

        System.out.println("Selamat Datang di Aplikasi Filkom Tour & Travel");
        boolean loop = true;

        while (loop) {
            System.out.println("-------------------------------------------------------");
            System.out.println("Masukkan data karyawan ke-" + counter);

            System.out.print("Nama          : ");
            String name = input.nextLine();

            System.out.print("Alamat        : ");
            String address = input.nextLine();

            System.out.print("Nomor Telepon : ");
            String phone = input.nextLine();

            System.out.print("Jenis Kelamin : ");
            String gender = input.nextLine();

            System.out.print("Kategori (supir travel, supir rentcar, admin): ");
            String category = input.nextLine();

            Karyawan karyawan = new Karyawan(name, address, phone, gender, category);
            daftarKaryawan.add(karyawan);
            counter++;

            System.out.print("Apakah Anda ingin menambah data karyawan lagi? (y/n): ");
            String response = input.nextLine().trim().toLowerCase();
            if (!response.equals("y")) {
                System.out.println("Terima Kasih Telah menggunakan Aplikasi Kami :)");
                loop = false;
            }
        }

        System.out.println("\nData karyawan yang telah diinputkan:");
        counter = 1;
        for (Karyawan karyawan : daftarKaryawan) {
            System.out.println("Karwayan ke - " + counter);
            karyawan.printInfo();
            counter++;
        }
    }
}