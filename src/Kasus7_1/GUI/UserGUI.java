package Kasus7_1.GUI;
import Kasus7_1.Karyawan;
import Kasus7_1.SupirTravel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UserGUI extends JPanel {
    private JTextField namaField;
    private JTextField alamatField;
    private JTextField noHPField;
    private JTextField jenisKelaminField;
    private JComboBox<String> kategoriComboBox;
    private JTextField lisensiField;
    private JButton saveButton;
    private JButton nextButton;
    private GUI mainGUI;

    public UserGUI(GUI mainGUI) {
        this.mainGUI = mainGUI;

        setLayout(new GridLayout(8, 2)); // Menambah satu baris untuk tombol next

        JLabel namaLabel = new JLabel("Nama :");
        JLabel alamatLabel = new JLabel("Alamat :");
        JLabel noHPLabel = new JLabel("Nomor HP :");
        JLabel jenisKelaminLabel = new JLabel("Jenis Kelamin :");
        JLabel kategoriLabel = new JLabel("Kategori Karyawan :");
        JLabel lisensiLabel = new JLabel("Lisensi :");

        namaField = new JTextField(10);
        alamatField = new JTextField(10);
        noHPField = new JTextField(10);
        jenisKelaminField = new JTextField(10);
        kategoriComboBox = new JComboBox<>(new String[]{"Admin", "Supir Travel", "Supir Rentcar"});
        lisensiField = new JTextField(10);
        lisensiField.setVisible(false);

        saveButton = new JButton("Save");
        nextButton = new JButton("Next");

        add(namaLabel);
        add(namaField);
        add(alamatLabel);
        add(alamatField);
        add(noHPLabel);
        add(noHPField);
        add(jenisKelaminLabel);
        add(jenisKelaminField);
        add(kategoriLabel);
        add(kategoriComboBox);
        add(lisensiLabel);
        add(lisensiField);
        add(saveButton);
        add(nextButton);

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveData();
            }
        });
        kategoriComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedCategory = (String) kategoriComboBox.getSelectedItem();
                // Jika kategori yang dipilih adalah "Supir Travel", tampilkan lisensiField
                if ("Supir Travel".equals(selectedCategory) || "Supir Rentcar".equals(selectedCategory)) {
                    lisensiField.setVisible(true);
                } else {
                    lisensiField.setVisible(false); // Sembunyikan lisensiField jika kategori yang dipilih bukan "Supir Travel"
                }
            }
        });
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedCategory = (String) kategoriComboBox.getSelectedItem();
                if ("Supir Travel".equals(selectedCategory) || "Supir Rentcar".equals(selectedCategory) ) {
                    showOutput();
                    showMobilInput();
                } else {
                    showOutput(); // Menampilkan output pada window baru
                }
            }
        });
    }

    private void saveData() {
        String nama = namaField.getText();
        String alamat = alamatField.getText();
        String noHP = noHPField.getText();
        String jenisKelamin = jenisKelaminField.getText();
        String kategori = (String) kategoriComboBox.getSelectedItem();
        String lisensi = lisensiField.getText();

        Karyawan karyawan = new Karyawan(nama, alamat, noHP, jenisKelamin, kategori);
        showOutput();
    }

    private void showMobilInput() {
        mainGUI.showMobilGUI(new Karyawan(
                namaField.getText(),
                alamatField.getText(),
                noHPField.getText(),
                jenisKelaminField.getText(),
                (String) kategoriComboBox.getSelectedItem()
        ));
    }

    private void showOutput() {
        // Menampilkan output pada window baru
        Karyawan karyawan = new Karyawan(
                namaField.getText(),
                alamatField.getText(),
                noHPField.getText(),
                jenisKelaminField.getText(),
                (String) kategoriComboBox.getSelectedItem()
        );
        JFrame outputFrame = new JFrame("Informasi Karyawan");
        outputFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        outputFrame.setSize(500, 300);
        outputFrame.setLocationRelativeTo(null);

        // Menggunakan BorderLayout untuk memastikan textarea berada di tengah
        outputFrame.setLayout(new BorderLayout());

        JTextArea outputTextArea = new JTextArea();
        outputTextArea.setEditable(false);
        outputTextArea.setFont(new Font("Monospaced", Font.BOLD, 16)); // Mengatur font monospace

        // Menggunakan String.format untuk memastikan kolom sejajar
        outputTextArea.setText(""); // Menggunakan setText untuk memulai teks di TextArea
        outputTextArea.append(String.format("%-20s %s\n", "Informasi Karyawan", ""));
        outputTextArea.append(String.format("%-20s : %s\n", "Nama", karyawan.getNama()));
        outputTextArea.append(String.format("%-20s : %s\n", "Alamat", karyawan.getAlamat()));
        outputTextArea.append(String.format("%-20s : %s\n", "Nomor HP", karyawan.getNoHP()));
        outputTextArea.append(String.format("%-20s : %s\n", "Jenis Kelamin", karyawan.getJenisKelamin()));
        outputTextArea.append(String.format("%-20s : %s\n", "Kategori Karyawan", karyawan.getKategori()));

        // Hanya menambahkan nilai lisensi jika kategori adalah "Supir Travel"
        if ("Supir Travel".equals(karyawan.getKategori())) {
            SupirTravel supirTravel = new SupirTravel(karyawan.getNama(), karyawan.getAlamat(), karyawan.getNoHP(), karyawan.getJenisKelamin(), lisensiField.getText());
            outputTextArea.append(String.format("%-20s : %s\n", "Lisensi", supirTravel.getLisensiTravel()));
        }

        // Menambahkan JTextArea ke JScrollPane
        JScrollPane scrollPane = new JScrollPane(outputTextArea);

        // Menambahkan JScrollPane ke tengah dari JFrame
        outputFrame.add(scrollPane, BorderLayout.CENTER);

        // Menampilkan JFrame
        outputFrame.setVisible(true);
        Timer timer = new Timer(3000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                outputFrame.dispose();
                // Lanjut ke MobilGUI atau keluar dari program
                if ("Supir Travel".equals(karyawan.getKategori())) {
                    showMobilInput();
                } else {
                    System.exit(0);
                }
            }
        });
        timer.setRepeats(false); // Timer hanya berjalan sekali
        timer.start();
    }
}
