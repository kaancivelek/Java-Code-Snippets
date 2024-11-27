/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kaanc
 * 
 * 100 ile 999 arasındaki Armstrong sayıları üreten programı java dilinde
kodlayınız.
• Armstrong Sayı Nedir ?
• N haneli bir sayının basamaklarının n'inci üstlerinin toplamı, sayının
kendisine eşitse, böyle sayılara Armstrong sayı denir. Örneğin 407
sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu
verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.
 */


public class Armstrong_sayibulucu {
    public static void calistir(){
    int yuzlerbasamagi,onlarbasamagi,birlerbasamagi;
        for (int i = 100; i <= 999; i++) {
            int temp=i;
            yuzlerbasamagi=temp/100;
            temp-=(yuzlerbasamagi*100);
            onlarbasamagi=temp/10;
            temp-=(onlarbasamagi*10);
            birlerbasamagi=temp;
            
            
            
            
            if (i==(Math.pow(yuzlerbasamagi,3))+Math.pow(onlarbasamagi,3)+Math.pow(birlerbasamagi,3)) {
                System.out.printf("%d sayisi Armstrong bir sayidir.\n",i);    
            }
            
        }
    
    
    }
    
    
    
}
