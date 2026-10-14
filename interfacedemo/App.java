//we cant declare public double 
 interface Instrument
{
	void play();

}
class Guitar implements Instrument{
	@Override
	void play(){
		System.out.println("play");
	}
}
public class App{
	public static void main(String args[])
	{

	}
}