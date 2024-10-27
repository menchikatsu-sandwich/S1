import java.util.Scanner;

public class NIM {
    public static void main(String[] args) {
        Scanner key1 = new Scanner(System.in);

        // Masukkan NIM
        System.out.println("Masukkan NIM: ");
        String NIM = key1.nextLine();

        //  Masukkan Nama
        System.out.println("Masukkan Nama: ");
        String Nama = key1.nextLine();

        //  Masukkan Nilai UTS
        System.out.println("Masukkan Nilai UTS: ");
        float UTS = key1.nextFloat();

        //  Masukkan Nilai UAS
        System.out.println("Masukkan Nilai UAS");
        float UAS = key1.nextFloat();

        // Melakukan Operasi Hasil
        float hasil = (40 * UTS / 100) + (60 * UAS / 100);

        // Menampilkan Hasil
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("");
        System.out.println("NIM: " + NIM );
        System.out.println("Nama: " + Nama);
        System.out.println("Nilai UTS: " + UTS);
        System.out.println("Nilai UAS: " + UAS);
        System.out.println("Hasil: " + hasil);
        System.out.println("");
        System.out.println("+++++++++++++++++++++++++++++++");
    }
}

// Santo Evorius Jehu / 2315354054/ 2B / TRPL