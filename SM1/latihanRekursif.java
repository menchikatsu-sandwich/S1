// import java.util.Scanner;

// public class latihanRekursif {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Masukkan angka: ");
//         int angka = scanner.nextInt();
//         System.out.print("Masukkan nilai pangkat: ");
//         int pangkat = scanner.nextInt();
//         System.out.println("Hasil perpangkatan: " + perpangkatan(angka, pangkat));
//     }

//     public static int perpangkatan(int angka, int pangkat) {
//         if (pangkat == 0) {
//             return 1;
//         } else if (pangkat > 0) {
//             return angka * perpangkatan(angka, pangkat - 1);
//         } else {
//             return perpangkatan(1 / angka, -pangkat);
//         }
//     }
// }

// cara biasa
import java.util.Scanner;
public class latihanRekursif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();
        System.out.print("Masukkan nilai pangkat: ");
        int pangkat = scanner.nextInt();
        double hasil = 1.0;

        if (pangkat == 0) {
            hasil = 1.0;
        } else if (pangkat > 0) {
            for (int i = 1; i <= pangkat; i++) {
                hasil *= angka;
            }
        } else {
            for (int i = 1; i <= -pangkat; i++) {
                hasil *= (1.0 / angka);
            }
        }

        System.out.println("Hasil perpangkatan: " + hasil);
    }
}
