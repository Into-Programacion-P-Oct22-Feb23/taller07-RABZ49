/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author roberto
 */
public class Problema01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String mensaje2 = "";
        String mensaje = "";
        String nombreJugador;
        String posicionCampo;

        int edad;
        boolean bandera = true;
        String salir;
        int sumaEdades = 0;
        int ejecuciones = 0;
        double estatura;
        double sumaEstatura = 0;
        double promedioEdad;
        double promedioEstatura;
        mensaje = String.format("%s%s\n", mensaje,
                "Listado de Jugadores");
        mensaje2 = String.format("%s%s\n", mensaje2,
                "Listado de edades:");

        do {
            System.out.println("Ingrese el nombre del Jugador: ");
            nombreJugador = entrada.nextLine();
            System.out.println("Ingrese la posición en el campo: ");
            posicionCampo = entrada.nextLine();
            System.out.println("Ingrese la edad del Jugador: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del Jugador: ");
            estatura = entrada.nextDouble();
            sumaEstatura = sumaEstatura + estatura;
            sumaEdades = sumaEdades + edad;
            mensaje2 = String.format("%s %s\n", mensaje2, edad);
            ejecuciones = ejecuciones + 1;
            mensaje = String.format("%s%d.) %s -%s-, edad %d\n",
                    mensaje, ejecuciones, nombreJugador,
                    posicionCampo, edad);
            entrada.nextLine();
            System.out.println("Ingrese s para terminar : ");
            salir = entrada.nextLine();
            if (salir.equals("s")) {
                bandera = false;
            }
        } while (bandera);
        promedioEdad = (double) sumaEdades / ejecuciones;
        promedioEstatura = (double) sumaEstatura / ejecuciones;
        mensaje = String.format("""
                                %s
                                %s
                                Promedio de edades: %.2s
                                 Promedio de estatura:%.2s""",
                mensaje, mensaje2, promedioEdad,
                promedioEstatura);

        System.out.printf("%s\n", mensaje);

    }
}
