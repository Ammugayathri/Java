// Write a Java program to implement a lambda expression to check if a given string is empty
package lambda.expression;

import java.util.function.Predicate;

public class IsEmpty {
	public static void main(String args[]) {
		Predicate<String> emptyCheck = (str) -> "".equals(str);
		System.out.println("Is string empty?" + emptyCheck.test(""));
		System.out.println("Is string empty?" + emptyCheck.test("Hello"));
	}

}
