package interviewUpdateProgram;

public class TotalAreaOfLand
{
	public static int areaOfland(int length, int breath)
	{
		int area =length*breath;
		return area;
	}
	public static void main(String[] args)
	{
	
		int land1= areaOfland(50,30);
		int land2= areaOfland(20,40);
		int land3= areaOfland(20,40);
		
		int totalarea=land1+land2+land3;
		System.out.println(totalarea);
	}

}
