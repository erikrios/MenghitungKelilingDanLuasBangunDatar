package com.kelompoksatu.programkedua;

public class Persegi {

    // Atribut Class Persegi
    private double sisi;

    // Constructor Class Persegi
    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    // Method Getter untuk Mendapatkan Nilai Variabel Private
    public double getSisi() {
        return sisi;
    }

    // Method Menghitung Keliling
    protected double keliling(double sisi) {
        return 4 * sisi;
    }

    // Method Menghitung Luas
    protected double luas(double sisi) {
        return sisi * sisi;
    }
}
