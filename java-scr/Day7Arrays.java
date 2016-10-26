import java.io.*;
import java.util.*;
// create an array of sizee n from user input and print out the numbers in reverse order
public class Day7Arrays 
{

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[]array=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=in.nextInt();//load the array
		}
		in.close();
		for(int i=n-1;i>=0;i--)// reverses it, the reason for n-1 is because an array index starts at zero,
		{                      // an array of 4 goes from 0-3.
			System.out.print(array[i] +" ");
		}

	}

}
