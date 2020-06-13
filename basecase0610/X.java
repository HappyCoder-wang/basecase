package basecase0610;

class Y{
	int square(int n) {
        return n * n;
    }
}

public class X {
	Y op;// aggregation
    double pi = 3.14;

    double area(int radius) {
        op = new Y();
        int rsquare = op.square(radius);// code reusability (i.e. delegates the
                                        // method call).
        return pi * rsquare;
    }

    public static void main(String args[]) {
        X x = new X();
        double result = x.area(5);
        System.out.println(result);
    }
}

