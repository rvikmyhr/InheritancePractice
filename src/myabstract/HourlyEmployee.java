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
public abstract class HourlyEmployee {
    private double hourlyPay;
    
    public void setHourlyPay(double hourlyPay){
        this.hourlyPay = hourlyPay;
    }
    
    public abstract double getTotalWage();
}
