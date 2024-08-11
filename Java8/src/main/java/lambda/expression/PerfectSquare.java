//Write a Java program to implement a lambda expression to check if a given number is a perfect square.
package lambda.expression;

import java.util.function.Predicate;

public class PerfectSquare {

	public static void main(String[] args) {
		int num = 64;
		int num1 = 50;
		Predicate<Integer> perfectSquare = number -> {
			int sqrt = (int) Math.sqrt(number);
			if (sqrt * sqrt == number)
				return true;
			else
				return false;
		};
		System.out.println(num + " is perfect square or not :" + perfectSquare.test(num));
		System.out.println(num1 + " is perfect square or not :" + perfectSquare.test(num1));

	}

}
