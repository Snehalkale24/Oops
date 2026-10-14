//interface==is contract bet service provider and service consumer 

//interface is protocol
//design rule ..>become standard
//set of standard..>specification
//separation bet declaration and defination
//claass will use interface by keyword ""implements"

//in multiple inheritance cant do bexo we can not extends more than onne class
//inheritance we can implements more than one interfaces
//differ bet abstract and interface
//an abstract class can have both abstract and concrete methods
//while interface contains only abstract methods
//why use --used to achieve 100% abstraction,used to define common behaviour across unrelated clases,used to achieve multiple inheritance in java,used to achieve loose coupling in our code,used extensively in framework,API,design pattern
//interface app{
//	(private,default,static)void m1(){} --in interface class me cant use concrete method(void m1())when u want to add method you use private,defaul,static keyword
//}



interface Hello
{
	void fly();
}
interface CanSwim{
	void swim();
}
interface CanFight{
	void fight();
}

class ActionHero implements CanFight{
	@Override
	public void fight(){
		System.out.println("CanFight:");
	}
}
//multiple inheritance
class Hero extends ActionHero implements CanFight,CanSwim{
	@Override
	public void swim(){

	}
	// @Override
	// public void fly(){

	// }
}
public class App{
	public static void main(String args[])
	{

	}
}