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
public class elseif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan data calon legislatif:");
        System.out.print("Nama calon: ");
        String namaCaleg = input.nextLine();
        System.out.print("Partai: ");
        String partaiCaleg = input.nextLine();
        System.out.print("Jumlah suara: ");
        int jumlahSuara = input.nextInt();

        boolean terpilih = false;

        if (jumlahSuara > 10000) {
            terpilih = true;
        } else {
            if (partaiCaleg.equalsIgnoreCase("nasdem") && jumlahSuara > 5000) {
                terpilih = true;
            } else if (partaiCaleg.equalsIgnoreCase("gerindra") && jumlahSuara > 6000) {
                terpilih = true;
            } else if (partaiCaleg.equalsIgnoreCase("banteng") && jumlahSuara > 7000) {
                terpilih = true;
            }
        }

        if (terpilih) {
            System.out.println(namaCaleg + " terpilih sebagai anggota legislatif.");
        } else {
            System.out.println(namaCaleg + " tidak terpilih sebagai anggota legislatif.");
        }

        input.close();
    }
}
