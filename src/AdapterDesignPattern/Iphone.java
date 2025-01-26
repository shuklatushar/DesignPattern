package AdapterDesignPattern;

public class Iphone {

    IphoneCharger iphoneCharger;

    public Iphone(IphoneCharger iphoneCharger){
        this.iphoneCharger=iphoneCharger;
    }

    public void charge(){
         iphoneCharger.chargePhone();
    }
}
