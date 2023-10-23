import java.util.Scanner;

public class FoodMenu {

       static Scanner sc=new Scanner(System.in);
			
			static int choice()
			{
			    int choice;
			    System.out.println("case 0:exit");
			    System.out.println("case 1:Dosa");
			    System.out.println("case 2:Samosa");
			    System.out.println("case 3:Idli");
			    System.out.println("case 4:totalBill");
			    System.out.println("case 5:Enter the choice: ");
                
                choice=sc.nextInt();
                return choice;
                
			}
			
			
		public static void main(String[] args) {
			
			int priceOfDosa=20;
			int priceOfIdli=40;
			int priceOfSamosa=30;
            int choice,quantity=0;
			
	while((choice=choice())!=0)
	{

			
		switch(choice)
		{
		    case 1:
		           System.out.println("Dosa:");
		        	System.out.println("Enter quantity:=");
		        	quantity=sc.nextInt();
		            priceOfDosa=priceOfDosa*quantity;
		            System.out.println("totalBill: "+priceOfDosa);
		            break;
		   
		    case 2:
		           System.out.println("Idli:");
		        	System.out.println("Enter quantity:=");
		        	quantity=sc.nextInt();
		            priceOfIdli=priceOfIdli*quantity;
		            System.out.println("totalBill: "+priceOfIdli);
		            break;

		    case 3:
		           System.out.println("Samosa:");
		        	System.out.println("Enter quantity:=");
		        	quantity=sc.nextInt();
		            priceOfSamosa=priceOfSamosa*quantity;
		            System.out.println("totalBill: "+priceOfSamosa);
		            break;	
		            
		   default:System.out.println("INVALID CHOICE");
		                break;
		}
			
			
			
	}
	
	
	
	
	
	}
	
}
