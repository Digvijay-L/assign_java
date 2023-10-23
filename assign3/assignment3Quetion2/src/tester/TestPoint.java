package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		
      Scanner sc=new Scanner(System.in);
      
     
      
      System.out.println("enter value of point of X2:");
      double x2=sc.nextDouble();
      System.out.println("enter value of point of Y2:");
      double Y2=sc.nextDouble();
      
      Point2D p1=new Point2D(x1, Y1);
      Point2D p2=new Point2D(x2, Y2); 
      
      System.out.println("p1 point:"+p1.getDetails());
      System.out.println("p1 point:"+p2.getDetails());
	
	
     if(p1.equal(p2))
     {
    	 System.out.println("p1 and p2 are located on same location");
     }
     else
     {
    	 double distance=p1.getDistance(p2);
    	 System.out.println(distance);
     }
     
     
	}
}
