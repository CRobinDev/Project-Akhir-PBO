package Kasus7_1;

public class MiniBus extends Mobil {
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
