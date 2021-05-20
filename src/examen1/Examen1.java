/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Alejandro Valladares, Mayra Salazar, Nahin Buezo
 */
public class Examen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String texto;
        String texto2="";
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            System.out.println("Ingrese el texto: ");
            texto = teclado.nextLine();
            try {
                archivo = new File("C:\\texto.txt");
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);
                String linea;
                while ((linea = br.readLine()) != null) {
                    texto2+=linea;
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
             System.out.println(texto);
              System.out.println(texto2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
