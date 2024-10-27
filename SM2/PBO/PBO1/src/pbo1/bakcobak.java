/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo1;

/**
 *
 * @author santo
 */
public class bakcobak {
    public static void main(String[] args) {
        int num = 20;
        int sum = 0;
        
        do {
            if (num % 2 == 0){
                sum += num;
            }
            num--;
        } while (num >= 0);
        
        System.out.println(sum);
    }
}
