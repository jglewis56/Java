import java.util.*;
public class Day2Operators {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		double mealCost=scan.nextDouble();
		int tipPercent=scan.nextInt();
		int taxPercent=scan.nextInt();
		scan.close();
		
		double tip=(mealCost*tipPercent/100);
		double tax=(mealCost*taxPercent/100);
		double total=mealCost+tip+tax;
		int totalCost=(int) Math.round((total));
		
		System.out.println("Your total cost is "+ totalCost);

	}

}
