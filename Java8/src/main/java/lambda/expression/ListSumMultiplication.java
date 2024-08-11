//Write a Java program to create a lambda expression to multiply and sum all elements in a list of integers.
package lambda.expression;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ListSumMultiplication {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int sumResult = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum of the list is :" + sumResult);
		Optional<Integer> mulplicationResult = numbers.stream().reduce((num1, num2) -> num1 * num2);
		if (mulplicationResult.isPresent())
			System.out.println("Multiplication result  of the list is :" + mulplicationResult.get());
		else
			System.out.println("List is empty");
	}

}
