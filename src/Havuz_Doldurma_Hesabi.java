/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author kaanc
 */
public class Havuz_Doldurma_Hesabi {
    
    public static void calistir()
    
    {
    /*Bir havuzun enini, boyunu ve yüksekliğini metre
cinsinden girdi olarak alan ve havuzun dolması için kaç
metreküp suyun gerekli olduğunu hesaplayıp ekranda
gösteren bir C programı yazınız.
        
        Ben litre hassasiyeti ve tonaj şeklinde çıktı ekledim.
*/
Scanner oku = new Scanner(System.in);

double genislik, uzunluk, yukseklik, hacim;

        System.out.println("Havuzun genisligini giriniz.");
        genislik = oku.nextDouble();
        
               System.out.println("Havuzun uzunlugunu giriniz.");
               uzunluk = oku.nextDouble();
                
                 System.out.println("Havuzun yuksekligini giriniz.");
                yukseklik = oku.nextDouble();

                hacim = genislik*uzunluk*yukseklik;
                
                System.out.printf("Havuzunuz icin gerekli su miktari: %.3f tondur ( noktadan sonraki değerler litredir.) ",hacim);
    }
    
}
