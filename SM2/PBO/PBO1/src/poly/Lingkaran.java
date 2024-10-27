/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly;

/**
 *
 * @author santo
 */
public class Lingkaran extends BangunDatar{
    int r;
    
    public Lingkaran(int r){
        this.r = r;
    }
    
    public float luas(){
        return (float) (Math.PI * r * r);
    }
    
    public float keliling(){
        return (float) (2 * Math.PI * r);
    }
}
