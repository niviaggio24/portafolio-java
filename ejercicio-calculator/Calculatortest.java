public class Calculatortest {
	
	
	public static void main(String[] args) 
	{
		Calculator oper= new Calculator();       // build object
		
		int val1;
		int val2;
		Integer[] result = new Integer[4];
		
		//Sum+Sub+Mul+Mod
		
		val1 = 8;
		val2 = 6;		
				
		System.out.println("Sum: " + oper.sum(val1,val2));
		System.out.println("Sub: " + oper.sub(val1,val2));
		System.out.println("Mult: " + oper.mult(val1,val2));
		System.out.println("Mod: " + oper.mod(val1,val2));
		//print array
		System.out.println(" ");
		System.out.println("Array arithmetic operations: ");
		System.out.println(" ");
		result=oper.operation(val1,val2);
		System.out.println("Sum: "+ result[0]);
		System.out.println("Sub: "+ result[1]);
		System.out.println("Mult: "+ result[2]);
		System.out.println("Mod: "+ result[3]);
		
		//print randon
		System.out.println("Random: "+ oper.aleatorio(val1));

	}
}

