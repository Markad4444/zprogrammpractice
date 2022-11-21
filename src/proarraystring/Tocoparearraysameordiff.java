package proarraystring;

import java.util.Arrays;

public class Tocoparearraysameordiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ar[][]= {{10,20},{30,40}};
int ar1[][]= {{10,20},{30,40}};
int ar2[]= {40,50,60};
System.out.println(Arrays.equals(ar,ar1));
//System.out.println(Arrays.equals(ar1, ar2));
System.out.println(Arrays.deepEquals(ar, ar1));
	}

}
