import java.util.Scanner;

public class sercing {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int[] data = new int[0];

        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Menginputkan data");
            System.out.println("2. Pencarian data");
            System.out.println("3. Reset Data");
            System.out.println("4. Exit");
            System.out.print("Pilih menu (1-4): ");
            pilihan = key.nextInt();

            switch (pilihan) {
                case 1:
                    data = inputData(key);
                    break;
                case 2:
                    caridata(data, key);
                    break;
                case 3:
                    data = new int[0];
                    System.out.println("Data berhasil di-reset.");
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (pilihan != 4);

        key.close();
    }

    public static int[] inputData(Scanner scanner) {
        System.out.print("Masukkan jumlah data: ");
        int jumlahData = scanner.nextInt();
        int[] data = new int[jumlahData];

        System.out.println("Masukkan data:");
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Data ke-" + (i + 1) + ": ");
            data[i] = scanner.nextInt();
        }

        System.out.println("Data berhasil diinput.");
        return data;
    }

    public static void caridata(int[] data, Scanner scanner) {
        if (data.length == 0) {
            System.out.println("Data belum diinput. Silakan input data terlebih dahulu.");
            return;
        }

        System.out.print("Masukkan data yang ingin dicari: ");
        int target = scanner.nextInt();
        boolean cari = false;

        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                cari = true;
                System.out.println("Data " + target + " ditemukan pada indeks " + i);
                break;
            }
        }

        if (!cari) {
            System.out.println("Data " + target + " tidak ditemukan.");
        }
    }
}

