//Check weather entered number is positive or negative using Switch case.
import java.util.Scanner;

public class PositiveNegativeSwitchcase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,c;
		System.out.print("Enter the Number : ");
		num=sc.nextInt();
		c=(num>0)?1:(num<0)?2:3;
		switch(c)
		{
		case 1:
			System.out.println(num+" is a positive number");
			break;
		case 2:
			System.out.println(num+" is a negative number");
			break;
		default:
			System.out.println(num+" is neither positive nor negative");
		}
		sc.close();
	}

}
