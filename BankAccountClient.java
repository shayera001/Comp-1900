import java.util.*;
public class BankAccountClient{
	public static void main(String[] args) {
		//main
	BankAccount poor_college_student=new BankAccount("poort college student");
	BankAccount scrooge_mcduck=new BankAccount("scrooge mcduck",5000000,true,1.55);
	poor_college_student.deposit(500);
	scrooge_mcduck.withdraw(18000);
	poor_college_student.setInterestRate(-0.75);
	scrooge_mcduck.setInterestRate(1.30);
	poor_college_student.payInterest();
	scrooge_mcduck.payInterest();

	}
}