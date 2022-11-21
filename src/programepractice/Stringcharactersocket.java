package programepractice;

public class Stringcharactersocket {

	public static void main(String[] args) {
		String f="vitthal123 markad123";
		System.out.println(f.length());
		System.out.println(f.toCharArray());
		System.out.println(f.contains("h"));
		System.out.println(f.replace("v","w"));
		System.out.println(f.trim());
		
		for(int i=0; i<2;i++)
		{
			String [] c= f.split(" ");
			System.out.println(c[i]);
		
		}
		
				
	}

}
