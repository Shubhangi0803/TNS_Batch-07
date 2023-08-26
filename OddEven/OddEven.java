//Check weather entered number is odd or even using if-else.
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.print("Enter the Number : ");
		num=sc.nextInt();
		if(num%2==0)
			System.out.println(num+" is Even number");
		else
			System.out.println(num+" is Odd number ");
		sc.close();
	}
	

}
