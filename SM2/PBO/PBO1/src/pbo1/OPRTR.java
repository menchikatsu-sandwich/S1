/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo1;

/**
 *
 * @author santo
 */
public class OPRTR {
    public static void main(String[] args) {
        OPRTR segi3 = new OPRTR();
            segi3.segitiga();
            
        System.out.println("");
            
        OPRTR pngr = new OPRTR();
            pngr.pengurang();
            
        System.out.println("");
        
        OPRTR bdg = new OPRTR();
            bdg.banding();
            
        System.out.println("");
        
        OPRTR btws = new OPRTR();
            btws.bitwise();
    }
    
static void segitiga(){
    int a = 12;
    int t = 24;
    double Ls = (a * t)/2;
    System.out.println("Luas Segitiga");
    System.out.println("Alas segitiga: " + a);
    System.out.println("Tinggi segitiga: " + t);
    System.out.println("Luas Segitiga: " + Ls);
    }

static void pengurang(){
    int s = 2;
    int p = 1;
    double bj = s - p;
    System.out.println("Pengurangan");
    System.out.println("Andi memiliki 2 biji, karna sebuah hal biji Andi hilang 1. Berapa jumlah biji yang dimiliki Andi?");
    System.out.println("Jawab: 2 - 1 = " + bj);
    }

static void banding(){
    int a=9, b=9;
    boolean c = true;
    boolean d = true;
    System.out.println("Operator Relasional");
    System.out.println("A == B = " + (a == b));
    System.out.println("A != B = " + (a != b));
    System.out.println("A > B = " + (a > b));
    System.out.println("Operator Logika");
    System.out.println("C && D = " + (c && d));
    System.out.println("C || D = " + (c || d));
    System.out.println("!(C && D) = " + !(c && d));
    }
static void bitwise(){
    int w = 1;
    int x = 0;
    System.out.println("Operator Bitwise");
    System.out.println("" + w + " & " + x + " = " + (w & x));
    System.out.println("" + w + " | " + x + " = " + (w | x));
    System.out.println("" + w + " ^ " + x + " = " + (w ^ x));
    }
}
