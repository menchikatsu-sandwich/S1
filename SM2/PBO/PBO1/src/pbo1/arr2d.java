/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo1;
import java.util.Scanner;

public class arr2d {

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nilai matriks 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Masukkan nilai baris ke-" + (i + 1) + ", kolom ke-" + (j + 1) + ": ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nMatriks yang dimasukkan:");
        for (int[] p : matrix) {
            for (int p2 : p) {
                System.out.print(p2 + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
