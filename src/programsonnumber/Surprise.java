package programsonnumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import seleniumpkgpractice.Seleniumpractice;

public class Surprise {
	public static void main(String[] args) {
		
	int sum=0;
	for(int i=0;i<10;i++)
	{ if(i==5)
	  {
		System.out.println(i);
		break;
	   }
		
		sum=sum+i;
	   }
	System.out.println(sum);
	
	
	int sum1=0; 
	for(int i=0;i<10;i++)
	{
		if(i==5)
		{
			System.out.println(i);
			continue;
		}
		sum1=sum1+i;
	}
	System.out.println(sum1);
	}
	
	
	}

	



	


