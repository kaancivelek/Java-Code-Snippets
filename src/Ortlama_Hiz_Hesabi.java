/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author kaanc
 */
public class Ortlama_Hiz_Hesabi {
    
    public static void calistir()
            
    {
 /*Bir arabanın Ankara’dan İstanbul’a varış zamanını saat
cinsinden girdi alarak alan ve arabanın ortalama hızını
hesaplayan bir C programı yazınız. Ankara-İstanbul
arasındaki uzaklığı (453 km.) isim sabiti olarak
tanımlayınız.  */
        // ben dakika hassasiyeti ekledim.
        
        
Scanner oku =new Scanner(System.in);


double ankara_istanbul = 453; // şehirler arası toplam mesafe (km)
        double orthiz, sure;

        System.out.println("Ne kadar surede vardınız? (örn: 10,05 için 10 saat 5 dakika)");
        System.out.print("Süre (saat.dakika formatında): ");
        sure = oku.nextDouble();

        int saat = (int) sure;
        double dakika = (sure - saat) * 60;


        double toplamSure = saat + (dakika / 60.0);

        
        orthiz = ankara_istanbul / toplamSure;

        System.out.printf("Ortalama hızınız: %.3f (km/saat)%n", orthiz);

    
    }
    
}
