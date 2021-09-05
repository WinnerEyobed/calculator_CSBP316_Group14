/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author eyobed
 */
public class Destinguisher {
    private boolean validity;
    private double value;
    private String errorMessage = "";
    
    public Destinguisher(String strValue){
        validity = checkDouble(strValue);
        if(validity){
            this.value = Double.parseDouble(strValue);
        }
        else{
            errorMessage = "incorrect numbering, please correct the number(s)";
        }
        
    }

    public boolean isValid() {
        return validity;
    }

    public double getValue() {
        return value;
    }
    
    
    
    public boolean checkDouble(String strValue){
        int initial = (int)'0', finalNum = (int)'9', dot = (int)'.';
        int countDot = 0;
        for(int i = 0; i < strValue.length(); i++){
            if(strValue.charAt(i) == '.')
                countDot++;
            if(((int)strValue.charAt(i) < initial || (int)strValue.charAt(i) > finalNum) && ((int)strValue.charAt(i) != dot) || (int)strValue.charAt(i) == dot && countDot >1)
                return false;
        }
        return true;
    }
}
