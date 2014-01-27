/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myabstract;

/**
 *
 * @author Ron
 */
public abstract class SalariedEmployee {
    private double annualSalary;

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    
    public abstract double getPayCheckTotal();
}
