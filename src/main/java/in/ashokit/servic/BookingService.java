package in.ashokit.servic;

import in.ashokit.request.Passenger;
import in.ashokit.response.Ticket;

public interface BookingService {
	
	public Ticket bookTicket(Passenger  passanger);
	public  Ticket getTicket(Integer ticketNumber);

}
