/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo1;
import java.util.Scanner;
/**
 *
 * @author santo
 */
public class ifdoang{
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);

        System.out.println("Masukkan nilai : ");
        int angka = key.nextInt();

        // if dengan else
        if(angka>=10){
            System.out.println("Nilai yang diinput lebih besar atau sama dengan 10");
        }
    }
}