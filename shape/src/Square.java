class Square extends Reactangle
{
	Square()
	{
		super();
	}

	Square(double side)
	{
		super(side,side);
	}

	Square(double side,String color,boolean filled)
	{
		super(side,side,color,filled);
	}

	public double getSide()
	{
		return width;
	}
	public void setSide(double side)
	{
		width=side;
		length=side;
	}

	public String toString(){
		return "Square["+super.toString()+"]";
	}
}