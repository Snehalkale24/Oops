class Circle extends shape
{
	protected double radius;

	Circle()
	{
		radius=1.0;
	}
	Circle(double radius)
	{
		this.radius=radius;
	}
	Circle(double radius,String color,boolean filled)
	{
		super(color,filled);
		this.radius=radius;
	}

	public double getRadius()
	{
		return radius;
	}

	public void setRadius(double radius)
	{
		this.radius=radius;
	}

	double getArea()
	{
		return Math.PI*radius*radius;
	}

	double getPerimeter()
	{
		return 2*Math.PI*radius;
	}

	public String toString()
	{
		return "Circle["+super.toString()+",radius="+radius+"]";
	}
}
