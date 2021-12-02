package RegexJAVA;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		RegexRegistration regex = new RegexRegistration();

		Scanner name = new Scanner(System.in);
		System.out.println("Input First Name :- ");
		
		String firstname = name.nextLine();
		regex.UserFirstName(firstname);	
	}
}
