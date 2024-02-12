 package in.ashokit.servic;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import in.ashokit.request.Passenger;
import in.ashokit.response.Ticket;
@Service
public class BookingServiceImpl  implements BookingService{

	private Map<Integer , Ticket> ticketMap=  new HashMap();
	private Integer ticketNum =1;
	
	
	
	
	@Override
	public Ticket bookTicket(Passenger passanger) {
		
		Ticket t = new Ticket();
		BeanUtils.copyProperties(passanger, t );
		t.setTicketCost(550.0);
		t.setStatus("CONFIRMED");
		t.setTicketNum(ticketNum);
		ticketNum++;
		
		ticketMap.put(ticketNum, t);
		return t;
	}

	@Override
	public Ticket getTicket(Integer ticketNumber) {
		
		if(ticketMap.containsKey(ticketNumber)) {
			return ticketMap.get(ticketNumber);
		}
			
		return null;
	}

}
