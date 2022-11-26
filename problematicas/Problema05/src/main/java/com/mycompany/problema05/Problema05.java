/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.problema05;

/**
 *
 * @author roberto
 */
public class Problema05 {

    public static void main(String[] args) {
        int dato1 = 1;
        int contador = 1;
        int contador2 = 1;
        String mensaje = "";
        do {
            if (contador % 2 == 0) {
                mensaje = String.format("%s +%s/%s", mensaje,
                        dato1, contador2);

            } else {
                mensaje = String.format("%s -%s/%s", mensaje,
                        dato1, contador2);
            }
            contador = contador + 1;
            contador2 = contador2 + 2;
        } while (contador2 <= 15);
        {

        }
        System.out.printf("%s %s", dato1,mensaje);
    }

}
