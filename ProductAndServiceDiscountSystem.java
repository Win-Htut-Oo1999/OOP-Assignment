import java.util.Date;
import java.util.Scanner;

class Customer{
	Scanner sc=new Scanner(System.in);
	private String name;
	private boolean member=false;
	private String type1="Gold";
	private String type2="Premium";
	private String type3="Silver";
	public String memberType;
	public Customer(String name,boolean member) {
		this.name=name;
		this.member=member;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isMember() {
		if(memberType==type1) {
			return true;
		}
		else if(memberType==type2) {
			return true;
		}
		else {
			return true;
		}
	}
	public void setMember(boolean type1) {
		this.member = type1;
	}
	public String getType1() {
		return type1;
	}
	public void setType1(String type1) {
		this.type1 = type1;
	}
	public String getType2() {
		return type2;
	}
	public void setType2(String type2) {
		this.type2 = type2;
	}
	public String getType3() {
		return type3;
	}
	public void setType3(String type3) {
		this.type3 = type3;
	}
	
	public void showInfo() {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter a name: ");
		name=sc.next();
		System.out.println("Member type:(Gold,Premium,Silver) ");
		String type=sc1.next();
		if(type==this.getType1()) {
			System.out.println("You choose type : "+type1.toString());
		}
		else if(type==this.getType2()) {
			System.out.println("You choose type: "+type2.toString());
		}
		else  {
			System.out.println("You choose type: "+type3.toString());
		}
		
	}
}
class Visit extends Customer{
	Customer  customer;
	public Date date;
	private double serviceExpense;
	private double productExpense;
	public Visit(String name,boolean member,Date date, Customer customer,double serviceExpense,double productExpense) {
		super(name,member);
		this.customer=customer;
		this.date=date;
		this.serviceExpense=serviceExpense;
		this.productExpense=productExpense;
		
	}
	public double getServiceExpense() {
		return serviceExpense;
	}
	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = serviceExpense;
	}
	public double getProductExpense() {
		
		return productExpense;
	}
	public void setProductExpense(double productExpense) {
		this.productExpense = productExpense;
	}
	public double getTotalResult() {
		double totalExpense=0.0;
		if(customer.isMember()) {
			totalExpense=serviceExpense*productExpense+0.3;
			System.out.println("Information about Discount System.");
			System.out.println("Result:"+totalExpense+"\n"+"Date:"+date+"Customer: "+customer+"Service expense: "+serviceExpense+"Product Expense: "+productExpense);
			
		}
		else {
			System.out.println("Invalid!!!");
		}
		return totalExpense;
		
	}
	
	
}
class DiscountRate{
	static double serviceDiscountPremium=0.2; 
	static double serviceDiscountGold=0.15;
	static double serviceDiscountSilver=0.1;
	
	static double productDiscountPremium=0.1;
	static double productDiscountGold=0.1;
	static double productDiscountSilver=0.1;
	static double getServiceDiscountRate(String type) {
		if(type.equals("premium")) {
			return serviceDiscountPremium;
		}else if(type.equals("gold")) {
			return serviceDiscountGold;
		}else {
			return serviceDiscountSilver;
		}
	}
	
	static double getProductDiscountRate(String type) {
		if(type.equals("premium")) {
			return productDiscountPremium;
		}else if(type.equals("gold")) {
			return productDiscountGold;
		}else {
			return productDiscountSilver;
		}
		
	}
}
public class ProductAndServiceDiscountSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer("",false);
		Visit v=new Visit("",false,new Date(2020-7-26),c,1200.0,1300.0);
		c.showInfo();
		System.out.println("Ridiculous Information!!!");
		v.getTotalResult();
		

	}

}
