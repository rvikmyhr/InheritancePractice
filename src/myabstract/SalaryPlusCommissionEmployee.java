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
public class SalaryPlusCommissionEmployee extends SalariedEmployee {
    
    private double commissionEarned;

    public void setCommissionEarned(double commissionEarned) {
        this.commissionEarned = commissionEarned;
    }

    public double getCommissionEarned() {
        return commissionEarned;
    }
    
    @Override
    public double calcWeeklyPay(){
        return (getAnnualSalary() / 52.1775) + commissionEarned;
    }
}
