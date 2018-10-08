/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan37.objectorientedprogramrataratanilai;

import java.util.Scanner;

/**
 *
 * @author Windows  Nama : Firman Ardhiansyah
 *          Kelas : IF-2 (PB02)
 *          NIM : 10117056
 * Deskripsi Program : Mengisi nilai mahasiswa yang banyaknya ditentukan
 * oleh inputan kita sendiri kemudian menampilkan rata-rata nilainya dengan
 * konsep OOP
 */
public class main {

    public static void main(String[] args) {
        Mahasiswa mah = new Mahasiswa();
        Scanner scn = new Scanner(System.in);

        int n;
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        n = scn.nextInt();

        mah.HitungTotal(mah.nilaiMhs, n);
        mah.HitungRataRataNilaiMhs(mah.totalNilaiMhs, n);

        System.out.println("\nMaka, Rata-rata Nilainya adalah : " + mah.HitungRataRataNilaiMhs(mah.totalNilaiMhs, n));
        System.out.println("Developed by : Rizki Adam Kurniawan");

    }
}
