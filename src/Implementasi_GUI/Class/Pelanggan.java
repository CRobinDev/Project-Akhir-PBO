package Implementasi_GUI.Class;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Pelanggan {
    private String username;
    private String[] dataPesanan;


    public Pelanggan(String username) {
        this.username = username;
        readDataPesanan();
    }

    public String getUsername() {
        return username;
    }

    public String[] getDataPesanan() {
        return this.dataPesanan;
    }

    private void readDataPesanan() {
        List<String> pesananList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(username + ".txt"))) {
            StringBuilder pesanan = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.isEmpty()) {
                    pesananList.add(pesanan.toString());
                    pesanan = new StringBuilder();
                } else {
                    pesanan.append(line).append("<br>");
                }
            }
            if (!pesanan.isEmpty()) {
                pesananList.add(pesanan.toString());
            }
            dataPesanan = pesananList.toArray(new String[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addDataPesanan(String data) {
        if (dataPesanan == null) {
            dataPesanan = new String[]{data};
        } else {
            String[] newData = new String[dataPesanan.length + 1];
            System.arraycopy(dataPesanan, 0, newData, 0, dataPesanan.length);
            newData[dataPesanan.length] = data;
            dataPesanan = newData;
        }
    }
}