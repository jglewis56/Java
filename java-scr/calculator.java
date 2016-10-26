
public class calculator
{
	
   public double add(double n, double j)
   {
	   return n+j;
			   
   }
   public double subtract(double n, double j)
   {
	  return n-j;
	  
   }
   public double multipication(double n, double j)
   {
	  return n*j;
   }
   public double division(double n, double j)
   {
	   return n/j;
   }
   public double exponets(double n, double j)
   {
	   double sum=1;
	  
	   for(int i=1;i<=j;i++)
	   {
		   sum=sum*n;
	   }
	   return sum;
   }
}
