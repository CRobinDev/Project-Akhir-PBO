/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Implementasi_GUI.GUI;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import Implementasi_GUI.Class.Karyawan;
/**
 *
 * @author dhani
 */
public class ListSemuaKaryawan extends javax.swing.JFrame {
    private Karyawan karyawan;
    private int currentIndex; // Indeks data sopir yang sedang ditampilkan

    /**
     * Creates new form ListSemuaKaryawan
     */
    public ListSemuaKaryawan() {
        initComponents();
        karyawan = new Karyawan();
        karyawan.readDataKaryawan();
        displayDataKaryawan();
        setLocationRelativeTo(null);
        setTitle("List Semua Karyawan");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("ITF Devanagari", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton1.setFont(new java.awt.Font("ITF Devanagari", 1, 14)); // NOI18N
        jButton1.setText(">");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButton(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("ITF Devanagari", 1, 14)); // NOI18N
        jButton3.setText("<");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrevButton(evt);
            }
        });


        jButton2.setFont(new java.awt.Font("ITF Devanagari", 1, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButton(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(50, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton2)
                                .addGap(100, 100, 100)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton2)
                                        .addComponent(jButton1)
                                        .addComponent(jButton3))
                                .addGap(18, 18, 18))
        );

        pack();
        setSize(400,340);
    }

    private void BackButton(java.awt.event.ActionEvent evt) {
        AdminScreenMenu adminMenu = new AdminScreenMenu();
        adminMenu.setVisible(true);
        this.dispose();
    }

    private void NextButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButton
        currentIndex++;
        if (currentIndex >= karyawan.getDataKaryawan().length) {
            currentIndex = 0;
        }
        displayDataKaryawan();
    }

    private void PrevButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrevButton
        currentIndex--;
        if (currentIndex < 0) {
            currentIndex = karyawan.getDataKaryawan().length - 1;
        }
        displayDataKaryawan();
    }

    private void displayDataKaryawan() {
        if (karyawan.getDataKaryawan() != null && karyawan.getDataKaryawan().length > 0) {
            String[] dataLines = karyawan.getDataKaryawan()[currentIndex].split("<br>");
            StringBuilder formattedData = new StringBuilder("<html><h2>Data Karyawan</h2><pre>");
            for (String line : dataLines) {
                formattedData.append(line).append("\n");
            }
            formattedData.append("</pre></html>");
            jLabel3.setText(formattedData.toString());
            jLabel3.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 15));
        } else {
            jLabel3.setText("<html><h2>Data Karyawan Kosong</h2></html>");
        }
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListSemuaKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListSemuaKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListSemuaKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListSemuaKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListSemuaKaryawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration                   
}