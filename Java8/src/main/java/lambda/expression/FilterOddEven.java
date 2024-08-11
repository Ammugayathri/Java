//Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.
package lambda.expression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterOddEven {
	public static void main(String args[]) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> even = numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		System.out.println("Even numbers:");
		for (int number : even) {
			System.out.println(number);
		}
		System.out.println("Odd numbers:");
		numbers.stream().filter(num -> num % 2 != 0).forEach(num -> System.out.println(num));

	}
}
