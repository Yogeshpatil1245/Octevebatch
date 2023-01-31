package programe;

public class Removethenumbersfromthestring {

	public static void main(String[] args) {
		String s ="d5de5dd56d5dd";
		int digit = 0;
		String numericstring = "";
		
		for (int i=0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i))) {
				numericstring = numericstring + s.charAt(i);
				
			}
		}
		System.out.println("the numeric string is:" + numericstring);
		
	}
}
