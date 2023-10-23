
import java.util.Scanner;
public class q2 {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	   
	   
	    System.out.println("enter the First number:=");
	 
	    if(sc.hasNextDouble())
	   {
		   double num1=sc.nextDouble();
		   System.out.println("num1:"+num1);
	   
	   
	   System.out.println("enter the second number:=");
	   
		   if(sc.hasNextDouble())
		   {
			   double num2=sc.nextDouble();
			   System.out.println("avg:="+((num1+num2)/2));
		   }
		   else
		   {
			   System.out.println("please enter double value");
		   }

	   }
	    else
	    {
	    	System.out.println("please enter double");
	    }
        
	}


}

