//Check weather entered number is odd or even using switch case.
import java.util.*;
public class OddEvenSwitch {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int num;
	System.out.print("Enter the Number : ");
	num=sc.nextInt();
	switch(num%2)
	{
	case 0:
		System.out.println(num+" is a Even number");
		break;
	case 1:
		System.out.println(num+" is a Odd number ");
		break;
	}
	sc.close();
	
}
}
