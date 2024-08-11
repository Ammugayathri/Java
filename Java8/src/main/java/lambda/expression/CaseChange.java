//Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
package lambda.expression;

import java.util.Arrays;
import java.util.List;

public class CaseChange {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Mango", "Orange", "Banana", "Apple", "Guava");
		// USING LAMBDA EXPRESSION
		fruits.replaceAll(str -> str.toLowerCase());
		System.out.println("Printing in lowercase:" + fruits.toString());
		fruits.replaceAll(str -> str.toUpperCase());
		System.out.println("Printing in uppercase:" + fruits.toString());
		// USING STREAM
		System.out.println("Printing in lowercase:");
		fruits.stream().map(String::toLowerCase).forEach(fruit -> System.out.println(fruit));
		System.out.println("Printing in uppercase:");
		fruits.stream().map(String::toUpperCase).forEach(fruit -> System.out.println(fruit));
	}

}
