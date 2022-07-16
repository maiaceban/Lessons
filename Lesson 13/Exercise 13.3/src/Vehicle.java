public class Vehicle {
    protected String licensePlate;

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    //Vehicle{licensePlate=ABC123}
    @Override
    public String toString() {
        return "Vehicle{licensePlate=" + licensePlate + ")";
    }
}
