package com.airline.controller;

import java.util.ArrayList;

import com.airline.model.FlightModel;

public class FlightController {
	static ArrayList<FlightModel> flights= new ArrayList<>();
	public FlightController()
	{

		flights.add(new FlightModel(1, "AirIndia", "Mumbai", "Chennai", 2,1500));
		flights.add(new FlightModel(2, "JetAir", "Delhi", "Hyderabad", 50,2000));
		flights.add(new FlightModel(3, "Indigo", "Pune", "Bangalore", 48,1300));
		flights.add(new FlightModel(4, "AirIndia","Bangalore","Chennai",52,4000));
		flights.add(new FlightModel(5, "indigo","Pune","Chennai",52,5000));
	}
	
	
	public String [] ticketBooking( int flightNo, String pname, String email, int ticketCount) {
		   
		
	    String arr[] =new String[2];
		for (FlightModel ft : flights)
		{
			if(ft.getflightNo()==flightNo) {
				    ft.setCapacity(ft.getCapacity()-ticketCount);
				    int  totalcost =ft.getticketCost()*ticketCount;
				      String tc=Integer.toString(totalcost);
				arr[0]=tc;
				arr[1]=ft.getflightName(); // print
				
				
				
				
				
				
			}
		
			}

		  return arr;
	}
	public static  void viewFlight()
	{ 
		
  
		for (FlightModel ft : flights)
		{
			System.out.println(ft.getflightNo()+" "+ft.getflightName()+" "+ft.getflightLocation()+" "+ft.getflightDestination()+" "+ft.getCapacity());
			}

		}

	}