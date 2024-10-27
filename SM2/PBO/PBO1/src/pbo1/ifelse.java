package pbo1;
import java.util.Scanner;
/**
 *
 * @author santo
 */
public class ifelse{
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);

        System.out.println("Masukkan nilai : ");
        int angka = key.nextInt();

        // if dengan else
        if(angka>=10){
            System.out.println("Nilai yang diinput lebih besar atau sama dengan 10");
        } else {
            System.out.println("Nilai kurang dari 10");
        }
    }
}