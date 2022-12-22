package com.bridgelabz;

public class InvoiceGenerator {
    static final double COST_PER_KM = 10;
    static final int COST_PER_MINUTE = 1;
    static final double MINIMUM_FARE = 5;

    public static void main(String[] args )
    {
        System.out.println( "Welcome to Cab Invoice Generator" );
        double TotalFare = totalFare(10, 4);
        System.out.println(TotalFare);
    }
    public static double totalFare(double distance, int time) {
        double totalCostForDist = distance * COST_PER_KM;
        int totalCostForTime = time * COST_PER_MINUTE;
        double totalFare = totalCostForDist + totalCostForTime;

        if (totalFare < MINIMUM_FARE)
            return MINIMUM_FARE;
        else return totalFare;
    }
}
