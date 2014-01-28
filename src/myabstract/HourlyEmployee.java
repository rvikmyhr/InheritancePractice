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
public class HourlyEmployee extends Employee {
    private double hourlyPay;
    private double hoursWorked;
    
    public void setHourlyPay(double hourlyPay){
        this.hourlyPay = hourlyPay;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
 
    @Override
    public double calcPayCheckAmount(){
        return hourlyPay * hoursWorked;
    }

}
