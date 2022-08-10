package javacoretopicrevision;

import java.util.Arrays;

public class Driver {

    public static void main(String[] args) {
        int[] arr={5,9,1,10};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Employee[] arr1=new Employee[5];
        Employee emp1=new Employee("Akansh",10);
        Employee emp2=new Employee("Ramesh",2);
        Employee emp3=new Employee("Bob",3);
        Employee emp4=new Employee("Charle",4);
        Employee emp5=new Employee("Chris",5);
        arr1[0]=emp1;
        arr1[1]=emp2;
        arr1[2]=emp3;
        arr1[3]=emp4;
        arr1[4]=emp5;

        //Arrays.sort(arr1);
        Arrays.sort(arr1,Employee.comparator);
        System.out.println(Arrays.toString(arr1));

        Employee employee=new Employee("Akansh",1);
        Employee employee1=new Employee("Akansh",1);
        String a="5";
        String b="5";
        String c=new String("5");
        System.out.println(a==c); //F
        System.out.println(a.equals(c));//T
        System.out.println(a==b);//T
        System.out.println(a.equals(b));//T
        System.out.println(employee.equals(employee1));//deep comparsion
        System.out.println(employee==employee1);//shallow comparsion
        //shallow comparsion
    }
}
