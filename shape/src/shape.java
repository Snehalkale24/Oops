abstract class shape
{
	protected String colour;
	protected boolean filled;


	shape()
	{
		colour="red";
		filled=true;
	}

	shape(String colour,boolean filled)
	{
		this.colour=colour;
		this.filled=filled;
	}
	public String getColor()
	{
		return colour;
	}
	public void setColor(String color)
	{
		this.colour=colour;
	}
	public boolean isFilled()
	{
		return filled;
	}
	public void setFilled(boolean filled)
	{
		this.filled=filled;
	}
	abstract double getArea();
	abstract double getPerimeter();

	public String toString()
	{
return "shape[color="+colour+", filled="+filled+"]";	
}
}