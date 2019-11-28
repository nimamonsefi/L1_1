/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nimamonsefi
 */
public class Person {
    private double income,instalment;

    public void setIncome(double income) {
        this.income = income;
    }

    public void setInstalment(double instalment) {
        this.instalment = instalment;
    }
    
    public double takeHomePay(){
        return income-instalment; 
    }
    
}
