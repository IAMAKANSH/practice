package multithreading;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Comparing implements Comparable<Comparing>{
    private String name;
    private Integer age;

    public Comparing(String name,Integer age) {
        this.name=name;
        this.age = age;
    }
    @Override
    public int compareTo(Comparing o) {
        if (this.name.compareTo(o.name)!=0)
        {
            return this.name.compareTo(o.name);
        }else
        {
            //if equal we will consider age
            return this.age-o.age;
        }
    }

    @Override
    public String toString() {
        return "Comparing{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {

        Comparing comp=new Comparing("xyz",10);
        Comparing comp2=new Comparing("abc",20);
        Comparing comp3=new Comparing("a",30);
        Comparing comp4=new Comparing("a",10);

        Comparing[] arr=new Comparing[4];
        arr[0]=comp;
        arr[1]=comp2;
        arr[2]=comp3;
        arr[3]=comp4;
        int[] arr1=IntStream.rangeClosed(0,5).toArray();
        Arrays.stream(arr1);
        System.out.println(arr1);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
