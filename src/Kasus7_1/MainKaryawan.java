package Kasus7_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

public class MainKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<CetakInfo> daftarKaryawan = new ArrayList<>();
        int counter = 1;

        System.out.println("Selamat Datang di Aplikasi Filkom Tour & Travel");
        // Menambahkan 4 objek berbeda dengan sifat polimorfisme
        daftarKaryawan.add(new SupirTravel("Ahmad", "Malang", "08123456789", "Laki-laki", "A123"));
        daftarKaryawan.add(new SupirRentcar("Budi", "Surabaya", "08198765432", "Laki-laki", "B456"));
        daftarKaryawan.add(new Admin("Citra", "Jakarta", "08134567890", "Perempuan", "HRD"));
        daftarKaryawan.add(new SupirTravel("Dewi", "Bandung", "08122334455", "Perempuan", "A789"));
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
            String category = input.nextLine().trim().toLowerCase();

            Karyawan karyawan = null;
            switch (category) {
                case "supir travel":
                    System.out.print("Lisensi Travel : ");
                    String lisensiTravel = input.nextLine();
                    karyawan = new SupirTravel(name, address, phone, gender, lisensiTravel);
                    break;
                case "supir rentcar":
                    System.out.print("Lisensi Rentcar : ");
                    String lisensiRentcar = input.nextLine();
                    karyawan = new SupirRentcar(name, address, phone, gender, lisensiRentcar);
                    break;
                case "admin":
                    System.out.print("Divisi        : ");
                    String divisi = input.nextLine();
                    karyawan = new Admin(name, address, phone, gender, divisi);
                    break;
                default:
                    System.out.println("Kategori tidak valid!");
                    continue;
            }

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
        for (CetakInfo karyawan : daftarKaryawan) {
            System.out.println("Karyawan ke - " + counter);
            karyawan.printInfo();
            counter++;
        }
    }
}
