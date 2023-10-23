package creditlimit;

public class CreditLimit {
  
	   int accountNumber;
	   int allowedCredit;
	   int itemCharges;
	   int creditApplied;
	   int remBalance;
	
	   
	   
	public CreditLimit(int accountNumber, int allowedCredit, int itemCharges, int creditApplied, int remBalance)
	{
		
		this.accountNumber = accountNumber;
		this.allowedCredit = allowedCredit;
		this.itemCharges = itemCharges;
		this.creditApplied = creditApplied;
		this.remBalance = remBalance;
		
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void checkCredit()
	{
		int newBalance=remBalance+itemCharges-creditApplied;
		if(newBalance<allowedCredit)
		{
			System.out.println(" within credit");
			System.out.println("available credit: "+newBalance);
			
		}
		else
		{
			System.out.println("credit limit exceeded");
			System.out.println("available credit: "+newBalance);
		}
	}
	   
}
