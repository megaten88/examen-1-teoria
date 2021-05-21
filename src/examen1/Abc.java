/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;
​
/**
 *
 * @author Nahin
 */
public class abc {
​
    String texto;
​
    public abc(String cadena) {
        texto = cadena.replace(" ", "");
    }
​
    public String esValida() {
        String valida = "";
        if (alfabetico()) {
            int count_a = 0;
            int count_b = 0;
            int count_intruso = 0;
            for (int i = 0; i < texto.length(); i++) {
                char c = texto.charAt(i);
                if (c == 'a') {
                    count_a++;
                }
                if (c == 'b') {
                    count_b++;
                }
                if (c != 'a' && c != 'b' && c != 'c') {
                    count_intruso++;
                }
            }
            if (count_intruso > 0) {
                valida = "\u001B[31mNo es valida, solo se permiten abc";
            } else {
                if (count_a > 0 && count_b > 0) {
                    valida = "\033[34mEs valida";
                } else {
                    valida = "\u001B[31mNo es valida";
                }
            }
​
        } else {
            valida = "\u001B[31mNo es valida";
        }
        return valida;
    }
​
    public void setTexto(String nuevo_texto) {
        this.texto = nuevo_texto;
    }
​
    public boolean alfabetico() {
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            // Si no está entre a y z, ni entre A y Z, ni es un espacio
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
                return false;
            }
        }
        return true;
    }
}