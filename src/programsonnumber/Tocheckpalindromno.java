package programsonnumber;

import java.util.Scanner;

public class Tocheckpalindromno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Scanner sc = new Scanner(System.in);
 System.out.println("Enter a number");
 //int num= sc.nextInt();
 int num=121;
 int rev=0;
 int a=10;
 int b=10;
 if(a==b)
 {
	 System.out.println("true");
 }
 while(num!=0)
 {
	rev=rev*10+num%10;
	num=num/10;
 }
 System.out.println(rev);
 if(num==rev)
 {
	 System.out.println("entered no is a palindrome no");
 }
 else
 {
 System.out.println("entered no is not a palindrome no");

	 
 }
	}

}
