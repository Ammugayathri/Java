//Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order
package lambda.expression;

import java.util.Arrays;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Mango", "Orange", "Banana", "Apple", "Guava");
		fruits.sort((str1, str2) -> str1.compareToIgnoreCase(str2));
		System.out.println(fruits.toString());

	}

}
