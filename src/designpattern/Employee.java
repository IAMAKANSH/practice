package designpattern;

public class Employee {

    private String firstName;
    private String lastName;
    private Integer id;
    private String address;

    private Employee() {
    }

    private static   Employee singletonEmployee;

    public static Employee getInstance() {
        if (singletonEmployee==null)
        {
            synchronized (Employee.class)
            {
                singletonEmployee=new Employee();
            }
        }
        return singletonEmployee;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class SingletonTest{

    public static void main(String[] args) throws InterruptedException {
        Employee employee=Employee.getInstance()
                ;
        employee.setAddress("India");
        employee.setFirstName("Akansh");
        employee.setLastName("Srivastava");
        employee.setId(1055986);

        System.out.println(System.identityHashCode(employee));

        Employee employee1=Employee.getInstance();
        employee1.setAddress("USA");
        employee1.setFirstName("Bob");
        employee1.setLastName("Marley");
        employee1.setId(1055988);

        System.out.println(System.identityHashCode(employee1));


    }
}
