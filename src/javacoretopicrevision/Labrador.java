package javacoretopicrevision;

public class Labrador extends Dog{
    @Override
    public Frog commonProperty() {
        System.out.println("Child of Dog class");
        return new Frog();
    }
}
