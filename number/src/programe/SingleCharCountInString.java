package programe;

public class SingleCharCountInString {
public static void main(String[] args) {
	{
		String s="pooonam";
		int count =0;
		for(int i =0; i<s.length();i++)
		{
			if(s.charAt(i)=='o')
			{
			count=count+1;
			}
			
			
		}
		System.out.println("counting the number of occurrences of o in a string="+count);
	}
}
}
		
			
		
		


