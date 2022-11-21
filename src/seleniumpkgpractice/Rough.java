package seleniumpkgpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Rough {
 public static void main(String[] args) {
ArrayList al= new ArrayList();	
al.add("10abc");
al.add(100);
al.add('A');
al.add(55.5f);
al.add(100);
al.add("200");
System.out.println(al);
 System.out.println(al.size());
System.out.println(al.get(0));
System.out.println(al.contains(100));
System.out.println(al.indexOf(100));
System.out.println(al.lastIndexOf(100));
System.out.println(al.remove(1));
System.out.println(al);
System.out.println(al.set(0, "vitthal"));
System.out.println(al);
System.out.println("===============");
java.util.Iterator itr=al.iterator();
while(itr.hasNext())
{
	System.out.print(itr.next()+" ");
}
System.out.println("================");
ListIterator itr1= al.listIterator();
while(itr1.hasNext())
{
	System.out.print(itr1.next()+" ");
}
System.out.println("===============");
for(int i=0;i<al.size();i++)
{
	System.out.println(al.get(i));
}
System.out.println("============================");
for(Object s1:al)
{
	System.out.println(s1);
}
 }
}
