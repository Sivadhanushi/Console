package com.airline.model;

public class FlightModel {
	 private int flightNo;
		private String flightName;
		private int Capacity;
		private String flightLocation;
		private String flightDestination;
		private int ticketCost;
		
		
	 public	FlightModel(int no,String name,String location,String des,int cap,int ticc)
	 {
			this.flightName = name;
			this.flightNo=no;
			this.Capacity = cap;
			this.flightLocation = location;
			this.flightDestination = des;
			this.ticketCost = ticc;
			
	 }
		
		public int getflightNo() {
			return flightNo;
		}
		public int getticketCost() {
			return ticketCost;
		}
		
		public String getflightName() {
			return flightName;
		}
		
		public String getflightLocation() {
			return flightLocation;
		}
		public String getflightDestination() {
			return flightDestination;
		}
		
		public int getCapacity() {
		return Capacity;
	    }
		
		public void setCapacity(int capacity) {
			Capacity = capacity;
		}
}
