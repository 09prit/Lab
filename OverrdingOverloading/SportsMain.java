// Sports class representing a generic sport
class Sports 
{
	// Method to play the sport
	void play() 
	{
		System.out.println("Playing a sport");
	}
}

// Football class representing the sport of football, extends Sports
class Football extends Sports 
{
	// Override play method to specify playing football
	@Override
	void play() 
	{
		System.out.println("Playing football");
	}
}

// Basketball class representing the sport of basketball, extends Sports
class Basketball extends Sports 
{
	// Override play method to specify playing basketball
	@Override
	void play() 
	{
		System.out.println("Playing basketball");
	}
}

// Rugby class representing the sport of rugby, extends Sports
class Rugby extends Sports 
{
	// Override play method to specify playing rugby
	@Override
	void play() 
	{
		System.out.println("Playing rugby");
	}
}

// Main class to test the Football, Basketball, and Rugby classes
public class SportsMain 
{
	public static void main(String[] args) 
	{
		// Create instances of Football, Basketball, and Rugby
		Football football = new Football();
		Basketball basketball = new Basketball();
		Rugby rugby = new Rugby();

		// Call play method for each instance to play the respective sports
		football.play();
		basketball.play();
		rugby.play();
	}
}

output:

Playing football
Playing basketball
Playing rugby
