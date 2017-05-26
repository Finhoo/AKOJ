import java.util.Scanner;


public class RectAngle {
	double length;
	double width;
	RectAngle() {
		length = 8.0;
		width = 4.0;
	}
	RectAngle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	public double getLength()
	{
		return length;
	}
	void setLength(double length)
	{
		this.length = length;
	}
	double area()
	{
		return length * width;
	}
	double perimeter()
	{
		return (length + width)*2;
	}
	void print()
	{
		System.out.println("³¤Îª£º"+this.width+"¿íÎª£º"+this.length);
	}
	public static void main(String[] args) {
		RectAngle rect = new RectAngle();
		rect.length = 8;
		rect.width = 6;
		rect.print();
	}
}
