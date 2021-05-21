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

                // Pruebas para el problema 1
                System.out.println("\nPrimer problema: L = {1,0} Cadena de 1s y 0s alternos");
                Problem1 problema1 = new Problem1(cadena);
                System.out.println("La cadena: "+problema1.getUseString()+" "+problema1.parseString(cadena, problema1.getFirstChar()));

                // Pruebas para el problema 2
                System.out.println("\nSegundo problema: L = {a,b,c} Cadena con al menos una a y al menos una b");
                Abc problema2 = new Abc(cadena);
                System.out.println("La cadena: "+problema2.texto+" "+problema2.esValida());

                // Pruebas para el problema 3
                System.out.println("\nTercer problema: L = {1,0} Cadena con igual cantidad de 1s y 0s en cualquier orden");
                TercerProblema tercerProblema = new TercerProblema();
                tercerProblema.resolverTercerProblema(cadena);

                // Pruebas para el problema 4
                System.out.println("\nCuarto problema: L = {1,0} Cadenas que terminan con 101");
                Problem4 problema4 = new Problem4(cadena);
                System.out.println("La cadena: "+problema4.getString()+" "+problema4.parseString(problema4.getString()));

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
