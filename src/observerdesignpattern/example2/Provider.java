package observerdesignpattern.example2;

public interface Provider {

    void subscriber(Listener listener);
    void unsubscribe(Listener listener);
    void notifier();
    Object getUpdate(Listener listener);
}
