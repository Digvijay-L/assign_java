package testemployee;

import java.util.Scanner;

import employee.Employee;

public class EmployeeTest {

	static Scanner sc=new Scanner(System.in);
	
	static int choice()
	{
		 int choice;
		 System.out.println("case 0:EXIT");
		 System.out.println("case 1:Accept Employee");
		 System.out.println("case 2:Display Employee Salary Per Annum");
		 System.out.println("case 3:Display Employee Salary After Increment");
		 System.out.println("Enter the choice:");
		 choice=sc.nextInt();
		 return choice;
	}
	public static void main(String[] args) {
     
		Employee employee[]=new Employee[2];
		for(int i=0;i<2;i++)
		{
			employee[i]=new Employee();
		}
		
		int choice;
		double sal,newSal=0;
		int index=0;
		
		while((choice=choice())!=0)
		{
	        
			switch (choice) {
			
			case 1:
				String fname,lname;
				System.out.println("enter the First Name:=");
				fname=sc.next();
				System.out.println("enter the Last Name:=");
		        lname=sc.next();
				System.out.println("enter the Salary:=");
		        sal=sc.nextDouble();
		        
				if(index<2)
			      {
				     employee[index].setFirstName(fname);
				     employee[index].setLastName(lname);
				     employee[index].setSalary(sal);
				     
				     index++;
			      }
				
				break;
				
			case 2:for(int i=0;i<index;i++)
			      {
				     System.out.println("Salary Per Annum: "+employee[i].calculateSalary());
			      }
                 break;
            
			case 3:for(int i=0;i<index;i++)
		        {
			     newSal=employee[i].calculateSalary();
			     System.out.println(newSal);
			     newSal=newSal+0.1*newSal;
				 System.out.println(" Employee Salary After Increment: "+newSal);
		        }
                 break;
			default:System.out.println("INVALID CHOICE");
				break;
			}
		}
	}

}
