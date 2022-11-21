package programepractice;

public class Stringconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "the rains have started here stop bellow shelter";
		String str1 = "the rains Have started here stop bellow shelter";// H capital

		System.out.println(str.length());
		System.out.println(str.charAt(8));
		System.out.println(str.indexOf('s'));//inde of 1st s
		System.out.println(str.indexOf('s',str.indexOf('s')+1));//index of 2nd s
		System.out.println(str.indexOf('s',str.indexOf('s',str.indexOf('s')+1)+1));// index of 3rd s
		System.out.println(str.charAt(28));
		System.out.println("======");
		System.out.println(str.indexOf("have"));//10
		System.out.println(str.indexOf("hello"));// -1 not avaiable use for assertion thst is greater than 1
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println("===========");
		//System.out.println(str.substring(0, 0);
		System.out.println(str.substring(0));
		System.out.println("=======");
		//trim
String s ="    Hello word    ";
System.out.println(s.trim());
System.out.println(s.replace(" ",""));
String date = "01-01-2022";
System.out.println(date.replace("-","/"));

String test = "Hello_word_Test_selenium";
String test1[]=test.split("_");// after split need to store in array
for(int i=0; i<test1.length;i++)
{
System.out.println(test1[i]);	
}
String x= "hello";
String y= "word";
int a= 100;
int b =200;
System.out.println(x+y);
System.out.println(x+y+a+b);
System.out.println(x+y+(a+b));
System.out.println(a+b+x+y);
String num = "vitt1234";
System.out.println(num.replaceAll("[^0-9]", ""));//1234
String num1=num.replaceAll("[0-9]", "");
System.out.println(num1);

int k=1234;
int add=0;
while(k!=0)
{
	add=add+ k%10;
	k=k/10;
}
System.out.println(add);
{
	
}
 String f ="velocity";
 System.out.println(f.substring(0));//velocity
 System.out.println(f.substring(1));//elocity
 System.out.println(f.substring(2));//locity
 System.out.println(f.substring(3));//ocity
 System.out.println(f.substring(4));//city
 System.out.println(f.substring(5));//ity
 System.out.println(f.substring(6));//ty
 System.out.println(f.substring(7));//y
 System.out.println(f.substring(8));//blank
// substring by using two index
 System.out.println(f.substring((0),(8))); // velocity or (0)
 System.out.println(f.substring(0, 7));// velocit
 System.out.println(f.substring(8, 8));//empty/ blank
 System.out.println(f.substring(0,0));//empty/ blank
 System.out.println(f.substring(1, 7));//elocit
 System.out.println(f.substring(2, 6));//loci
 System.out.println(f.substring(3, 5));//oc
 System.out.println(f.substring(4, 4));//blank/empty
 System.out.println(f.substring(2, 2));// index  out of box exception
String ss= "velocityvele";
String sss="velocity";
System.out.println(ss.contains(sss));//true
System.out.println(ss.equals(sss));//false
System.out.println(ss.contentEquals(sss));//false

System.out.println(ss.indexOf("e"));
System.out.println(ss.lastIndexOf("e"));
System.out.println(ss.lastIndexOf("v"));
System.out.println(ss.replace("city", "townn"));
 String s3="abc xyz abc xyz1";
 String ar[]=s3.split(" ");
 for(int i=0;i<=ar.length-1;i++)
 {
	 System.out.println(ar[i]);
 }
 


 


	}
	
}
