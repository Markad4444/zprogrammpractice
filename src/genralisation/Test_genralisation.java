package genralisation;

public class Test_genralisation {
public static void main(String[] args) {
	System.out.println("features of Jio Simcard");
	Jio j =new Jio();
	j.Audiocalling();
	j.sms();
	j.internet();
	j.newfeature();
	System.out.println(" features of Idea Simcard");
	Idea i=new Idea();
	i.Audiocalling();
	i.sms();
	i.internet();
	i.newfeature();
}
}
