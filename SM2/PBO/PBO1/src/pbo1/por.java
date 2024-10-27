/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo1;
import java.util.Scanner;

public class por {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Masukkan jumlah data : ");
        int JumDat = key.nextInt();

        int sum = 0;

        for (int i = 0; i < JumDat; i++) {
            System.out.println("Masukkan data ke-" + (i + 1));
            int data = key.nextInt();

            sum += data;
        }
        System.out.println("");
        System.out.println("Jumlah data : " + sum);
        System.out.println("");

        key.close();
    }
}
