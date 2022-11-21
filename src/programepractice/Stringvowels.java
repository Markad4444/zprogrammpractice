package programepractice;

public class Stringvowels {
 public static void main(String[] args) {
	String str="testingAEIOU";
	int vcount=0;
	for(int i=0;i<str.length();i++)
	{ char c= str.charAt(i);
		if(Isvowels(c))
		{
			vcount++;
		}
	}
	System.out.println(vcount);
	String y="vitthal";
	int vowless =0;
	for(int z=0;z<y.length();z++)
	{
		char cc=y.charAt(z);
		if(isvowless(cc))
		{
			vowless++;
			System.out.println(cc);
		}
	}
	System.out.println(vowless);
}
 public static boolean Isvowels(char t)
 { return t=='a'||t=='e'||t=='i'||t=='o'||t=='u'||
           t=='A'||t=='E'||t=='I'||t=='O'||t=='U';
 	 
 }
 public static boolean isvowless(char x)
 {
	 return x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||
			 x=='A'||x=='E'||x=='O'||x=='U'||x=='I';
 }

 }

