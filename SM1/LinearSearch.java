import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int[] array = {20,25,35,40,45,48,79,90,49};

        System.out.println("Niai berapa yang ingin di cari: ");
        int nilaiCari = key.nextInt();

        int pilihan;
            System.out.println("Menu:");
            System.out.println("1. Linear Search");
            System.out.println("2. Binery Search");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            pilihan = key.nextInt();
        
        switch (pilihan) {
            case 1:
                LiniarSearch(nilaiCari, array);
                break;
            case 2:
                BinarySearch(nilaiCari, array);
                break;
            case 3:
                System.out.println("Terima kasih!");
                key.close();
        }
    }

    public static void LiniarSearch(int nilaiCari, int[] array){
        //LinearSearch
        for (int i = 0; i < array.length; i++) {
            System.out.println(i+1 + ".inputan user " + nilaiCari + " dicocokkan dengan " + array[i]);
            if (nilaiCari == array[i]) {
                System.out.println("Nilai ditemukan pada index ke " + i);
                break;
            }
        }
    }


    public static void BinarySearch(int nilaiCari, int[] array){
        //Binery Search
        int low = 0;
        int high = array.length-1;

        do {
            int mid = (low + high) /2;
            System.out.println("low " + low);
            System.out.println("mid " + mid);
            System.out.println("high " + high);
            if (array[mid] == nilaiCari) {
                System.out.println("Nilai Ditemukan");
                break;
            } else if (array[mid] > nilaiCari) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        } while (high > low);
    }
}