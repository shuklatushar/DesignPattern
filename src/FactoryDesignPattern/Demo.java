package FactoryDesignPattern;

public class Demo {
    public static void main(String args[]){

        Employee employee = EmployeeFactory.getEmployee("Android Developer");
        System.out.println(employee.salary());

        Employee employee2 = EmployeeFactory.getEmployee("web Developer");
        System.out.println(employee2.salary());

    }
}
