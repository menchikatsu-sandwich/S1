/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pewarisan;
import java.util.Scanner;
/**
 *
 * @author santo
 */
public class demopewarisan {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        hero a = new hero();
//        input
        System.out.println("Masukkan Nama Hero : ");
        a.setnama(key.nextLine());
        System.out.println("Masukkan Nama Jurus : ");
        a.setwaza(key.nextLine());
        System.out.println("Masukkan Attack Hero : ");
        a.setatk(key.nextInt());
        System.out.println("Masukkan HP Hero : ");
        a.sethp(key.nextInt());
        key.nextLine();

        
//        tampilkna superclass
        System.out.println("");
        System.out.println("Contoh Pewarisan");
        System.out.println("");
        System.out.println("Superclass Hero");
        System.out.println("Nama Hero : "+a.getnama());
        System.out.println("Attack Hero : "+a.getatk());
        System.out.println("HP Hero : "+a.gethp());
        System.out.println("Nama Jurus : "+a.getwaza());
        System.out.println("");
        
//        tampilkan subclass
        beast b = new beast();
        System.out.println("Masukkan Nama Hero : ");
        b.setnama(key.nextLine());
        System.out.println("Masukkan Nama Jurus : ");
        b.setwaza(key.nextLine());
        System.out.println("Masukkan Attack Hero : ");
        b.setatk(key.nextInt());
        System.out.println("Masukkan HP Hero : ");
        b.sethp(key.nextInt());
        b.setstatus("berserk");
        
        System.out.println("");
        System.out.println("Contoh Pewarisan");
        System.out.println("");
        System.out.println("Superclass Hero");
        System.out.println("Nama Hero : "+b.getnama());
        System.out.println("Attack Hero : "+b.getatk());
        System.out.println("HP Hero : "+b.gethp());
        System.out.println("Nama Jurus : "+b.getwaza());
        System.out.println("Special Skill : "+b.getstatus());
        
    }
}
