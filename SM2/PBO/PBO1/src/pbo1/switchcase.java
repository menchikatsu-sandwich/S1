/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo1;
import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        
        System.out.println("Masukkan pilihan (1, 2, atau 3):");
        int pilihan = key.nextInt();
        
        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih AMIS");
                break;
            case 2:
                System.out.println("Anda memilih PRABRORO");
                break;
            case 3:
                System.out.println("Anda memilih JANGGAR");
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
        key.close();
    }
}
