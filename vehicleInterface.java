interface vehicle{
	void start();
	void stop();
}
class car implements vehicle{
	public void start(){
		System.out.println("car start");
	}
	public void stop(){
		System.out.println("car stop");
	}
}

public class vehicleInterface{
	public static void main(String args[])
	{
     vehicle v=new car();
     v.start();
     v.stop();
	}
}