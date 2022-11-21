package proarraystring;

import java.util.Arrays;

public class Asendingarray {
public static void main(String[] args) {
	int [] a = {27,500,120,56,88};
	
	for(int i= 0;i<a.length; i++)
	{
		for(int j=i+1; j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				int h=a[i];
				a[i]=a[j];
				a[j]=h;
			}

	}


}
	System.out.println(Arrays.toString(a));

}
}
