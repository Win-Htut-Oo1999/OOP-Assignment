abstract class Shape{
	private String color;
	private boolean filled;
	public abstract double getArea();
	public abstract double getParameter();
	public Shape() {
		
	}
	public Shape(String color,boolean filled) {
		this.color=color;
		this.filled=filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
}
class Circle extends Shape{
	public double radius=0.0;
	public Circle() {
	}
	public Circle(double radius) {
		this.radius=radius;
	}
	public Circle(double radius,String color,boolean filled) {
		super(color,filled);
		this.radius=radius;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		final double PI=3.14;
		return 1/2*PI*radius*radius;
		
		
	}
	@Override
	public double getParameter() {
		// TODO Auto-generated method stub
		final double PI=3.14;
		return PI*radius*radius;
		
	}
}
class Rectangle extends Shape{
	public double width=0.0;
	public double lenght=0.0;
	public Rectangle() {
		
	}
	public Rectangle(double width,double lenght) {
		this.lenght=lenght;
		this.width=width;
	}
	public Rectangle(double width,double lenght,String color,boolean filled) {
		super(color,filled);
		this.width=width;
		this.lenght=lenght;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*lenght;
	}
	@Override
	public double getParameter() {
		// TODO Auto-generated method stub
		return 2*width*lenght;
	}
}
class Square extends Rectangle{
	public double side;
	public Square() {
		
	}
	public Square(double side) {
		this.side=side;
	}
	public Square(double side,double width,double lenght,String color,boolean filled) {
		super(lenght,width,color,filled);
		this.side=side;
	}
}
public class GeometricShapeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Circle(12.0,"Red",true);
		System.out.println("Shape Information: ");
		System.out.println("Color: "+s.getColor());
		System.out.println("Boolean: "+s.isFilled());
		Circle c=new Circle(12.0,"Red",true);
		System.out.println("\n");
		System.out.println("Circle Information: ");
		System.out.println("Radius: "+c.radius+"\n"+"Color: "+c.getColor()+"\n"+"Filled: "+c.isFilled()+"\n"
				+"Area: "+c.getArea()+"\n"+"Parameter: "+c.getParameter());
		Rectangle r=new Rectangle(12.0,13.0,"Red",true);
		System.out.println("\n");
		System.out.println("Rectangle Information: ");
		System.out.println("Width: "+r.lenght+"\n"+"Color: "+r.getColor()+"\n"+"Area: "+r.getArea()+"\n"+"Parameter: "+r.getParameter());
		Square sq=new Square(13.0,12.0,13.0,"Red",true);
		System.out.println("\n");
		System.out.println("Square Information: ");
		System.out.println("Width: "+sq.lenght+"\n"+"Color: "+sq.getColor()+"\n"+"Area: "+r.getArea()+"\n"+"Parameter: "+sq.getParameter());
		

	}
}
