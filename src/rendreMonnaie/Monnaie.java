package rendreMonnaie;

public class Monnaie {
	static long piece2=0;
	static long billet5=0;
	static long billet10=0;
	
	public static void main(String[] args) {
		//long l=9223372036854775803;
		long s=54775803;
		System.out.println(Solution.monnaieOptimal(s));//9223372036854775803
		if(Solution.monnaieOptimal(s) != null) {
		System.out.println(Monnaie.piece2);
		System.out.println(Monnaie.billet5);
		System.out.println(Monnaie.billet10);
		}
		System.out.println(01|11);
	}
}
class Solution{
	static Monnaie  monnaieOptimal(long s) {
		
		Monnaie monnaie=new Monnaie();
		if(s>=10) {
			monnaie.billet10=s/10;
			s=s%10;
			
		}
		if(s==2||s==4||s==6||s==8) {
			monnaie.piece2=s/2;
		}
		else {
			monnaie.billet5=s/5;
			s=s%5;
			monnaie.piece2=s/2;
			s=s%2;
			
		}
		if(s==1) {
		return null;
		}
		return monnaie;
		
	}
}
