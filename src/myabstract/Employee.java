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
public abstract class Employee {
    private String firstName;
    private String lastName;
    private int employeeNum;
    private String address;

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public abstract String getEmployeeInformation();
    
}
