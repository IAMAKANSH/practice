package builderpattern.example;


public class Player {
    private  final String firsName;
    private  final String lastName;

    protected int age;
    protected String address;
    protected String phoneNumber;

    public Player(String firsName, String lastName) {
        this.firsName = firsName;
        this.lastName = lastName;
    }

    public Player(PersonBuilder personBuilder) {
        this(personBuilder.getFirsName(), personBuilder.getLastName());
        this.age = personBuilder.age;
        this.address = personBuilder.address;
        this.phoneNumber = personBuilder.phoneNumber;
    }

    public String getFirsName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Player{" +
                "firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    static class PersonBuilder extends Player{

        public PersonBuilder(String firsName, String lastName) {
            super(firsName, lastName);
        }
        public PersonBuilder age(Integer age){
            this.age=age;
            return this;
        }
        public PersonBuilder address(String address)
        {
            this.address=address;
            return this;
        }
        public PersonBuilder phoneNumber(String phoneNumber)
        {
            this.phoneNumber=phoneNumber;
            return this;
        }
        public Player build()
        {
            return new Player(this);
        }
    }
}
