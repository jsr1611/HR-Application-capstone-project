package hrapp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author opc
 */
public class Employee {
    private int ID;
    private String name;
    private double salary;
    public Employee(){}
    public Employee(int eId, String eName, double eSalary){
        ID = eId;
        name = eName;
        salary = eSalary;
    }
    
    @Override
    public String toString(){
        return  "Employee: " + ID + " " +  name + " " + salary;
                
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
