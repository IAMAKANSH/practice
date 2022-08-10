package multithreading;

public class SwitchJava13 {

    public static void main(String[] args) {
        String day="Monday";
        switch (day)
        {
            case "Monday","Tuesday","Wednesday","Thursday","Friday"-> System.out.println("Working Day");
            case "Saturday","Sunday"-> System.out.println("Holidays");
            default -> System.out.println("Unknown request");
        }
    }
}
