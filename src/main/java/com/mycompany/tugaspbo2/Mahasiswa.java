/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspbo2;

/**
 *
 * @author ASUS
 */
public class Mahasiswa {

    // ===== ATRIBUT =====
    String nama;
    String nim;
    int semester;
    double ipk;

    // ===== CONSTRUCTOR 1 — Tanpa Parameter =====
    // Dipakai saat belum tahu data, jadi diisi nilai default
    public Mahasiswa() {
        nama     = "Tidak Diketahui";
        nim      = "000000";
        semester = 1;
        ipk      = 0.0;
    }

    // ===== CONSTRUCTOR 2 — Dengan Parameter =====
    // Dipakai saat langsung tahu datanya ketika membuat object
    public Mahasiswa(String nama, String nim, int semester, double ipk) {
        this.nama     = nama;
        this.nim      = nim;
        this.semester = semester;
        this.ipk      = ipk;
    }

    // ===== METHOD TANPA NILAI BALIK (void) =====
    public void tampilkanInfo() {
        System.out.println("===== Data Mahasiswa =====");
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Semester : " + semester);
        System.out.println("IPK      : " + ipk);
    }

    public void naikSemester() {
        semester++;
        System.out.println(nama + " naik ke semester " + semester);
    }

    // ===== METHOD DENGAN NILAI BALIK =====
    public String getStatusKelulusan() {
        if (ipk >= 3.5) {
            return "Cumlaude";
        } else if (ipk >= 2.0) {
            return "Lulus";
        } else {
            return "Perlu Bimbingan";
        }
    }

    public double hitungSKSMaksimal() {
        // Simulasi: IPK > 3.0 , misal mengambil 24 SKS, selainnya 18 SKS
        if (ipk > 3.0) {
            return 24;
        } else {
            return 18;
        }
    }
}
