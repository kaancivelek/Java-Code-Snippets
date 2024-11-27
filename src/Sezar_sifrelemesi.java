/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author kaanc
 * 
 * Buyuk harfle girilen kelimeyi, belirtilen anahtara gore sezar şifrelemesi
 * algorıtması ile şifreleyen programı yazınız.
 */
public class Sezar_sifrelemesi {
    public static void calistir(){
    
    Scanner oku = new Scanner(System.in);

    String mesaj, sifrelimesaj = "";  
        int kaydirac;  
    
       
        System.out.print("Kelimeyi giriniz :");
        mesaj = oku.nextLine(); 
        
        
        System.out.print("Anahtarı giriniz :");
        kaydirac = oku.nextInt();  
        
        
        for(int i = 0; i < mesaj.length(); i++) {
            
            // ASCII değerine göre harf kaydırma yapılıyor
            sifrelimesaj += (char)(((int)mesaj.charAt(i) - 65 + kaydirac) % 26 + 65); 
            // (int)m.charAt(i): Karakterin ASCII değerini alır
            // -65: A'nın ASCII değeri olan 65'i çıkararak 0-25 arası bir değer elde ederiz
            // +a: Kullanıcının girdiği anahtar ile kaydırma yapılır
            // %26: Kaydırmanın 26 harfli alfabede kalmasını sağlar
            // +65: Sonucu tekrar A-Z aralığındaki bir karaktere çevirir
            
            /*Yani harfin ascii değerini çekip alfabeye uyarlayıp alfabede kaydırıyoruz ve kaydırılıp değişen harfi tekrar ascii
            formatına çeviriyoruz
            */
        }

        
        System.out.println("Sifreli Kelime :" + sifrelimesaj);
        
        
    }
}
    
    
    
    

