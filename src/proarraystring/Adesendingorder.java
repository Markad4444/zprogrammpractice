package proarraystring;

import java.util.Arrays;

public class Adesendingorder {
public static void main(String[] args) {
	int a[] = {1000, 92, 75, 120, 65, 854, 625, 235 };
	System.out.println(a.length);


	for(int i=0; i<a.length; i++)
	{
		for(int j=i+1; j<a.length; j++)
		{
			if(a[i] < a[j])
			{
				int h = a[i];
				a[i]= a[j];
				a[j]=h;

			}

		}
		System.out.print(a[i] +",");//doubt

	}
System.out.println(" ");
//	for(int m=0; m<a.length; m++)
//	{
//		System.out.print(a[m] + ", ");
//	}
System.out.println(Arrays.toString(a));
}
}
