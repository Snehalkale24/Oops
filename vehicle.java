class car{
	int tyres=4;
	void displayTyres()
	{
		System.out.println("car has"+tyres+"tyres.");
	}

	void start(){
		System.out.println("car start with");
	}
}

class scooter{
	int tyres=3;
	void displayTyres(){
		System.out.println("scooter has"+tyres+"tyres");
	}
	void start(){
		System.out.println("scooter start");
	}
}

public class vehicle{
	public static void main(String args[])
	{
    car c=new car();
    c.displayTyres();
    c.start();

    System.out.println();

    scooter s=new scooter();
    s.displayTyres();
    s.start();
	}
}