import java.util.Scanner;

interface BankFunction {
	public void totalIncrement(double amt);
	public void totalDecrement();
	
}
class Bank{
	private String name;
	private String accType;
	public Bank(String name,String accType) {
		this.name=name;
		this.accType=accType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public void nameInfo() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name:");
		name=sc.nextLine();
		System.out.print("Enter account type: ");
		accType=sc.nextLine();
		System.out.println("###############################"+"\n");
		System.out.println("User Name:"+name);
		System.out.println("Account Name: "+accType);
	}
	
}
class Account extends Bank implements BankFunction{
	private double amounts;
	public Account(String name,String accType,double amounts) {
	   super(name,accType);
	   this.amounts=amounts;
	}

	public double getAmounts() {
		return amounts;
	}
	public void setAmounts(double amounts) {
		this.amounts = amounts;
	}
	public double showAmounts() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Add amounts: ");
		amounts=sc.nextDouble();
		System.out.println("Total amounts: "+this.amounts);
		return amounts;
	}
	public void totalIncrement(double amt) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Current Amounts: "+this.amounts);
		System.out.print("Add new amounts: ");
		double newAmount=sc.nextDouble();
		if(newAmount<amounts) {
			System.out.println("Your new amounts is "+newAmount);
			double incAmount=this.amounts+newAmount;
			System.out.println("Increment amounts :"+incAmount);
		}else {
			System.out.println("Invalid Amounts");
		}
		
	}
	public void totalDecrement() {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Current Amounts: "+this.amounts);
	    System.out.println("Enter your expend amounts: ");
	    double expends=sc.nextDouble();
	    if(expends<amounts) {
	    System.out.println("Check Amounts");
	    double update=this.amounts-expends;
	    System.out.println("Your update amounts:"+update);
	    }
	    else {
	    	System.out.println("Insefficent Amounts");
	    }
	}
}

public class BankAccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bk=new Bank("","");
		Account ac=new Account("","",0.0);
		bk.nameInfo();
		ac.showAmounts();
		ac.totalIncrement(0.0);
		ac.totalDecrement();
		

	}

}
