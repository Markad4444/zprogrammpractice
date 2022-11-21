package programepractice;

public class Arraytostring {
	public static void main(String[] args) {
		char k[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

		String str = "gayatri";

		char l[] = str.toCharArray();


		for(int a=0; a<k.length; a++)
		{
			for(int b=0; b<l.length; b++)
			{
				if(k[a] == l[b])
				{
					System.out.print(l[b]);
				}
			}

	}
	}
}

