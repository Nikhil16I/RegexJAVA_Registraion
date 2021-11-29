package RegexJAVA;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		RegexRegistration regex = new RegexRegistration();

		Scanner name = new Scanner(System.in);
		System.out.println("Input Last Name :- ");
		
		String lastName = name.nextLine();
		regex.UserAttributes(lastName);
		
	}
}
