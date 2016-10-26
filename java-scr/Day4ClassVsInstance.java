import java.util.*;
import java.io.*;
public class Day4ClassVsInstance
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();//for current age
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();//age after 3 years
			System.out.println();
        }
		sc.close();
    }

	}

