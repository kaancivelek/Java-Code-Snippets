/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author kaanc
 */
public class Harf_alfabe_kapsam {
     public static void calistir(){
     
      /*Kullanıcı tarafından klavyeden girilen bir harfin
alfabede olup olmadığını bulan bir C programı yazınız.
        */
        
        // Alfabedeki kaçıncı harf olduğunu bulmama yarayan " int sirasi = harf - 'a' + 1; "a ifadesini buldum ve kullandım.
        
        
Scanner oku = new Scanner(System.in);
char harf;

      System.out.println("Harfinizi giriniz.");
harf = oku.nextLine().charAt(0); /* Sonraki satırdaki ifadeleri string tipinden 
okayacakken fazladan sadece ilk harfi oku şartı koydum ( .CharAt(0)  ) */
     
        if ( harf >= 'a' && harf <= 'z' ) {
            int sirasi = harf - 'a' + 1;
            System.out.printf("Girdiginiz kucuk harf alfabe icerisindedir. Alfabenin %d numarali harfidir ", sirasi );
            
            
            
        }
        
        else if ( harf >= 'A' && harf <= 'Z') {
            int sirasi = harf - 'A' + 1;
        System.out.printf("Girdiginiz buyuk harf alfabe icerisindedir. Alfabenin %d numarali harfidir", sirasi);
        
        
        }
        
            else 
      {
            System.out.println("Girdiginiz harf alfabede bulunmamaktadir.");
        }
     
     
     
     }
    
}
