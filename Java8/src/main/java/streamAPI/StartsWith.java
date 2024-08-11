//Write a Java program to count the number of strings in a list that start with a specific letter using streams
package streamAPI;

import java.util.Arrays;
import java.util.List;

public class StartsWith {
	public static void main(String args[]) {
		List<String> names = Arrays.asList("Katrina", "Karthik", "Navya", "Venba", "Kavya");
		long cnt = names.stream().filter(str -> str.startsWith("K")).count();
		System.out.println("Count of names starts with K:" + cnt);
	}

}
