import java.util.Scanner;

public class dmatrixperkalian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah baris dan kolom matriks
        System.out.print("Masukkan jumlah baris matriks: ");
        int baris = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        int kolom = scanner.nextInt();

        // Input elemen-elemen matriks
        int[][] matriksA = inputMatriks("Matriks A", baris, kolom);
        int[][] matriksB = inputMatriks("Matriks B", baris, kolom);

        // Operasi perkalian matriks
        int[][] hasilPerkalian = perkalianMatriks(matriksA, matriksB);

        // Menampilkan hasil
        System.out.println("\nMatriks A:");
        tampilkanMatriks(matriksA);

        System.out.println("\nMatriks B:");
        tampilkanMatriks(matriksB);

        System.out.println("\nHasil Perkalian Matriks A dan B:");
        tampilkanMatriks(hasilPerkalian);
    }

    // Fungsi untuk input matriks
    public static int[][] inputMatriks(String nama, int baris, int kolom) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan elemen-elemen " + nama + ":");
        int[][] matriks = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(nama + "[" + (i + 1) + "][" + (j + 1) + "]: ");
                matriks[i][j] = scanner.nextInt();
            }
        }
        return matriks;
    }

    // Fungsi untuk perkalian matriks
    public static int[][] perkalianMatriks(int[][] matriksA, int[][] matriksB) {
        int barisA = matriksA.length;
        int kolomA = matriksA[0].length;
        int kolomB = matriksB[0].length;
        int[][] hasil = new int[barisA][kolomB];
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomB; j++) {
                for (int k = 0; k < kolomA; k++) {
                    hasil[i][j] += matriksA[i][k] * matriksB[k][j];
                }
            }
        }
        return hasil;
    }

    // Fungsi untuk menampilkan matriks
    public static void tampilkanMatriks(int[][] matriks) {
        int baris = matriks.length;
        int kolom = matriks[0].length;
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }
    }
}