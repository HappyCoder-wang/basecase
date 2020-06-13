package question5;

public class Water {
	private int type1;
	private int type2;
	private int type3;
	public void cup() {
		int type1=1,type2=10,type3=20;
		this.type1=type1;
		this.type2=type2;
		this.type3=type3;
	}
	public void taste() {
		System.out.println(type1);
		System.out.println(type2);
		System.out.println(type3);
	}
	
}
