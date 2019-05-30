package com.kelompoksatu.programkedua;

public class Segitiga {

    // Atribut Class Segitiga
    private double sisiSatu, sisiDua, sisiTiga, alas, tinggi;

    // Constructor Class Segitiga
    public Segitiga(double sisiSatu, double sisiDua, double sisiTiga, double alas, double tinggi) {
        this.sisiSatu = sisiSatu;
        this.sisiDua = sisiDua;
        this.sisiTiga = sisiTiga;
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // Method Getter untuk Mendapatkan Nilai Variabel Private
    public double getSisiSatu() {
        return sisiSatu;
    }

    public double getSisiDua() {
        return sisiDua;
    }

    public double getSisiTiga() {
        return sisiTiga;
    }

    public double getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    // Method Menghitung Keliling
    protected double keliling(double sisiSatu, double sisiDua, double sisiTiga) {
        return sisiSatu + sisiDua + sisiTiga;
    }

    // Method Menghitung Luas
    protected double luas(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }
}