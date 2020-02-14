/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1salarycalculator;


/**
 *
 * @author gubotdev
 */
public class SalaryCalculator {

    private int hoursInWeek = 40;
    private int weeksInYear = 52;

    public SalaryCalculator(){   
        
    }
    
    public void getSalary(double hourlyWage){
        double salary = (double)(hourlyWage*hoursInWeek*weeksInYear);
        System.out.printf("For an hourly wage of $" + hourlyWage + " your salary is $%.2f ", salary);
    }

    public void getHourlyWage(double salary){
        
    }

    public void calcYearlyTaxes(double taxPercentage, double salary){
        
    }

    public void monthlyAfterTax(double taxPercentage, double salary){
        
    }

    public static void main(String[] args) {
        SalaryCalculator testCalc = new SalaryCalculator();
        testCalc.getSalary(34);
             
    }
    
}
