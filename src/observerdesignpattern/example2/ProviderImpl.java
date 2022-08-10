package observerdesignpattern.example2;

import java.util.ArrayList;
import java.util.List;

public class ProviderImpl implements Provider{

    List<Listener> listeners;
    String message;

    public ProviderImpl() {
        listeners=new ArrayList<>();
    }

    @Override
    public void subscriber(Listener listener) {
        if (!listeners.contains(listener))
            listeners.add(listener);
    }

    @Override
    public void unsubscribe(Listener listener) {
        listeners.remove(listener);
    }

    @Override
    public void notifier() {
        for (Listener listener:
             listeners) {
            listener.update();
        }
    }

    @Override
    public Object getUpdate(Listener listener) {
        return this.message;
    }

    public void postMessage(String message)
    {
        System.out.println("Posting message from the provider");
        this.message=message;
        notifier();
    }
}

