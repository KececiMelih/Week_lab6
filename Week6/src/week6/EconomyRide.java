package week6;

public class EconomyRide extends Ride {
    private double pricePerMinute;

    public EconomyRide(double pricePerMinute, String passengerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm) {
        super(passengerName, pickup, destination, distanceKm, durationMin, pricePerKm);
        this.pricePerMinute = pricePerMinute;
    }

    @Override
    public double calculateFare() {
        double result = super.calculateFare() + (super.getDurationMin() * pricePerMinute);
        if (result < 50) {
            result = 50;
        }
        return result;
    }

    @Override
    public String toString() {
        return "=== Economy Ride ===\n" + super.toString() + "\nprice per minute: " + pricePerMinute;
    }
}