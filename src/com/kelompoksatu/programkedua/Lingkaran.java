package com.kelompoksatu.programkedua;

public class Lingkaran {

    // Atribut Class Lingkaran
    private double jariJari;

    // Constructor Class Lingkaran
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    // Method Getter untuk Mendapatkan Nilai Variabel Private
    public double getJariJari() {
        return jariJari;
    }

    // Method Menghitung Keliling
    protected double keliling(double jariJari) {
        return 2 * Math.PI * jariJari;
    }

    // Method Menghitung Luas
    protected double luas(double jariJari) {
        return Math.PI * Math.pow(jariJari, 2);
    }
}
