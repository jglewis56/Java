import java.util.Scanner; // scanner class for user input
public class AddTwoNumbers {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int a,b,c;
		String output="The result is ";
		a=input.nextInt();
		b=input.nextInt();
		input.close();
		c=a+b;
		System.out.println(output);
		System.out.println(c);
	}

}
