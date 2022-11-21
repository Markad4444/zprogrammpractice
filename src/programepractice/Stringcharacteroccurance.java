package programepractice;

import java.util.Arrays;

public class Stringcharacteroccurance {
public static void main(String[] args) {
String str= "vitthal@34#$";
String rev="";
for(int i=11;i>=0;i--)
{
	rev=rev+ str.charAt(i);
}
System.out.println(rev);
StringBuffer sb =new StringBuffer(str);
System.out.println(sb.reverse());
System.out.println(str.toCharArray());
System.out.println(str.concat(rev));
System.out.println(str.split(rev));
String d[]= {"a","d","f","g",};
System.out.println(d.length);
for(int k=d.length-1;k>=0;k--)
{    

System.out.print(d[k]+"");
	
	
}
System.out.println(Arrays.toString(d));
}
}
