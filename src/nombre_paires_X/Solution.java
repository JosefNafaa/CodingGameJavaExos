package nombre_paires_X;

public class Solution {
	 public static void main(String ar[])
	    {
		
		 String example1="-X-XX-X-XXX-";
		 System.out.println(counter(example1));

		 String example2="-X-XXXXXXX-";
		 System.out.println(counter(example2));
		 
	    }
	 
	  public static int counter(String chaine) {
		  String s="";
		
		  int counter =0;
		  for (int i=0;i<chaine.length();i++){
			  System.out.print(chaine.charAt(i));
			  if(chaine.charAt(i)=='X') {
				  if(s.length()<2) {
					  s+="X";
				  }
				  if(s.length()==2) {
					  counter++;
					  s="";
				  }
				  
			  }
			  else {
				  if(s.length()!=0) {
					  s="";
				  }
				  
			  }
		  }
		  System.out.println();
		  return counter;
	  }
	  
	  

}
