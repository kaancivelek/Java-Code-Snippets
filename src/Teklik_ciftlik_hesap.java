/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author kaanc
 */
public class Teklik_ciftlik_hesap {
    public static void calistir(){
    
     /*Klavyeden girilen bir sayının tek mi yoksa çift mi
olduğunu tespit eden C programını yazınız.
        */
        //
        
Scanner oku = new Scanner(System.in);
int sayi;

      System.out.println("Sayinizi giriniz.");
sayi = oku.nextInt();
     
      if((sayi%2)==0){
          System.out.println("Sayiniz cift sayidir.");
      }
      else {
          System.out.println("Sayiniz tek sayidir.");
      } 
    
    }
    
}
