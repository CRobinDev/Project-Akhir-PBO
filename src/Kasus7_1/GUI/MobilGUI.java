package Kasus7_1.GUI;
import Kasus7_1.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MobilGUI extends JPanel {
    private JTextField noPlatField;
    private JTextField merkField;
    private JTextField warnaField;
    private JTextField tahunField;
    private JComboBox<String> jenisComboBox;
    private JButton saveButton;
    private JButton backButton;

    private GUI mainGUI;
    private Karyawan karyawan;

    public MobilGUI(GUI mainGUI, Karyawan karyawan) {
        this.mainGUI = mainGUI;
        this.karyawan = karyawan;

        setLayout(new GridLayout(7, 2));

        JLabel noPlatLabel = new JLabel("Nomor Plat :");
        JLabel merkLabel = new JLabel("Merk Mobil :");
        JLabel warnaLabel = new JLabel("Warna Mobil :");
        JLabel tahunLabel = new JLabel("Tahun Keluaran :");
        JLabel jenisLabel = new JLabel("Jenis Mobil :");

        noPlatField = new JTextField(10);
        merkField = new JTextField(10);
        warnaField = new JTextField(10);
        tahunField = new JTextField(10);
        jenisComboBox = new JComboBox<>(new String[]{"Bus", "Mini Bus", "Mobil Pribadi"});

        saveButton = new JButton("Save");
        backButton = new JButton("Back");

        add(noPlatLabel);
        add(noPlatField);
        add(merkLabel);
        add(merkField);
        add(warnaLabel);
        add(warnaField);
        add(tahunLabel);
        add(tahunField);
        add(jenisLabel);
        add(jenisComboBox);
        add(saveButton);
        add(backButton);

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveData();
            }
        });

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainGUI.showUserGUI();
            }
        });

    }

    private void saveData() {
        String noPlat = noPlatField.getText();
        String merk = merkField.getText();
        String warna = warnaField.getText();
        int tahun = Integer.parseInt(tahunField.getText());
        String jenis = (String) jenisComboBox.getSelectedItem();

        // Mengumpulkan informasi yang akan ditampilkan
        StringBuilder info = new StringBuilder();
        info.append("Informasi Mobil").append("\n");
        info.append("Nomor Plat: ").append(noPlat).append("\n");
        info.append("Merk Mobil: ").append(merk).append("\n");
        info.append("Warna Mobil: ").append(warna).append("\n");
        info.append("Tahun Keluaran: ").append(tahun).append("\n");
        info.append("Jenis Mobil: ").append(jenis).append("\n");

        if (jenis.equals("Bus")) {
            displayAvailableRutes();
            String ruteInputBus = JOptionPane.showInputDialog("Masukkan rute Bus:").trim().toUpperCase().replace("-", "_");
            RuteTravel rute = RuteTravel.valueOf(ruteInputBus);
            Bus bus = new Bus(noPlat, merk, warna, tahun, rute);
            info.append("Rute: ").append(rute.name().replace("_", "-")).append("\n");
        } else if (jenis.equals("MiniBus")) {
            displayAvailableRutes();
            String ruteInputMiniBus = JOptionPane.showInputDialog("Masukkan rute Minibus :").trim().toUpperCase().replace("-", "_");
            RuteTravel rute = RuteTravel.valueOf(ruteInputMiniBus);
            int kapasitas = Integer.parseInt(JOptionPane.showInputDialog("Masukkan kapasitas MiniBus :"));
            MiniBus miniBus = new MiniBus(noPlat, merk, warna, tahun, kapasitas, rute);
            info.append("Rute : ").append(rute.name().replace("_", "-")).append("\n");
            info.append("Kapasitas : ").append(kapasitas).append("\n");
        } else if (jenis.equals("Mobil Pribadi")) {
            displayAvailableRutes();
            String ruteInputMobilPribadi = JOptionPane.showInputDialog("Masukkan rute Mobil Pribadi :").trim().toUpperCase().replace("-", "_");
            String bahanBakar = JOptionPane.showInputDialog("Masukkan jenis bahan bakar Mobil Pribadi :");
            MobilPribadi mobilPribadi = new MobilPribadi(noPlat, merk, warna, tahun, bahanBakar);
            info.append("Rute: ").append(ruteInputMobilPribadi.replace("_", "-")).append("\n");
            info.append("Bahan Bakar: ").append(bahanBakar).append("\n");
        }
        showOutput(info.toString());
    }
    private void showOutput(String info) {
        // Menampilkan informasi di JFrame baru
        JFrame outputFrame = new JFrame("Informasi Mobil");
        outputFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        outputFrame.setSize(500, 300);

        JTextArea outputTextArea = new JTextArea(info);
        outputTextArea.setEditable(false);
        outputTextArea.setFont(new Font("Monospaced", Font.BOLD, 16));
        outputFrame.add(new JScrollPane(outputTextArea));

        outputFrame.setLocationRelativeTo(null);
        outputFrame.setVisible(true);

        Timer timer = new Timer(3000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                outputFrame.dispose();
                // Menanyakan apakah user ingin mengisi data lagi
                int response = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin mengisi data lagi?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    mainGUI.showUserGUI();
                } else {
                    JOptionPane.showMessageDialog(null, "Terima kasih telah menggunakan aplikasi kami!");
                    System.exit(0);

                }
            }
        });
        timer.setRepeats(false);
        timer.start();
    }
    private void displayAvailableRutes() {
        StringBuilder availableRutes = new StringBuilder("Available Rutes:\n");
        for (RuteTravel rute : RuteTravel.values()) {
            availableRutes.append(rute.name().replace("_", "-")).append("\n");
        }
        JOptionPane.showMessageDialog(this, availableRutes.toString(), "Available Rutes", JOptionPane.INFORMATION_MESSAGE);
    }

}



