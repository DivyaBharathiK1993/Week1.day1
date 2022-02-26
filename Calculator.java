package week1.day2assignments;

public class Calculator {
	
	public int add(int num1, int num2, int num3) {
		
		int sum = num1+num2+num3;
		System.out.println(sum); 
		return sum;
	}
public int sub(int num1, int num2) {
		
		int sub = num1-num2;
		System.out.println(sub);
		return sub;
	}
public double mul(double num1, double num2){
	
	double mul = num1 * num2;
	System.out.println(mul); 
	return mul;
}

public float divide(float num1, float num2) {
	float div = num1/num2;
	System.out.println(div); 
	return div; 
}

}
