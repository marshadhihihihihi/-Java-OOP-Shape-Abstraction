import java.util.Scanner;
abstract class Shape {
	
	abstract double calculateArea();
	
	void shapeName(){
		
		System.out.println("Shape can be different");
		
	}
	
}

class Circle extends Shape {
	
	private double radius;
	
	public Circle (double radius) {
		
		setRadius(radius);
		
	}
	
	public void setRadius(double radius) {
		
		if (radius > 0) {
			
			this.radius = radius;
			
		} else {
			
			System.out.println ("radius cannot be equal or less than Zero");
			
		}
		
	}
	
	public double getRadius() {
		
		return radius;
		
	}
	
	@Override
	double calculateArea() {
		
		return Math.PI * radius * radius;
		
	}
	
	@Override
	void shapeName() {
		
		System.out.println ("Shape name is Circle");
		
	}
	
}

class Rectangle extends Shape {
	
	private double length;
	private double width;
	
	public Rectangle (double length,double width) {
		
		setLength(length);
		setWidth(width);
		
	}
	
	public void setLength(double length) {
		
		if (length > 0) {
			
			this.length = length;
			
		} else {
			
			System.out.println ("Length cannot be equal to or less than Zero");
			
		}
		
	}
	
	public void setWidth(double width) {
		
		if (width > 0) {
			
			this.width = width;
			
		} else {
			
			System.out.println ("Width cannot be equal to or less than Zero");
			
		}
		
	}
	
	public double getLength() {
		
		return length;
		
	}
	
	public double getWidth() {
		
		return width;
		
	}
	
	@Override
	double calculateArea() {
		
		return length * width;
		
	}
	
	@Override
	void shapeName() {
		
		System.out.println ("Shape name is Rectangle");
		
	}
	
}

class Triangle extends Shape {
	
	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		
		setBase(base);
		setHeight(height);
		
	}
	
	public void setHeight(double height) {
		
		if (height > 0) {
			
			this.height = height;
			
		} else {
			
			System.out.println ("Height cannot be equal to or less than Zero");
			
		}
		
	}
	
	public void setBase(double base) {
		
		if (base > 0) {
			
			this.base = base;
			
		} else {
			
			System.out.println ("Base cannot be equal to or less than Zero");
			
		}
		
	}
	
	public double getHeigth() {
		
		return height;
		
	}
	
	public double getBase() {
		
		return base;
		
	}
	
	@Override
	public double calculateArea() {
		
		return height * base / 2.0;
		
	}
	
	@Override
	public void shapeName() {
		
		System.out.println ("Shape name is Triangle");
		
	}
}



public class ShapeManagement {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("---circle---");
		double radius;
		Shape myCircle = null;
		do {
			
		System.out.println ("Enter the radius of a circle : ");
		radius = sc.nextDouble();
		
			if (radius > 0) {
			
				myCircle = new Circle(radius);

			} else {
			
				System.out.println ("Radius cannot be equal to less than zero");
			
			}
		
		} while (radius <= 0);

		System.out.println();
		
		System.out.println("---Rectangle---");
		double l;
		double w;
		
		Shape myRectangle = null;
		
		do {
			
		System.out.println ("enter the length & width of a rectangle : ");
		l = sc.nextDouble();
		w = sc.nextDouble();
		
			if (l > 0 && w > 0) {
				
				myRectangle = new Rectangle(l,w);

			} else {
			
				System.out.println ("Length and width must be greater than Zero");
			
			}
		
		} while (w <= 0 || l <= 0);
		
		System.out.println();
		
		System.out.println ("---Triangle---");	
		double base;
		double height;
		Shape myTriangle = null;
		
		do {
			
			System.out.println ("Enter the height & base of a Triangle : ");
			height = sc.nextDouble();
			base = sc.nextDouble();
			
			if (base > 0 && height > 0) {
				
				myTriangle = new Triangle(height,base);
				
			} else {
				
				System.out.println ("Base and Height must be greater than Zero");
				
			}
			
		} while (base <= 0 || height <= 0);
		
		
		myCircle.shapeName();
		System.out.println ("Circle's area is : "+myCircle.calculateArea());
		System.out.println();
		
		myRectangle.shapeName();
		System.out.println ("Rectangle's area is : "+myRectangle.calculateArea());
		System.out.println();
		
		myTriangle.shapeName();
		System.out.println ("Triangle's area is : "+myTriangle.calculateArea());
		
	}
}