package com.app.geometry;

public class Point2D {
   
	double x;
	double y;
	
	public Point2D(double x, double y) 
	{
		this.x = x;
		this.y = y;
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

