/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encap;

/**
 *
 * @author santo
 */
public class main {
    public static void main(String[] args) {
        // Membuat objek enkapulasi
        enkapulasi obj = new enkapulasi("Budi", "123456", 85.5);

        // Mengenkripsi data
        String namaEnkripsi = Enkripsi.enkripsi(obj.getNama());
        String nimEnkripsi = Enkripsi.enkripsi(obj.getNim());
        String nilaiEnkripsi = Enkripsi.enkripsi(Double.toString(obj.getNilai()));

        // Menampilkan data terenkripsi
        System.out.println("Nama terenkripsi: " + namaEnkripsi);
        System.out.println("NIM terenkripsi: " + nimEnkripsi);
        System.out.println("Nilai terenkripsi: " + nilaiEnkripsi);

        // Mendekripsi data
        String namaDekripsi = Enkripsi.dekripsi(namaEnkripsi);
        String nimDekripsi = Enkripsi.dekripsi(nimEnkripsi);
        String nilaiDekripsi = Enkripsi.dekripsi(nilaiEnkripsi);

        // Menampilkan data terdekripsi
        System.out.println("Nama terdekripsi: " + namaDekripsi);
        System.out.println("NIM terdekripsi: " + nimDekripsi);
        System.out.println("Nilai terdekripsi: " + nilaiDekripsi);
    }
}
