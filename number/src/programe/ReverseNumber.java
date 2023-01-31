package programe;

public class ReverseNumber {

	//the reverse number is number which will start from the last index point 
	
	public static void main(String[] args) {
		
		int n = 8796;
		int a = 0;
		int b;
		
		while(n>0) {
			b = n%10;
			a = a*10+b;
			n = n/10;
			
		}
		System.out.println(a);
		
	}
}
 