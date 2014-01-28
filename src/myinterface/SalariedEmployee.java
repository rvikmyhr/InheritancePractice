/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myinterface;

/**
 *
 * @author Ron
 */
public class SalariedEmployee implements Employee {
    private String firstName;
    private String lastName;
    private int employeeNum;
    private double annualPay;
    
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
    
    @Override
    public void setEmployeeNum(int employeeNum){
        this.employeeNum = employeeNum;
    }
}
