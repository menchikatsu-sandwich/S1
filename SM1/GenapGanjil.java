import java.util.Scanner;
public class GenapGanjil {
    public static void main(String[] args){

        Scanner key = new Scanner(System.in);
    
        System.out.println("Masukkan Nilai : ");
        int angka = key.nextInt();
    
        int sisa = angka % 2;
        
        if(sisa==1){
            System.out.println("Nilai "+angka+" termasuk bilangan ganjil");
        }
    
        else{
            System.out.println("Nilai "+angka+" termasuk bilangan genap");
        }
    }
}
