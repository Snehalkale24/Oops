public class Circle implements Shape
{
	private double radius;
	private String color;
	private boolean filled;

	public Circle()
	{
		radius=1.0;
		color="red";
		filled=true;
	}

	public Circle(double radius)
	{
		this.radius=radius;
	}

	public Circle(double radius,String color,boolean filled)
	{
		this.radius=radius;
		this.color=color;
		this.filled=filled;
	}

	public double getRadis()
	{
		return radius;
	}

	public void setRadius(double radius)
	{
		this.radius=radius;
	}

	@Override
	public double getArea()
	{
		return Math.PI*radius*radius;
	}

	@Override
	public double getPerimeter()
	{
		return 2*Math.PI*radius;
	}

	public String toString()
	{
		return "Circle[radius="+radius+",color="+color+",filled="+filled+"]";
	}
}