package programepractice;

import java.util.Arrays;

public class Arraytostringnosadd {

	public static void main(String[] args) {
String str[]= {"2AA","12","ABC","c1a1","a5"};
int sum=0;
for(int i=0;i<str.length;i++)
{ String string = str[i];
for(int j=0; j<string.length();j++)
{
 if(Character.isDigit(string.charAt(j)))
 {
	 
	sum=sum+Integer.parseInt(string.charAt(j)+"");
 }
}
}
System.out.println(sum);

String sr= "vitt7h3al9";
int summ=0;
 String a= sr.replaceAll("[^0-9]", "");
 for(int x=0;x<a.length();x++)
 {
	 if(Character.isDigit(a.charAt(x)))
	 {
		 summ= summ+Integer.parseInt(a.charAt(x)+"");
	 }
 }
 System.out.println(summ);
	}
}



