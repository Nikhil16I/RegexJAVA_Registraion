package RegexJAVA;

import java.util.Scanner;

public class MainClass {
		public static void main(String[] args) {
			RegexRegistration regex = new RegexRegistration();

		Scanner name = new Scanner(System.in);
		System.out.println("Use Atleast one Uppercase , Numeric Number & Special Character- Mandatory");
		System.out.println("Generate a Password of Minimum '8' Characters :-  ");
		
		String password = name.nextLine();
		regex.UserPassword(password);
      }
}
