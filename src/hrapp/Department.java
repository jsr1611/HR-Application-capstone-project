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
    
}
