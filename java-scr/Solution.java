import java.util.*;
import java.io.*;
public class Solution 
{

	public static void main(String[] args) 
	{
		
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		input.close();
		for(int i=0;i<=num;i++)
		{
			for(int j=0;j<=num;j++)
			{
				for(int k=0;k<=num;k++)
				{
					if(i>=0&&j>=0&&k>=0)
						if(i+j+k==num)
							if(i!=k&&i!=j&&j!=i&&j!=k&&k!=i&&k!=j)
								{
								//System.out.println(num);
								System.out.println(i +" " + j+" "+ k);
								}
				}
			}
		}
	}
}
