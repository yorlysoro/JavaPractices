package input_ouput;

import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in)) {
			System.out.println("Insert a string:");
			String msg = input.next();
			System.out.println(msg);
			System.out.println("Insert a double:");
			Double number = input.nextDouble();
			System.out.println(number.toString());
		}

	}

}
