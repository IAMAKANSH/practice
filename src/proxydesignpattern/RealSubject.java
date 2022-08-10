package proxydesignpattern;

public class RealSubject implements Subject{
    @Override
    public void method() {
        System.out.println("Real Subject method is called");
    }
}
