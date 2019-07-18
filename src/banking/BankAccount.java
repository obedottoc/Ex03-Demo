/*********
 * Program to represent bank account
 * Developed by
 * ObedOtto C
 * obedotto@saveetha.ac.in
 */
package banking;

public class BankAccount {
	protected String account_name;
	protected long account_id;
	protected String address; 
	protected String mail_id;
	protected long mobile_no;
	
	public BankAccount()
	{
		account_name="noname";
		account_id=100001;
		address="not given"; 
		mail_id="not given";
		mobile_no=80000001;
	}
	
	public BankAccount(String n,long id,String ad,String mail,long mo)
	{
		account_name=n;
		account_id=id;
		address=ad; 
		mail_id=mail;
		mobile_no=mo;
	}
	
	public void printAccount()
	{
		System.out.println("Name:"+account_name);
		System.out.println("Account ID:"+account_id);
		System.out.println("Address:"+address);
		System.out.println("EMail:"+mail_id);
		System.out.println("Mobile:"+mobile_no);
	}
	
}
