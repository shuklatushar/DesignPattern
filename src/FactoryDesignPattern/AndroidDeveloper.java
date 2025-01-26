package FactoryDesignPattern;

public class AndroidDeveloper implements Employee{

    public int salary(){
        System.out.println("Getting Android Developer Salary");
        return 40000;
    }
}
