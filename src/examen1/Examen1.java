/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;
​
import java.util.Scanner;
import java.io.*;
​
/**
 *
 * @author Alejandro Valladares, Mayra Salazar, Nahin Buezo
 */
public class Examen1 {
​
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
                // Apertura del fichero y creacion de BufferedReader para poder
                // hacer una lectura comoda (disponer del metodo readLine()).
                archivo = new File("C:\\texto.txt");
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);
​
                // Lectura del fichero
                String linea;
                while ((linea = br.readLine()) != null) {
                    texto2+=linea;
                }
                abc ejercicio6 = new abc(texto);
                System.out.println("La cadena: "+ejercicio6.texto+" "+ejercicio6.esValida());
                
                ejercicio6.setTexto(texto2);
                System.out.println("\u001B[30mLa cadena: "+ejercicio6.texto+" "+ejercicio6.esValida());
                
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
​
        } catch (Exception e) {
            e.printStackTrace();
        }
​
    }
​
}