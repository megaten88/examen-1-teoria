package examen1;

import java.io.BufferedReader;
import java.io.File;

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
                    texto2+=linea;
                    System.out.println("La cadena a evaular es: \"" + texto2 + "\"");
                    TercerProblema tp = new TercerProblema();
                    tp.resolverTercerProblema(texto2);

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
