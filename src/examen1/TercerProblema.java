package examen1;

import java.util.Scanner;

public class TercerProblema {
    void resolverTercerProblema() {
        System.out.println("Tercer problema: Cadena con igual cantidad de 1s y 0s en cualquier orden");
        Scanner scanner = new Scanner(System.in);
        String cadena;

        do {
            System.out.print("Ingrese una cadena: ");
            cadena = scanner.nextLine();
        } while(cadena.length() == 0);

        int oneCounter = 0;
        int zeroCounter = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) == ' ') {
                System.out.println("Se detectaron espacios, pero fueron ignorados...");
            }
            else if(cadena.charAt(i) != '1' && cadena.charAt(i) != '0') {
                System.out.println("El caracter \"" +  cadena.charAt(i) + "\" en la posición " + ++i + " no está permitido! Solo se permiten 1s y 0s.");
                System.out.println("Saliendo...");
                return;
            }
            else if(cadena.charAt(i) == '1'){
                oneCounter++;
            }
            else if(cadena.charAt(i) == '0'){
                zeroCounter++;
            }
        }
        System.out.println("La cadena ingresada es: \"" + cadena + "\"");
        System.out.println("La cantidad de 1s es: " + oneCounter);
        System.out.println("La cantidad de 0s es: " + zeroCounter);

        if(oneCounter == zeroCounter){
            System.out.println(Colores.TEXT_GREEN + "Cadena aceptada\n" + Colores.TEXT_RESET);
        }
        else {
            System.out.println(Colores.TEXT_RED + "Cadena rechazada\n" + Colores.TEXT_RESET);
        }
    }
}
