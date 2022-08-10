package javacoretopicrevision;

import java.util.Arrays;
import java.util.List;

public class Animal {

    private String name;
    private int age;
    private String color;
    private String behaviour;

    public Animal() {
    }

    public Animal(String name, int age, String color, String behaviour) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.behaviour = behaviour;
    }

    private List<Animal> getAnimalList()
    {
        return Arrays.asList(
                new Animal("Tiger",30,"yellow","aggressive"),
                new Animal("Cat",15,"black","sometime aggressive sometime quite"),
                new Animal("Dog",20,"white","sometime aggressive sometime quite")
        );
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", behaviour='" + behaviour + '\'' +
                '}';
    }
    public void getAnimal()
    {
        System.out.println("Its Animal Class");
    }

    public static void check()
    {
        System.out.println("Check Animal class");
    }

    protected Object commonProperty() {
        return null;
    }
}
