/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.concrete;

/**
 *
 * @author Ron
 */
public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean overtimeQualified;
    private boolean commissionQualified;

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public boolean isOvertimeQualified() {
        return overtimeQualified;
    }

    public void setOvertimeQualified(boolean overtimeQualified) {
        this.overtimeQualified = overtimeQualified;
    }

    public boolean isCommissionQualified() {
        return commissionQualified;
    }

    public void setCommissionQualified(boolean commissionQualified) {
        this.commissionQualified = commissionQualified;
    }
    
    
}
