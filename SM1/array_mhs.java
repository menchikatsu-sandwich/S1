import java.util.Scanner;

public class array_mhs{
    public static void main(String[] args){
        Scanner key1 = new Scanner(System.in);
        Scanner key2 = new Scanner(System.in);
        String[] nama = new String[10];
        int[] umur = new int[10];
        int i = 0;
        String MyName;
        int MyUmur;
        while (i <= 3){
            System.out.println("Masukkan Nama Mahasiswa ke-"+(i+1)+" ");
            MyName = key1.nextLine();
            nama[i] = MyName;
            System.out.println("Masukkan Umur Mahasiswa ke-"+(i+1)+" ");
            MyUmur = key2.nextInt();
            umur[i] = MyUmur;
            System.out.println();
            i++;
        }
        System.out.println("Data yang sudah dimasukkan adalah : ");
        i = 0;
        while (i <= 3){
            System.out.println(" ");
            System.out.println("Nama Mahasiswa ke-"+(i+1)+" "+nama[i]);
            System.out.println("Umur Mahasiswa ke-"+(i+1)+" "+umur[i]);
            i++;
        }
    }
}