package RegexJAVA;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexRegistration {

	
	public static  boolean UserAttributes(String lastName) {
		String UserFirstName= "^[A-Z][a-z]{3,10}$";
	    String UserLastName="^[A-Z][a-z]{3,10}$";
	    
		Pattern pattern =Pattern.compile(UserLastName);
		Matcher matcher = pattern.matcher(lastName);
		
	System.out.println(matcher.matches());
		return matcher.matches();
	}
}
