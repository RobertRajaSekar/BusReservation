package BusResv;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking { 
	String PassengerName;
	int BusNo;
	Date Date;
	
	
	Booking(){
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the name of the passenger:");
		PassengerName = S.next();
		System.out.println("Enter bus no:");
		BusNo = S.nextInt();
		System.out.println("Enter date dd-mm-yyyy");
		String dateInput =S.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			Date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean isAvailable(ArrayList<Booking> Bookings,ArrayList<Bus> Buses) {
		int Capacity =0;
		for(Bus Bus:Buses) {
			if(Bus.getBusNo() == BusNo)
				Capacity = Bus.getCapacity();
		}
		int booked =0;
		for(Booking b:Bookings) {
			if(b.BusNo == BusNo && b.Date.equals(Date)) {
				booked ++;
			}
		}
		return booked<Capacity?true:false;
	}
}
