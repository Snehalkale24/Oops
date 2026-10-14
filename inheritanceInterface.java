interface I1{
	void m1();
}
interface I2{
	void m2();
}
Class A implements I1,I2{
	public void m1()
	{
		System.out.println("method m1:");
	}
	public void m2(){
		System.out.println("method m2:");
	}
}

public class inheritanceInterface{
	public static void main(String args[])
	{

	}
}