import java.util.Scanner;

public class Pengurangan2bil {
    public static void main(String[] args) {
        // Membuat objek key untuk masukan dari pengguna
        Scanner key1 = new Scanner(System.in);

        // Meminta pengguna memasukkan dua bilangan
        System.out.println("Masukkan bilangan pertama: ");
        int bilangan1 = key1.nextInt();

        System.out.println("Masukkan bilangan kedua: ");
        int bilangan2 = key1.nextInt();

        // Melakukan operasi pengurangan
        int hasil = bilangan1 - bilangan2;

        // Menampilkan hasil pengurangan ke monitor
        System.out.println("Hasil dari " + bilangan1 + " - " + bilangan2 + " = " + hasil);

        // Menutup scanner
        key1.close();
    }
}
