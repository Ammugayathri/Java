//Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class EvenOddSum {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Predicate<Integer> p1 = i -> i % 2 == 0;
		Predicate<Integer> p2 = i -> i % 2 != 0;
		int evenSum = list.stream().filter(p1).mapToInt(Integer::intValue).sum();
		System.out.println("Sum of even numbers:" + evenSum);
		int oddSum = list.stream().filter(p2).mapToInt(Integer::intValue).sum();
		System.out.println("Sum of odd numbers:" + oddSum);

	}

}
