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
    
}
