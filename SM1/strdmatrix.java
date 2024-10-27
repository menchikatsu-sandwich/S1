import java.util.Scanner;

public class strdmatrix {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            System.out.println("Matrix Nilai");
            // Membuat array 2 dimensi dengan ukuran yang sesuai dengan input pengguna
            String[][] array2D = new String[4][3];

            // Meminta input elemen array 2 dimensi dari pengguna
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Masukkan elemen [" + i + "][" + j + "]: ");
                    array2D[i][j] = key.next();
                }
            }
            key.nextLine(); // Membersihkan newline setelah membaca input

            // Menampilkan elemen array 2 dimensi
            System.out.println("Hasil matriks: ");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 3; j++) {
                    // Menambahkan kondisi untuk memeriksa apakah input dapat diubah menjadi integer
                    try {
                        int nilai = Integer.parseInt(array2D[i][j]);
                        System.out.print(nilai + " ");
                    } catch (NumberFormatException e) {
                        System.out.print(array2D[i][j] + " ");
                    }
                }
                System.out.println();
            }

            System.out.println("Apakah anda ingin lanjut? (Y/T)");
            String jawaban = key.nextLine();

            if (jawaban.equalsIgnoreCase("T")) {
                lanjut = false;
            }
        }
        key.close();
    }
}
