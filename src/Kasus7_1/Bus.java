package Kasus7_1;

public class Bus extends Mobil {
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
