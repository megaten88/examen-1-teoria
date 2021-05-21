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
                // Apertura del fichero y creacion de BufferedReader para poder
                // hacer una lectura comoda (disponer del metodo readLine()).
                archivo = new File("./src/examen1/texto.txt");
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);

                // Lectura del fichero
                String linea;
                while ((linea = br.readLine()) != null) {
                    texto2+=linea;
                }
                
                // Pruebas para el problema 1                
                Problem1 problema1 = new Problem1(texto);
                System.out.println("\u001B[30mLa cadena: "+problema1.getUseString()+" "+problema1.parseString(texto, problema1.getFirstChar()));
                
                // Pruebas para el problema 2
                Abc problema2 = new Abc(texto);
                System.out.println("La cadena: "+problema2.texto+" "+problema2.esValida());              
                problema2.setTexto(texto2);
                System.out.println("\u001B[30mLa cadena: "+problema2.texto+" "+problema2.esValida());
                
                // Pruebas para el problema 4
                Problem4 problema4 = new Problem4(texto);
                System.out.println("\u001B[30mLa cadena: "+problema4.getString()+" "+problema4.parseString(problema4.getString()));
                
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