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
public abstract class TemplateEmployee {
    
    protected String name;
    protected String lastName;
    protected int salary;
    protected int bonus;
    
    public final void createEmployee()
    {
        addEmployee(name, lastName);
        addSalary(salary);
        addBonus(bonus);
        toString();
        getSalary();
    }
    public abstract void addEmployee(String name, String lastName);
    public abstract void addSalary(int salary);
    public abstract void addBonus(int bonus);
    public abstract int getSalary();
    public abstract String toString();
}
