package RegexJAVA;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexRegistration {

	
	public static  boolean UserAttributes(String firstName) {
		String UserFirstName= "^[A-Z][a-z]{3,10}$";
	
		Pattern pattern =Pattern.compile(UserFirstName);
		Matcher matcher = pattern.matcher(firstName);
		
	System.out.println(matcher.matches());
		return matcher.matches();
	}
}
