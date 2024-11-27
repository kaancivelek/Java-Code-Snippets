/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author kaanc
 */
public class Kare_Alani {
    public static void calistir(){
    
        Scanner oku = new Scanner(System.in);
        
        int kenar;
        System.out.println("Enter Length of square's any border.");
        kenar = oku.nextInt();
        kenar *=kenar;
        System.out.println("Area Of Square: "+kenar);
    
    }
}
