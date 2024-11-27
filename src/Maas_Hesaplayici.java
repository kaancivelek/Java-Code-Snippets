/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author kaanc
 * 
 * Maaş Hesaplayıcı
 */
public class  Maas_Hesaplayici {
    
    public static void calistir()
            
    {
    Scanner oku = new Scanner(System.in);
 int sicilno, saatbasiucret;
 saatbasiucret =100;
 float calisilansaat, calisilandakika, maas;   
 
 
System.out.println("Sicil numaraniz nedir ?");
        sicilno = oku.nextInt();
 
        System.out.println("Toplam kac saat calistiniz ?");
        calisilansaat =oku.nextInt();
        
        System.out.println("Toplam kac dakika calistiniz ?");
 calisilandakika =oku.nextInt();
 
 
 calisilansaat += (calisilandakika /60);
 
        maas = calisilansaat*saatbasiucret;
           System.out.printf("Sicil numarasi: %d icin calisilan toplam saat %.2f tesekkürler."
    + " %d TL saatlik ucret baz alınarak hesaplanan maas %.2f TL seklindedir.", sicilno, calisilansaat, saatbasiucret, maas);
    }
    
}
