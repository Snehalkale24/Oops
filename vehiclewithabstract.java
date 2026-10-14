abstract class vehicle{
	int tyres;
	void displayTyres(){
		System.out.println("this vehicle has"+tyres+"tyres");
	}
	abstract void start();
}

class car extends vehicle{
	car()
	{
		tyres=3;
	}

	void start(){
		System.out.println("car started:");
	}
}

public class vehiclewithabstract{
	public static void main(String args[])
	{

	}
}