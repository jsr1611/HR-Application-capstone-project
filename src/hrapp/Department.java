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
    private int lastAddedEmployeeIndex = -1;

    public Department() {
    }

    public Department(String dName) {
        name = dName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void addEmployee(Employee employee) {
        /*
        Increment lastAddedEmployeeIndex by one when new employee is added, 
        and it should not exceed the total capacity of the employees array.
         */

        if (lastAddedEmployeeIndex < employees.length) {
            lastAddedEmployeeIndex++;
            employees[lastAddedEmployeeIndex] = employee;
        }
    }

    public Employee getEmployeeById(int empId) {
        for (Employee emp : employees) {
            if (emp != null) {
                if (emp.getID() == empId) {
                    return emp;
                }
            }
        }
        return null;
    }

    public Employee[] getEmployees() {
        int counter = 0;
        for (Employee emp : employees) {

            if (emp != null) {
                counter += 1;
            }
        }
        Employee[] emps = new Employee[counter];
        int counter2 = 0;
        for (Employee empl : emps) {
            emps[counter2] = employees[counter2];
            counter2 += 1;
        }
        return emps;
    }

    public int getNumberOfEmployees() {
        return getEmployees().length;
    }

    public double getTotalSalary() {
        double totalSalary = 0.0;
        for (int i = 0; i <= lastAddedEmployeeIndex; i++) {
            totalSalary += employees[i].getSalary();
        }
        return totalSalary;
    }

    public double getAvgSalary() {
        /*
        To calculate avera salary of employees
         */
        return lastAddedEmployeeIndex > -1 ? getTotalSalary() / (lastAddedEmployeeIndex + 1) : 0.0;
    }

}
