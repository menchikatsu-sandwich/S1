import java.util.Scanner;

public class LKpersegi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan panjang persegi panjang:");
        double panjang = scanner.nextDouble();
        
        System.out.println("Masukkan lebar persegi panjang:");
        double lebar = scanner.nextDouble();
        
        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);
        
        System.out.println("Luas persegi panjang adalah: " + luas);
        System.out.println("Keliling persegi panjang adalah: " + keliling);
    }
}

