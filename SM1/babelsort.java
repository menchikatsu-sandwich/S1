import java.util.Scanner;

public class babelsort {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int arr[] = new int[10];

        for(int i=0; i < arr.length; i++){
            System.out.println("Masukkan nilai (maks.10): ");
            arr[i] = key.nextInt();
        }
        System.out.println();

        bubbleSort(arr);

        System.out.println("Array Setelah Bubble Sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
