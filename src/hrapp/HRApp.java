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
public class HRApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("HR App Stars");
        Department d1 = new Department();
        d1.setName("Education");
        System.out.println("Department " + d1.toString());
        
        Employee emp1 = new Employee(101, "Jim", 1234.56);
        Employee emp2 = new Employee(102, "Sung", 1200.34);
        Employee emp3 = new Employee(103, "Rash", 1122.33);

        d1.addEmployee(emp1);
//        d1.addEmployee(emp2);
        d1.addEmployee(emp3);
//        int eId = 101;
//        Employee foundEmployee = d1.findEmployeeById(eId);
//        String msg = (foundEmployee != null && foundEmployee.getID() == eId) ? foundEmployee.toString() : "No employee found with this id";
//        System.out.println(msg);

        Employee[] allEmpls = d1.getEmployees();
        for (Employee em : allEmpls) {
            System.out.println(em.toString());
        }
        
        System.out.println("Total of Employee salaries: " + d1.getTotalSalaries());
        System.out.println("Average salary in the department: " + d1.getAvgSalary());
    }

}
