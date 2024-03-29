/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Muhammad Ihsan Saifullah
 * 13020220105
 * A3
 * */
import java.util.Scanner;

public class TestNilai {
    public static void main(String[] args) {
        HitungRata hitung = new HitungRata();
        Scanner input = new Scanner(System.in);
        String pilihan;
        boolean exit = true;
        int banyakData = 0;
        do{
            System.out.println("Menu:");
            System.out.println("1. Input Nilai");
            System.out.println("2. Input Nilai Baru");
            System.out.println("0. Keluar dari Program");
            System.out.print("Masukkan pilihan: ");
            pilihan = input.nextLine();
            
            switch(pilihan){
                case"1":
                    System.out.print("Masukkan Jumlah Data: ");
                    banyakData = input.nextInt();
                    int nilai[] = new int[banyakData];
                    System.out.println("Masukkan Nilai: ");
                    hitung.inputNilai(nilai);
                    System.out.print("Daftar Nilai: ");
                    hitung.cetakNilai(nilai);
                    System.out.println("Rata Nilai: "+ hitung.rataNilai(banyakData));
                    break;
                case"2":
                    System.out.print("Masukkan Nilai Baru: ");
                    hitung.inputNilaiBaru(banyakData);
                    System.out.print("Daftar Nilai Baru: ");
                    hitung.cetakNilaiBaru();
                    break;
                case"0":
                    exit = false;
                    break;
                default:
                    System.out.println("Masukkan Pilihan Yang Benar!");
                    break;
            }
            System.out.println();
        }while(exit);
    }
}
