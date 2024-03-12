/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class PrintXRepeat {
    public static void main(String[] args) {
        int Sum;
        int x;
        Scanner masukan=new Scanner(System.in);
        
        System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt(); 
        if (x == 999){
            System.out.print("Kasus kosong \n");
        }else {
            Sum = 0; 
            do{
                Sum = Sum + x; 
                System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
                x = masukan.nextInt(); 
            } while (x != 999); 
        System.out.println ("Hasil penjumlahan = "+Sum);
        }
    }
}
