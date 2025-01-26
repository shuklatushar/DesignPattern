package AdapterDesignPattern;

public class AdapterCharger implements IphoneCharger{

    AndroidCharger androidCharger;

    public AdapterCharger(CtypeCharger ctypeCharger){
        this.androidCharger=ctypeCharger;
    }

    public void chargePhone(){
          androidCharger.chargeAndroidPhone();
    }
}
