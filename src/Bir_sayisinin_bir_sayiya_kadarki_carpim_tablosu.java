/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author kaanc
 * Kullanıcı tarafından girilen sayı değerinde çarpım tablosu(n*n)
oluşturan programı yazınız.
 */
public class Bir_sayisinin_bir_sayiya_kadarki_carpim_tablosu {
    public static void calistir(){
    
        Scanner oku = new Scanner(System.in);
        
        System.out.println("Hangi sayinin carpim tablosunu istiyorsunuz ?");
    int sayi = oku.nextInt();
        System.out.println("Hangi sayiya kadar carpim tablosunu istiyorsunuz ?");    
    int sayimenzili = oku.nextInt();
    
        for (int i = 1; i <= sayimenzili; i++) {
            
            System.out.printf("%d*%d= %d",sayimenzili,sayi,(sayimenzili*sayi));
            System.out.println(" ");
            
        }
    
    
    
    
    
    
    
    
    
    }
}
