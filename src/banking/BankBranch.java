/*********
 * Program to represent bank branch
 * Developed by
 * ObedOtto C
 * obedotto@saveetha.ac.in
 */
package banking;

public class BankBranch {

	public static void main(String[] args) {
		BankAccount ba1;
		RegularAccount ra1;
		SeniorCitizenAccount sca1;
		
			ba1=new BankAccount("Raja",300001,"Chennai","account@gmail.com",9000000001l);

			ra1=new RegularAccount("Kamal",600001,"Chennai","account@gmail.com",7000000001l,500000.00,10);
			
			sca1=new SeniorCitizenAccount("Kala",800001,"Chennai","account@gmail.com",4000000001l,400000.00,4);
			
			ba1.printAccount();			
			ra1.printStatement();
			sca1.printStatement();
	}

}
