package arraysDiscussion;

public class AdditionElementOfODDIndex {

	public static void main(String[] args)
{
		// we can access here using first type of array 
				// syntax datatypa [] ref.variablname= new datatype [size of array ];
				
			int [] x= new int[5];	
			x[0]= 2;
			x[1]= 4;
			x[2]= 5;
			x[3]= 6;
			x[4]= 10;
			int oddnum = 0;
			
			for (int i=0; i<5; i++)
			{
				if (i%2==1)
				{
					oddnum = oddnum+x[i];
		         }
			}
				
			 System.out.println(oddnum);	   // 10
				

	}

}
