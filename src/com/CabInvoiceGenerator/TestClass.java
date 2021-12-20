package com.CabInvoiceGenerator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestClass {
	CabInvoiceGenerator cabInvoiceGenerator;

	@Before
	public void TestInvoiceGenerator() {
		cabInvoiceGenerator = new CabInvoiceGenerator();
	}

	@Test
	public void TestReturnFare() {

		double Fare = cabInvoiceGenerator.CalculateFare(3.2, 4.0);

		assertEquals(Fare, 36.0, 0.0);
	}

	@Test
	public void TestReturnMinimumFare() {

		double Fare = cabInvoiceGenerator.CalculateFare(0.1, 1.0);

		assertEquals(Fare, 5.0, 0.0);
	}

	@Test
	public void TestReturnFare_ForMultipleRides() {
		Rides[] rides = { new Rides(3.0, 4.0), new Rides(0.1, 1.0) };
		double Fare = cabInvoiceGenerator.CalculateFareMultipleRides(rides);

		assertEquals(Fare, 36.0, 0.0);
	}
}
