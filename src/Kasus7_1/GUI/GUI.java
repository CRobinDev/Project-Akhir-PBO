package Kasus7_1.GUI;
import Kasus7_1.Karyawan;

import javax.swing.*;

public class GUI extends JFrame {
    private WelcomeScreen welcomeScreen;
    private UserGUI userGUI;
    private MobilGUI mobilGUI;

    public GUI() {
        setTitle("Aplikasi Filkom Tour & Travel");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
                welcomeScreen = new WelcomeScreen(this);
        add(welcomeScreen);

        setVisible(true);
    }

    public void showUserGUI() {
        getContentPane().removeAll();
        userGUI = new UserGUI(this);
        add(userGUI);
        revalidate();
        repaint();
    }


    public void showMobilGUI(Karyawan karyawan) {
        getContentPane().removeAll();
        mobilGUI = new MobilGUI(this, karyawan);
        add(mobilGUI);
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GUI();
            }
        });
    }
}
