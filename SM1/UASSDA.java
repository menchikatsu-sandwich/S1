//Nama : Santo Evorius Jehu
//NIM : 2315354054
//Kelas : 1B / TRPL


// import java.util.Arrays;
import java.util.Scanner;

public class UASSDA {
    private static final int MAX_MHS = 6;
    private static String[] dataMhs = new String[MAX_MHS];
    private static int jumlahMhs = 0;    
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        int pilih;

        do {
            System.out.println("\nMenu Utama:");
            System.out.println("1. Linear Search");
            System.out.println("2. Insertion Sort");
            System.out.println("3. Stack");
            System.out.println("4. Queue");
            System.out.println("5. Tampilkan Data Saat Ini");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilih = key.nextInt();

            switch (pilih) {
                case 1:
                    linearsearch();
                    break;
                case 2:
                    insertionSortMenu();
                    break;
                case 3:
                    stackMenu();
                    break;
                case 4:
                    queueMenu();
                    break;
                case 5:
                    displayDataMahasiswa();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 6);
    }

    private static void linearsearch() {
        System.out.println("\nMenu Linear Search:");
        insertionSort(); 
        displayDataMahasiswa();

        System.out.print("Masukkan nama mahasiswa yang dicari: ");
        Scanner key = new Scanner(System.in);
        String cariNama = key.nextLine();

        int index = linearSearch(cariNama);

        if (index != -1) {
            System.out.println("Mahasiswa ditemukan pada indeks: " + index);
        } else {
            System.out.println("Mahasiswa tidak ditemukan.");
        }
    }

    private static int linearSearch(String key) {
        for (int i = 0; i < jumlahMhs; i++) {
            if (key.equals(dataMhs[i])) {
                return i;
            }
        }
        return -1;
    }

    private static void insertionSortMenu() {
        System.out.println("\nMenu Insertion Sort:");
        insertionSort();
        displayDataMahasiswa();
    }

    private static void insertionSort() {
        for (int i = 1; i < jumlahMhs; i++) {
            String currenTemp = dataMhs[i];
            int j = i - 1;
            while (j >= 0 && currenTemp.compareTo(dataMhs[j]) > 0) {
                dataMhs[j + 1] = dataMhs[j];
                j--;
            }
            dataMhs[j + 1] = currenTemp;
        }
    }
    

    private static void stackMenu() {
        Scanner key = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu Stack:");
            System.out.println("1. Pop");
            System.out.println("2. Push");
            System.out.println("3. isEmpty");
            System.out.println("4. isFull");
            System.out.println("5. Reverse Stack");
            System.out.println("6. Tampilkan Data Mahasiswa Saat Ini");
            System.out.println("7. Kembali ke Menu Utama");
            System.out.print("Pilih menu: ");
            pilih = key.nextInt();

            switch (pilih) {
                case 1:
                    pop();
                    break;
                case 2:
                    key.nextLine();
                    System.out.print("Masukkan nama mahasiswa untuk di-push: ");
                    String pushNama = key.nextLine();
                    push(pushNama);
                    break;
                case 3:
                    System.out.println("Stack " + (isEmpty() ? "kosong" : "tidak kosong"));
                    break;
                case 4:
                    System.out.println("Stack " + (isFull() ? "penuh" : "tidak penuh"));
                    break;
                case 5:
                    reverseStack();
                    displayDataMahasiswa();
                    break;
                case 6:
                    displayDataMahasiswa();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 7);
    }

    private static void push(String namaMhs) {
        if (isFull()) {
            System.out.println("Stack penuh, tidak dapat di-push.");
        } else {
            dataMhs[jumlahMhs++] = namaMhs;
            System.out.println(namaMhs + " berhasil di-push ke dalam stack.");
        }
    }

    private static void pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong, tidak dapat di-pop.");
        } else {
            System.out.println(dataMhs[jumlahMhs - 1] + " berhasil di-pop dari stack.");
            jumlahMhs--;
        }
    }

    private static boolean isEmpty() {
        return jumlahMhs == 0;
    }

    private static boolean isFull() {
        return jumlahMhs == MAX_MHS;
    }

    private static void reverseStack() {
        String[] reversedStack = new String[MAX_MHS];
        for (int i = 0; i < jumlahMhs; i++) {
            reversedStack[i] = dataMhs[jumlahMhs - i - 1];
        }
        dataMhs = reversedStack;
    }

    private static void queueMenu() {
        Scanner key = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu Queue:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. isEmpty");
            System.out.println("4. isFull");
            System.out.println("5. Reverse Queue");
            System.out.println("6. Tampilkan Data Mahasiswa Saat Ini");
            System.out.println("7. Kembali ke Menu Utama");
            System.out.print("Pilih menu: ");
            pilih = key.nextInt();

            switch (pilih) {
                case 1:
                    key.nextLine();
                    System.out.print("Masukkan nama mahasiswa untuk di-enqueue: ");
                    String enqNama = key.nextLine();
                    enqueue(enqNama);
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    System.out.println("Queue " + (isEmpty() ? "kosong" : "tidak kosong"));
                    break;
                case 4:
                    System.out.println("Queue " + (isFull() ? "penuh" : "tidak penuh"));
                    break;
                case 5:
                    reverseQueue();
                    displayDataMahasiswa();
                    break;
                case 6:
                    displayDataMahasiswa();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 7);
    }

    private static void enqueue(String namaMhs) {
        if (isFull()) {
            System.out.println("Queue penuh, tidak dapat di-enqueue.");
        } else {
            dataMhs[jumlahMhs++] = namaMhs;
            System.out.println(namaMhs + " berhasil di-enqueue ke dalam queue.");
        }
    }

    private static void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong, tidak dapat di-dequeue.");
        } else {
            System.out.println(dataMhs[0] + " berhasil di-dequeue dari queue.");
            for (int i = 0; i < jumlahMhs - 1; i++) {
                dataMhs[i] = dataMhs[i + 1];
            }
            jumlahMhs--;
        }
    }

    private static void reverseQueue() {
        String[] reversedQueue = new String[MAX_MHS];
        for (int i = 0; i < jumlahMhs; i++) {
            reversedQueue[i] = dataMhs[jumlahMhs - i - 1];
        }
        dataMhs = reversedQueue;
    }

    private static void displayDataMahasiswa() {
        System.out.println("Data Mahasiswa:");
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println((i + 1) + ". " + dataMhs[i]);
        }
    }
}
