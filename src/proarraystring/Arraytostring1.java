package proarraystring;

import java.util.Arrays;

public class Arraytostring1 {
public static void main(String[] args) {
	String [] c= {"velocity", "is","in","katraj"};
	System.out.println(Arrays.toString(c));
	String[] h= Arrays.copyOf(c, 2);
	System.out.println(Arrays.toString(h));
	System.out.println(c.length);
	
	int [] a = {25,10,100,5,2};
	int b = a[0];
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1; j<a.length;j++)
		{
			if(a[i]<a[j])
			{
				int g =a[j];
				a[j]=a[i];
				b=g;
				
			}
	
		}
		System.out.print(a[i]+",");

	}
int maxno= a[0];
for(int k=1;k<a.length;k++)
{
	if(maxno<a[k])
	{
		maxno=a[k];
	}
}
System.out.println(maxno);
}
}
