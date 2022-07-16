public class Car extends Vehicle {
    protected int numberOfSeats;

    public Car(String licensePlate, int numberOfSeats) {
        super(licensePlate);
        this.numberOfSeats = numberOfSeats;
    }
    //Car{licensePlate=ABC123,numberOfSeats=4}
    @Override
    public String toString() {
        return "Car{licensePlate=" + super.licensePlate + ",numberOfSeats=" + numberOfSeats + ")";
    }
}
