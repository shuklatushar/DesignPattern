package AbstractFactoryDesign;

public class WebDeveloper implements Employee{
    public int salary(){
        return 50000;
    }

    public String name(){
       // System.out.println("Hi I am a Web developer");
        return "Web developer";
    }
}
