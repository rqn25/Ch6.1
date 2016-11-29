
public class CalculatorDriverx {

	public static void main(String[] args) {
		
		double [] num = new double [5];

		num[0] = 10;
		num[1] = 12;
		num[2] = 13.5;
		num[3] = 12.5;
		num[4] = 14.5;
		
		System.out.println("Sum: " + Calculator.getSum(num));
		System.out.println("SumDriver: " + Calculator.getSum(10, 12, 13.5, 12.5, 14.5));

		System.out.println("Average: " + Calculator.getAverage(num));
		System.out.println("AverageDriver: " + Calculator.getAverage(10, 12, 13.5, 12.5, 14.5));
		
		System.out.println("Product: " + Calculator.getProduct(num));
		System.out.println("ProductDriver: " + Calculator.getProduct(10, 12, 13.5, 12.5, 14.5));
		
		System.out.println("Factorial: " + Calculator.getFactorial(num));
		System.out.println("FactorialDriver: " + Calculator.getFactorial(12));
		
	}
}
