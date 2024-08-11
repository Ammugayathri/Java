package lambda.expression;

public class RunnableExample {

	public static void main(String[] args) {
		// BEFORE JAVA 8 - using anonymous class
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Runnable implementation before Java");
			}
		};
		new Thread(runnable).start();

		// USING LAMBDA EXPRESSION
		Runnable runnableLambda = () -> System.out.println("Runnable implementation using Lambda expression");
		new Thread(runnableLambda).start();

		// BEFORE JAVA 8 - using anonymous class
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Runnable implementation 2 before Java");
			}
		}).start();
		// USING LAMBDA EXPRESSION
		new Thread(() -> System.out.println("Runnable implementation using Lambda expression 2")).start();

	}

}
