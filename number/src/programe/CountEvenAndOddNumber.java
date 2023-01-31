package programe;

public class CountEvenAndOddNumber {
	public static void main(String[] args) {
		int evencount = 0;
		int oddcount = 0;
		for(int i=1; i<=999; i++)
		{
			if(i%2==0)
			{
				evencount++;
		       
			}
			else
			{
				oddcount++;
			}
		}
		System.out.println("even count:"+evencount);
		System.out.println("odd count:"+oddcount);
		
	}

}
