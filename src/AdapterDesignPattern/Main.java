package AdapterDesignPattern;

public class Main {
    public static void main(String args[]){

      LightningFast lightningFast=new LightningFast();
      Iphone iphone = new Iphone(lightningFast);
      iphone.charge();

      AdapterCharger adapterCharger=new AdapterCharger(new CtypeCharger());
      Iphone iphone13 = new Iphone(adapterCharger);
      iphone13.charge();
    }
}
