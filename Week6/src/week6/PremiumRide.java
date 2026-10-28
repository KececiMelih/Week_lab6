package week6;

public class PremiumRide extends Ride {
    private double comfortFee;
    private double surgeMultiplier;

    public PremiumRide(double comfortFee, double surgeMultiplier, String passengerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm) {
        super(passengerName, pickup, destination, distanceKm, durationMin, pricePerKm);
        this.comfortFee = comfortFee;
        
        if (surgeMultiplier < 1.0 || surgeMultiplier > 3.0) {
            System.out.println("Warning: surge multiplier must be between 1.0 and 3.0");
            this.surgeMultiplier = 1.0;
        } else {
            this.surgeMultiplier = surgeMultiplier;
        }
    }

    @Override
    public double calculateFare() {
        return (super.calculateFare() + comfortFee) * surgeMultiplier;
    }

    @Override
    public String toString() {
        return "===Premium Ride===\n" + super.toString() + "\ncomfortFee: " + comfortFee + "\nsurgeMultiplier: " + surgeMultiplier;
    }
}