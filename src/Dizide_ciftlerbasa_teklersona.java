/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kaanc
 * 
 * • Tanımlanan bir dizi içerisinde dizi elamanlarından çift olanları başa tek
olanları sona olmak üzere bir başka diziye kaydeden programı java
dilinde yazınız.
 */
public class Dizide_ciftlerbasa_teklersona {
     public static void calistir(){
     
     int []hamdizi ={1,2,3,4,5,6,7,8,9,10};
     int []islenmisdizi = new int[hamdizi.length];
     
         for (int i = 0; i < hamdizi.length; i++) {
             
             if (hamdizi[i]%2==0) {
                 islenmisdizi[i]=hamdizi[i];
                 
             }
             else{
             islenmisdizi[islenmisdizi.length-1-i]=hamdizi[i];
             }
             
             
         }
     
     
     
     }
}
