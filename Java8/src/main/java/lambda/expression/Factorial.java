package lambda.expression;

import java.util.function.Function;

public class Factorial {

	public static void main(String[] args) {
		long number = (long) 5;
		Function<Long, Long> factorial = (num) -> {
			long result = 1;
			if (num == 0 || num == 1)
				return (long) 1;
			else {
				for (int i = 2; i <= num; i++) {
					result *= i;
				}
			}
			return result;
		};
		System.out.println("Factorial of the number is : " + factorial.apply(number));

	}

}
