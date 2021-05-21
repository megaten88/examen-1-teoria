/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

/**
 *
 * @author megaten
 */
public class Problem4 {
    
    private String string;
    
    public Problem4(String receive){
        this.string = receive;
    }
    
    public String getString(){
        return this.string;
    }
    
    public String parseString(String validate){
        String valid = Colores.TEXT_GREEN +  "Es válida" + Colores.TEXT_RESET;
         if(validate.length() == 3){
             if(validate.equals("101")){
                 valid = Colores.TEXT_GREEN +  "Es válida" + Colores.TEXT_RESET;
             }else{
                 valid = Colores.TEXT_RED +  "No es válida, no termina en 101" + Colores.TEXT_RESET;
             }
           return valid;
       }else{
           char initial = validate.charAt(0);
           if(initial=='1'|| initial == '0'){
               return parseString(validate.substring(1));
           }else{
               valid = Colores.TEXT_RED +  "No es válida" + Colores.TEXT_RESET;
               return valid;
           }
        }
    }
}
