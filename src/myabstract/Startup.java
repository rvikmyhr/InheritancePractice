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
public class Startup {
    public static void main(String[] args) {
        my.concrete.HourlyEmployee person1 = new my.concrete.HourlyEmployee();

        person1.setFirstName("John");
        person1.setLastName("Doe");
        person1.setEmployeeNum(123456);
        
        System.out.println(person1.getFirstName());
        System.out.println(person1.getLastName());
        System.out.println(person1.getEmployeeNum());
        
        my.concrete.SalaryPlusCommissionEmployee person2 = new my.concrete.SalaryPlusCommissionEmployee();
        
        person2.setFirstName("Dave");
        person2.setLastName("Smith");
        person2.setEmployeeNum(654321);
        person2.setAnnualSalary(40000);
        person2.setCommissionPercentage(0.1);
        
        System.out.println(person2.getFirstName());
        System.out.println(person2.getLastName());
        System.out.println(person2.getEmployeeNum());
        System.out.println(person2.getAnnualSalary());
        System.out.println(person2.getCommissionPercentage());
    }
}
