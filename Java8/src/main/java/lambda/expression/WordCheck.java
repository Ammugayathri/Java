//Write a Java program to implement a lambda expression to check if a list of strings contains a specific word.
package lambda.expression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class WordCheck {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Mango", "Orange", "Banana", "Apple", "Guava");
		Predicate<String> wordCheck = (str -> str.equals("Orange"));

		boolean result = fruits.stream().anyMatch(wordCheck);
		System.out.println("Word is found or not:" + result);

	}

}
