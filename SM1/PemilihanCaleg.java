// NAMA : SANTO EVORIUS JEHU
// KELAS / PRODI : 1B / TRPL
// PEMILIHAN CALON LEGISLATIF








import java.util.Scanner;

public class PemilihanCaleg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Masukkan data calon legislatif
        System.out.println("Masukkan data calon legislatif:");
        System.out.print("Nama calon: ");
        String namaCaleg = input.nextLine();
        System.out.print("Partai: ");
        String partaiCaleg = input.nextLine();
        System.out.print("Jumlah suara: ");
        int jumlahSuara = input.nextInt();

        // Kriteria pemilihan
        boolean terpilih = false;

        if (jumlahSuara > 10000) {
            terpilih = true;
        } else {
            if (partaiCaleg.equalsIgnoreCase("A") && jumlahSuara > 5000) {
                terpilih = true;
            } else if (partaiCaleg.equalsIgnoreCase("B") && jumlahSuara > 6000) {
                terpilih = true;
            } else if (partaiCaleg.equalsIgnoreCase("C") && jumlahSuara > 7000) {
                terpilih = true;
            }
        }

        // Output hasil pemilihan
        if (terpilih) {
            System.out.println(namaCaleg + " terpilih sebagai anggota legislatif.");
        } else {
            System.out.println(namaCaleg + " tidak terpilih sebagai anggota legislatif.");
        }

        input.close();
    }
}
