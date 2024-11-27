/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author kaanc
 * 
 * Bölme işlemini bölme operatörünü kullanmadan yapan sonucu bölüm
ve kalan olarak ekrana yazan bir programı java dilinde yazınız.
 */
public class Bolme_operatorsuz_bolme {
     public static void calistir(){
         
     Scanner oku = new Scanner(System.in);
 
     
         System.out.println("Bolunecek sayinizi giriniz");
         int bolunen = oku.nextInt();
     
         System.out.println("Bolen sayinizi giriniz.");
         int bolen = oku.nextInt();
         
         int bolum=0;
         while(bolunen>0){
         
             bolunen-=bolen;
             bolum++;
         } 
             System.out.printf("İslem sonucunda bolum: %d kalan: %d seklinde hesaplanmistir.", bolum, bolunen);
         
     
     }
    
}
