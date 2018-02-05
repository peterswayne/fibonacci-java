package Test;
import java.util.Scanner;

public class ctrl {

	public static void main(String args[]) 
	{
		System.out.println("Enter in the number of emmmm\n");
		Scanner sc = new Scanner(System.in);
		int var=sc.nextInt();
		quat a1 = new quat(var); 
		a1.show(3);
	}

}
