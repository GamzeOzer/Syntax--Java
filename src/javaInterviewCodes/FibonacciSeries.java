package javaInterviewCodes;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//0 1 1 2 3 5 8
		
		int a=0;
		int b=1;
		int c=1;
		
		for (int i=0;i<10;i++)
		{
			System.out.println(a);
			
			a=b;
			b=c;
			c=a+b;
		}
	}

}
