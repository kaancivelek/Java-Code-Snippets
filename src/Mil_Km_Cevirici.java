/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author kaanc
 */
public class Mil_Km_Cevirici {
    public static void calistir(){
    
            /*Bir arabanın gittiği yolu milden kilometreye veya
kilometreden mile çeviren bir C programı yazınız.
Programda gidilen yolun mil veya kilometre cinsinden
olup olmadığı sorulmalıdır. 1 mil = 1.609344 kilometre olup, kullanıcı mil için
M/m; kilometre için K/k girmelidir.
        */
        
                
Scanner oku = new Scanner(System.in);

        System.out.println("Hangi tipte mesafe girisinde bulunacaksınız ? 1) Mil    2) Kilometre sati ile belirtiniz.");
        int nav = oku.nextInt();
        
        if( nav != 1 && nav !=2 ){System.out.println("Hatali secim."); System.exit(1);}
        
        
        
        else if( nav ==1 ){ 
            
            System.out.println("Mil cinsinden Mesafeyi giriniz.");
            float mesafe = oku.nextFloat();
            System.out.printf("Mil => Kilometre: %.2f Mil => %.2f Kilometre.",mesafe,(mesafe*1.60));
            
        }
    
        else { 
            System.out.println("Kilometre cinsinden Mesafeyi giriniz.");
            float mesafe = oku.nextFloat();
            System.out.printf("Kilometre => Mil: %.2f Kilometre => %.2f Mil.",mesafe,(mesafe/1.60));
        
    }
        
    }
}
