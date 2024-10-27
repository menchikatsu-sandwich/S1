import java.util.Random;
import java .util.Scanner;
public class suit {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String[] pilihan = {"Batu","kertas","gunting"};

        while (true) {
            System.out.println("Pilih 1 (batu) 2 (kertas) 3 (gunting) 4 (keluar)");
            System.out.print("masukan pilihan anda (1/2/3/4):");
            int Pilihanpengguna = input.nextInt();

            if(Pilihanpengguna < 1 || Pilihanpengguna > 4){
                System.out.println("tidak valid silahkan pilih 1/2/3");
                continue;
            }

            if (Pilihanpengguna == 4){
                System.out.println("keluar dari permainan");
                break;
            }

            int PilihanKomputer = random.nextInt(3);

            System.out.println("anda memilih"+pilihan[Pilihanpengguna -1]);
            System.out.println("komputer memilih"+pilihan[PilihanKomputer]);

            if (Pilihanpengguna == PilihanKomputer + 1 || (Pilihanpengguna == 1 && PilihanKomputer == 2)){
                System.out.println("KAMU KALAH");
            } else if (Pilihanpengguna == PilihanKomputer || (Pilihanpengguna == 3 && PilihanKomputer == 0)){
                System.out.println("seri");
            } else {
                System.out.println("KAMU MENANG");
            }
        }
        input.close();
    }
}