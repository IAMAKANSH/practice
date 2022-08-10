package builderpattern;

public class Driver {

    public static void main(String[] args) {

        //Employee akansh=new Employee("Akansh","Srivastava","8218152572","583/B Allahabad");

//        Employee1 aditya=new Employee1.EmployeeBuilder("Aditya","Chauhan")
//                .phoneNumber("7376627313")
//                .build();
//
//        System.out.println(aditya);
//        //Java library StringBuilder

        Person oldPerson=new Person.PersonBuilder("James","Bond")
                .age(45)
                .address("New York City")
                .build();
        System.out.println(oldPerson);
    }
}
