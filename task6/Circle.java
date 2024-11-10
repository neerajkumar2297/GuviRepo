package task6;

public class Circle {
	private double radius;

	public void Circle() {
		this.radius=7.0;
	}
	
public void Circle(double radius) {
		this.radius=radius;
	}
	

public double calculateCircumference() {
	return 2*3.14*this.radius;
}
	
	public static void main(String[] args) {
		
		Circle c= new Circle();
		c.Circle();
		System.out.println("circumference of circle via unparameterised constructor is : "+c.calculateCircumference());
		
		Circle c1= new Circle();
		c1.Circle(6);
		System.out.println("circumference of circle via parameterised constructor is : "+c1.calculateCircumference());
	}
		
	}

