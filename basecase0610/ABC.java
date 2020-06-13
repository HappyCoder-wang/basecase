package basecase0610;
//1.) Write a Program considering 1 class named ABC which contains 1 local variable with value 200 & consider 1 instance variable with 4 different Output's. 

public class ABC {
	public int b;
	public ABC(int val) {
		b=val;
	}
	public void changeValue() {
		int val=200;
		b=val;
	}
	public static void main(String[] args) {
		int a=30;
		ABC abc1=new ABC(a);
		ABC abc2=new ABC(a-2);
		ABC abc3=new ABC(10);
		ABC abc4=new ABC(20);
		System.out.println(a);
		System.out.println(abc1.b);
		abc1.changeValue();
		System.out.println(abc1.b);
		System.out.println(abc2.b);
		System.out.println(abc3.b);
		System.out.println(abc4.b);
	}
}
