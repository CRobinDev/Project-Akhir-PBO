package Kasus7_1;

public class SupirRentcar extends Karyawan {
    private final String lisensiRentcar;

    public SupirRentcar(String nama, String alamat, String noHP, String jenisKelamin, String lisensiRentcar) {
        super(nama, alamat, noHP, jenisKelamin, "Supir Rentcar");
        this.lisensiRentcar = lisensiRentcar;
    }

    public String getLisensiRentcar() {
        return lisensiRentcar;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Lisensi Rentcar     : " + this.lisensiRentcar);
        System.out.println("--------------------------------------------------");
    }
}
