package AbstractFactoryDesign;

public class Main {

    public static void main(String args[]){

        Employee e1=EmployeeFactory.getEmployee(new AndroidFactory());

        System.out.println("Hi, I am "+e1.name()+" My salary is : "+e1.salary());

        Employee e2=EmployeeFactory.getEmployee(new WebFactory());

        System.out.println("Hi, I am "+e2.name()+" My salary is : "+e2.salary());


    }
}
