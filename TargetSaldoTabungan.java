/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

/**
 *
 * @author Dell
 */
public class TargetSaldoTabungan {
    public static void main(String[] args) {
        // Input
        double saldoAwal = 3500000;
        double bungaPersen = 8;
        double saldoTarget = 6000000;

        // Konversi bunga persen ke bentuk desimal
        double bungaDesimal = bungaPersen / 100;

        // Hitung saldo setiap bulan sampai mencapai target
        int bulan = 1;
        while (saldoAwal < saldoTarget) {
            saldoAwal *= (1 + bungaDesimal);
            System.out.println("Saldo di bulan ke-" + bulan + ": Rp " + Math.round(saldoAwal));
            bulan++;
        }
    }
}
