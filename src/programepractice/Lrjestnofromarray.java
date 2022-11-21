package programepractice;

public class Lrjestnofromarray {
 public static void main(String[] args) {

	 int a[]= {12, 54, 69, 32, 5, 95, 725, 966,1};
	
int largeno= a[0];
for(int i=0;i<a.length-1;i++)
{
	if(a[i]>a[i+1])
	{
		int h= a[i+1];// stored temporary 
		largeno=a[i];//assigned to large no
		a[i]=h;//
		a[i+1]=a[i];// for take new index position for comparision
		
	}
	else
	{
		largeno=a[i+1];
	}
}
System.out.println(largeno);

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
//		int largeno = a[0];
//		for(int b =0; b<a.length-1; b++)
//		{ 
//			if (a[b]>a[b+1])
//		{ 
//				largeno=a[b];
//			int h = a[b+1];
//			a[b+1]=a[b];
//			a[b] = h;
//			
//		}
//		else {
//			 largeno =a[b+1];
//			}
//		}
//
//		System.out.println(largeno +" is large Number");
 }
}


		