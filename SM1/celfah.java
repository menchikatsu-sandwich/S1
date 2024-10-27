import java.util.Scanner;

public class celfah {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Masukkan suhu dalam Celcius: ");
    double celcius = scanner.nextDouble();
    
    double fahrenheit = (celcius * 9/5) + 32;
    System.out.println(celcius + " derajat Celcius sama dengan " + fahrenheit + " derajat Fahrenheit.");
    }
}
