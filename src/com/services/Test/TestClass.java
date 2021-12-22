package com.services.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.entity.InvoiceData;
import com.entity.Rides;
import com.services.CabInvoiceGenerator;

public class TestClass {
	CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();

/*	@Before
	public void TestInvoiceGenerator() {
		cabInvoiceGenerator = new CabInvoiceGenerator();
	}*/

	@Test
	public void ReturnFare() {

		double Fare = cabInvoiceGenerator.CalculateFare(3.2, 4.0);

		assertEquals(36.0,Fare, 0.0);
	}

	@Test
	public void ReturnMinimumFare() {

		double Fare = cabInvoiceGenerator.CalculateFare(0.1, 1.0);

		assertEquals(5.0,Fare, 0.0);
	}

	@Test
	public void ReturnFare_ForMultipleRides() {
		Rides[] rides = { new Rides(3.0, 4.0), new Rides(0.1, 1.0) };
		InvoiceData Fare =  cabInvoiceGenerator.CalculateFareMultipleRides(rides);
		InvoiceData invoiceData = new InvoiceData(2,36.0);
		assertEquals(invoiceData, Fare);
	}
}

