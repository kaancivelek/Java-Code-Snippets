/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kaanc
 * 
 * • A dizisi elamanları 23,15,45,39,6,34,35,20,7,44 olmak üzere A dizi
elemanlarını kendi içerisinde ters çeviren programı java dilinde
kodlayınız. (başka bir dizi kullanılmayacak)
 */
public class Dizi_eleman_tepetaklak {
    public static void calistir(){
    
    int []a ={23,15,45,39,6,34,35,20,7,44};
    int temp;
        for (int i = 0; i < a.length; i++) {
            
            temp=a[i]; // ilk eleman yedeklendi.
            a[i]=a[a.length-i-1];  // ilk elemanın yerine son eleman geldi.
            a[a.length-1-i] =temp ; // son elemanın yerine ilk eleman geldi.
        }
        for (int j = 0; j < a.length; j++) {
            
            System.out.printf("Dizi elemanlarinin terse cevrilmis hali. a={%d,}",a[j]);
            
        }
    }
}
