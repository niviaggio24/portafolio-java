import java.util.Random;

public class Dogtest 
{
	public static void main(String[] args)    
	{
		Random var= new Random();
		int i = 0;	
			
		String[] namedog={"koki","luna","santa","matias","casper"};
		int[] agedog={13,7,15,9,1};
		String[] weight={"12Kgs","17Kgs","22Kgs","4Kgs","25Kgs"};
		String[] barkdog={"Juauu Juauu","Ruff Ruff","Guau Guauu","Auuu Auuu","Rrgua Rrgua"};
		
		Dog ArraysDogs[] = new Dog[5];   //Declaro la cantidad de perros
		
		while(i<5)		
		{
			ArraysDogs[i] = new Dog(); //Intancia			
			ArraysDogs[i].namedog=namedog[var.nextInt(5)];
			ArraysDogs[i].agedog=agedog[var.nextInt(5)];
			ArraysDogs[i].weight=weight[var.nextInt(5)];
			ArraysDogs[i].barkdog=barkdog[var.nextInt(5)];			
			ArraysDogs[i].bark();	
		i=i+1;		
		}
			
    }	
}

