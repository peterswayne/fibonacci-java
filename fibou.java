package Test;

public class quat {

	int x=0;
	int first=1;
	int second=1;
	int product=0;
	int Number;
	
	//constructor 
	public quat(int Number)
	{
	
		System.out.println("The number is "+Number);
		while( x <Number)
		{
			if (x<=1)
			{
				System.out.println(1);
				
				x=2;
			}
			
			product=first+second;
			System.out.println(product);
			first=second;
			second=product;
			x++;
		}
	}
	
	//Random method just to for testing 
	public void show(int var)
	{
		System.out.print(var+" THIS");
	}
}
