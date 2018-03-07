package cst8284.shape;

public class Square extends BasicShape {
	public Square() {
		this(1);
		
	}
	
	public Square(double width) {
		this.setWidth(width);
	}
	
	public Square(Square Square) {
		this(Square.getWidth());
	}
	
	public double getArea() {
		return  this.getWidth()*this.getWidth();
	}
	
	public double getPerimeter() {
		return this.getWidth()*4;
	}
	
	@Override
	public String toString() {
		return ("Square Overrides " + super.toString());
		
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Square && this.getWidth()==((Square)obj).getWidth();	
	}
}
