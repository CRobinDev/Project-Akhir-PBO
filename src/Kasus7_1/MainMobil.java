package Kasus7_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

enum RuteTravel {
    SURABAYA_MALANG,
    MADURA_MALANG,
    BANYUWANGI_MALANG,
    SITUBONDO_MALANG,
    TULUNGAGUNG_MALANG;

    @Override
    public String toString() {
        return this.name().replace("_", "-");
    }
}

interface CetakInfoMobil {
    void displayInfo();
}

class Mobil implements CetakInfoMobil {
    private final String noPlat;
    private final String merkMobil;
    private final String warnaMobil;
    private final int tahunKeluaranMobil;

    public Mobil(String noPlat, String merkMobil, String warnaMobil, int tahunKeluaranMobil) {
        this.noPlat = noPlat;
        this.merkMobil = merkMobil;
        this.warnaMobil = warnaMobil;
        this.tahunKeluaranMobil = tahunKeluaranMobil;
    }

    @Override
    public void displayInfo() {
        System.out.println("Nomor Plat          : " + this.noPlat);
        System.out.println("Merk Mobil          : " + this.merkMobil);
        System.out.println("Warna Mobil         : " + this.warnaMobil);
        System.out.println("Tahun Keluaran Mobil: " + this.tahunKeluaranMobil);
    }
}

class MobilPribadi extends Mobil {
    private final String jenisBahanBakar;

    public MobilPribadi(String noPlat, String merkMobil, String warnaMobil, int tahunKeluaranMobil, String jenisBahanBakar) {
        super(noPlat, merkMobil, warnaMobil, tahunKeluaranMobil);
        this.jenisBahanBakar = jenisBahanBakar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jenis Bahan Bakar   : " + this.jenisBahanBakar);
        System.out.println("--------------------------------------------------");
    }
}

class MiniBus extends Mobil {
    private final int kapasitasPenumpang;
    private final RuteTravel rute;

    public MiniBus(String noPlat, String merkMobil, String warnaMobil, int tahunKeluaranMobil, int kapasitasPenumpang, RuteTravel rute) {
        super(noPlat, merkMobil, warnaMobil, tahunKeluaranMobil);
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.rute = rute;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kapasitas Penumpang : " + this.kapasitasPenumpang);
        System.out.println("Rute                : " + this.rute);
        System.out.println("--------------------------------------------------");
    }
}

class Bus extends Mobil {
    private final RuteTravel rute;

    public Bus(String noPlat, String merkMobil, String warnaMobil, int tahunKeluaranMobil, RuteTravel rute) {
        super(noPlat, merkMobil, warnaMobil, tahunKeluaranMobil);
        this.rute = rute;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Rute                : " + this.rute);
        System.out.println("--------------------------------------------------");
    }
}

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

