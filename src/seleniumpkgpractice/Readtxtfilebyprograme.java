package seleniumpkgpractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;//C:\\\\selenium\\\\Text.txt
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Readtxtfilebyprograme {
public static void main(String[] args) throws IOException {
	FileReader file = new FileReader("C:\\selenium\\Text.txt");
	try (BufferedReader br = new BufferedReader(file)) {
		String str;
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
			
		}
		br.close();
	}

}
}