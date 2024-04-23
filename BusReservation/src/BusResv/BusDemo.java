package BusResv;

import java.util.Scanner;
import java.util.ArrayList;
public class BusDemo {
      public static void main(String[] args){
    	  ArrayList<Bus>Buses =new ArrayList<Bus>();
    	  ArrayList<Booking> Bookings = new ArrayList<Booking>();
    	  
    	  Buses.add(new Bus(1,true,2));
    	  Buses.add(new Bus(2,false,50));
    	  Buses.add(new Bus(3,true,48));
    	  
    	  int userOpt =1;
    	  Scanner S= new Scanner(System.in);
    	  
    	  for(Bus b :Buses) {
    		  b.displyBusinfo();
    	  }
    	  
    	  while(userOpt==1) {
    	  System.out.println("Enter 1 to book and 2 to exit");
    	  userOpt = S.nextInt();
    if(userOpt ==1) {
    	Booking Booking = new Booking(); 
    	if(Booking.isAvailable(Bookings,Buses)) {
    		Bookings.add(Booking);
    		System.out.println("Your booking is confirmed");
    	}
    	else
    		System.out.println("Sorry,Bus is full...Try Another Bus or Date");
    }
    	  }
    	  
}
}