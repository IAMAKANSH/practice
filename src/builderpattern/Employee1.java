package builderpattern;

public class Employee1 {

    private final String firstName;
    private final String lastName;
    private final Integer age;
    private final String phoneNumber;
    private final String address;

    public Employee1(EmployeeBuilder builder) {
        this.firstName=builder.firstName;
        this.lastName=builder.lastName;
        this.address=builder.address;
        this.age=builder.age;
        this.phoneNumber=builder.phoneNumber;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class EmployeeBuilder{
        private final String firstName;
        private final String lastName;
        private Integer age;
        private String phoneNumber;
        private String address;

        public EmployeeBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public EmployeeBuilder age(Integer age)
        {
            this.age=age;
            return this;
        }
        public EmployeeBuilder phoneNumber(String phoneNumber)
        {
            this.phoneNumber=phoneNumber;
            return this;
        }
        public EmployeeBuilder address(String address)
        {
            this.address=address;
            return this;
        }
        public Employee1 build()
        {
            return new Employee1(this);
        }

    }
}
