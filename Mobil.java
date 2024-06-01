/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FilkomTravel;

/**
 *
 * @author dhani
 */

interface CetakInfoMobil {
    void displayInfo();
}

public class Mobil implements CetakInfoMobil {
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