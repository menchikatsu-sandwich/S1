import java.util.Scanner;

public class myswitch {

    public static void main(String[] args){
        Scanner key_input = new Scanner (System.in);
        System.out.println("Inputkan angka (1-7) : ");
        int angka = 0;
        angka = key_input.nextInt();
        System.out.println("==================================");

            switch (angka) {
            case 1:
            System.out.println("Senin");
            break;
            case 2:
            System.out.println("Selasa");
            break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
            System.out.println("Jumat");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7:
                System.out.println("Minggu");
                break;
        }
    }
}
// Outputs "Thursday" (day 4)