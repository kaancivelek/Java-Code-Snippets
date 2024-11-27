/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kaanc
 * A dizisi elamanları 4,8,3,1,18,9,21,20,5,11 olmak üzere A dizisi
elamanlarını toplatan ve ortalamasını bulan programı java dilinde
kodlayınız
 */
public class Dizi_ortalamasi {
     public static void calistir(){
    int []kume={4,8,3,1,18,9,21,20,5,11};
    
   int cache =0;
    for(int i=0;i<kume.length;i++){
cache+=kume[i];
        
    }
         System.out.println("Dizinizin ortalamasi: "+(cache/kume.length));
}    
}
