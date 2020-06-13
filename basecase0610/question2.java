package basecase0610;
class A{
	
	public int val1;
	public int val2;
	public A() {}
	public A(int a, int b, int c) {
		System.out.println(a+" "+b+" "+c);
	}
	
	public void f1(int a, int b, int c, int d) {
		System.out.println(a+" "+b+" "+c+" "+d);
	}
}
public class question2{
	
	public static void main(String[] args) {
		A a1=new A();
		A a2=new A(1,2,3);
		A a3=new A();
		A a4=new A();
		A a5=new A();
		a1.f1(4,5,6,7);
		a1.val1=200;
		a2.val1=100;
		a3.val1=300;
		a4.val1=500;
		a5.val1=400;
		System.out.println(a1.val1+" "+a2.val1+" "+a3.val1+" "+a4.val1+" "+a5.val1);
	}

}