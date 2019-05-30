package com.kelompoksatu.programkedua;

public class BelahKetupat {

    // Atribut Class BelahKetupat
    private double sisiSatu, sisiDua, sisiTiga, sisiEmpat, diagonalSatu, diagonalDua;

    // Constructor Class BelahKetupat
    public BelahKetupat(double sisiSatu, double sisiDua, double sisiTiga, double sisiEmpat, double diagonalSatu, double diagonalDua) {
        this.sisiSatu = sisiSatu;
        this.sisiDua = sisiDua;
        this.sisiTiga = sisiTiga;
        this.sisiEmpat = sisiEmpat;
        this.diagonalSatu = diagonalSatu;
        this.diagonalDua = diagonalDua;
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

    public double getSisiEmpat() {
        return sisiEmpat;
    }

    public double getDiagonalSatu() {
        return diagonalSatu;
    }

    public double getDiagonalDua() {
        return diagonalDua;
    }

    // Method Menghitung Keliling
    protected double keliling(double sisiSatu, double sisiDua, double sisiTiga, double sisiEmpat) {
        return sisiSatu + sisiDua + sisiTiga + sisiEmpat;
    }

    // Method Menghitung Luas
    protected double luas(double diagonalSatu, double diagonalDua) {
        return 0.5 * diagonalSatu * diagonalDua;
    }
}
