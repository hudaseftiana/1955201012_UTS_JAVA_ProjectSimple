/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIMPLE_PROGRAM;

import java.util.Scanner;

/**
 *
 * @author acr
 */
public class Project_simple {
    public static void main(String[] args) {
     System.out.println("BILANGAN PRIMA");
     Scanner atas = new Scanner (System.in);
     System.out.println("Inputkan Nilai batas atas :");
        int a = atas.nextInt();
     Scanner bawah = new Scanner (System.in);
     System.out.println("Inputkan Nilai batas bawah :");
        int b = bawah.nextInt();
     for (int i = b; i <=a; i++) {
         boolean isPrima = true;

         for (int j = 2; j < i; j++) {
             if(i%j==0){
                 isPrima = false;
                 break;
             }
         }

         if(isPrima==true){
         System.out.println(i+",");
    }
  }
 }
}
 