/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.util.Scanner;

/**
 *
 * @author Alejandro Valladares, Mayra Salazar, Nahin Buezo
 */
public class Examen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String cadena;
        Scanner opcionScanner = new Scanner(System.in);
        FileReader fr = new FileReader();
        char opcion;

        while(true) {
            System.out.println("---------- Menú ----------");
            System.out.println("1. Ingresar una cadena desde el teclado");
            System.out.println("2. Leer desde archivo \"cadena.txt\"");
            System.out.println("q. Salir");
            System.out.print("Ingresa una opción el menú: ");
            opcion = opcionScanner.next().charAt(0);

            if(opcion=='1'){
                do {
                    System.out.print("Ingrese una cadena: ");
                    cadena = teclado.nextLine();
                } while(cadena.length() == 0);
                System.out.println("\nLa cadena ingresada es: \"" + cadena + "\"");

                TercerProblema tp = new TercerProblema();
                tp.resolverTercerProblema(cadena);

            }else if (opcion=='2'){
                fr.readFile("./src/cadena.txt");
            }else if (opcion=='q') {
                System.out.println("Saliendo...");
                return;
            } else {
                System.out.println("Opción inválida\n");
            }
        }

    }
}
