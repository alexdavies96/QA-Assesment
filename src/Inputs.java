import java.util.Scanner;

public class Inputs
{
	private boolean wednesday = false; //initialises a private boolean
	
	void inputFilms() //initialises method inputFilms
	{
		Scanner Sc = new Scanner(System.in); //opens the scanner
		boolean FilmSelect = false;
		
		while (!FilmSelect)
		{
		int film = Sc.nextInt(); //initialises film as the scanner variable 
		
		if (film == 1) //if the user entered 1 for the film 
		{
			System.out.println("You have selected: Guardians of the galaxy!"); //tell the user what film they have chosen 
			System.out.println("");
			FilmSelect = true;
		}
		else if (film == 2) // if the user entered 2 for the film 
		{
			System.out.println("You have selected: Beauty and the beast!"); //tell the user what film they have chosen
			System.out.println("");
			FilmSelect = true;
		}
		else if (film == 3) // if the user entered 3 for the film 
		{
			System.out.println("You have selected: Gohst Shell!"); //tell the user what film they have chosen 
			System.out.println("");
			FilmSelect = true;
		}
		else if (film == 4) //if the user entered 4 for the film 
		{
			System.out.println("You have selected: Fate of the Furious!"); //tell the user what film they have chosen 
			System.out.println("");
			FilmSelect = true;
		}
		else if (film == 5)//if the user entered 5 for the film
		{
			System.out.println("You have selected: The Boss Baby!");//tell the user what film they have chosen 
			System.out.println("");
			FilmSelect = true;
		}
		else if (film == 6) // if the user entered 6 for the film
		{
			System.out.println("You have selected: Alien Covenant!"); //tell the user what film they have chosen 
			System.out.println("");
			FilmSelect = true;
		}
		else if (film == 7) // if the user entered 7 for the film 
		{
			System.out.println("You have selected: A Dogs Purpose!"); //tell the user what film they have chosen 
			System.out.println("");
			FilmSelect = true;
		}
		else 
		{
			System.out.println("Sorry that was not a valid identifier for a film, please try again"); //error message for the user 
			System.out.println("");
			FilmSelect = false;
		}
		}
	}
	
	void ticket() //initialises method ticket
	{
		Scanner Sc = new Scanner(System.in); //opens the scanner for user input
		
		int standard = 8; //initialises integer standard and assigns value 8
		int oap = 6; //initialises integer OAP and assigns value 6
		int student = 6; //initialises integer student and assigns value 6
		int child = 4; //initialises integer child and assigns value 4
		int totalStandard = 0; //initialises integer totalStandard for the total price of Standard tickets 
		int totalOap = 0; //initialises integer totalOAP for the total price of OAP tickets
		int totalStudent = 0; //initialises integer totalStudent for the total price of student tickets
		int totalChild = 0; //initialises integer totalChild for the total price of Child tickets
		
		System.out.println("How many Standard tickets are required: ");  //asks the user how many standard tickets are required
		int i = Sc.nextInt(); //integer i equals the next user input
		if (i > 0)//if i is greater than 0 
		{
			totalStandard = i * standard; //total number of tickets multiplied by total price of one ticket
		}
		
		System.out.println("How many OAP tickets are required: "); //asks the user how many OAP tickets are required
		int f = Sc.nextInt(); // int f equals next user input
		if (f > 0) //if f is less than 0
		{
			totalOap = f * oap; //total number of tickets multiplied by total price of one ticket
		}
		
		System.out.println("How many Child tickets are required: "); //asks the user how many child tickets are required
		int j = Sc.nextInt(); //integer i equals the next user input
		if (j > 0) //if f is less than 0
		{
			totalChild = j * child; //total number of tickets multiplied by total price of one ticket
		}
		
		System.out.println("How many Student tickets are required: "); //asks the user how many student tickets are required
		int k = Sc.nextInt(); //integer i equals the next user input
		if (k > 0) //if f is less than 0
		{
			totalStudent = k * student; //total number of tickets multiplied by total price of one ticket
		}
		int totalTickets = i + f + j + k; //total of tickets calculated by adding all tickets together
		int wednesdayOffer = totalTickets * 2; //Wednesday offer calculated by multiplying total tickets by 2 to get the amount to be deducted 
		int total = totalStandard + totalOap + totalStudent + totalChild; //calculates the total
		int wedOfferTotal = totalStandard + totalOap + totalStudent + totalChild - wednesdayOffer; //calculates the Wednesday offer by total - the previously calculated Wednesday offer
		
		EncapTicket obj = new EncapTicket(); //creates a new instance of the EncapTicket class
		obj.setTicketTotal(total); //calls the setter for ticket total and uses total as the integer
		obj.setWednesdayTicketTotal(wedOfferTotal); //calls the setter for Wednesday ticket total as the integer
		
		if (wednesday) //if boolean Wednesday is true (if the day is Wednesday and the offer can be applied)
		{
		System.out.println("Standard tickets: £" + totalStandard + ".00"); //prints the total price for all standard tickets
		System.out.println("OAP tickets: £" + totalOap + ".00"); //prints the total price for all the OAP tickets
		System.out.println("Child tickets: £" + totalChild + ".00"); //prints the total price for all the child tickets
		System.out.println("Student tickets: £" + totalStudent + ".00"); //prints the total price for all the student tickets
		System.out.println("Total discount is: £" + wednesdayOffer + ".00"); //prints the discount amount
		System.out.println("The total price for your ticket(s) is: £" + obj.getWednesdayTicketTotal() + ".00");//tells the user the total price of their tickets
		}

		else 
		{
		System.out.println("Standard tickets: £" + totalStandard + ".00"); //prints the total price for all standard tickets
		System.out.println("OAP tickets: £" + totalOap + ".00"); //prints the total price for all the OAP tickets
		System.out.println("Child tickets: £" + totalChild + ".00"); //prints the total price for all the child tickets
		System.out.println("Student tickets: £" + totalStudent + ".00"); //prints the total price for all the student tickets
		System.out.println("The total price for your ticket(s) is: £" + obj.getTicketTotal() + ".00");//tells the user the total price of their tickets 
		}
	}

	void Day()//initiates class Day
	{
		Scanner Sc = new Scanner(System.in); //opens the scanner for the user input
		boolean dayEntered = false; //initialises boolean dayEntered and sets it to false for the while loop
		
		while (!dayEntered) //while the boolean dayEntered is false 
		{
		String day = Sc.nextLine();//string day equals the next user input 
		
		if (day.equalsIgnoreCase("wednesday"))//if the user input equals Wednesday (ignores capitals)
		{ 
			System.out.println("Congratulations you have qualified for a £2 discount on every ticket!"); //tells the user they have qualified for the discount
			System.out.println("");
			dayEntered = true;//sets the day entered boolean to true
			wednesday = true; //boolean Wednesday equals true
		}
		else if (day.equalsIgnoreCase("monday") || day.equalsIgnoreCase("tuesday") 
				|| day.equalsIgnoreCase("thursday") || day.equalsIgnoreCase("friday") 
				|| day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")) //if the user input is any other day of the week
		{
			System.out.println("Sorry you have not qualified for the Wednesday discount.");//tells the user they have not qualified for the Wednesday discount
			System.out.println("");
			dayEntered = true;//sets the day entered boolean to true
			wednesday = false;//wednesday boolean equals false
		}
		else //if the other two cases were false execute this 
		{
			System.out.println("Sorry i did not recognise that as a day of the week, please try again: "); //tells the user they did not enter a day so they can try again
			System.out.println("");
			dayEntered = false;//sets the boolean day entered to false so the user can try again
		}
	}
}
}