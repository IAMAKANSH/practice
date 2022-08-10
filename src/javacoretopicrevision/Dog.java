package javacoretopicrevision;

public class Dog {

    public Animal commonProperty()
    {
        System.out.println("Parent Class");
        return new Animal();
    }
//    void sum(int a,int b)
//    {
//        System.out.println(a+b+10);
//    }
//    void sum(int a,long b)
//    {
//        System.out.println(a+b+20);
//    }
//    void sum(long a,int b)
//    {
//        System.out.println(a+b+30);
//    }
    void sum(long a,long b)
    {
        System.out.println(a+b+50);
    }
}
