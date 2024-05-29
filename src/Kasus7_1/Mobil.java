package Kasus7_1;

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
