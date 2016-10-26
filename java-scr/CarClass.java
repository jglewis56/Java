
public class CarClass 
{
	int maxSpeed=120;
	int minSpeed=0;
	double weight= 4079;
	boolean isCarOn=false;
	char condition='A';
	String nameofCar="Betsy";
	double maxfuel=16;//gallons
	double currentfuel=8;
	double mpg=26.4;//miles per gallon
	int numPeople=1;
	
	public void printvariables ()
	{
		System.out.println("This is the maxSpeed"+ maxSpeed);
		System.out.println("this is the weight of the car"+weight);
		System.out.println("Name of car is " +nameofCar);
		System.out.println("The amount of fuel in the car is "+currentfuel);
		System.out.println("The amount of people in the car is " +numPeople);
	}
	

}
