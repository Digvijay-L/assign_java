package creditlimit;

import java.util.Scanner;

public class TestCredit {

	 Scanner sc=new Scanner(System.in);
	public static int choice()
	{
		System.out.println("case 0:exit");
		System.out.println("case 1:acceptdata");
		System.out.println("case 2:check credit");
		System.out.println("Enter the choice");
		int choice=new Scanner(System.in).nextInt();
		return choice;
	}
	
	public static void main(String[] args) {
        
        CreditLimit arr[]=new CreditLimit[4];
        int choice;
        int index=0;
        
        
        while((choice=choice())!=0)
        {
        	switch (choice) {
        	case 1:
        		   System.out.println("enter the Account number: ");
        		   int acc_num=new Scanner(System.in).nextInt();
        		   System.out.println("enter the Allowed credit: ");
        		   int allow_credit=new Scanner(System.in).nextInt();
        		   System.out.println("enter the Items charges: ");
        		   int item_charge=new Scanner(System.in).nextInt();
        		   System.out.println("enter the Credit applied: ");
        		   int credit_applied=new Scanner(System.in).nextInt();
        		   System.out.println("enter the Remaining balance: ");
        		   int rem_balance=new Scanner(System.in).nextInt();
        		   
        			
   				if(index<4)
   			   {
   				   arr[index]=new CreditLimit(acc_num, allow_credit, item_charge, credit_applied, rem_balance);
   			       index++;
   			   }
   				
   				break;
        	case 2:  System.out.println("enter the account number:");
        	         int acc=new Scanner(System.in).nextInt();
        	         
        	         
        		for(int i=0;i<index;i++)
        		{
        			if(acc==arr[i].getAccountNumber())
        			arr[i].checkCredit();
        		}
				break;

			default:System.out.println("INVALID choice");
				break;
			}
        }
       
	}

}
