/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.problema02;

/**
 *
 * @author roberto
 */
public class Problema02 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int suma = 4;
        int control = 2;
        int contador = 1;
        while (contador <= 10) {
            System.out.println(control);
            control = control + suma;
            suma = suma + 2;
            contador = contador + 1;
        }

    }

}
