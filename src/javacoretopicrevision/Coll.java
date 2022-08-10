package javacoretopicrevision;

import java.util.HashSet;

public class Coll {
    protected String name = "Mouse";
    int age;

    public static void main(String[] args) {

        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(2);
        hashSet.add(null);
        hashSet.add(null);
        hashSet.add(4);
        System.out.println(hashSet);
        int a=10;
        changeValueOfA(a);
        System.out.println(a);
        Coll coll=new Coll();
        coll.age=10;
        changeObjectReference(coll);
        System.out.println(coll.age);
    }
    private static void changeObjectReference(Coll coll)
    {
        coll.age=12;
    }
    private static void changeValueOfA(int a) {
        a=15;
    }


}
