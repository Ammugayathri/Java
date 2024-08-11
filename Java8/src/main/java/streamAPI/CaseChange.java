//Write a Java program to convert a list of strings to uppercase or lowercase using streams.
package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class CaseChange {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Tony", "Tommy", "Raju", "Adam");
		List<String> list1 = list.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
		System.out.println(list1);
		list.stream().map(s -> s.toUpperCase()).forEach(System.out::println);

	}

}
