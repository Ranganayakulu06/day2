public class SimpleInterestCalculator{
	public static void calculatorSimpleInterest(double principal, double rate, double time){
		System.out.println((principal * rate * time) / 100);
	}
	public static void main(String [] args){
		calculatorSimpleInterest(1000.0, 5.0, 2.0);
}
}