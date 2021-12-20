package com.CabInvoiceGenerator;

public class CabInvoiceGenerator {
	
	static int  MinimumFare = 5;

	static final double CostPerKM = 10.0;
	static final int CostPerMIN = 1;
	
	public double CalculateFare(double Distance, double Time) {

		double TotalFare = ((Distance * CostPerKM) + (Time * CostPerMIN));
		if (TotalFare < 5) {
			System.out.println("Minimun Fare Should not less than Rs.5 ");
			return MinimumFare;
		}
		return TotalFare;
	}
}
