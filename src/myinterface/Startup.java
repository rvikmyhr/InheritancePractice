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
public class Startup {
    public static void main(String[] args) {
        
    HourlyEmployee person3 = new HourlyEmployee();
    person3.setFirstName("Bob");
    person3.setLastName("Jones");
    person3.setHourlyPay(20);
    SalaryPlusCommissionEmployee person4 = new SalaryPlusCommissionEmployee();
    person4.setFirstName("Beth");
    person4.setLastName("Brown");
    person4.setCommissionPercentage(.06);
    
    System.out.println(person3.getFirstName());
    System.out.println(person3.getLastName());
    System.out.println(person3.getHourlyPay());
    
    System.out.println(person4.getFirstName());
    System.out.println(person4.getLastName());
    System.out.println(person4.getCommissionPercentage());
    
    }
}
