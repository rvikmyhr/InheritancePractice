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
        HourlyEmployee person1 = new HourlyEmployee();

        person1.setFirstName("John");
        person1.setLastName("Doe");
        person1.setEmployeeNum(123456);
        person1.setHourlyPay(12);
        person1.setHoursWorked(4);
        
        System.out.println(person1.getEmpInfo());
        System.out.println(person1.calcPayCheckAmount());
        
        SalaryPlusCommissionEmployee person2 = new SalaryPlusCommissionEmployee();
        
        person2.setFirstName("Dave");
        person2.setLastName("Smith");
        person2.setEmployeeNum(654321);
        person2.setAnnualSalary(40000);
        person2.setCommissionEarned(500);
        
        System.out.println(person2.getEmpInfo());
        System.out.println(person2.calcPayCheckAmount());
        
    }
}
