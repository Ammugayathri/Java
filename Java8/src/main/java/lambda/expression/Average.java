//Write a Java program to implement a lambda expression to find the average of a list of doubles.
package lambda.expression;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Average {

	public static void main(String[] args) {
		List<Double> list = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
		OptionalDouble average = list.stream().mapToDouble(num -> num).average();
		if (average.isPresent())
			System.out.println("Average of the list is:" + average.getAsDouble());
		else
			System.out.println("List is empty");

	}

}
