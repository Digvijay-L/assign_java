package testinvoice;
import java.util.Scanner;

import Invoice.Invoice;

public class TestInvoice {
     static Scanner sc=new Scanner(System.in);
     
	 static int choice()
	{
		int choice;
		
		System.out.println("0:exit");
		System.out.println("1:Accept INFO of sold Item");
		System.out.println("2:generate bill");
		System.out.println("Enter the choice");
		choice=sc.nextInt();
		return choice;

	}
	
	public static void main(String[] args) {

	Invoice invice[]=new Invoice[4];
	for(int i=0;i<4;i++)
	{
		invice[i]=new Invoice();
	}

     int choice;
     int index=0;
    
    while((choice=choice())!=0)
    {
    
    switch (choice) 
    {
    
	case 1:if(index<4)
	       {
		      invice[index].acceptInformation();
		      index++;
	       }
	
		break;

	case 2:for(int i=0;i<index;i++)
	       {
		     System.out.println("Part number: "+invice[i].getPartNumber());
		     System.out.println("Part Discription: "+invice[i].getPartDescription());
		     System.out.println("Part Quantity: "+invice[i].getQuanityOfItems());
		     System.out.println("Part Price: "+invice[i].calculateInvoiceAmount());
	       }
	
	   break;
	   
	default: System.out.println("INVALID CHOICE");
		break;
	}
    
    
	}

}
}