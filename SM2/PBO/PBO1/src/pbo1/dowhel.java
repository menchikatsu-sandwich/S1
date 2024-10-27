/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo1;
import java.util.Scanner;

public class dowhel {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Masukkan angka kurang dari 100: ");
        int i = key.nextInt();
        System.out.println("");
        do {
            System.out.println(i);
            i++;
        } while (i <= 100);
    }
}
