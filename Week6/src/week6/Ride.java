package week6;

public class Ride {
    private String passengerName;
    private String pickup;
    private String destination;
    private double distanceKm;
    private int durationMin;
    private double pricePerKm;

    public Ride(String passengerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm) {
        this.passengerName = passengerName;
        this.pickup = pickup;
        this.destination = destination;
        
        if (distanceKm <= 0) {
            System.out.println("Warning: distance km must be positive");
            this.distanceKm = 1.0;
        } else {
            this.distanceKm = distanceKm;
        }

        if (durationMin <= 0) {
            System.out.println("Warning: duration min must be positive");
            this.durationMin = 1;
        } else {
            this.durationMin = durationMin;
        }

        if (pricePerKm <= 0) {
            System.out.println("Warning: price per km must be positive");
            this.pricePerKm = 1.0;
        } else {
            this.pricePerKm = pricePerKm;
        }
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getPickup() {
        return pickup;
    }

    public String getDestination() {
        return destination;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public int getDurationMin() {
        return durationMin;
    }

    public double getPricePerKm() {
        return pricePerKm;
    }

    public double calculateFare() {
        return distanceKm * pricePerKm;
    }

    @Override
    public String toString() {
        return "name: " + passengerName + 
               " pickup: " + pickup + 
               " destination: " + destination + 
               " Distance km: " + distanceKm + 
               " duration min: " + durationMin + 
               " Price per Km: " + pricePerKm + 
               "\ncalculated fare: " + calculateFare();
    }
}