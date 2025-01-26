package ObserverDesignPattern;

public class Subscriber implements Observer{

    private String name;

    public Subscriber(String name){
        this.name=name;
    }

    public void notified(String title){
        System.out.println("Hi "+name+", New video "+title+" Uploaded");
    }
}
