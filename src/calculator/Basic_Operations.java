/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author eyobed
 */
public class Basic_Operations extends MainCalc {
   
   
    public Basic_Operations(double first, double second){
        super(first, second);
    }
    
    public void divide(){
        if(this.getSecondNumber() != 0){
            this.setResult(this.getFirstNumber()/this.getSecondNumber());
        }
        else{
            this.setCheckValidity(false);
        }
    }
    
    public void add(){
        this.setResult(this.getFirstNumber() + this.getSecondNumber());
    }
    
    public void subtract(){
        this.setResult(this.getFirstNumber() - this.getSecondNumber());
    }
    
    public void multiply(){
        this.setResult(this.getFirstNumber() * this.getSecondNumber());

    }
    
    public void calculate(){
        
        if(this.getSymbol() == '+'){
            this.add();
        }
        if(this.getSymbol() == '-'){
            this.subtract();
        }
        if(this.getSymbol() == '*'){
            this.multiply();
        }
        if(this.getSymbol() == '/')
            this.divide();
    }
 

    
}
