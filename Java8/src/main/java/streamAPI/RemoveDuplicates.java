//Write a Java program to remove all duplicate elements from a list using streams.
package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 4, 3, 3, 7, 2, 4);
		List<Integer> result = list.stream().distinct().collect(Collectors.toList());
		System.out.println("List after removing duplicates:" + result);
	}

}
