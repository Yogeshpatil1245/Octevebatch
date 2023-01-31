package programe;

public class PolindroneString {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//System.out.println(Enter the String");
		//int num=sc.nextlnt();
		String s="nayan";
		String rev="";
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		//System.out.println(rev);
		
		if(s.equals(rev))
		{
			System.out.println("String is a polindrome");
		}
		else
		{
			System.out.println("string is not a polindrome");
			
		}
		
}

}
	