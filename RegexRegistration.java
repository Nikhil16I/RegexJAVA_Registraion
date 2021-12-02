package RegexJAVA;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexRegistration {
	
	public static  boolean UserFirstName(String firstName) {
		String FirstName= "^[A-Z][a-z]{3,10}$";
	
		Pattern pattern =Pattern.compile(FirstName);
		Matcher matcher = pattern.matcher(firstName);
	
	System.out.println(matcher.matches());
		return true;
	}
}
