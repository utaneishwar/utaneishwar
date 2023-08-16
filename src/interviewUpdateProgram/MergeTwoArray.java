package interviewUpdateProgram;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5};
		int b[]= {5,6,7,8};
		int c[]=new int [a.length+b.length];
		int k=0;
		for(int i=0; i<a.length; i++)
		{
			c[i]=a[i];
		}
		for(int j=a.length; j<a.length+b.length; j++)
		{
			c[j]=b[k];
			k++;
		}
		Arrays.sort(c);
		for(int d:c)
		{
			System.out.println(d);
		}

	}


}
