package week6;

public class SharedRide extends EconomyRide {
    private int passengerCount;

    public SharedRide(int passengerCount, double pricePerMinute, String passengerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm) {
        super(pricePerMinute, passengerName, pickup, destination, distanceKm, durationMin, pricePerKm);
        
        if (passengerCount < 1 || passengerCount > 4) {
            System.out.println("Warning: passenger count must be between 1 and 4");
            this.passengerCount = 1;
        } else {
            this.passengerCount = passengerCount;
        }
    }

    @Override
    public double calculateFare() {
        return (super.calculateFare() / passengerCount) * 1.1;
    }

    @Override
    public String toString() {
        return "====Shared Ride====\n" + super.toString() + "\npassenger count: " + passengerCount;
    }
}