package Invoice;
import java.util.Scanner;
public class Invoice {

	String partNumber;
	String partDescription;
	int quanityOfItems;
	double price;
	double billAmount;
	
	public Invoice() {
		
		this.partNumber = "";
		this.partDescription = "";
		this.quanityOfItems = 0;
		this.price = 0;
	}
	
	public Invoice(String partNumber, String partDescription, int quanityOfItems, double price) {
	
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quanityOfItems = quanityOfItems;
		this.price = price;
	}


	public String getPartNumber() {
		return partNumber;
	}


	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}


	public String getPartDescription() {
		return partDescription;
	}


	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}


	public int getQuanityOfItems() {
		return quanityOfItems;
	}


	public void setQuanityOfItems(int quanityOfItems) {
		this.quanityOfItems = quanityOfItems;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	public void acceptInformation()
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the part number: ");
		 this.partNumber=sc.nextLine();
		System.out.println("enter the part discription: ");
		 this.partDescription=sc.nextLine();
		System.out.println("enter the part quantity: ");
		 this.quanityOfItems=sc.nextInt();
		System.out.println("enter the part price: ");
		 this.price=sc.nextDouble();
	}
	
	public double calculateInvoiceAmount()
	{
		if(this.quanityOfItems<0)
		{
			this.billAmount=0;
		}
		else
		if(this.price<0)
		{
			this.billAmount=0;
		}
		else
		{
		   this.billAmount=this.price*this.quanityOfItems;
		}
		
		return billAmount;
	}

}
