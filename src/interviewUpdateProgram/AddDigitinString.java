package interviewUpdateProgram;

public class AddDigitinString 
{
	public static void m1()
	{
		String s ="12kish34or56";
		String sv="";
		int num=0;
		int sum=0;
		for(int i=0; i<s.length(); i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				sv=sv+s.charAt(i);

				num=Integer.parseInt(sv);
				sum=sum+num;
				sv="";

			}
		}
		System.out.println(sum); ///21
	}
//------------------------------------------------------
	public static void m2()
	{
		String s ="12kish34or56";
		String sv="";
		int num=0;
		int sum=0;
		boolean flag=false;
		for(int i=0; i<s.length(); i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				sv=sv+s.charAt(i);
				flag=true;
				if(i!=s.length()-1)
				{   
					continue;
				}
			}
			if(flag)
			{
				num=Integer.parseInt(sv);
				sum=sum+num;
				flag=false;
				sv="";
			}
		}
		System.out.println(sum);///102
	}

	public static void main(String[] args) 
	{
		m1();
		m2();


	}
}
