package question6;

public class FAN extends AC{

	public FAN() {
		super("fan");
	}

	@Override
	public void turnon() {
		System.out.println("turn on "+name);
	}

	@Override
	public void turnoff() {
		System.out.println("turn off "+name);
	}
	
	public static void main(String[] args) {
		AC ac=new AC();
		ac.turnon();
		ac.turnoff();
		FAN f=new FAN();
		f.turnoff();
		f.turnon();
	}
	
}
