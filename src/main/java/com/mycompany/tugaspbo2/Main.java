/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaspbo2;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {

        // ===== OBJECT 1 — Menggunakan Constructor TANPA Parameter =====
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.tampilkanInfo();
        System.out.println("Status : " + mhs1.getStatusKelulusan());
        System.out.println();

        // ===== OBJECT 2 — Menggunakan Constructor DENGAN Parameter =====
        Mahasiswa mhs2 = new Mahasiswa("Abdul Hayyi", "2410010612", 4, 3.85);
        mhs2.tampilkanInfo();
        mhs2.naikSemester();
        System.out.println("Status    : " + mhs2.getStatusKelulusan());
        System.out.println("Maks SKS  : " + mhs2.hitungSKSMaksimal());
    }
}
