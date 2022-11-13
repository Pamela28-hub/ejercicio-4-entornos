/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cosasmias;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author PAMELA GARCIA
 */
public class Consola {

    public static String lligText() throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in)); // el lector és el teclat
        return lector.readLine(); // llig el text del teclat
    }

    public static int lligEnter() throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        boolean incorrecte = true;
        do {
            try {
                int valor = Integer.parseInt(lector.readLine()); // transforma el text a enter
                return valor; // retorna l'enter resultant de la transformació
            } catch (NumberFormatException ex) { // la transformació falla i s'agafa l'excepció
            }
        } while (incorrecte); // es repeteix mentre la transformació falla
        return -1;
        
    /**
     * lee un entero de teclado. el proceso de lectura se repite mientras el valor no sea un entero
     * @return el número leído
     * @lanza IOException
     */
    }

}
