/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author kaanc
 * 
 * Kullanıcı tarafından girilen sayıyı basamak değerlerine ayıran programı
while döngüsü kullanarak java dilinde yazınız.
 */
public class Basamaklarina_ayir {
    public static void calistir(){
    Scanner oku = new Scanner(System.in);
    
    System.out.println("Sayinizi Giriniz.");
        int sayi= oku.nextInt();
        int basamakdegeri;
        int a=1;
        while(sayi>0){
        
        basamakdegeri =sayi%10;
            System.out.println(a+"'ler basamagi: "+basamakdegeri);
            sayi/=10;
            a*=10;
    
    
    /*
        System.out.println("Sayinizi giriniz.");
    int sayi= oku.nextInt();
        
        System.out.print("Sayiniz: "+sayi);
        
    
 
        if (sayi>=100) {
            int yuzlerbasamagi = (sayi/100);
            sayi-=(yuzlerbasamagi*100);
            System.out.print(" Sayinizin yuzler basamagi: "+yuzlerbasamagi);
        }
         if (sayi>=10) {
            int onlarbasamagi =(sayi/10);
            sayi-=(onlarbasamagi*10);
            System.out.print(" Sayinizin onlar basamagi: "+onlarbasamagi);
         } 
         System.out.print(" Sayinizin birler basamagi: "+sayi);
           */
            
        
    
        
        
        
        
        }
        
        
    }
    
}
