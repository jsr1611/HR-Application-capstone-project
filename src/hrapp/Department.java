/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrapp;

/**
 *
 * @author opc
 */
public class Department {
    private final Employee[] employees = new Employee[10];
    private String name;
    
    public Department(){}
    public Department(String dName){
        name = dName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    public void addEmployee(Employee employee){
        int counter = 0;
        for(Employee emp : employees){
            if(emp == null){
                employees[counter] = employee;
                break;
            }
            counter += 1;
        }
    }
    
    public Employee[] getEmployees(){
        int counter =0;
        for(Employee emp : employees){
            
            if(emp != null){
                counter += 1;
            }
        }
        Employee[] emps = new Employee[counter];
        int counter2 = 0;
        for(Employee empl : emps){
            emps[counter2] = employees[counter2];
            counter2 += 1;
        }
        return emps;
    }
    
    public int getNumberOfEmployees(){
        return getEmployees().length;
    }
    
    public Employee findEmployeeById(int Id){
        Employee newEmp = new Employee();
        Employee[] emps = getEmployees();
        int index = 0;
        for(Employee emp : emps){
            if(emp.getID() == Id){
                newEmp = emp;
            }
        }
        return newEmp;
    }
    
    public double getTotalSalaries(){
        Employee[] ems = getEmployees();
        double total = 0;
        for(Employee emp : ems){
            total += emp.getSalary();
        }
        return total;
    }
    
    public double getAvgSalary(){
        double totalSalary = getTotalSalaries();
        int numOfEmps = getNumberOfEmployees();
        double avgSal = numOfEmps != 0 ? totalSalary / numOfEmps : 0;
        return avgSal;
    }
    
}
