public class Main
{
	public static void main(String args[])
	{
		shape s1=new Circle(5,"blue",true);
		shape s2=new Reactangle(4,6,"red",false);
		shape s3=new Square(7,"green",true);

		System.out.println(s1);
		System.out.println("area="+s1.getArea());
		System.out.println("perimeter="+s1.getPerimeter());

		System.out.println();

		System.out.println(s2);
		System.out.println("area="+s2.getArea());
		System.out.println("perimeter="+s2.getPerimeter());

		System.out.println();

		System.out.println(s3);
		System.out.println("area="+s3.getArea());
		System.out.println("perimeter="+s3.getPerimeter());
	}
}