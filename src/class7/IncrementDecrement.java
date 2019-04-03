package class7;

public class IncrementDecrement {
	public static void main(String[] args) {
		int x = 1;
		x = x + 1;
		System.out.println(x);
		int y = 1;
		y += 1;
		System.out.println(y);
		int z = 1;
		z++;
		System.out.println(z);
		int w = 2;
		w++;
		System.out.println(w);
		int v = 10;
		v--;
		System.out.println(v);
		int a = 10;
		int b = ++a;// preincrement = first increment --> assignSystem.out.println("Value of b is
					// "+b);//11System.out.println("Value of a is "+a);//11int c=10;int
					// d=c++;//postincrement= first assign --> incrementSystem.out.println("Value of
					// d is "+d);//10System.out.println("Value of c is "+c);//11int q=100;int
					// e=q--;System.out.println("Value of e is "+e);//100 or
					// 99?System.out.println("Value of q is "+q);//99int h=50;int g=--h;//first
					// decrement --> assignSystem.out.println("Value of h is "+h);//49 or
					// 50?System.out.println("Value of g is "+g);//49 or 50?}}

	}
}
