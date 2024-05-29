package Kasus7_1.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeScreen extends JPanel {
    private JButton startButton;

    public WelcomeScreen(GUI mainGUI) {
        setLayout(new BorderLayout());

        JLabel welcomeLabel = new JLabel("Selamat Datang Di Aplikasi Filkom Tour & Travel");
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 20)); // Ukuran teks diperbesar menjadi 40

        // Warna teks diubah menjadi biru tua
        welcomeLabel.setForeground(new Color(0, 0, 128));

        // Efek bayangan ditambahkan
        setShadowed(true);

        startButton = new JButton("Mulai");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainGUI.showUserGUI();
            }
        });

        add(welcomeLabel, BorderLayout.CENTER);
        add(startButton, BorderLayout.SOUTH);
    }

    // Metode untuk menambahkan efek bayangan ke JLabel
    private void setShadowed(boolean shadowed) {
        if (shadowed) {
            setForeground(Color.WHITE); // Warna teks menjadi putih untuk efek bayangan
            setFont(getFont().deriveFont(Font.BOLD, 20)); // Ukuran teks yang sama dengan judul, bisa disesuaikan
        } else {
            setForeground(Color.BLACK); // Kembali ke warna teks asli jika tidak menggunakan efek bayangan
        }
    }
}

