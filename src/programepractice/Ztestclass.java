package programepractice;

import java.util.Scanner;

public class Ztestclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "gayatri";

		char l[] = str.toCharArray();
for(int i=0;i<l.length;i++)
{
	System.out.print(l[i] +",");
}
Scanner scr = new Scanner(System.in);

int k = scr.nextInt();

scr.close();

int a = 0;
int b = 1;

System.out.print(a +", "+b);

for(int v=2; v<k; v++)
{
	int c= a+b;
	System.out.print(", "+ c);
	a = b;
	b = c;

}

	}

}
