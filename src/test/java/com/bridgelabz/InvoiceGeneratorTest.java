package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;
public class InvoiceGeneratorTest {
    @Test
    public void givenDistanceAndTime_shouldReturnTotalFare(){
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance=2.0;
        int time=5;
        double fare = invoiceGenerator.totalFare(distance, time );
        Assert.assertEquals(28, fare, 0.0);
    }
    @Test
    public void givenDistanceAndTime_shouldReturnMinFare(){
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance=0.1;
        int time=1;
        double fare = invoiceGenerator.totalFare(distance, time);
        Assert.assertEquals(5,fare,0.0);
    }
}
