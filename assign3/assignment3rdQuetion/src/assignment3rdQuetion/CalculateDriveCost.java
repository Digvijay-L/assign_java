package assignment3rdQuetion;

import java.util.Scanner;


public class CalculateDriveCost {

		static Scanner sc=new Scanner(System.in);
		public static int choice()
		{
			System.out.println("case 0:exit");
			System.out.println("case 1:accept Details");
			System.out.println("case 2:display Daily Driving Cost ");
			System.out.println("Enter the choice");
			
			int choice=sc.nextInt();
			return choice;
		}
		
		public static void main(String[] args) {
			
		   
		      
		      System.out.println("enter the number of Vehicles detalis going to accept:=");
		      int size=sc.nextInt();
		      
		      DriveCost p[]=new DriveCost[size];
		      int choice;
		      int index=0;
		
			while((choice=choice())!=0)
			{
				switch (choice) {
				
				case 1:

				if(index<size)
				{
					p[index]=new DriveCost();
					p[index].accpetData();
					index++;
				}
					  break;
					  
				case 2:
					
			           for(int i=0;i<index;i++)
			           {
			        	  
			        		   p[i].calculateDailyDrivingCost();
			           }
					break;
					
					    
				default:System.out.println("INVALID CHOICE");
					break;
				}
			
		     
		     
			}

	}

}
