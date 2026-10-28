package week6;

import java.util.ArrayList;

public class Week6 {
    public static void main(String[] args) {
        ArrayList<Ride> ridedeneme = new ArrayList<>();

        // Gerçekçi test değerleri:
        // EconomyRide(dakika_ücreti, isim, kalkış, varış, km, dk, km_ücreti)
        Ride rd1 = new EconomyRide(2.5, "Ali", "Kizilay", "Tunalı", 8.5, 15, 15.0);
        
        // SharedRide(yolcu_sayısı, dakika_ücreti, isim, kalkış, varış, km, dk, km_ücreti)
        Ride rd2 = new SharedRide(3, 2.5, "Ayse", "Asti", "Baskent Uni", 18.0, 25, 15.0);
        
        // PremiumRide(konfor_ücreti, surge_çarpanı, isim, kalkış, varış, km, dk, km_ücreti)
        Ride rd3 = new PremiumRide(50.0, 1.5, "Mehmet", "Havalimani", "Cankaya", 32.0, 40, 20.0);

        ridedeneme.add(rd1);
        ridedeneme.add(rd2);
        ridedeneme.add(rd3);

        for (Ride i : ridedeneme) {
            System.out.println(i.toString());
            System.out.println("----------------------------------------");
        }
    }
}