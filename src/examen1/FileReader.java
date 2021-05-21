package examen1;

import java.io.BufferedReader;
import java.io.File;

/**
 *
 * @author Nahin Buezo, Alejandro Valladares
 */
public class FileReader {
    public FileReader(){}

    public void readFile (String ruta) {
        File archivo = null;
        java.io.FileReader fr = null;
        BufferedReader br = null;
        try {
            try {
                // Apertura del fichero y creacion de BufferedReader para poder
                // hacer una lectura comoda (disponer del metodo readLine()).
                archivo = new File(ruta);
                fr = new java.io.FileReader(archivo);
                br = new BufferedReader(fr);
                // Lectura del fichero
                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.println("\nLa cadena a evaular es: \"" + Colores.TEXT_CYAN +  linea + Colores.TEXT_RESET + "\"");

                    // Pruebas para el problema 1
                    System.out.println("\nPrimer problema: L = {1,0} Cadena de 1s y 0s alternos");
                    Problem1 problema1 = new Problem1(linea);
                    System.out.println("La cadena: "+problema1.getUseString()+" "+problema1.parseString(linea, problema1.getFirstChar()));

                    // Pruebas para el problema 2
                    System.out.println("\nSegundo problema: L = {a,b,c} Cadena con al menos una a y al menos una b");
                    Problem2 problem2 = new Problem2(linea);
                    System.out.println("La cadena: "+ problem2.texto+" "+ problem2.esValida());

                    // Pruebas para el problema 3
                    System.out.println("\nTercer problema: L = {1,0} Cadena con igual cantidad de 1s y 0s en cualquier orden");
                    Problem3 problem3 = new Problem3(linea);
                    System.out.println("La cadena: " + linea + " " + problem3.resolverTercerProblema());

                    // Pruebas para el problema 4
                    System.out.println("\nCuarto problema: L = {1,0} Cadenas que terminan con 101");
                    Problem4 problema4 = new Problem4(linea);
                    System.out.println("La cadena: "+problema4.getString()+" "+problema4.parseString(problema4.getString()));
                    System.out.println("            =====================            ");
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (null != fr) {
                        fr.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
