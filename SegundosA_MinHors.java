/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.segundosa_minhors;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class SegundosA_MinHors {

    public static void main(String[] args) {
        
         Scanner leer = new Scanner(System.in);
         
         int seg;
         int h;
         int m;
         int s;
         
         System.out.println("CONVERTIR DE SEGUNDOS A SEGUNDOS, MINUTOS Y HORAS");
         System.out.println("Ingrese los segundos: ");
         seg = leer.nextInt();
         
         h = seg/3600;
         
         m = seg % 3600/60;
         
         s = seg % 3600 % 60;
         
         System.out.println(seg+" segundos son " +h+":"+m+":"+s);
         
    }
}
