import java.util.*;
public class Arithmetic_operation {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		int r;
		do{
			System.out.println("Do you want to perform the Task ? Y/N");
			r = sc.next().charAt(0);
			switch(r)
			{
			case 'Y':
					int num1,num2,result;
					System.out.print("Enter first Number :");
					num1=sc.nextInt();
					System.out.print("Enter second Number :");
					num2=sc.nextInt();
					int ch;
					System.out.println("1.Addition");
					System.out.println("2.Subtraction");
					System.out.println("3.Mutiplication");
					System.out.println("4.Division");
					System.out.println("5.Exit");
					do{
						System.out.print("Enter Your Choice :");
						ch=sc.nextInt();
						switch(ch){
						case 1:
							result=num1+num2;
							System.out.println("Addition = "+result);
						break;
						case 2:
							result=num1-num2;
							System.out.println("Subtraction = "+result);
						break;
						case 3:
							result=num1*num2;
							System.out.println("Multiplication = "+result);
						break;
						case 4:
							result=num1/num2;
							System.out.println("Division = "+result);
						break;
						case 5:
							System.out.println("Terminated");
							System.exit(1);
					
						default:
							System.out.println("Invalid Choice");
						}
					}while(ch<=5);
					break;
			case 'N':
				System.out.println("Terminated");
				System.exit(1);
				break;
			
			}
		}while(r<='N');
	}
}
