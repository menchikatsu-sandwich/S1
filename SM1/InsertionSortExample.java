import java.util.Scanner;

public class InsertionSortExample {

    public static void insertionSort(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            // Move elements of array[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }

            array[j + 1] = key;
        }
    }

    public static void printArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = null; // Declare the array outside the loop

        do {
            System.out.println("=== Insertion Sort Example ===");
            System.out.println("1. Input Data");
            System.out.println("2. Run Insertion Sort");
            System.out.println("3. Exit");
            System.out.print("Pilih option di atas : ");

            int option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Masukkan Berapa Data Yang Di Inginkan: ");
                    int n = input.nextInt();

                    array = new int[n]; // Initialize the array here

                    System.out.println("Data Ke :");
                    for (int i = 0; i < n; i++) {
                        System.out.print("Element " + (i + 1) + ": ");
                        array[i] = input.nextInt();
                    }
                    break;

                case 2:
                    if (array == null) {
                        System.out.println("Tolong Masukkan Data Dahulu.");
                        break;
                    }

                    System.out.println("Data Before :");
                    printArray(array);

                    insertionSort(array);

                    System.out.println("Data After :");
                    printArray(array);
                    break;

                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Please choose again.");
                    break;
            }

        } while (true);
    }
}
