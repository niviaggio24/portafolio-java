import java.util.Random; 

public class Calculator 
{

	public int sum(int val1, int val2)  // method returns sum
	{
		int sum = val1 + val2;
		return sum;
	}
	
	public int sub(int val1, int val2)  // method returns sum
 
	{
		int sub = val1 - val2;
		return sub;
	}
	
	public int mult(int val1, int val2) //method returns mult
	 
	{
		int mult = val1 * val2;
		return mult;
	}
	
	public Integer mod(int val1, int val2) // method returns mod

	 
	{
		if(val2==0)
		{
			System.out.println("No es posible hacer una division por cero");
			return null;
		}
		else
		{
			int mod = val1 % val2;
			return mod;
		}
	}	
	
	public Integer[] operation(int val1, int val2) // method returns array arithmetic operations
	 
	{
		Integer[] operaciones = new Integer[4];
		
		operaciones[0] = val1+val2;
		operaciones[1] = val1-val2;
		operaciones[2] = val1*val2;
		
		if(val2==0)
		{
			System.out.println("No es posible hacer una division por cero");
			operaciones[3] = null;
		}
		else
		{
			operaciones[3] = val1%val2;
		}
	
		
		return operaciones;
		

	}
	
	public int aleatorio(int val1) // method returns random
	 
	{
		int aleatorio;
		Random randon = new Random();
		aleatorio= randon.nextInt(val1);
		
		return aleatorio;	

	}		
}
	
	
	
	
	
	
	
	
	
	

