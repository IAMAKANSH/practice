package builderpattern.example;

public class Driver {

    public static void main(String[] args) {

        Player messi=new Player.PersonBuilder("Lionel","Messi")
                .age(24)
                .phoneNumber("737373737373")
                .address("Spain Barcelona")
                .build();
        System.out.println(messi);

        DriverInt ronaldo=new DriverInt.Player.PersonBuilder("Akansh","Srivastava")
                .build();

        System.out.println(ronaldo);
    }
}
