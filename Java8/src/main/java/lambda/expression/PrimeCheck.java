//Write a Java program to implement a lambda expression to create a lambda expression to check if a number is prime.
package lambda.expression;

import java.util.function.Predicate;

public class PrimeCheck {
	public static void main(String args[]) {
		int number = 7;
		Predicate<Integer> factorial = (num) -> {
			long result = 0;

			if (num <= 1)
				return false;
			else {
				for (int i = 1; i * i <= num; i++) {
					if (num % i == 0) {
						result++;
						if ((num / i) != i) {
							result++;
						}
					}
				}
			}
			if (result == 2)
				return true;
			else
				return false;
		};
		System.out.println("Is the number prime : " + factorial.test(number));
	}
}
