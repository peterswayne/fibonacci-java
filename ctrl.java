package Test;
import java.util.Scanner;

public class ctrl {

	public static void main(String args[]) 
	{
		
		System.out.println("Enter in the number of emmmm\n");
		//getting user input
		Scanner sc = new Scanner(System.in);
		//placing input into variable
		int var=sc.nextInt();
		//creating new object
		quat a1 = new quat(var); 
		//display 
		a1.show(3);
	}

}
