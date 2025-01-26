package FactoryDesignPattern;

public class EmployeeFactory {

    public static Employee getEmployee(String employeeType){
         if(employeeType.trim().equalsIgnoreCase("Android Developer")){
             return new AndroidDeveloper();
         }
         else if(employeeType.trim().equalsIgnoreCase("web Developer")){
             return new WebDeveloper();
         }
         else{
             return null;
         }
    }
}
