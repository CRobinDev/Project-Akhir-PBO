package GUI;

import java.io.*;
import javax.swing.*;
import java.awt.*;

public class ListSopirAvailable extends javax.swing.JFrame {

    private String[] sopirData;
    private int currentIndex;

    public ListSopirAvailable() {
        initComponents();
        readSopirData();
        displaySopirData();
        setLocationRelativeTo(null);
        setTitle("List Sopir yang Tersedia");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setFont(new java.awt.Font("ITF Devanagari", 1, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("ITF Devanagari", 1, 14)); // NOI18N
        jButton1.setText(">");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("ITF Devanagari", 1, 14)); // NOI18N
        jButton3.setText("<");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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
        setSize(400, 340);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AdminScreenMenu adminMenu = new AdminScreenMenu();
        adminMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        currentIndex++;
        if (currentIndex >= sopirData.length) {
            currentIndex = 0;
        }
        displaySopirData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        currentIndex--;
        if (currentIndex < 0) {
            currentIndex = sopirData.length - 1;
        }
        displaySopirData();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void readSopirData() {
        sopirData = new String[0];
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
            JOptionPane.showMessageDialog(this, "Gagal membaca data sopir.");
        }
    }
    private void addSopirDataIfAvailable(String data) {
        if (data.contains("Status        : Available")) {
            addSopirData(data);
        }
    }
    private void addSopirData(String data) {
        if (sopirData == null) {
            sopirData = new String[]{data};
        } else {
            String[] newData = new String[sopirData.length + 1];
            System.arraycopy(sopirData, 0, newData, 0, sopirData.length);
            newData[sopirData.length] = data;
            sopirData = newData;
        }
    }

    private void displaySopirData() {
        if (sopirData != null && sopirData.length > 0) {
            String[] dataLines = sopirData[currentIndex].split("<br>");
            StringBuilder formattedData = new StringBuilder("<html><h2>Data Sopir</h2><pre>");
            for (String line : dataLines) {
                formattedData.append(line).append("\n");
            }
            formattedData.append("</pre></html>");
            jLabel3.setText(formattedData.toString());
            jLabel3.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 15));
        } else {
            jLabel3.setText("<html><h2>Data Sopir Kosong</h2></html>");
        }
    }

    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListSopirAvailable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
