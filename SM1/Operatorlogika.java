public class Operatorlogika{
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Menggunakan operator AND (&&)
        boolean resultAnd = a && b;
        System.out.println("a AND b = " + resultAnd);
        // hasilnya akan false karena salah satu opertaornya (b) adalah false

        // Menggunakan operator OR (||)
        boolean resultOr = a || b;
        System.out.println("a OR b = " + resultOr);
        // Hasilnya akan true karena satu operatornya (a) adalah true

        // Menggunakan operator NOT (!)
        booleaan resultNotA = !a
        System.out.println("NOT a = " + resultNotA);
        // Hasilnya akan false karena a adalah true
    }
}
