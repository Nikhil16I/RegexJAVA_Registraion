package RegexJAVA;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		RegexRegistration regex = new RegexRegistration();

		Scanner name = new Scanner(System.in);
		System.out.println("Add Country Code - Manadatory");
		System.out.println("Input User's Phone Number  :- ");
		
		String MobNum = name.nextLine();
		regex.UserPhoneNumber(MobNum);
     }
}
