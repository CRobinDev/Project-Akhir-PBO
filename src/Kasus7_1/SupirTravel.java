package Kasus7_1;

public class SupirTravel extends Karyawan {
    private final String lisensiTravel;

    public SupirTravel(String nama, String alamat, String noHP, String jenisKelamin, String lisensiTravel) {
        super(nama, alamat, noHP, jenisKelamin, "Supir Travel");
        this.lisensiTravel = lisensiTravel;
    }

    public String getLisensiTravel() {
        return lisensiTravel;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Lisensi Travel      : " + this.lisensiTravel);
        System.out.println("--------------------------------------------------");
    }
}
