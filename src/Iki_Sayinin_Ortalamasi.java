/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author kaanc
 */
public class Iki_Sayinin_Ortalamasi {
    
    public static void calistir(){
    
    Scanner oku = new Scanner(System.in);
        
        int sayi1,sayi2;
        double sonuc;
        System.out.println("Enter your first number.");
        sayi1 = oku.nextInt();
        System.out.println("Enter your second number.");
        sayi2 = oku.nextInt();
        
        sonuc= sayi1+sayi2;
        sonuc /= 2.0;
        
        System.out.println("Average of your numbers is: "+sonuc);
}
}
