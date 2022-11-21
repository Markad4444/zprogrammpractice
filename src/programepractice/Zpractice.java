package programepractice;

public class Zpractice {
public static void main(String[] args) {
for (int i=0; i<5; i++)
{
 for(int j=0; j<5-i; j++)
 {
	 System.out.print(" ");
 }
 for(int k=0; k<=i;k++)
 {
	 System.out.print("* ");
 }
 System.out.println("");
}
System.out.println("@###");
for(int b=0; b<5; b++)
{
	for(int a=0; a<=b; a++)
	{
		System.out.print("* ");
	}

	System.out.println();
}


for(int b=3; b>=0; b--)
{
	for(int a=0; a<=b; a++)
	{
		System.out.print("* ");
	}

	System.out.println();
}

for(int x=0; x<4; x++)
{
	
for(int z=0; z<=x; z++)
		{ System.out.print("*");
		}
System.out.println("");
	}
		
 String a[]= {"a","b","c","d"};
 for(int i=a.length-1 ;i>=0;i--)
 {
	 
	 System.out.print(a[i]+"");
 }
	}


}


