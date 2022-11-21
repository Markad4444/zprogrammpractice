package proarraystring;

import java.util.Arrays;

public class Reversearray1 {

	public static void main(String[] args) {
int a[]= {10,100,20,100,100,20,10};
for(int i=0;i<(a.length-1);i++)
{
int count=0;
for(int j=0;j<a.length;j++)
{
	if(a[i]==a[j])
	{ 
		
		count= count+1;
	}
}
System.out.println(a[i]+" repeted "+count);
}
System.out.println(Arrays.toString(a));

	}

}
