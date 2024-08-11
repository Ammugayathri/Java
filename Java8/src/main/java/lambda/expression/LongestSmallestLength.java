//Write a Java program to implement a lambda expression to find the length of the longest and smallest string in a list.
package lambda.expression;

import java.util.Arrays;
import java.util.List;

public class LongestSmallestLength {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Mango", "Orange", "Banana", "Apple", "Guava");
		int longest = fruits.stream().mapToInt(String::length).max().orElse(0);
		System.out.println("Length of longest string in the list is:" + longest);
		int smallest = fruits.stream().mapToInt(String::length).min().orElse(0);
		System.out.println("Length of smallest string in the list is:" + smallest);

	}

}
