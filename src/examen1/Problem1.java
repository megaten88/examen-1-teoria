/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

/**
 *
 * @author Mayra Salazar
 */
public class Problem1 {
    private char firstChar;
    private String useString;
    public Problem1(String receiveString){
        //get the first char to validate
        this.firstChar = receiveString.charAt(0);
        this.useString = receiveString;
        
    }
    
    public char getFirstChar(){
        return this.firstChar;
    }
    public String getUseString(){
        return this.useString;
    }

    public String parseString(String string, char validate){
       String valid = "\033[34mEs válida";
       if(string.length() == 0){
           return valid;
       }else{
           // Comparisons with the validation character
           char initial = string.charAt(0);
           if(initial=='1'&& initial==validate){
               return parseString(string.substring(1),'0');
           }else if(initial == '0'&& initial==validate){
               return parseString(string.substring(1),'1');
           }else{
               valid = "\u001B[31mNo es válida";
               return valid;
           }
       }
        
    };
    
}
