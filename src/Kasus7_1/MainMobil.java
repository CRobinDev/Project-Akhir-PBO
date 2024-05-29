package Kasus7_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMobil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<CetakInfoMobil> daftarMobil = new ArrayList<>();
        int counter = 1;

        System.out.println("Selamat Datang di Aplikasi Filkom Tour & Travel");

        // Menambahkan 4 objek berbeda dengan sifat polimorfisme
        daftarMobil.add(new MobilPribadi("N 1234 AB", "Toyota Avanza", "Hitam", 2020, "Bensin"));
        daftarMobil.add(new MiniBus("N 5678 CD", "Isuzu Elf", "Putih", 2018, 12, RuteTravel.BANYUWANGI_MALANG));
        daftarMobil.add(new Bus("N 9101 EF", "Mitsubishi", "Biru", 2019, RuteTravel.SURABAYA_MALANG));
        daftarMobil.add(new MobilPribadi("N 1122 GH", "Honda Brio", "Merah", 2021, "Bensin"));

        boolean loop = true;
        while (loop) {
            System.out.println("-------------------------------------------------------");
            System.out.println("Masukkan data mobil ke-" + counter);

            System.out.print("Nomor Plat            : ");
            String noPlat = input.nextLine();

            System.out.print("Merk Mobil            : ");
            String merkMobil = input.nextLine();

            System.out.print("Warna Mobil           : ");
            String warnaMobil = input.nextLine();

            System.out.print("Tahun Keluaran Mobil  : ");
            int tahunKeluaranMobil = input.nextInt();
            input.nextLine();

            System.out.print("Kategori (mobil pribadi, minibus, bus): ");
            String category = input.nextLine().trim().toLowerCase();

            Mobil mobil = null;
            switch (category) {
                case "mobil pribadi":
                    System.out.print("Jenis Bahan Bakar   : ");
                    String jenisBahanBakar = input.nextLine();
                    mobil = new MobilPribadi(noPlat, merkMobil, warnaMobil, tahunKeluaranMobil, jenisBahanBakar);
                    break;
                case "minibus":
                    System.out.print("Kapasitas Penumpang   : ");
                    int kapasitasPenumpang = input.nextInt();
                    input.nextLine();

                    displayAvailableRutes();

                    System.out.print("Rute                  : ");
                    String ruteInputMinibus = input.nextLine().trim().toUpperCase().replace("-", "_");
                    try {
                        RuteTravel ruteMinibus = RuteTravel.valueOf(ruteInputMinibus);
                        mobil = new MiniBus(noPlat, merkMobil, warnaMobil, tahunKeluaranMobil, kapasitasPenumpang, ruteMinibus);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Rute tidak valid!");
                        continue;
                    }
                    break;
                case "bus":
                    displayAvailableRutes();

                    System.out.print("Rute                  : ");
                    String ruteInputBus = input.nextLine().trim().toUpperCase().replace("-", "_");
                    try {
                        RuteTravel ruteBus = RuteTravel.valueOf(ruteInputBus);
                        mobil = new Bus(noPlat, merkMobil, warnaMobil, tahunKeluaranMobil, ruteBus);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Rute tidak valid!");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Kategori tidak valid!");
                    continue;
            }

            daftarMobil.add(mobil);
            counter++;

            System.out.print("Apakah Anda ingin menambah data mobil lagi? (y/n): ");
            String response = input.nextLine().trim().toLowerCase();
            if (!response.equals("y")) {
                System.out.println("Terima Kasih Telah menggunakan Aplikasi Kami :)");
                loop = false;
            }
        }

        System.out.println("\nData mobil yang telah diinputkan:");
        counter = 1;
        for (CetakInfoMobil mobil : daftarMobil) {
            System.out.println("Mobil ke-" + counter);
            mobil.displayInfo();
            counter++;
        }
    }
    private static void displayAvailableRutes() {
        System.out.println("Rute yang tersedia    :");
        try {
            RuteTravel[] rutes = RuteTravel.values();
            for (int i = 0; i < rutes.length; i++) {
                System.out.println(" - " + rutes[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi kesalahan saat menampilkan rute.");
        }
    }
}

