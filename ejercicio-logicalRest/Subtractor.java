public class LogicalRest
{
	
	private static int and(int a, int b) 
	{
		if (a == 1 && b == 1) 
	{
			return 1;
		}
		
		return 0;
	}
	
	
	private static int xor(int a, int b) 
	
	{
		if (a == b) 
		{
			return 0;
		}
		
		return 1;
	}
	
	
	private static int or(int a, int b)  
	
	{
		if (a == 0 && b == 0) 
		{
			return 0;
		}
		
		return 1;
	}
		
	
	private static int Not (int a) //
	{
		if (a == 1) 
		{
			return 0;
		}
		
		return 1;
	}
	
	public static int[] fullAdder(int a, int b, int carry) {
		int[] result = new int[2];

		result[0] = xor(xor(a, b), carry);                  
		result[1] = or(and(xor(a, b), carry), and(a, b)); 

		return result;

	}
		
	public static int[] SubstractorhalfAdder(int a, int b)
	{
		int bout = and(Not(a), b);                   	
		int diferencia = xor(a, b);
		
		int[] result = new int[2];
		
		result[0] = diferencia;
		result[1] = bout;
		
		return result;
	}
	
	
	public static int[] SubstractorfullAdder(int a, int b, int bin)
	
	{
		int[] result = new int[2];
		
		result[0] = xor(xor(a, b), bin);                          //Difference  
		result[1] = or(and(Not(a),b),and(Not(xor(a, b)),bin));    //Bout		   
			
		return result;
	}
			
	
	public static int[][] SubstractorfullAdder4bits(int[] a, int[] b, int carry)	
	{
	
		int i = 0;
		int[] sumaycarry;
		int resultadototal[][];
		resultadototal = new int[4][2];

		while (i < 4) {
			sumaycarry = SubstractorfullAdder(a[i], b[i], carry);

			resultadototal[i][0] = sumaycarry[0];
			resultadototal[i][1] = sumaycarry[1];
			carry = resultadototal[i][1];
			
		i=i+1;
		
		}

		return resultadototal;
		
	
	}

	
	public static void main(String[] args) 
	
	{
		int carryentrada = 0;
		int[][]  resultado = new int[4][];
		resultado[0] = new int[2];
		resultado[1] = new int[2];
		resultado[2] = new int[2];
		resultado[3] = new int[2];
		
		int[] a = { 1, 1, 0, 1 };
		int[] b = { 1, 0, 0, 0 };

		 resultado = SubstractorfullAdder4bits(a, b, carryentrada);		 
		 	 
		 System.out.println("Res: "+resultado[3][1]+resultado[3][0]+resultado[2][0]+resultado[1][0]+resultado[0][0]+ " Borrow "+ resultado[3][1]);

	}


}
