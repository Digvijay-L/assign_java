package com.app.geometry;

import java.util.Scanner;

public class Point2D {
   
	double x;
	double y;
	
	public Point2D() 
	{
		this.x = 0;
		this.y = 0;
	}
	
 public void acceptDetails() {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter value of point of X1:");
      x=sc.nextDouble();
      System.out.println("enter value of point of Y1:");
      y=sc.nextDouble();	
}
	public String getDetails()
    {
	    String s1=Double.toString(x);
	    String s2=Double.toString(y);
 
        return "Point (" + s1 + ", " + s2 + ")";	    
    }

	public boolean equal(Point2D p2) {
		if(this.x==p2.x && this.y==p2.y)
		return true;
		return false;
	}

	public double getDistance(Point2D p2) {
		double x=this.x=p2.x;
		double y=this.y-p2.y;
		
		return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
	}
    
    
    
}

