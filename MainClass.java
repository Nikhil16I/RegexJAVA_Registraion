package RegexJAVA;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		RegexRegistration regex = new RegexRegistration();

		Scanner name = new Scanner(System.in);
		System.out.println("Generate a Password of Minimum '8' Characters :- ");
		
		String password = name.nextLine();
		regex.UserAttributes(password);
		
	}
}
