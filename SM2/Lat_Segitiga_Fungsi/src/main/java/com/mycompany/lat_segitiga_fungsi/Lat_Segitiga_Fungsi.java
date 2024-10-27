/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lat_segitiga_fungsi;
//import scanner
import java.util.Scanner;
/**
 *
 * @author santo
 */
public class Lat_Segitiga_Fungsi {

    public static void main(String[] args) {
        //instanisasi class scanner
        Scanner input = new Scanner(System.in);
        
        //instanisasi class to object
        Segitiga objSegitiga = new Segitiga();
        
        System.out.print("Masukkan Alas: ");
            objSegitiga.alas = input.nextInt();
        System.out.print("Masukkan Tinggi: ");
            objSegitiga.tinggi = input.nextInt();
        System.out.printf("Luas Segitiga: %.2f\n",objSegitiga.luas());
    }
}
