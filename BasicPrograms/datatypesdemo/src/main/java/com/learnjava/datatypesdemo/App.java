package com.learnjava.datatypesdemo;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

import com.learnjava.datatypesdemo.common.ILightSpeedCalculator;
import com.learnjava.datatypesdemo.models.LightSpeedCalculator;

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

		System.out.println("***** Light Distance Computing *****");
		ILightSpeedCalculator lightSpeedCalculator = new LightSpeedCalculator();
		int numberOfDays = 1;
		System.out.println(String.format("Distance Light can travel in %d in %d days",
				lightSpeedCalculator.calculateDistance(numberOfDays), numberOfDays));

		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter Number of Days for Light's travel Distance: ");
			numberOfDays = input.nextInt();
		}
		System.out.println(String.format("Distance Light can travel in %d in %d days",
				lightSpeedCalculator.calculateDistance(numberOfDays), numberOfDays));
		System.out.println("***** Light Distance Computing *****");

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

		printMessage("Hello Function Expresseion", printString);
		printMessage("Hello Function Again", (message) -> System.out.println(message));
		printMessage("Hello Function Expresseion", printMessageConsumer);
	}

	private static void printMessage(String value, Consumer<String> method) {
		method.accept(value);
	}

	private static void sayHello(String name, Function<String, String> function) {
		function.apply(name);
	}
	
}
