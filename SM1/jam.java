import java.util.Scanner;

public class jam {
    public static void main(String[] args){
        Scanner key1 = new Scanner(System.in);

        System.out.println("masukkan t.detik");
        int Tdetik = key1.nextInt();

        // cari jam
        int jam = Tdetik / 3600;
        int Sdetik = Tdetik % 3600;
        int menit = Sdetik / 60;
        int detik = Sdetik % 60;

        System.out.println("Hasil dari " + jam + " - " + menit + " - " + detik + "");

        key1.close();
    }
}
