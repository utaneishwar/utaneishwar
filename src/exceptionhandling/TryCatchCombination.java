package exceptionhandling;

public class TryCatchCombination {

	public static void main(String[] args)
	{
		// Try Catch Combination

		// we can have one try and multiple CATCH combination 
		// But we cannot have Multiple TRY and One or multiple Catch combination

		int a[]= {1,2,3,4,5};

		try {

			a[5]= 60;      //it will  found out only related catch and that will be executed 
			// int b =10/0;  
			// int a1 =10/20;   we can handle it by using multiple catch 
		}

		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(" Exception arrived in try it");
		}
		// both catch block will not executed because its not related with try block 
		catch(ArithmeticException e)
		{
			System.out.println(a[0])	;
		}

		catch(NullPointerException e)
		{
			System.out.println("this is null pointer exception wont execute");
		}






	}
}
