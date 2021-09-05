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
public class MainCalc {

    private double result;
    private double firstNumber;
    private double secondNumber;
    private char symbol;
    private boolean checkValidity = true;

    public MainCalc(double first, double second) {
        this.firstNumber = first;
        this.secondNumber = second;
    }

    public boolean isCheckValidity() {
        return checkValidity;
    }

    public void setCheckValidity(boolean checkValidity) {
        this.checkValidity = checkValidity;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getResult() {
        return result;
    }

    public char getSymbol() {
        return this.symbol;
    }
    public void setSymbol(char symbol){
        this.symbol = symbol;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

}
