package com.kiranacademy;

public class Operations {

	public Operations() {

	}

	public void add() {

		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println("addition=" + sum);
	}

	public void subtract() {

	}

	public void multiply() {

	}

	public void divide() {

	}

	public void modulus() {
		int a = 1234;
		int b = 10;

		int result = 1234 % 10;

		System.out.println("Remainder of " + a + " divided by" + b + "is:" + result);

	}

	public void exponent() {

	}

	public void factorial() {

		int num = 5;
		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact *= i;
		}

		System.out.println("Factorial of " + num + " is: " + fact);

	}

	public void squareRoot() {

	}

	public void cubeRoot() {
		int num = 7;
		int ans = num * num * num;
		System.out.println("Cube root is:" + ans);
	}

	public void absolute() {

	}

	public void logarithm() {
		double number = 100; // You can change this value

		if (number <= 0) {
			System.out.println("Logarithm is undefined for zero or negative numbers.");
		} else {
			double naturalLog = Math.log(number);
			double logBase10 = Math.log10(number);
			double logBase2 = Math.log(number) / Math.log(2);

			System.out.println("Test");
			System.out.println("Number: " + number);
			System.out.println("Natural Log (ln): " + naturalLog);
			System.out.println("Log base 10 (log10): " + logBase10);
			System.out.println("Log base 2 (log2): " + logBase2);
		}
	}

	public void average() {

	}

	public void square() {

	}
}
