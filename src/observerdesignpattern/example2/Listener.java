package observerdesignpattern.example2;

public interface Listener {
    void setProvider(Provider provider);
    void update();
}
