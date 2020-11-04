package ge.edu.btu.collections;

import java.util.Map;

public interface ICompany {

    void initializeEmployeeType();

    void addEmployee(EmployeeType type, Employee employee);

    Map<EmployeeType, Double>getAverageSalary();

    void printAverageSalaries();
}
