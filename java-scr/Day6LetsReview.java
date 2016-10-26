import java.io.*;
import java.util.*;
public class Day6LetsReview {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int T=scan.nextInt();
		String string[]=new String[T];
		
		for(int i=0;i<T;i++)//Get the name
		{
			string[i]=scan.next();
		}
		
		for(int j=0;j<T;j++)
		{
			for(int k=0;k<string[j].length();k=k+2)//print out the even-numbered letters
			{
				System.out.print(string[j].charAt(k));
			}
			System.out.print(" ");
			for(int k=1;k<string[j].length();k=k+2)//odd numbers
			{
				System.out.print(string[j].charAt(k));
			}
			System.out.println();
		}
	}
}
		


