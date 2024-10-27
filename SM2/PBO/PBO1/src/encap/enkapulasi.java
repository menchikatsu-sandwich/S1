/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encap;

public class enkapulasi {
     // Deklarasi variabel private
    private String nama;
    private String nim;
    private double nilai;   

    // Constructor
    public enkapulasi(String nama, String nim, double nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk NIM
    public String getNim() {
        return nim;
    }

    // Setter untuk NIM
    public void setNim(String nim) {
        this.nim = nim;
    }

    // Getter untuk nilai
    public double getNilai() {
        return nilai;
    }

    // Setter untuk nilai
    public void setNilai(double nilai) {
        if (nilai >= 0 && nilai <= 100) {
            this.nilai = nilai;
        } else {
            System.out.println("Nilai harus di antara 0 dan 100");
        }
    }
}

