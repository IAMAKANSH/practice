package prototypedesignpattern;

public class Person1 implements Animal {

    private String name;
    private int age;

    public Person1() {
    }

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Animal clone() {
        System.out.println("Creating person copying");
        Person1 person1=null;
        try {
            person1=(Person1) super.clone();
            person1.age=(-1);
            person1.name=null;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return person1;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
