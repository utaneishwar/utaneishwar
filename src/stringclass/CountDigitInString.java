package stringclass;

public class CountDigitInString {

	public static void main(String[] args) 
	
	{
		
		 String set= "hello my 45 name 23 is ishwar";
		  char[] cr= set.toCharArray();
		  int space = 0;
		  for(int i=0; i<cr.length; i++)  // 5==5    true   5!=5  false 
		  {
			  if((Character.isDigit(cr[i])|| Character.isAlphabetic(cr[i])))
			  {
				
			  }
			  else
			  {
				  space++;
			  }
		  }
		  System.out.println(space);  // 4
		  }


	}


