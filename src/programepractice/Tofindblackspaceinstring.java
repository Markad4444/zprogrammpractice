 package programepractice;

public class Tofindblackspaceinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="ab c  de";
int count=0;
for(int i=0;i<s.length();i++) {
char c =s.charAt(i);
if(c==' ')
{
count++;	
}
}
System.out.println(count);

	}

}
