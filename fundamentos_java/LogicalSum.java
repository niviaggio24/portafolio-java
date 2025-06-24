public class LogicalSum {
	
	private int and(int a, int b) { //metodo and es el mismo carry
		if (a == 1 && b == 1) {
			return 1;
		}
		
		return 0;
	}
	
	private int xor(int a, int b) {   //metodo and es el mismo sum
		if (a == b) {
			return 0;
		}
		
		return 1;
	}
	
	private int xor(int a, int b, int carry)   //Compueta Xor 
	    { 
		if (a == b && ) 
		{
			return 0;
		}
		
		return 1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int[] halfAdder(int a, int b) { // devuelvo arrego suma y carry
		int sum = xor(a, b);               // llamo metod xor  y le paso a suma
		int carry = and(a, b);             // llamo metod xor  y le paso a suma
		
		int[] result = new int[2];         // Creo el objeto y lo instancio
		result[0] = sum;
		result[1] = carry;
		
		return result;                     // 
	}
	
	public int[] fullAdder(int a, int b, int carry) {
		// Inserte aquí el fabuloso código del FullAdder
	}
	
	public static void main(String[] args) {
		LogicalSum ls = new LogicalSum();   // Se crea una instancia del metodo logicalsum
		
		int[] results = new int[2];         //   

		results = ls.fullAdder(0, 0, 0);
		System.out.println("Sum: " + results[0] + " Carry: " + results[1]);
		
		results = ls.fullAdder(0, 1, 0);
		System.out.println("Sum: " + results[0] + " Carry: " + results[1]);
		
		results = ls.fullAdder(1, 0, 0);
		System.out.println("Sum: " + results[0] + " Carry: " + results[1]);
		
		results = ls.fullAdder(1, 1, 0);
		System.out.println("Sum: " + results[0] + " Carry: " + results[1]);
		
		results = ls.fullAdder(0, 0, 1);
		System.out.println("Sum: " + results[0] + " Carry: " + results[1]);
		
		results = ls.fullAdder(0, 1, 1);
		System.out.println("Sum: " + results[0] + " Carry: " + results[1]);
		
		results = ls.fullAdder(1, 0, 1);
		System.out.println("Sum: " + results[0] + " Carry: " + results[1]);
		
		results = ls.fullAdder(1, 1, 1);
		System.out.println("Sum: " + results[0] + " Carry: " + results[1]);

	}

}
