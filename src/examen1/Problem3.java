package examen1;

/**
 *
 * @author Alejandro Valladares
 */
public class Problem3 {
    private String cadena;
    public Problem3(String cadena){
        this.cadena = cadena;
    }

    public String resolverTercerProblema() {
        int oneCounter = 0;
        int zeroCounter = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) == ' ') {
                System.out.println("Se detectaron espacios, pero fueron ignorados...");
            }
            else if(cadena.charAt(i) != '1' && cadena.charAt(i) != '0') {
                System.out.println("El caracter \"" +  cadena.charAt(i) + "\" en la posición " + ++i + " no está permitido! Solo se permiten 1s y 0s.");
                return Colores.TEXT_RED + "No Es válida" + Colores.TEXT_RESET;
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
            return Colores.TEXT_GREEN + "Es válida" + Colores.TEXT_RESET;
        }
        else {
            return Colores.TEXT_RED + "No Es válida" + Colores.TEXT_RESET;
        }
    }
}
