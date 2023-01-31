package programe;

public class PolindroneNumber {

	//The Palindrome number is number which is same as reverse of it.
	//Examples:
	//78687 ==78678
	//for taking number 
	public static void main(String[] args) {
		int rev =0;
		int rem =0;
		int number = 12321;
		int temp = number;
		while(number!=0) {
			
			rem = number%10;
			rev = rev*10+rem;
			number = number/10;
			
		}
		System.out.println(rev);
		if(rev==temp) {
			System.out.println("Give number is pallindrome");
		}
		else {
			System.out.println("Given number is not pallindrome");
		}
	}
}
