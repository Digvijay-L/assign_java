package assignment3rdQuetion;

import java.util.Scanner;

public class DriveCost {
       double totalMiles;
       double costPerGallon;
       double AverageMilesPerGallon;
       double parkingFees;
       double tollCharges;
       
       
	public DriveCost() 
	{
		
		this.totalMiles = 0;
		this.costPerGallon = 0;
		this.AverageMilesPerGallon = 0;
		this.parkingFees = 0;
		this.tollCharges = 0;
	}
       
       public void accpetData()
       {
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("enter the Total miles driven per day:=");
    	   totalMiles=sc.nextDouble();
    	   System.out.println("enter the Cost per gallon of gasoline:=");
    	   costPerGallon=sc.nextDouble();
    	   System.out.println("enter the Average miles per gallon.:=");
    	   AverageMilesPerGallon=sc.nextDouble();
    	   System.out.println("enter the Parking fees per day:=");
    	   parkingFees=sc.nextDouble();
    	   System.out.println("enter the Tolls per day.:=");
    	   tollCharges=sc.nextDouble();
    	   
       }
       
       public void calculateDailyDrivingCost()
       {
    	   double gasolineForOneDayInGallon=totalMiles/AverageMilesPerGallon;
    	   double fuelCost=gasolineForOneDayInGallon*costPerGallon;
    	   double totalCost=fuelCost+parkingFees+tollCharges;
    	   System.out.println("Your Daily Driving Cost: "+totalCost);
       }
       
}

































