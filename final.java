//we dont final keyword in abstract 
//static dont not override cd
//can we make constructor static--no(constructor to initialize instrace field)
//cons job to initialize instrace field

// abstract class A{
// 	final abstract void f1();
// }

class cycle
{
	int wheels=0;
	public void ride();
	cycle(int wheels){
		this.wheels=wheels;
	}
}
class unicycle extends cycle{
	@Override
	public void ride(){

	}
}
class Bicyle extends cycle{
	@Override
	public void ride(){

	}
}
public class sample
{
	public static void main(String args[])
	{

	}
}