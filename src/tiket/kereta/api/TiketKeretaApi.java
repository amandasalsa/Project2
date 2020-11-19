/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiket.kereta.api;

import java.util.Scanner;
/**
 *
 * @author Manda Salsa
 */
public class TiketKeretaApi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int pilihan,jmlhtiket,total,nominal,kembalian;
    
        Scanner input = new Scanner(System.in);
        System.out.println("------SELAMAT DATANG------");
        System.out.println("PEMESANAN TIKET KERETA API");
        System.out.println("--------------------------");
        System.out.println("Daftar harga tiket kereta api");
        
        System.out.println("NO   NAMA KERETA   TUJUAN    HARGA ");
        System.out.println("1    MALABAR       MALANG    45.000,-");
        System.out.println("2    KALIGUNG      SEMARANG  60.000,-");
        System.out.println("3    BIMA          SURABAYA  55.000,-");
        
        System.out.println("Masukkan Pilihan =");
        pilihan = input.nextInt();
        System.out.println("------------------");
        
        switch(pilihan){
            case 1:
                System.out.println("MALABAR TUJUAN MALANG  Rp 45.000,-");
                System.out.println("Jumlah tiket yang dipesan =");
                jmlhtiket = input.nextInt();
                total = 45000*jmlhtiket;
                System.out.println("Total Pembayaran = "+total);
                System.out.println("Input Nominal Anda = ");
                nominal = input.nextInt();
                kembalian = nominal-total;
                System.out.println("Kembalian Anda = "+kembalian);
                System.out.println("-----TERIMA KASIH-------");
                break;
            case 2:
                System.out.println("KALIGUNG TUJUAN SEMARANG  Rp 60.000,-");
                System.out.println("Jumlah tiket yang dipesan =");
                jmlhtiket = input.nextInt();
                total = 60000*jmlhtiket;
                System.out.println("Total Pembayaran = "+total);
                System.out.println("Input Nominal Anda = ");
                nominal = input.nextInt();
                kembalian = nominal-total;
                System.out.println("Kembalian Anda = "+kembalian);
                System.out.println("-----TERIMA KASIH-------");
                break;
            case 3:
                System.out.println("BIMA TUJUAN SURABAYA  Rp 55.000,-");
                System.out.println("Jumlah tiket yang dipesan =");
                jmlhtiket = input.nextInt();
                total = 55000*jmlhtiket;
                System.out.println("Total Pembayaran = "+total);
                System.out.println("Input Nominal Anda = ");
                nominal = input.nextInt();
                kembalian = nominal-total;
                System.out.println("Kembalian Anda = "+kembalian);
                System.out.println("-----TERIMA KASIH-------");
            default:
            System.out.println("-MAAF KODE YANG ANDA MASUKKAN SALAH-");
        }
        
    }
    
}
