package week1.day2assignments;


public class PrimeNumberAssignment {

	public static void main(String[] args) {

//boolean reminder = false;

int input = 19;

boolean prime = false;

for (int i = 2; i<input ; i++) {
	System.out.println(i);
	if(input % i == 0) {
	prime = true;
	
	}
	
}
if (prime) {

	System.out.println("Not a Prime Number");
}
else 
	
	System.out.println("Prime Number");
	}
}

	

	
