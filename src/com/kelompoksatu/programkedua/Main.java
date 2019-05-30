package com.kelompoksatu.programkedua;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Memanggil Method judulProgram() yang Berada di Inner Class Program
        Program.judulProgram("Program Menghitung Keliling & Luas Bangun Datar", "Erik", "Melyana", "Savina", "Agus");

        // Memanggil Method jalankanProgram() yang Berada di Inner Class Program
        Program.jalankanProgram();
    }

    // Membuat Inner Class dengan Access Modifier Private
    private static class Program {

        // Method Private untuk Mengatur Nama Program
        private static void judulProgram(String namaProgram, String namaSatu, String namaDua, String namaTiga, String namaEmpat) {
            System.out.printf("%s\n", namaProgram);
            System.out.printf("%s\n", "-------------------------");
            System.out.printf("%s : \n%s\n%s\n%s\n%s\n", "Kelompok Satu", namaSatu, namaDua, namaTiga, namaEmpat);
            System.out.printf("%s\n", "-------------------------");
        }

        // Method Private untuk Mengolah Data
        private static void jalankanProgram() {
            // Membuat Object userInput dari Library Class Scanner
            Scanner userInput = new Scanner(System.in);

            System.out.printf("%s\n", "Pilih bangun datar");
            System.out.printf("1. %s\n", "Persegi");
            System.out.printf("2. %s\n", "Persegi Panjang");
            System.out.printf("3. %s\n", "Segitiga");
            System.out.printf("4. %s\n", "Belah Ketupat");
            System.out.printf("5. %s\n", "Lingkaran");
            System.out.printf("%s : ", "Masukkan pilihan (sesuai nomor)");
            int pilihan = userInput.nextInt();
            if (pilihan == 1) {
                System.out.printf("%s : ", "Masukkan sisi");
                double sisi = userInput.nextDouble();

                // Membuat Object hitungPersegi dari Class Persegi
                Persegi hitungPersegi = new Persegi(sisi);

                printHasil(hitungPersegi.keliling(sisi), hitungPersegi.luas(sisi));
            } else if (pilihan == 2) {
                System.out.printf("%s : ", "Masukkan panjang");
                double panjang = userInput.nextDouble();
                System.out.printf("%s : ", "Masukkan lebar");
                double lebar = userInput.nextDouble();

                // Membuat Object hitungPersegiPanjang dari Class PersegiPanjang
                PersegiPanjang hitungPersegiPanjang = new PersegiPanjang(panjang, lebar);

                printHasil(hitungPersegiPanjang.keliling(panjang, lebar), hitungPersegiPanjang.luas(panjang, lebar));
            }

            else if (pilihan == 3) {
                System.out.printf("%s : ", "Masukkan sisi satu");
                double sisiSatu = userInput.nextDouble();
                System.out.printf("%s : ", "Masukkan sisi dua");
                double sisiDua = userInput.nextDouble();
                System.out.printf("%s : ", "Masukkan sisi tiga");
                double sisiTiga = userInput.nextDouble();
                System.out.printf("%s : ", "Masukkan alas");
                double alas = userInput.nextDouble();
                System.out.printf("%s : ", "Masukkan tinggi");
                double tinggi = userInput.nextDouble();

                // Membuat Object hitungSegitiga dari Class Segitiga
                Segitiga hitungSegitiga = new Segitiga(sisiSatu, sisiDua, sisiTiga, alas, tinggi);

                printHasil(hitungSegitiga.keliling(sisiSatu, sisiDua, sisiTiga), hitungSegitiga.luas(alas, tinggi));
            } else if (pilihan == 4) {
                System.out.printf("%s : ", "Masukkan sisi satu");
                double sisiSatu = userInput.nextDouble();
                System.out.printf("%s : ", "Masukkan sisi dua");
                double sisiDua = userInput.nextDouble();
                System.out.printf("%s : ", "Masukkan sisi tiga");
                double sisiTiga = userInput.nextDouble();
                System.out.printf("%s : ", "Masukkan sisi empat");
                double sisiEmpat = userInput.nextDouble();
                System.out.printf("%s : ", "Masukkan diagonal satu");
                double diagonalSatu = userInput.nextDouble();
                System.out.printf("%s : ", "Masukkan diagonal dua");
                double diagonalDua = userInput.nextDouble();

                // Membuat Object hitungBelahKetupat dari Class Belah Ketupat
                BelahKetupat hitungBelahKetupat = new BelahKetupat(sisiSatu, sisiDua, sisiTiga, sisiEmpat, diagonalSatu, diagonalDua);

                printHasil(hitungBelahKetupat.keliling(sisiSatu, sisiDua, sisiTiga, sisiEmpat), hitungBelahKetupat.luas(diagonalSatu, diagonalDua));
            } else if (pilihan == 5) {
                System.out.printf("%s : ", "Masukkan jari-jari");
                double jariJari = userInput.nextDouble();

                // Membuat Object hitungLingkarang dari Class Lingkaran
                Lingkaran hitungLingkaran = new Lingkaran(jariJari);

                printHasil(hitungLingkaran.keliling(jariJari), hitungLingkaran.luas(jariJari));
            } else {
                System.out.printf("%s\n", "Nomor yang Anda masukkan salah! Coba lagi.");
                // Menggunakan Method Rekursif untuk Mengantisipasi Jika User Memasukkan Pilihan yang Salah
                jalankanProgram();
            }
        }

        // Method Private untuk Mencetak Hasil
        private static void printHasil(double keliling, double luas) {
            System.out.printf("\n%s\n", "-------------------------");
            System.out.printf("%s : %f\n", "Keliling", keliling);
            System.out.printf("%s : %f\n", "Luas", luas);
            System.out.printf("%s\n", "-------------------------");
        }
    }
}
