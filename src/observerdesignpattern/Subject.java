package observerdesignpattern;

public interface Subject {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers();
    Object getUpdate(Observer observer);
}
