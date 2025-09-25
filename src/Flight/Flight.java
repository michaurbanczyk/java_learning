package Flight;

public class Flight {
    private int passengers, seats = 150;
    private static int allPassengers;
    String name;

    Flight(String name){
        this.name = name;
    }

    public void addPassenger(){
        allPassengers++;
    }

    public static int getAllPassengers(){
        return allPassengers;
    }
}
