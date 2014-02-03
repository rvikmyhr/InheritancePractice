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
    private double hoursWorkedWeekly;
    
    public void setHourlyPay(double hourlyPay){
        this.hourlyPay = hourlyPay;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public double getHoursWorkedWeekly() {
        return hoursWorkedWeekly;
    }

    public void setHoursWorkedWeekly(double hoursWorkedWeekly) {
        this.hoursWorkedWeekly = hoursWorkedWeekly;
    }
    
 
    @Override
    public double calcWeeklyPay(){
        return hourlyPay * hoursWorkedWeekly;
    }

}
