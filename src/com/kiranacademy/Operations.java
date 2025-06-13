package com.kiranacademy;

public class Operations {

	public int absolute(int a, int b) {
		return Math.abs(a - b);
	}

	public static void main(String[] args) {
		Operations op = new Operations();

		int result = op.absolute(-15, 7);
		System.out.println("Absolute differece:" + result);
	}

}
