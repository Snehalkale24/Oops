abstract class ATM{
	public abstract void doAuthetication();
	public abstract void withdraw();
}
class SBIATM extends ATM{
	@Override
	public void doAuthetication(){
		System.out.println("doAuthetication SBIATM");
	}

	@Override
	public void withdraw(){
		System.out.println("withdraw SBIATM");
	}
}

class ICICIATM extends ATM{
	@Override 
	public void doAuthetication(){
		System.out.println("doAuthetication ICICIATM");
	}

	@Override 
	public void withdraw(){
		System.out.println("withdraw ICICIATM");
	}
}

class AXISATM extends ATM{
	@Override 
	public void doAuthetication(){
		System.out.println("doAuthetication AXISATM");
	}

	@Override 
	public void withdraw(){
		System.out.println("withdraw AXISATM");
	}
}

// class App
// {
// 	static void withdrawFromAtm(ATM atm)
// 	{
// 		atm.doAuthetication();
// 		atm.withdraw();
// 	}
// 	public static void main(String args[])
// 	{
// 		withdrawFromAtm(new SBIATM());
// 		withdrawFromAtm(new ICICIATM());
// 		withdrawFromAtm(new AXISATM());
// 	}
// }

public class App
{
    public static void main(String args[])
    {
        ATM s = new SBIATM();
        s.doAuthetication();
        s.withdraw();

        ICICIATM i = new ICICIATM();
        i.doAuthetication();
        i.withdraw();

        AXISATM a = new AXISATM();
        a.doAuthetication();
        a.withdraw();
    }
}