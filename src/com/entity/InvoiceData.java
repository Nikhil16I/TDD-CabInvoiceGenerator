package com.entity;
import java.util.Objects;

public class InvoiceData {
	/* Initializing Variables */

	int Total_Number_OfRide;
	double Total_Fare;
	double AverageFare_PerRide;

	
	public InvoiceData(int total_Number_OfRide, double total_Fare) {
		super();
		this.Total_Number_OfRide = total_Number_OfRide;
		this.Total_Fare = total_Fare;
		this.AverageFare_PerRide = this.Total_Fare/this.Total_Number_OfRide;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		
		if (obj == null || getClass() != obj.getClass())
			return false;
		
		InvoiceData other = (InvoiceData) obj;

		return Total_Number_OfRide == other.Total_Number_OfRide && Double.compare(other.Total_Fare, Total_Fare) == 0
				&& Double.compare(other.AverageFare_PerRide, AverageFare_PerRide) == 0;
	}

}
