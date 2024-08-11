//Write a Java program to implement a lambda expression to find the average length of strings in a list
package lambda.expression;

import java.util.Arrays;
import java.util.List;

public class AverageLength {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Mango", "Orange", "Banana", "Apple", "Guava");
		double avg = fruits.stream().map(fruit -> fruit.length()).mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println("Average length of the list of strings:" + avg);

	}

}
