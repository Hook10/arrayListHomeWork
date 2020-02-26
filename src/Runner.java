import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Collections;

public class Runner {
    public static void main(String[] args){
        ArrayList<Employee> topManagement = new ArrayList<>();
        Employee director = new Employee(1001, "Konstantin", "Ernst", 100000, "director" );
        topManagement.add(director);

        ArrayList<Employee> midManagement = new ArrayList<>();
        Employee managerFirst = new Employee(1002, "Mikhail", "Shifutinsky", 80000, "department Manager" );
        Employee managerSecond = new Employee(1003, "Ivan", "Urgant", 85000, "department Manager" );
        midManagement.add(managerFirst);
        midManagement.add(managerSecond);

        ArrayList<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee(1004, "Maria", "Sharapova", 50000, "engineer" );
        Employee employee2 = new Employee(1005, "Philip", "Kirkorov", 50000, "engineer" );
        Employee employee3 = new Employee(1006, "Gregor", "Leps", 50000, "engineer" );
        Employee employee4 = new Employee(1007, "Dima", "Belan", 50000, "engineer" );
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        midManagement.addAll(employees);
        topManagement.addAll(midManagement);

        Collections.sort(topManagement, Employee.getCompByName());
        for(Employee employee : topManagement){
            System.out.println(employee.getFirstName());
        }
        System.out.println("--------" + "\n");

        Collections.sort(topManagement, Employee.getCompByName());
        for(Employee employee : topManagement){
            System.out.println(employee.getLastName());
        }
        System.out.println("--------" + "\n");

        Collections.sort(topManagement, Employee.getCompByPosition());
        for(Employee employee : topManagement){
            System.out.println(employee.getPosition());
        }
        System.out.println("--------" + "\n");

        Collections.sort(topManagement, Employee.getCompById());
        for(Employee employee : topManagement){
            System.out.println(employee.getId());
        }
        System.out.println("--------" + "\n");

        Collections.sort(topManagement, Employee.getCompBySalary());
        for(Employee employee : topManagement){
            System.out.println(employee.getSalary());
        }
    }
}
