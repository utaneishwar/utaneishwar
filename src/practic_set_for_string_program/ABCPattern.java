package practic_set_for_string_program;

public class ABCPattern 
{

	public static void main(String[] args)
	{
		int end = 3;
		int count = 0;
		String  pattern ="abc";
		String x="";
		String s ="abcxyzabcdefamc";  // abc.bcx,cxy,xyz,yza,abc,bcd,cde,def,fam,amc
		String b[]=new String [s.length()-2];  //abc.bcx,cxy,xyz,yza,abc,bcd,cde,def,fam,amc

		for(int start=0; end<=s.length();start++)
		{
			x=s.substring(start, end);
			b[start]=x;  //abc
			end++;
		}
		for(int i=0; i<b.length; i++)

		{
			if(b[i].equals(pattern))
			{
				count++;
			}

		}
		System.out.println(count);


	}

}
