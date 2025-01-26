package ObserverDesignPattern;

public interface Subject {

    public void subscribe(Observer obj);

    public void unsubscribe(Observer obj);

    public void notifyChanges(String title);
}
