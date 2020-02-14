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
        System.out.println();
    }

    public void getHourlyWage(double salary){
        double hourlyWage = (double)(salary/(hoursInWeek*weeksInYear));
        System.out.printf("For a salary of $" + salary + " your hourly wage is $%.2f ", hourlyWage);
        System.out.println();
    }

    public void calcYearlyTaxes(double taxPercentage, double salary){
        double yearlyTax = (double)((taxPercentage*salary)/(100.0));
        System.out.printf("For a salary of $" + salary + " and tax of " + taxPercentage + " percent your yearly tax is $%.2f ", yearlyTax);
        System.out.println();
    }

    public void monthlyAfterTax(double taxPercentage, double salary){
        double monthAfterTax = (double)(((100.0-taxPercentage)*salary)/(100.0 * 12.0));
        System.out.printf("For a salary of $" + salary + " and tax of " + taxPercentage + " percent your monthly salary after tax is $%.2f ", monthAfterTax);
        System.out.println();
    }

    public static void main(String[] args) {
        SalaryCalculator testCalc = new SalaryCalculator();
        testCalc.getSalary(34);
        testCalc.getHourlyWage(167000);
        testCalc.calcYearlyTaxes(20, 200000);
        testCalc.monthlyAfterTax(20, 200000);
             
    }
    
}
