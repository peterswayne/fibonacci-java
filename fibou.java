package Test;

public class quat {
	//initialise variables
	int x=0;
	int first=1;
	int second=1;
	int product=0;
	int Number;
	
	//constructor 
	public quat(int Number)
	{
		//rints the number
		System.out.println("The number is "+Number);
		//loops while x is less than the number passes
		while( x <Number)
		{
			//checks if x is less than or equal to 1
			if (x<=1)
			{
				//prints 1
				System.out.println(1);
				//x is set to 2
				x=2;
			}
			//product is set to the sum of the first and second number
			product=first+second;
			//prints the second number
			System.out.println(product);
			//first is set as second
			first=second;
			//second set as product
			second=product;
			//x is incremented
			x++;
		}
	}
	
	//Random method just to for testing 
	public void show(int var)
	{
		System.out.print(var+" THIS");
	}
}
