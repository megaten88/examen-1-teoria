package examen1;

import java.io.BufferedReader;
import java.io.File;

/**
 *
 * @author Nahin Buezo, Alejandro Valladares
 */
public class FileReader {
    void readFile (String ruta) {
        String texto2="";
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
                    System.out.println("\nLa cadena a evaular es: \"" + linea + "\"");
                    Abc segundoProblema = new Abc(linea);
                    System.out.println(segundoProblema.esValida());
                    TercerProblema tp = new TercerProblema();
                    tp.resolverTercerProblema(linea);
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
