package programepractice;

public class Dublicatenamearray {
 public static void main(String[] args) {
	 Dublicatenamearray kk= new Dublicatenamearray();
	kk.dublicatevalue();
	 
	String a[]= {"vitthal","sushil","rekha" ,"krishna","vitthal", "sharad"};
	
	 for(int i=0;i< 6; i++)
	 {
		 for(int j=i+1;j<6; j++)
		 {
			 if (a[i]==a[j])
				 System.out.println(a[i] + " is a dublicate name");
		 }
	 }
}
 public  void dublicatevalue()
 {
	 int a[]= {15,25,30,24,15,22};
 
 for(int i=0;i< 6; i++)
 {
	 for(int j=i+1;j<6; j++)
	 {
		 if (a[i]==a[j])
			 System.out.println(a[i] + " is a dublicate value");
	 }
 }

}
}
