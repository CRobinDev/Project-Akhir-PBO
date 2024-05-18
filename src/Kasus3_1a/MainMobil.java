package Kasus3_1a;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Mobil {
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

    public void displayInfo() {
        System.out.println("Nomor Plat          : " + this.noPlat);
        System.out.println("Merk Mobil          : " + this.merkMobil);
        System.out.println("Warna Mobil         : " + this.warnaMobil);
        System.out.println("Tahun Keluaran Mobil: " + this.tahunKeluaranMobil);
        System.out.println("--------------------------------------------------");
    }
}
public class MainMobil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Mobil> daftarMobil = new ArrayList<>();
        int counter = 1;

        System.out.println("Selamat Datang di Aplikasi Filkom Tour & Travel");
        boolean loop = true;

        while (loop) {
            System.out.println("-------------------------------------------------------");
            System.out.println("Masukkan data mobil ke-" + counter);

            System.out.print("Nomor Plat          : ");
            String noPlat = input.nextLine();

            System.out.print("Merk Mobil          : ");
            String merkMobil = input.nextLine();

            System.out.print("Warna Mobil         : ");
            String warnaMobil = input.nextLine();

            System.out.print("Tahun Keluaran Mobil: ");
            int tahunKeluaranMobil = input.nextInt();
            input.nextLine();  // Consume newline

            Mobil mobil = new Mobil(noPlat, merkMobil, warnaMobil, tahunKeluaranMobil);
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
        for (Mobil mobil : daftarMobil) {
            System.out.println("Mobil ke-" + counter);
            mobil.displayInfo();
            counter++;
        }
    }
}
