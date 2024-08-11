//Write a Java program to implement a lambda expression to find the sum of two integers
package lambda.expression;

import java.util.function.BiFunction;

public class Sum {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> sum = (num1, num2) -> {
			return num1 + num2;
		};
		System.out.println("Sum is:" + sum.apply(10, 20));
	}

}
