package FactoryDesignPattern;

public class WebDeveloper implements Employee{
    public int salary(){
        System.out.println("Getting Web developer salary");
          return 50000;
    }
}
