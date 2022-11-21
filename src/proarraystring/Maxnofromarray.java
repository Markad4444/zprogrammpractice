package proarraystring;

public class Maxnofromarray {

	public static void main(String[] args) {
		int [] a = {25,10,100,5,200};

		int maxno= a[0];
		for(int k=1;k<a.length;k++)
		{
			if(maxno<a[k])
			{
				maxno=a[k];
			}
		}
		System.out.println(maxno);
		int min = a[0];
		for(int j=1;j<a.length;j++)
		{
			if(min>a[j])
			{
				min=a[j];
			}
		}
		System.out.println(min);
	}

}
