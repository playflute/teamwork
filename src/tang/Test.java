package tang;

import java.util.Scanner;

public class Test {
	
	public static int fibonacci(int number) 
	{
		if(number>=3) 
		{
			return fibonacci(number-1)+fibonacci(number-2);
		}
		else
			return 1;
	}

	public static long factorial(int number)
	{
		if(number!=1) 
		{
			return number * factorial(number-1);
		}
		else
			return number;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner c = new Scanner(System.in);
		System.out.println("input the number which you want to fibonacci:");
		int number = c.nextInt();
		//Test b= new Test();
		//System.out.println(Test.factorial(number));
		System.out.println(Test.fibonacci(number));
	}

}
