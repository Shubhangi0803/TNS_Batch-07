//Check weather entered number is positive or negative else-if ladder.
import java.util.Scanner;

public class PositiveNegativeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.print("Enter the Number : ");
		num=sc.nextInt();
		if(num>0)
		{
			System.out.println(num+" is a positive number");
		}
		else if(num<0)
		{
			System.out.println(num+" is a negative number");
		}
		else
			System.out.println(num+" is neither positive nor negative");
		sc.close();
	}

}
