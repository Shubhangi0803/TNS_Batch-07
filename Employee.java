/*Write a java program to calculate an employee salary based on following criteria :
 	1. Accept basic payment(4500-6500)
 	2. Calculate DA 2% of basic
 				 TA 1% of basic
 				 HRA 3% of basic
 	3. The employee is eligible for 0.5% of PF
 	4. If the salary of employee is more than 10000 is eligible for 1000rs deduction in account of tax
 	5. Also calculate the retirement date on basis of age which is 55 years as a standard of company*/

import java.time.LocalDate;
import java.util.Scanner;

public class Employee
{
    public static void main(String args[])
    {
        String emp_name,dob;
        int emp_id,retirementage = 55;
        Double basic,DA,TA,HRA,salary,PF,deduct_amount;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Employee id     : ");
	  emp_id=sc.nextInt();
 	  System.out.print("Enter Employee Name   : ");
	  emp_name=sc.next();
        System.out.print("Enter your data of birth yyyy-mm-dd format :");
        dob = sc.next();
        LocalDate birthDate = LocalDate.parse(dob);
        LocalDate retirementDate = birthDate.plusYears(retirementage);
        System.out.print("Enter the basic payment between 4500 and 6500:");
        basic = sc.nextDouble();
        DA=basic*0.2;
	  TA=basic*0.1;
	  HRA=basic*0.3;
        PF=(basic+DA)*0.5;
	  salary=basic+DA+HRA;
        if(basic<4500 || basic>6500)
        {
            if(basic < 4500)
            {
                System.out.println("Basic payment is low than the specified range !");
                return;
            }
            if(basic > 6500)
            {
                System.out.println("Basic payment is exceeding the sepcified range !");
                return;
            }
        }
            System.out.println("\n----- Employee Details ----\n");
		System.out.println("EMPID              : "+emp_id);
		System.out.println("Employee Name      : "+emp_name);
	      System.out.println("Date of birth      : "+birthDate);
		System.out.println("Basic Salary       : "+basic);
		System.out.println("Dearness Allow     : "+DA);
		System.out.println("Travel Allow       : "+TA);
		System.out.println("HouseRent Allow    : "+HRA);
		System.out.println("Net Salary Pay     : "+salary);
		System.out.println("Provident Fund     : "+PF);
		System.out.println("Retirement Date    : "+retirementDate);
		if(salary>10000)
		{
			System.out.println("\nEmployee is eligible for 1000 RS deduction of professional tax.");
			deduct_amount=salary-1000;
			System.out.println("\nSalary after deduction :"+deduct_amount);
		}
		else
		{
			System.out.println("Employee is not eligible for 1000 rs. deduction of professional tax.");
		}
		sc.close();
    }
}