package programe;

public class ReverseString {

	public static void main(String[] args) {
		  /* String s ="fedcba";
		   String rev="";
		   
		   for (int i=(s.length()-1); i>=0; i--)
		   {
		   rev=rev+s.charAt(i);
		   
		   }
		   system.out.println("the reversed String is "+rev);
		   
		   		   */
		//By using StringBuffer
		//Declare string object and assign the string 
		StringBuffer str = new StringBuffer("fedcba");
		
		//reverse the string
		str.reverse();
		
		//print the reverse string 
		System.out.println("String after reversing:" + str);
		
		
	}
	
	
}
