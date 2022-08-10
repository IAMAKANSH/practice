package observerdesignpattern.example2;

public class ListenerImpl implements Listener{

    Provider provider;
    String name;

    public ListenerImpl(String name) {
        this.name = name;
    }

    @Override
    public void setProvider(Provider provider) {
        this.provider=provider;
    }

    @Override
    public void update() {
       String msg= (String) provider.getUpdate(this);
       if (msg==null)
           System.out.println(name+ " No new message to this topic");
       else
           System.out.println(name+ " Retrieving message "+msg);
    }
}
