package com.CabInvoiceGenerator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestClass {
	CabInvoiceGenerator cabInvoiceGenerator;
	
@Before
public void TestInvoiceGenerator() {
	cabInvoiceGenerator= new CabInvoiceGenerator();
}

@Test
public void TestReturnFare() {
	
	double Fare = cabInvoiceGenerator.CalculateFare(2.0,5.0);
	
	assertEquals(Fare, 25.0,0.0);
}
@Test
public void TestReturnMinimumFare() {

	double Fare =cabInvoiceGenerator.CalculateFare(0.1, 1.0);
	
	assertEquals(Fare, 5.0,0.0);
}

}
