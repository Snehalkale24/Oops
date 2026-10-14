interface Printable{
	void print();
}
class document implements Printable{
	public void print()
	{
		System.out.println("printing document:");
	}
}
class image implements Printable{
	public void print()
	{
		System.out.println("print image:");
	}
}

public class printInterface{
	public static void main(String args[])
	{
    Printable p1=new document();
    Printable p2=new image();
    p1.print();
    p2.print();
	}
}}