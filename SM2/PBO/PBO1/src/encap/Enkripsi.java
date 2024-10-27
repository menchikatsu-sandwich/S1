/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encap;

import java.util.Base64;

public class Enkripsi {
    // Metode untuk mengenkripsi string
    public static String enkripsi(String data) {
        return Base64.getEncoder().encodeToString(data.getBytes());
    }

    // Metode untuk mendekripsi string
    public static String dekripsi(String data) {
        return new String(Base64.getDecoder().decode(data));
    }
}
