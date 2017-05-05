class Films extends Inputs
{
	void Film()
	{
		System.out.println("Welcome to QA Cinemas!");
		System.out.println("");
		System.out.println("Please enter the number corresponding to the film you wish to view: ");
		System.out.println("");
		System.out.println("Guardians of the Galaxy: (1)");  // asks the user what film they wish to see 
		System.out.println("Beauty and the Beast:    (2)");
		System.out.println("Gohst Shell:             (3)");
		System.out.println("Fate of the Furious:     (4)");
		System.out.println("The Boss Baby:           (5)");
		System.out.println("Alien Covenant:          (6)");
		System.out.println("A Dogs Purpose:          (7)");
		
		Inputs I = new Inputs(); //creates a new instance of the inputs class
		I.inputFilms(); //calls the method inputFilms inside the inputs class
		
	}
}