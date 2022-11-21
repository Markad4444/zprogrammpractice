package programepractice;

public class Reversetheinteger {

	public static void main(String[] args) {
		long num=12345;//54321
		long rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse no is :"+ rev);
		long num1=123456;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		
	}

}
