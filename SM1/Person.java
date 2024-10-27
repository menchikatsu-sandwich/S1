package record;
import java.util.Scanner;

public class Person {
    public static record PersonRecord(
            String nama,
            int age,
            String hobby,
            String status) {
    }

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        PersonRecord[] person = new PersonRecord[3];

        for (int i = 0; i < person.length; i++) {
            System.out.print("Masukkan nama: ");
            String nama = key.next();
            System.out.print("Masukkan usia: ");
            int age = key.nextInt();
            System.out.print("Masukkan hobi: ");
            String hobby = key.next();
            System.out.print("Masukkan status: ");
            String status = key.next();

            person[i] = new PersonRecord(nama, age, hobby, status);
        }

        System.out.println("\nData Person:");
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].nama + " " + person[i].age + " " + person[i].hobby + " " + person[i].status);
        }

        key.close();
    }
}
