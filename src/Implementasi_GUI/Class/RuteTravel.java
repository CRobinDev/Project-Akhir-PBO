/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementasi_GUI.Class;

public enum RuteTravel {

    SURABAYA_MALANG,
    MADURA_MALANG,
    BANYUWANGI_MALANG,
    SITUBONDO_MALANG,
    TULUNGAGUNG_MALANG;

    @Override
    public String toString() {
        return this.name().replace("_", "-");
    }
}