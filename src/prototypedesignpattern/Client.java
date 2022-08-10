package prototypedesignpattern;

public class Client {

    public static void main(String[] args) {
//
//        Person akansh=new Person("Akansh",26);
//        System.out.println(akansh);
//
//        Person messi= (Person) akansh.clone();
//        messi.setName("Messi");
//        System.out.println(messi);
//        System.out.println(System.identityHashCode(akansh));
//        System.out.println(System.identityHashCode(messi));
//        Dolphin jerry=new Dolphin("Jerry",46);
//        Dolphin sam= (Dolphin) jerry.clone();
//
//        System.out.println(jerry);
//        System.out.println(sam );

        Person1 person1=new Person1("Akansh",26);
        System.out.println(person1);

        Person1 person2= (Person1) person1.clone();
        System.out.println(person2);

        System.out.println(System.identityHashCode(person1));
        System.out.println(System.identityHashCode(person2));
    }
}
