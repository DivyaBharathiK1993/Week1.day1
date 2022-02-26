package week1.day2assignments;

public class FibonacciSeriesAssignment {

	public static void main(String[] args) {
		
		int firstNum = 0, secNum=1;
		int sum;
		System.out.println(firstNum);
		System.out.println(secNum);
		
		for (int i=1; i<=8; i++)
		{
			sum = firstNum + secNum;
			firstNum=secNum;
			secNum = sum;
			System.out.println(sum);
		}
	
		}

	}

