/*********
 * Program to represent senior citizen bank account
 * Developed by
 * ObedOtto C
 * obedotto@saveetha.ac.in
 */
package banking;

public class SeniorCitizenAccount extends BankAccount{
	private double fixedDepositAmount;
	private double years;
	private static final double interestRate;
	
	public SeniorCitizenAccount()
	{
		fixedDepositAmount=0;
		years=0;
	}
	
	public SeniorCitizenAccount(String n,long id,String ad,String mail,long mo,double amount,double yr)
	{
		super(n,id,ad,mail,mo);
		fixedDepositAmount=amount;
		years=yr;
	}
	
	public void printAccount()
	{
		super.printAccount();
		System.out.println("Fixed Deposit Amount:"+fixedDepositAmount);
		System.out.println("Duration:"+years+" years");
	}
	
	public void printStatement()
	{
		double total;
		printAccount();
		
		total=fixedDepositAmount+fixedDepositAmount*years*interestRate;
		System.out.printf("Maturity Amount:%.2f\n",total);
	}
	
	static {
		interestRate=0.08;
	}
}
