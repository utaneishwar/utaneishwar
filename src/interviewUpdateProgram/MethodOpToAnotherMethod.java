package interviewUpdateProgram;

public class MethodOpToAnotherMethod 
{
	public static int  m1()
	{
		int c=5+3;
		return c;
	}
	public static int m2(int b)
	{
		int d=b+3;
		return d;
	}

	public static void main(String[] args) 
	{
	   int y =m1();
	
	      System.out.println(m2(y));
	}

}
