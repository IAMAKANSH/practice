package proxydesignpattern;

public class ProxySubject extends RealSubject{

    @Override
    public void method() {

        System.out.println("Hi, I am proxy,i will perform authentication nd security checks");
        //Logic

        System.out.println("Calling real method");
        super.method();
    }
}
