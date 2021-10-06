package week1.day2.assignments;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		System.out.println("Sum of 3 numbers is " + obj.add(15, 87, 20));
		System.out.println("Subtraction of 2 numbers is " + obj.sub(100, 27));
		System.out.println("Product of 2 numbers is " + obj.mul(12.5, 2.0));
		System.out.println("Division of 2 numbers is " + obj.divide(81, 9));
	}

}
