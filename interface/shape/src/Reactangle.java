public class Reactangle implements Shape
{
	protected double width;
	protected double length;
	protected String color;
	protected boolean filled;

	public Reactangle()
	{
		width=1.0;
		length=1.0;
		color="red";
		filled=true;
	}

	public Reactangle(double width,double length)
	{
		this.width=width;
		this.length=length;
	}

	public Reactangle(double width,double length,String color,boolean filled)
	{
		this.width=width;
		this.length=length;
		this.color=color;
		this.filled=filled;
	}

	public double getWidth()
	{
		return width;
	}
	public double getLength(){
		return length;
	}
	public void setWidth(double width){
		this.width=width;
	}
	public void setLength(double length)
	{
		this.length=length;
	}

	@Override 
	public double getArea(){
		return width*length;
	}

	@Override
	public double getPerimeter()
	{
		return 2*(width+length);
	}

	public String toString(){
		return "Reactangle[width="+width+",length="+length+",color="+color+",filled="+filled+"]";
	}
}