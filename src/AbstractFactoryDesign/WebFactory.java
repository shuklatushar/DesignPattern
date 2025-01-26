package AbstractFactoryDesign;

public class WebFactory implements AbstractEmployeeFactory{

    public Employee create(){
         return new WebDeveloper();
    }
}
