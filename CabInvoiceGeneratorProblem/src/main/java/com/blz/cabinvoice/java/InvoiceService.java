package com.blz.cabinvoice.java;

public class InvoiceService {

	private static final double NORMAL_COST_PER_KM = 10.0;
	private static final int NORMAL_COST_PER_TIME = 1;
	private static final double NORMAL_MINIMUM_FARE = 5;
	private static final double PREMIUM_COST_PER_KM = 15.0;
	private static final int PREMIUM_COST_PER_TIME = 2;
	private static final double PREMIUM_MINIMUM_FARE = 20;
	
	
	public double calculateFare(double distance, int time,boolean premiumRide) {
		double fare = 0;
		if(premiumRide) {
			fare = distance * PREMIUM_COST_PER_KM + time * PREMIUM_COST_PER_TIME;
			if (fare < PREMIUM_MINIMUM_FARE)
				return PREMIUM_MINIMUM_FARE;
			return fare;
		} else {
			fare = distance * NORMAL_COST_PER_KM + time * NORMAL_COST_PER_TIME;
			if(fare < NORMAL_MINIMUM_FARE)
				return NORMAL_MINIMUM_FARE;
			return fare;
		}
	}

	public InvoiceSummary calculateSummaryFare(Ride[] rides, boolean premiumRide) {
		double fare = 0;
		for (Ride ride : rides) {
			fare += this.calculateFare(ride.distance, ride.time, premiumRide);
		}
		return new InvoiceSummary(rides.length, fare);
	}
}
