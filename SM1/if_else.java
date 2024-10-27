import java.util.Scanner;
public class if_else {
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        Scanner keypwd = new Scanner(System.in);

        System.out.println("Masukkan nilai : ");
        int angka = key.nextInt();

        System.out.println("Masukkan password : ");
        String pwd = keypwd.nextLine();

        // if dengan else
        if(angka>=10){
            System.out.println("Nilai yang diinput lebih besar atau sama dengan 10");
        }
        else{
            System.out.println("Nilai lebih kecil dari pada 10");
        }

        // if tanpa else
        if(angka==100){
            System.out.println("Nilai yang diinput sama dengan seratus");
        }

        if((pwd.equals("passwordku")) && (angka==100)){
            System.out.println("Password yang anda input benar");
        }
        else{
            System.out.println("password yang anda input salah");
        }

    }
}