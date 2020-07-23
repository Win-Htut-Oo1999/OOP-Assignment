import java.util.Scanner;

class Person{
	private static String name;
	private static String address;
	public Person(String name,String address) {
		this.name=name;
		this.address=address;
	}
	public static String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
		
}
class Student extends Person{
	public String program;
	public int year;
	public double fees;
	public Student(String name,String address,String program,int year,double fees) {
	super(name,address);
	this.fees=fees;
	this.program=program;
	this.year=year;
	}
	public void ShowStudentInfo() {
		System.out.println("Student name: "+Person.getName());
		System.out.println("Address: "+Person.getAddress());
		System.out.println("Program: "+program);
		System.out.println("Year: "+year);
		System.out.println("Fees: "+fees);
		System.out.println("\n");
	}
}
class Stuff extends Person{
	public String school;
	public double pay;
	public Stuff(String name,String address,String school,double pay) {
		super(name,address);
		this.school=school;
		this.pay=pay;
	}
	public void ShowStuffInfo() {
		System.out.println("Stuff Name: "+Person.getName());
		System.out.println("Address: "+Person.getAddress());
		System.out.println("School: "+school);
		System.out.println("Pay:"+pay);
		
	}
}
public class StudentAndStuffInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person("Mg Mg","Yangon");
		Student s=new Student("Mg Mg","Yangon","Java",2020,300000.0);
		Stuff sf=new Stuff("Mg Mg","Bagoo","Yangon University",120000.0);
		s.ShowStudentInfo();
		sf.ShowStuffInfo();

	}

}
