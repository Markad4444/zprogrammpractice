package programepractice;

public class Trycatchfinally {
public static void main(String[] args) {
	int a=100;
	int b= 20;
	int [] k = {12,3,2,5};
	try
	{
		System.out.println(a/b);
		System.out.println(k[a]);
	}
//	catch (Exception e )
//	{
//		System.out.println("last index must be " + k.length);
//		System.out.println(e);
//	}
	finally
	{
		System.out.println("finally called");
	}
}

}

