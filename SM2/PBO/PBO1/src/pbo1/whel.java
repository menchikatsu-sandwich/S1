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
public class whel {
    
public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            System.out.println("Avanza / Zenia / Innova");
            System.out.print("Merek Kendaraan:");
            String Pilihan = "";
            Pilihan = key.nextLine();

            System.out.println("Jumlah Kendaraan Yang Dipesan:");
            double Jumlah = key.nextInt();

            System.out.println("Jumlah Jam Sewa:");
            double Jam = key.nextInt();

            double perjam = 0;
            double totsewa = 0;

            if ("Avanza".equals(Pilihan)){
                perjam = 600000;
            } else if ("Zenia".equals(Pilihan)){
                perjam = 500000;
            } else if ("Innova".equals(Pilihan)){
                perjam = 800000;
            } else {
                return;
            }
    
            totsewa = Jumlah * Jam * perjam;

            double disc = 0;

            if (Jumlah > 2){
                disc = 0.3 * totsewa;
            } else {
                disc = 0 * totsewa;
                System.out.println("Jumlah Unit Yang dipinjam kurang dari atau sama dengan 2 tidak mendapat diskon");
            }

            double tot = totsewa - disc;

            System.out.println("======================================");
            System.out.println(" ");
            System.out.println("Harga sewa perjam: Rp." + perjam);
            System.out.println("Total Sewa: Rp." + totsewa);
            System.out.println("Diskon: Rp." + disc);
            System.out.println("Total Bayar: Rp." + tot);
            System.out.println(" ");
            System.out.println("======================================");
            System.out.println(" ");
            System.out.println("Apakah anda ingin Lanjut (Y/T)");
            key.nextLine();
            String Jawaban = key.nextLine();

            if (Jawaban.equalsIgnoreCase("T")){
                lanjut = false;
            }
        }
        key.close();      
    }
}

