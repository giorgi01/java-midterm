package ge.edu.btu.collections;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Company company = new Company("Amazon");

        company.initializeEmployeeType();

        Employee employeeFirst = new Employee("Jason Statham", 17000);
        Employee employeeSecond = new Employee("John Doe", 3000);
        Employee employeeThird = new Employee("James Doe", 5000);
        Employee employeeFourth = new Employee("Joe Doe", 12000);
        Employee employeeFifth = new Employee("Giorgi Giorgadze", 9000);

        company.addEmployee(EmployeeType.ARCHITECT, employeeFirst);
        company.addEmployee(EmployeeType.FRONT_END, employeeSecond);
        company.addEmployee(EmployeeType.FRONT_END, employeeThird);
        company.addEmployee(EmployeeType.BACK_END, employeeFourth);
        company.addEmployee(EmployeeType.BACK_END, employeeFifth);

        company.printAverageSalaries();

        Map<EmployeeType, Double> avgSalaries = company.getAverageSalary();
        System.out.println(avgSalaries);
    }
}