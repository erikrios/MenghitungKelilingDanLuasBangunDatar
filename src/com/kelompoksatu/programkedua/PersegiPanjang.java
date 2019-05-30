package com.kelompoksatu.programkedua;

public class PersegiPanjang {

    // Atribut Class PersegiPanjang
    private double panjang, lebar;

    // Constructor Class PersegiPanjang
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Method Getter untuk Mendapatkan Nilai Variabel Private
    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    // Method Menghitung Keliling
    protected double keliling(double panjang, double lebar) {
        return 2 * (panjang + lebar);
    }

    // Method Menghitung Luas
    protected double luas(double panjang, double lebar) {
        return panjang * lebar;
    }
}
