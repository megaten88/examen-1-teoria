package examen1;

import java.util.Scanner;

/**
 *
 * @author Alejandro Valladares
 */
public class TercerProblema {
    void resolverTercerProblema(String cadena) {
        System.out.println("\nTercer problema: L = {1,0} Cadena con igual cantidad de 1s y 0s en cualquier orden");

        int oneCounter = 0;
        int zeroCounter = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) == ' ') {
                System.out.println("Se detectaron espacios, pero fueron ignorados...");
            }
            else if(cadena.charAt(i) != '1' && cadena.charAt(i) != '0') {
                System.out.println("El caracter \"" +  cadena.charAt(i) + "\" en la posición " + ++i + " no está permitido! Solo se permiten 1s y 0s.");
                System.out.println(Colores.TEXT_RED + "Cadena rechazada\n" + Colores.TEXT_RESET);
                return;
            }
            else if(cadena.charAt(i) == '1'){
                oneCounter++;
            }
            else if(cadena.charAt(i) == '0'){
                zeroCounter++;
            }
        }

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
