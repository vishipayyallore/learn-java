package com.learnjava.datatypesdemo;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.function.Consumer;

/**
 * Data Types Demo
 *
 */
public class App {
	public static void main(String[] args) {
		
		// Consumer Variables.
		Consumer<String> printString = message -> System.out.println(message);
		Consumer<String> printMessageConsumer = (message) -> {
			System.out.println(String.format("***** %s ******", message));	
		};
		
		System.out.println(String.format("***** Data Types Demo in (%s)*****", System.getProperty("user.dir")));
		System.out.printf("%,.2f", 12345678.9);

		Locale locale = new Locale("en", "IN");
		String pattern = "#,###.##";

		DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(locale);
		decimalFormat.applyPattern(pattern);

		String format = decimalFormat.format(123456789.123);
		System.out.println(String.format("\nSalary= %s", format));

		// Basic Lambda Expression
		new Thread(() -> {
			System.out.println("New thread created");
		}).start();

		// lambda expression to define the calculate method
		ISquare square = (int x) -> x * x;
		System.out.println(String.format("Square of 5 is %s", square.calculate(5)));

		executeLambda("Hello Function Expresseion", printString);
		executeLambda("Hello Function Again", (message) -> System.out.println(message));
		executeLambda("Hello Function Expresseion", printMessageConsumer);
	}

	private static void executeLambda(String value, Consumer<String> method) {
		method.accept(value);
	}
	
}
