package stringclass;

public class StringpartiateDigitandChar {

	public static void main(String[] args) {
		
		String s ="k23an45ak2a1";
		int a[]=new int[s.length()];
		int b =0;
		String s1 ="";
		int j=0;
	
		for(int i=0; i<s.length(); i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				s1=s1+s.charAt(i);
				b =Integer.parseInt(s1);
				
				a[j]=b;
				j++;
				s1="";
				
			}
		
		}
		
		for(int c:a)
		{
		System.out.println(c);
		}
	}

}
