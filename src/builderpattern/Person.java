package builderpattern;

public interface Person {

    String getFirstName();
    String getLastName();
    String getPhoneNumber();
    String getAddress();
    Integer getAge();

    public class DefaultPerson implements Person{

        //Required parameters;
        private final String firstName;
        private final String lastName;

        //Optional parameters
        protected  String phoneNumber;
        protected  String address;
        protected  Integer age;

        public DefaultPerson(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        protected DefaultPerson(PersonBuilder builder) {
            this(builder.getFirstName(),builder.getLastName());
            this.phoneNumber = builder.phoneNumber;
            this.address = builder.address;
            this.age = builder.age;
        }

        @Override
        public String getFirstName() {
            return this.firstName;
        }

        @Override
        public String getLastName() {
            return this.lastName;
        }

        @Override
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        @Override
        public String getAddress() {
            return this.address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        @Override
        public Integer getAge() {
            return this.age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "DefaultPerson{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    ", address='" + address + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
    class PersonBuilder extends DefaultPerson {

        public PersonBuilder(String firstName, String lastName) {
            super(firstName, lastName);
        }

        public PersonBuilder phone(String phone)
        {
            this.phoneNumber=phone;
            return this;
        }
        public PersonBuilder address(String address)
        {
            this.address=address;
            return this;
        }
        public PersonBuilder age(Integer age)
        {
            this.age=age;
            return this;
        }
        public Person build()
        {
            return new DefaultPerson(this);
        }
    }
}
