package builderpattern;

public class Employee {
    private String firstName;
    private String lastName;
    private String middleName;
    private String age;
    private String phoneNumber;
    private String address;

    public Employee(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public Employee(String firstName, String lastName, String middleName, String age, String phoneNumber, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Employee(String firstName, String age, String phoneNumber, String address) {
        this.firstName = firstName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", age='" + age + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
