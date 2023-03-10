package com.bridgelabz;

public class InvoiceGenerator {
    static final double COST_PER_KM = 10;
    static final int COST_PER_MINUTE = 1;
    static final double MINIMUM_FARE = 5;

    public static void main(String[] args )
    {
        System.out.println( "Welcome to Cab Invoice Generator" );
        double totalFare = calculateFare(0, 4); // distance,time
        double totalFare2 = calculateFare(10, 4); // distance,time
        System.out.println(totalFare);
        System.out.println(totalFare2);
    }

    public static double calculateFare(double distance, int time){
        double totalFare= distance *COST_PER_KM+time*COST_PER_MINUTE;
        if (totalFare < MINIMUM_FARE)
            return MINIMUM_FARE;
         return totalFare;
    }
}
