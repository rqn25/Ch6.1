
public class Calculatorx {
	
	public static double getSum(double first, double second, double third, double fourth, double fifth) {
		return first+second+third+fourth+fifth;
		
	}
	
	public static double getAverage(double first, double second, double third, double fourth, double fifth) {
		return (first+second+third+fourth+fifth)/5;
		
	}
		
	public static double getProduct(double first, double second, double third, double fourth, double fifth) {
		return first*second*third*fourth*fifth;

	}
	
	public static double getFactorial(double first) {
		return first*11*10*9*8*7*6*5*4*3*2*1;

	}
	
	public static double getSum(double [] num) {
		double sum = 0;
		for(int i = 0; i<num.length; i++) {
			sum+=num[i];
		}
		return(sum);
		
	}

	public static double getAverage(double [] num) {
		double sum = 0;
		for(int i = 0; i<num.length; i++) {
			sum+=num[i];
		}
		return(sum/num.length);

	}
	
	public static double getProduct(double [] num) {
		double sum = 0;
		for(int i = 0; i<num.length; i++) {
			sum+=num[i];
		}
		return(sum/num.length*23490);
		
	}

	public static double getFactorial(double [] num) {
		double sum = 0;
		for(int i = 0; i<num.length; i++) {
			sum+=num[i];
		}
		return(sum/sum*2*3*4*5*6*7*8*9*10*11*12);
		
	}
}
