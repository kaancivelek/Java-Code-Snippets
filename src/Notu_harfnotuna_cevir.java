/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author kaanc
 */
public class Notu_harfnotuna_cevir {
    
    public static void calistir(){
    
        /*Klavyeden girilen iki sayıdan büyük olanını bulup
ekrana yazdıran C programını yazınız.
        */
        
                
Scanner oku = new Scanner(System.in);
int sayi1,sayi2;


        System.out.println("İlk sayinizi giriniz");
sayi1 = oku.nextInt();
        
 System.out.println("İkinci sayinizi giriniz");
sayi2 = oku.nextInt();
 
if(sayi1 == sayi2) {System.out.println("Sayilariniz birbirine esittir.");}

  else if( sayi1 > sayi2){System.out.println("Birinci girdiginiz sayi daha buyuktur.");}

    else { System.out.println("Ikinci girdiginiz sayi daha buyuktur.");}
    
}
}