/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author kaanc
 * 
 * Kullanıcının girdiği seviyor ve sevmiyor için sırasıyla 0 ve 1 değerleri
için 20 ile 30 arasında papatya yaprağı oluşturan ve seviyor ya da
sevmiyor diye değer döndüren programı java dilinde kodlayınız.
• ( döngü kullanılmayacak.)
 */
public class Soyle_papatya_seviyormu_beni {
    
    public static void calistir(){
    
    Scanner oku = new Scanner(System.in);
        
        System.out.println("Soyle bakalim seviyor(1) mu sevmiyor(0) mu ?");
    int cache = oku.nextByte();
    int yapraksayisi= (int)Math.random()*(20+10);
    
    switch (cache){
    
        case 1:
        
        if(yapraksayisi%2==0){ System.out.println("Sevmiyor");}
        else{System.out.println("Sevmiyor.");}
        break;
        
        
        case 0:
            
        if(yapraksayisi%2==0){ System.out.println("Seviyor");}
        else{System.out.println("Sevmiyor.");}
        break;
            
            default :
            System.out.println("Seviyorsa 1 sevmiyorsa 0 yazmalisin.");
            break;
            
}

}}
