package com.services.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.entity.InvoiceData;
import com.entity.Rides;
import com.services.CabInvoiceGenerator;

public class Test_Class {

	CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();

	@Test
	public void ReturnFare() {
		double distance = 3.0;
		int time = 4;
		double fare = cabInvoiceGenerator.CalculateFare(distance, time);
		assertEquals(34, fare, 0.0);
	}

	@Test
	public void ReturnMinimumFare() {
		double distance = 0.1;
		int time = 1;
		double fare = cabInvoiceGenerator.CalculateFare(distance, time);
		assertEquals(5.0, fare, 0.0);
	}

	@Test
	public void ReturnFare_ForMultipleRides() {
		Rides[] rides = { new Rides(3.0, 4), new Rides(0.1, 1) };
		InvoiceData result = cabInvoiceGenerator.CalculateFareMultipleRides(rides);
		System.out.println(result);
		InvoiceData invoicedata = new InvoiceData(2, 36.0);
		assertEquals(result, invoicedata);

	}
}
