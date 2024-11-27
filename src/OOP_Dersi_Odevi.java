/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author kaanc
 */
public class OOP_Dersi_Odevi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        Scanner scanner = new Scanner(System.in);
        int secim;

        
        do {
            System.out.println("Lütfen bir seçim yapın:");
            System.out.println("1. Havuz Doldurma Hesabı");
            System.out.println("2. Ortalama Hız Hesabı");
            System.out.println("3. Maaş Hesaplayıcı");
            System.out.println("4. İki Sayının Ortalaması");
            System.out.println("5. Kare Alanı Hesabı");
            System.out.println("6. Sayı Büyüklüğü Kıyas");
            System.out.println("7. Notu Harf Notuna Çevir");
            System.out.println("8. Teklik Çiftlik Hesabı");
            System.out.println("9. Harf Alfabe Kapsamı");
            System.out.println("10. Mil-Km Çevirici");
            System.out.println("11. Sayılar Arası Fark");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminizi girin (0-11): ");

            secim = scanner.nextInt();
          
            
            switch (secim) {
                
              
                
                case 1:
                    Havuz_Doldurma_Hesabi.calistir();
                    break;

                case 2:
                    Ortlama_Hiz_Hesabi.calistir();
                    break;

                case 3:
                    Maas_Hesaplayici.calistir();
                    break;

                case 4:
                    Iki_Sayinin_Ortalamasi.calistir();
                    break;

                case 5:
                    Kare_Alani.calistir();
                    break;

                case 6:
                    Sayi_Buyuklugu_kiyas.calistir();
                    break;

                case 7:
                    Notu_harfnotuna_cevir.calistir();
                    break;

                case 8:
                    Teklik_ciftlik_hesap.calistir();
                    break;

                case 9:
                    Harf_alfabe_kapsam.calistir();
                    break;

                case 10:
                    Mil_Km_Cevirici.calistir();
                    break;

                case 11:
                    Sayilar_arasi_fark.calistir();
                    break;

                case 0:
                    System.out.println("Çıkış yapılıyor...");
                    break;

                default:
                    System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
                    break;
            }
            System.out.println(); 
        } while (secim != 0); 

        
    }
}

           
           
            
    
    

    
