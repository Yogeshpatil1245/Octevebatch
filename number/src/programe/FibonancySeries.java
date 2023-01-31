package programe;

public class FibonancySeries {

	public static void main(String[] args) {
		
		//Fibonacci Series is Series of number where next number is sum of previous two number.
		//0+1=1  //1+1=2  //2+1=3   //2+3=5   //3+5=8
		int x=0;
		int y=1;
		int z=0;
		int n =1000;
		while(z<=n) {
			System.out.println(z);
			x = y;
			y = z;
			z = x + y;
			
			//System.out.println('m'+'a'+'h'+'e'+'s'+'h');
			System.out.println('a');
			
		}
	}
}
