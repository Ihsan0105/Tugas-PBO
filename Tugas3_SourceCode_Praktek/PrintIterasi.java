/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;


public class PrintIterasi {
    public static void main(String[] args) {
        int N;
        int i;
        Scanner masukan=new Scanner(System.in);
        
        System.out.print ("Nilai N >0 = "); 
        N = masukan.nextInt();
        i = 1; 
        System.out.print ("Print i dengan ITERATE : \n");
        for (;;){
            System.out.println(i); 
            if (i == N)break;
            else{
                i++; 
            }
        } 
    }
}
