/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author kaanc
 * 
 * • Gömülü bir sistem içerisinde çalışacak olan bir Mayın Tarlası oyunu Java dili ile
programlanmak istenmektedir. Aşağıdaki isterleri gerçekleştirecek olan programı
yazınız.
• Oyun için tasarlanan Tarla, 10 satır ve 10 sütuna sahip olacaktır.
• Bu satır ve sütunlar üzerinde rastgele 10 tane mayın yerleştirilecektir.
• Oyun esnasında her adımda kullanıcıdan bir sütun ve satır numarası istenecektir.
• Oyunda bu satır ve sütun numaralarında bir mayının var olup olmadığı kontrol
edilecektir.
• Oyun bir mayına basana kadar devam edecektir.
• Oyun da puan: başarılı yapılan hamlelerin sayısı olarak belirlenecektir.
• Oyun bitiminde mayına basmadan yapılmış başarılı hamlelerin sayısı yani oyuncu
puanı ekrana yazdırılacaktır.
 * 
 */
public class Mayin_tarlasi {
    public static void calistir() {
        Scanner oku = new Scanner(System.in);
        
     
        int satirsayisi = 10; //oyun alani genisligi
        int sutunsayisi = 10; // oyun alani uzunlugu
         int mayinMiktari = 10; // oyunda bulunan mayin miktari
    
         
        
        char[][] oyunalani = new char[satirsayisi][sutunsayisi];
        int skor = 0;
  
        
        
        for (int i = 0; i < satirsayisi; i++) {
            for (int j = 0; j < sutunsayisi; j++) {
                oyunalani[i][j] = 'O';
            }
        }
        
        
        int mayinSayaci = 0;
        while (mayinSayaci < mayinMiktari) {
            int yataymayinci = (int) (Math.random() * satirsayisi);
            int dikeymayinci = (int) (Math.random() * sutunsayisi);
            if (oyunalani[yataymayinci][dikeymayinci] != '*') {
                oyunalani[yataymayinci][dikeymayinci] = '*';
                mayinSayaci++;
            }
        }
        
        
        while (true) {
            
            for (int i = 0; i < satirsayisi; i++) {
                for (int j = 0; j < sutunsayisi; j++) {
                    if (oyunalani[i][j] == '*') {
                        System.out.print("O "); 
                    } else {
                        System.out.print(oyunalani[i][j] + " ");
                    }
                }
                System.out.println();
            }
            
            
            System.out.printf("Kacinci satiri seciyorsunuz (1-%d) ?",satirsayisi);
            int satirsecimi = oku.nextInt();
            satirsecimi--;
            
            System.out.printf("Kacinci sutunu seciyorsunuz (1-%d) ?",sutunsayisi);
            int sutunsecimi = oku.nextInt();
            sutunsecimi--;
            
            
            if (oyunalani[satirsecimi][sutunsecimi] == '*') {
                System.out.println("Mayina bastiniz! Oyun bitti.");
                 
                for (int i = 0; i < satirsayisi; i++) {
                    for (int j = 0; j < sutunsayisi; j++) {
                        System.out.print(oyunalani[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.printf("Toplam puanınız: %d", skor);
                break;           
            } 
            
            else {
                System.out.println("Tebrikler, mayina denk gelmediniz.");
                oyunalani[satirsecimi][sutunsecimi] = 'X'; 
                skor++;
            }
        }
        
        
    }}
    
        
    

