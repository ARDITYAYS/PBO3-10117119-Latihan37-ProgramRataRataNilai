/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117119latihan37programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author Yogaputra
 * NAMA : ARDITYA YOGAPUTRA S
 * NIM : 10117119
 * KELAS : PBO3 / IF-3
 * Deskripsi Program : program ini dapat menghitung rata rata nilai
 */
public class PBO310117119Latihan37ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Na na = new Na();
        Scanner scn = new Scanner(System.in);

        int n;
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        n = scn.nextInt();

        na.HitungTotal(na.nilaiMhs, n);
        na.HitungRataRataNilaiMhs(na.totalNilaiMhs, n);

        System.out.println("\nMaka, Rata-rata Nilainya adalah : " + na.HitungRataRataNilaiMhs(na.totalNilaiMhs, n));
    }

}
