package com.services.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.entity.InvoiceData;
import com.entity.Rides;
import com.services.CabInvoiceGenerator;

public class Test_Class {

	CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();

	/* Testing Method */
	@Test
	public void returnFare() {
		double distance = 3.0;
		int time = 4;
		double fare = cabInvoiceGenerator.CalculateFare(distance, time);
		assertEquals(34, fare, 0.0);
	}

	/* Testing for Returning Minimum Fare */
	@Test
	public void returnMinimumFare() {
		double distance = 0.1;
		int time = 1;
		double fare = cabInvoiceGenerator.CalculateFare(distance, time);
		assertEquals(5.0, fare, 0.0);
	}

	/* Testing for Avergae multiple rides for User */
	@Test
	public void returnFare_ForMultipleRides() {
		Rides[] rides = { new Rides(3.0, 4), new Rides(0.1, 1) };
		InvoiceData result = cabInvoiceGenerator.CalculateFareMultipleRides(rides);
		System.out.println(result);
		InvoiceData invoicedata = new InvoiceData(2, 36.0);
		assertEquals(result, invoicedata);

	}

	/* Testing Invoice Summary for Every User's Data */
	@Test
	public void return_Fare_for_evry_User() {
		InvoiceData invoiceData = cabInvoiceGenerator.calculate_summary_forUser(2);
		InvoiceData result = new InvoiceData(2, 36.0);
		assertEquals(invoiceData.getinvoicedata(), result.getinvoicedata());

	}
	/*-------------------For Premium User------------------------*/
	
	/* Testing Method for Premium User */
	@Test
	public void returnPremiumFare() {
		double distance = 3.0;
		int time = 4;
		double fare = cabInvoiceGenerator.Calculate_Premium_Fare(distance, time);
		assertEquals(53, fare, 0.0);
	}
	
	/* Testing for Returning Minimum Fare */
	@Test
	public void returnMinimum_Premium_Fare() {
		double distance = 1.0;
		int time = 1;
		double fare = cabInvoiceGenerator.Calculate_Premium_Fare(distance, time);
		assertEquals(20.0, fare, 0.0);
	}
	
	/* Testing for Avergae multiple rides for Premium User */
	@Test
	public void returnFare_ForMultiple_Premium_Rides() {
		Rides[] premium_rides = { new Rides(3.0, 4), new Rides(1.0, 1) };
		InvoiceData result = cabInvoiceGenerator.CalculateFareMultiple_Premium_Rides(premium_rides);
		System.out.println(result);
		InvoiceData invoicedata = new InvoiceData(2, 70.0);
		assertEquals(result, invoicedata);
	}
	
	/* Testing Invoice Summary for Every  Premium User's Data */
	@Test
	public void return_Fare_for_evry_Premimu_User() {
		InvoiceData invoiceData = cabInvoiceGenerator.calculate_summary_for_Premium_User(2);
		InvoiceData result = new InvoiceData(2, 70.0);
		assertEquals(invoiceData.getinvoicedata(), result.getinvoicedata());
	}
}
