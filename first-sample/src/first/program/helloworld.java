package first.program;

import java.util.Scanner;

public class helloworld {

	public static void main(String[] args) {
		
		// Variables
		int numberValue = 100;
		int number2Value = 200;
		
		System.out.println("Hello World. \nThis is my first program in Java!");
		
		var output = String.format("Number 1: %d Number 2: %d", numberValue, number2Value);
		System.out.println(output);
		
		numberValue = number2Value;
		output = String.format("Number 1: %d Number 2: %d", numberValue, number2Value);
		System.out.println(output);
		
		number2Value = 400;
		output = String.format("Number 1: %d Number 2: %d", numberValue, number2Value);
		System.out.println(output);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		System.out.print(input.next());
	}

}
