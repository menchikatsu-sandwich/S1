/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo1;

/**
 *
 * @author santo
 */
public class TData {
    String nama;
    int umur;
    float gaji;
    char klsGaji;
    double pajak;
    
    void judul(){
        System.out.println("Data Pekerja");
        System.out.println("");
    }
    
    void menampilkanDaftar(){
        System.out.println("- Nama: " + nama);
        System.out.println("  Umur: " + umur);
        System.out.println("  Kelas Gaji: " + klsGaji);
        System.out.println("  Pajak: Rp. " + pajak);
        System.out.println("  Gaji: Rp. " + gaji);
    }
    
    public static void main(String[] args) {
        TData p1 = new TData();
        p1.nama = "Danil";
        p1.umur = 48;
        p1.klsGaji = 'B';
        p1.pajak = 50000;
        p1.gaji = 550000;
        p1.judul();
        p1.menampilkanDaftar();
        
        TData p2 = new TData();
        p2.nama = "Santo";
        p2.umur = 25;
        p2.klsGaji = 'A';
        p2.pajak = 75000;
        p2.gaji = 750000;
        p2.menampilkanDaftar();
        
        TData p3 = new TData();
        p3.nama = "Adi";
        p3.umur = 32;
        p3.klsGaji = 'S';
        p3.pajak = 100000;
        p3.gaji = 1000000;
        p3.menampilkanDaftar();
        
        TData p4 = new TData();
        p4.nama = "Emo";
        p4.umur = 28;
        p4.klsGaji = 'C';
        p4.pajak = 40000;
        p4.gaji = 400000;
        p4.menampilkanDaftar();
    }
}
