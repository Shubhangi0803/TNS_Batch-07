//Check weather entered number is divisible by 5 & 7 using switch case.
import java.util.Scanner;

public class NumberDivision {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,c;
		System.out.print("Enter the Number : ");
		num=sc.nextInt();
		c=(num%5==0 && num%7==0)?1:(num%5==0)?2:(num%7==0)?3:4;
		switch(c)
		{
		case 1:
			System.out.println(num+" is a divisible by both 5 & 7");
			break;
		case 2:
			System.out.println(num+" is a divisible by 5");
			break;
		case 3:
			System.out.println(num+" is a divisible by 7");
			break;	
		default:
			System.out.println(num+" is neither divisible by 5 nor by 7");
		}
		sc.close();
	}

}
