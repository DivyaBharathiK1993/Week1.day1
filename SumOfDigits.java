package week1.day2assignments;

public class SumOfDigits {

	public static void main(String[] args) {

int num = 199;
int sum = 0;


for (int i=1; i<=3; i++)
{
	int reminder = num%10;
	 int quot = num/10;
	 num = quot;
	 System.out.println("quot"+num);
	if(reminder!=0) {
		
		sum = sum+reminder;
		System.out.println(sum);

	}
}
	}

}
