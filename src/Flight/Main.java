package Flight;
import static Flight.Flight.getAllPassengers;

public class Main {
    public static void main(String[] args) {
        Flight f1 = new Flight("ABC");
        Flight f2 = new Flight("ABC");
        f1.addPassenger();
        f2.addPassenger();
        System.out.println(getAllPassengers());
    }
}
