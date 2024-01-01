package interviewUpdateProgram;

public class First1000NumberDividedBy4 {

	public static void main(String[] args)
	{
		
		int count=0;
		int number=1;
		while (count<=1000)
		{
			if(number%4==0)
			{
				System.out.println(number);
				count++;
			}
			number++;
		}
		
		

	}

}
