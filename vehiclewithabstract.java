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

class scooter extends vehicle{
	scooter(){
		tyres=2;
	}

	void start(){
		System.out.println("scooter start:");
	}
}

public class vehiclewithabstract{
	public static void main(String args[])
	{
     vehicle v1=new car();
     v1.displayTyres();
     v1.start();

     System.out.println();

     vehicle v2=new scooter();
     v2.displayTyres();
     v2.start();
	}
}