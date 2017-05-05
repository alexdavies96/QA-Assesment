public class Day extends Ticket
{
	void wed()
	{
		System.out.println("Please enter the day of the week: "); //ask the user to enter the day of the week
		
		Inputs I = new Inputs(); //calls a new instance of the class inputs
		I.Day(); //calls the day method of the class inputs
	}
}