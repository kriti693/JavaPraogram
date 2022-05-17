package Simple;

import java.io.Console;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test {
	public static void main(String[] args) {
		Console cons = System.console();
		try {
			System.out.println("Please enter your age.");
			int age = Integer.parseInt(cons.readLine());
			System.out.println("You are " + age + " years old.");
		} catch (Exception e) {
			System.out.println("Error: A number is required.");
		} finally {
			System.out.println("Exit");
		}
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("DD MM YYYY");
		LocalDate date = LocalDate.of(2015, 12, 20);

		System.out.println(date.format(formatter));
		boolean x = false;
		if (x = true) {
			System.out.println("Looping");
		}
		StringBuilder sb = new StringBuilder("Test ");
		//String test = sb.append("StringBuilder");
		//System.out.print(test);
	}
}
