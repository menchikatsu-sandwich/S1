import java.util.Scanner;
public class dbersama {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("x: Masukkan jumlah mahasiswa: ");
        int jumMhs = scan.nextInt();

        System.out.println("x: Masukkan jumlah mata kuliah: ");
        int jumMK = scan.nextInt();

        float[][] nilai = new float[jumMhs][jumMK];
        String[] nama = new String[jumMhs];

    // menginput nama mhs dan nilai mk
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("x: Masukkan nama ke " + (i + 1) + " : ");
            nama[i] = scan.next();
            for (int j = 0; j < nilai[i].length; j++) {
            System.out.print("x: Masukkan nilai " + nama[i] + " untuk mk " + (j + 1) + " : ");
            nilai[i][j] = scan.nextFloat();
            }
        }

    // menampilkan tabel header
        System.out.print(" |");
        for (int i = 0; i < jumMK; i++) {
            System.out.print(String.format(" | %-10s", "mk" + (i + 1)));
        }
        System.out.println();

       // menampilkan tabel body
       for (int i = 0; i < nilai.length; i++) {
           System.out.print(String.format(" | %-10s", nama[i]));
           for (int j = 0; j < nilai[i].length; j++) {
               System.out.print(String.format(" | %-10f", nilai[i][j]));
           }
           System.out.println();
       }
    }
}