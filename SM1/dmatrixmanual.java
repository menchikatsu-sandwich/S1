import java.util.Scanner; // Mengimpor kelas Scanner untuk membaca input dari pengguna

public class dmatrixmanual {
  public static void main(String[] args) {
    Scanner key = new Scanner(System.in); // Membuat objek Scanner bernama scanner
    boolean lanjut = true;

    while(lanjut) {
        System.out.println("Matrix 3 x 3");
      // Membuat array 2 dimensi dengan ukuran yang sesuai dengan input pengguna
      int[][] array2D = new int[3][3]; // Membuat objek array 2 dimensi bernama array2D
      // Meminta input elemen array 2 dimensi dari pengguna
      for (int i = 0; i < 3; i++) { // Mengulang sebanyak jumlah baris
        for (int j = 0; j < 3; j++) { // Mengulang sebanyak jumlah kolom
          System.out.print("Masukkan elemen [" + i + "][" + j + "]: "); // Menampilkan pesan untuk meminta input elemen array
          array2D[i][j] = key.nextInt(); // Membaca input elemen array dan menyimpannya dalam array2D
        }
      }
      key.nextLine();
      // Menampilkan elemen array 2 dimensi
      System.out.println("Hasil matriks: "); // Menampilkan pesan untuk menampilkan hasil matriks
      for (int i = 0; i < 3; i++) { // Mengulang sebanyak jumlah baris
        for (int j = 0; j < 3; j++) { // Mengulang sebanyak jumlah kolom
          System.out.print(array2D[i][j] + " "); // Menampilkan elemen array dengan spasi sebagai pemisah
        }
        System.out.println(); // Mencetak baris baru setelah menampilkan semua elemen dalam satu baris
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
