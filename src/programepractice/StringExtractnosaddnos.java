package programepractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringExtractnosaddnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "AHGSHejjj2d7d9d9nF";
		Pattern p = Pattern.compile("[0-9]");
		Matcher m = p.matcher(str);
		int sum=0;
		while(m.find())
		{
			sum=sum+Integer.parseInt(m.group());
		}
System.out.println(sum);
	}

}
