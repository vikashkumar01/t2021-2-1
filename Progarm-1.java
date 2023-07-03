

import java.util.Scanner;

public class Problem_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Numbers:");
		double num1 = sc.nextDouble();

		System.out.println("Enter Second Numbers:");
		double num2 = sc.nextDouble();

		System.out.println("Enter the operation among them: +, - ,* ,/");
		char ch = sc.next().charAt(0);

		double result;

		switch (ch) {
		case '+':
			result = num1 + num2;
			System.out.println("Addition of " + num1 + " and " + num2 + " = " + result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println("Subtraction of " + num1 + " and " + num2 + " = " + result);
			break;

		case '*':
			result = num1 * num2;
			System.out.println("Multiplication of " + num1 + " and " + num2 + " = " + result);
			break;
		case '/':
			if (num2 == 0) {
				System.out.println(num1 + " is not divisible by " + num2);
				break;
			}
			result = num1 / num2;
			System.out.println("Division of " + num1 + " and " + num2 + " = " + result);
			break;
		default:
			System.out.println("Invalid choice");
		}

	}

}
