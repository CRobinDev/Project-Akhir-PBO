package Kasus7_1.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeScreen extends JPanel {
    private JButton startButton;


    public WelcomeScreen(GUI mainGUI) {
        setLayout(new BorderLayout());
        ImageIcon logoIcon = new ImageIcon(getClass().getResource("/Kasus7_1/assets/logo.png"));
        Image image = logoIcon.getImage(); // Get the image
        Image resizedImage = image.getScaledInstance(175, 175, Image.SCALE_SMOOTH); // Resize the image
        logoIcon = new ImageIcon(resizedImage);
        JLabel logoLabel = new JLabel(logoIcon);
        logoLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel welcomeLabel = new JLabel("Selamat Datang Di Aplikasi Filkom Tour & Travel");
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        welcomeLabel.setForeground(new Color(80, 176, 167));

        startButton = new JButton("Mulai");

        startButton.setPreferredSize(new Dimension(10, 50));
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainGUI.showUserGUI();
            }
        });

        add(logoLabel, BorderLayout.NORTH);
        add(welcomeLabel, BorderLayout.CENTER);
        add(startButton, BorderLayout.SOUTH);
    }
}

