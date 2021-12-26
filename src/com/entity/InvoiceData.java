package com.entity;

public class InvoiceData {

	int total_Number_OfRide;
	double total_Fare;
	double averageFare_PerRide;

	public InvoiceData(int total_Number_OfRide, double total_Fare) {
		this.total_Number_OfRide = total_Number_OfRide;
		this.total_Fare = total_Fare;
		this.averageFare_PerRide = this.total_Fare / this.total_Number_OfRide;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (obj == null || getClass() != obj.getClass())
			return false;

		InvoiceData other = (InvoiceData) obj;

		return total_Number_OfRide == other.total_Number_OfRide && Double.compare(other.total_Fare, total_Fare) == 0
				&& Double.compare(averageFare_PerRide, averageFare_PerRide) == 0;

	}

}
