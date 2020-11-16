package com.blz.cabinvoice.java;

public class RideRepository {
	public final int userId;
	public final Ride[] rides;

	public RideRepository(int userId, Ride[] rides) {
		this.userId = userId;
		this.rides = rides;
	}
}
