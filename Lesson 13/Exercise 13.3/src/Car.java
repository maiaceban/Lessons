public class Car extends Vehicle {
    protected int numberOfSeats;

    public Car(String licensePlate, int numberOfSeats) {
        super(licensePlate);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "licensePlate=ABC123,numberOfSeats=4";
    }
}
