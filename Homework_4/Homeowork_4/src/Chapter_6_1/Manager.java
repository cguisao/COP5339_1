/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_6_1;

/**
 *
 * @author Carlos Guisao
 */
public class Manager extends TemplateEmployee {
   
    @Override
    public void addEmployee(String Name, String LastName) {
        name = Name;
        lastName = LastName;
    }

    @Override
    public void addSalary(int Salary) {
        salary = Salary;
    }

    @Override
    public void addBonus(int Bonus) {
        bonus = Bonus;
    }

    @Override
    public String toString() {
        return ("Manager Information \n" + 
                "Full Name: " + name + " " + lastName + "\n" +
                "Salary: " + getSalary() + "\n");
    }

    @Override
    public int getSalary() {
        return salary + bonus;
    }
}
