package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{

    List<Observer> subscribers=new ArrayList<>();

    public void subscribe(Observer obj){
          subscribers.add(obj);
    }

    public void unsubscribe(Observer obj){
         subscribers.remove(obj);
    }

    public void notifyChanges(String title){
         for(Observer obj:subscribers){
             obj.notified(title);
         }
    }


}
