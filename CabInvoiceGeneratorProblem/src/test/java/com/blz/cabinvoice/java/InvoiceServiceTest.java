package com.blz.cabinvoice.java;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class InvoiceServiceTest {
	
	static InvoiceGenerator invoiceGenerator;
	
	@BeforeClass
	public static void createInvoiceGeneratorObj() {
		invoiceGenerator = new InvoiceGenerator();
	}
	
	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare() {
		double distance = 2.0;
		int time  = 5;
		double fare = invoiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(25, fare, 0.0);
		
	}

}
