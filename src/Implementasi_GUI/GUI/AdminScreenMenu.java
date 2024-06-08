/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Implementasi_GUI.GUI;

public class AdminScreenMenu extends javax.swing.JFrame {
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel labelAdminMenu;
    private javax.swing.JButton ListKaryawanButton;
    private javax.swing.JButton ListKendaraanButton;
    private javax.swing.JButton ListSopirButton;
    private javax.swing.JButton TambahKendaraanButton;
    private javax.swing.JButton TambahSupirButton;
    private javax.swing.JButton TambahAdminButton;
    public AdminScreenMenu() {
        setTitle("Admin Menu");
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        labelAdminMenu = new javax.swing.JLabel();
        TambahSupirButton = new javax.swing.JButton();
        ListSopirButton = new javax.swing.JButton();
        TambahKendaraanButton = new javax.swing.JButton();
        ListKaryawanButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        TambahAdminButton = new javax.swing.JButton();
        ListKendaraanButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelAdminMenu.setFont(new java.awt.Font("ITF Devanagari", 1, 24)); // NOI18N
        labelAdminMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAdminMenu.setText("Admin Menu");

        TambahSupirButton.setText("Tambah Sopir");
        TambahSupirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahSupirButtonActionPerformed(evt);
            }
        });

        ListSopirButton.setText("List Sopir Tersedia");
        ListSopirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListSopirButtonActionPerformed(evt);
            }
        });

        TambahKendaraanButton.setText("Tambah Kendaraan");
        TambahKendaraanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahKendaraanButtonActionPerformed(evt);
            }
        });

        ListKaryawanButton.setText("List Semua Karyawan");
        ListKaryawanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListKaryawanButtonActionPerformed(evt);
            }
        });

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        TambahAdminButton.setText("Tambah Admin");
        TambahAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahAdminButtonActionPerformed(evt);
            }
        });

        ListKendaraanButton.setText("List Kendaraan Tersedia");
        ListKendaraanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListKendaraanButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(111, 111, 111)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(labelAdminMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(TambahSupirButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(ListSopirButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(TambahKendaraanButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(ListKaryawanButton, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                                        .addComponent(TambahAdminButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(ListKendaraanButton, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(labelAdminMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TambahSupirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TambahAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TambahKendaraanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ListSopirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ListKaryawanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ListKendaraanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(BackButton)
                                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>

    private void ListSopirButtonActionPerformed(java.awt.event.ActionEvent evt) {
        ListSopirAvailable listSopirMenu = new ListSopirAvailable();
        listSopirMenu.setVisible(true);
        this.dispose();
    }

    private void TambahKendaraanButtonActionPerformed(java.awt.event.ActionEvent evt) {
        TambahKendaraanMenu tbhKdrMenu = new TambahKendaraanMenu();
        tbhKdrMenu.setVisible(true);
        this.dispose();
    }

    private void ListKaryawanButtonActionPerformed(java.awt.event.ActionEvent evt) {
        ListSemuaKaryawan listKry = new ListSemuaKaryawan();
        listKry.setVisible(true);
        this.dispose();
    }

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {
        AdminLoginMenu admLgMenu = new AdminLoginMenu();
        admLgMenu.setVisible(true);
        this.dispose();
    }

    private void TambahAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {
        TambahAdmin tbAdm = new TambahAdmin();
        tbAdm.setVisible(true);
        this.dispose();
    }

    private void TambahSupirButtonActionPerformed(java.awt.event.ActionEvent evt) {
        TambahSopirMenu tbsopirMenu = new TambahSopirMenu();
        tbsopirMenu.setVisible(true);
        this.dispose();
    }

    private void ListKendaraanButtonActionPerformed(java.awt.event.ActionEvent evt) {
        ListKendaraanAvailable listKdrMenu = new ListKendaraanAvailable();
        listKdrMenu.setVisible(true);
        this.dispose();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminScreenMenu().setVisible(true);
            }
        });
    }
}