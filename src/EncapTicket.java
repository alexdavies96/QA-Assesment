public class EncapTicket {

	private int ticketTotal; //initialises a private integer called ticketTotal
	private int wednesdayTotal; //initialises a private integer called wednesdayTotal
	
	public int getTicketTotal() //initialises the getter method for ticket total
	{
		return ticketTotal; //return ticket total
	}
	
	public int getWednesdayTicketTotal() //initialises the getter method for Wednesday ticket total
	{
		return wednesdayTotal; //return Wednesday total
	}
	
	public void setTicketTotal(int newValue) //initialises setter for ticket total 
	{
		ticketTotal = newValue; //a new integer value can be assigned to ticket total
	}
	
	public void setWednesdayTicketTotal(int newValue) //initialises the setter for Wednesday ticket total 
	{
		wednesdayTotal = newValue; //a new integer value can be assigned to Wednesday ticket total
	}
	
}