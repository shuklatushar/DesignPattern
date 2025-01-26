package AbstractFactoryDesign;

public class AndroidFactory implements AbstractEmployeeFactory{

      public Employee create(){
          return new AndroidDeveloper();
      }
}
