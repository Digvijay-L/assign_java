package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {

	 static Scanner sc=new Scanner(System.in);
	public static int choice()
	{
		System.out.println("case 0:exit");
		System.out.println("case 1:accept Points");
		System.out.println("case 2:display specific Point");
		System.out.println("case 3:display all Points");
		System.out.println("case 4:validate");
		System.out.println("Enter the choice");
		
		int choice=sc.nextInt();
		return choice;
	}
	
	public static void main(String[] args) {
		
	   
	      
	      System.out.println("enter the number of points going to plot:=");
	      int size=sc.nextInt();
	      
	      Point2D p[]=new Point2D[size];
	      int choice;
	      int index=0;
	
		while((choice=choice())!=0)
		{
			switch (choice) {
			
			case 1:

			if(index<size)
			{
				p[index]=new Point2D();
				p[index].acceptDetails();
				index++;
			}
				  break;
				  
			case 2:
		           System.out.println("enter the index of point want to see:=");
		           int user_index=new Scanner(System.in).nextInt();
		           
		           if(user_index<index)
		           {
		        	  
		        		   String str=p[user_index].getDetails();
		        		   System.out.println(str);
		           }
				break;
				
			case 3:
		          for(Point2D point:p)
		          {
		                String str=point.getDetails();
		                System.out.println(str);
		          }
				
		          break;
		          
			case 4:
				  System.out.println("Enter the first point number to validate:");
				  int i=new Scanner(System.in).nextInt();
				  System.out.println("Enter the Second point number to validate:");
				  int j=new Scanner(System.in).nextInt();
				  
				     if(p[i].equal(p[j]))
				     {
				    	 System.out.println("p1 and p2 are located on same location");
				     }
				     else
				     {
				    	 double distance=p[i].getDistance(p[j]);
				    	 System.out.println(distance);
				     } 
				     
				    break;
				    
			default:System.out.println("INVALID CHOICE");
				break;
			}
		
	     
	     
		}

	}
}
