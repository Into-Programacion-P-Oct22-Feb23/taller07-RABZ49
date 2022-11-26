/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.problema03;

/**
 *
 * @author roberto
 */
public class Problema03 {

    public static void main(String[] args) {
        int suma = 3;
        int control = 2;
        int contador = 1;
        do {
            System.out.println(control);
            control = control + suma;
            suma = suma + 2;
            contador = contador + 1;
        } while (contador <= 6);
        {
        }

    }

}
