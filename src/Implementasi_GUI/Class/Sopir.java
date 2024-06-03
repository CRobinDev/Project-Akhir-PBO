package Implementasi_GUI.Class;
import javax.swing.*;
import java.io.*;
public class Sopir extends Karyawan {
    private String lisensi;
    private String jenisMobil;
    private String rute;
    private boolean status;
    private String[] sopirData;
    public Sopir() {
        super();
        this.lisensi = "";
        this.jenisMobil = "";
        this.rute = "";
        this.status = true;
    }
    public Sopir(String nama, String alamat, String nomorHp, String jenisKelamin,
                 String lisensi, String jenisMobil, String rute) {
        super(nama, alamat, nomorHp, jenisKelamin);
        this.lisensi = lisensi;
        this.jenisMobil = jenisMobil;
        this.rute = rute;
        this.status = true;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public String getLisensi(){
        return lisensi;
    }
    public String getJenisMobil(){
        return lisensi;
    }
    public String getRute(){
        return lisensi;
    }
    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public String getAlamat() {
        return super.getAlamat();
    }

    @Override
    public String getNoHP() {
        return super.getNoHP();
    }

    @Override
    public void setNama(String nama) {
        super.setNama(nama);
    }

    @Override
    public void setJenisKelamin(String jenisKelamin) {
        super.setJenisKelamin(jenisKelamin);
    }

    @Override
    public void setNomorHp(String nomorHp) {
        super.setNomorHp(nomorHp);
    }

    @Override
    public void setAlamat(String alamat) {
        super.setAlamat(alamat);
    }

    public void setLisensi(String lisensi) {
        this.lisensi = lisensi;
    }

    public void setJenisMobil(String jenisMobil) {
        this.jenisMobil = jenisMobil;
    }

    public void setRute(String rute) {
        this.rute = rute;
    }

    public String[] getSopirData() {
        return sopirData;
    }

    @Override
    public String getJenisKelamin() {
        return super.getJenisKelamin();
    }
    public void saveDataSopir() {
        try (FileWriter writerSopir = new FileWriter("sopir.txt", true);
             FileWriter writerKaryawan = new FileWriter("karyawan.txt", true)) {

            writerSopir.write("Lisensi       : " + lisensi + "\n");
            writerSopir.write("Jenis Mobil   : " + jenisMobil + "\n");
            writerSopir.write("Rute          : " + rute + "\n");
            writerSopir.write("Status        : " + (status ? "Available" : "Unavailable") + "\n\n");

            writerKaryawan.write("Nama          : " + getNama() + "\n");
            writerKaryawan.write("Alamat        : " + getAlamat() + "\n");
            writerKaryawan.write("Nomor HP      : " + getNoHP() + "\n");
            writerKaryawan.write("Jenis Kelamin : " + getJenisKelamin() + "\n");
            writerKaryawan.write("Lisensi       : " + lisensi + "\n");
            writerKaryawan.write("Jenis Mobil   : " + jenisMobil + "\n");
            writerKaryawan.write("Rute          : " + rute + "\n");
            writerKaryawan.write("Status        : " + (status ? "Available" : "Unavailable") + "\n\n");

        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Gagal menyimpan biodata sopir.");
        }
    }
    public void readDataSopir() {
        try (BufferedReader reader = new BufferedReader(new FileReader("Sopir.txt"))) {
            StringBuilder sopir = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    addSopirDataIfAvailable(sopir.toString());
                    sopir = new StringBuilder();
                } else {
                    sopir.append(line).append("<br>");
                }
            }
            if (sopir.length() > 0) {
                addSopirDataIfAvailable(sopir.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Gagal membaca data sopir.");
        }
    }

    private void addSopirDataIfAvailable(String data) {
        if (data.contains("Status        : Available")) {
            addDataSopir(data);
        }
    }

    private void addDataSopir(String data) {
        if (sopirData == null) {
            sopirData = new String[]{data};
        } else {
            String[] newData = new String[sopirData.length + 1];
            System.arraycopy(sopirData, 0, newData, 0, sopirData.length);
            newData[sopirData.length] = data;
            sopirData = newData;
        }
    }
}

