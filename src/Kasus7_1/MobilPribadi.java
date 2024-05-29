package Kasus7_1;

public class MobilPribadi extends Mobil {
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
