package programe;

public class FactorialNumber {
public static void main (String[]argu) {
	
	int number = 5;
	int factorial = 1;
	/*for(int i=number;i>0;i--)     // 1st way
{	 
	 factorial = factorial*i;
	 
	 }*/
	for (int i=1; i<=number; i++)  //2nd way
	{
		factorial = factorial*i;
	}
    System.out.println("factorial of number 5 is"+ factorial);
}
}
 //The factorial function (Symbol:!) says to multiply all  whole number from our chosen number down to 1
 //eg. 5! = 5*4*3*2*1=120
