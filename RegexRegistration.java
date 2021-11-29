package RegexJAVA;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexRegistration {

	
	public static  boolean UserAttributes(String Mail) {
		String UserFirstName= "^[A-Z][a-z]{3,10}$";
	    String UserLastName="^[A-Z][a-z]{3,10}$";	    
	    
	    String UserEmail="^[a-z]+([.][a-z]+)@[a-z]+[.][a-z]+([.][a-z]+)$";
	                 //As per UC-3 "abc.xyz@bl.co.in" FOR LOWERCASES
		Pattern pattern =Pattern.compile(UserEmail);
		Matcher matcher = pattern.matcher(Mail);
		
	System.out.println(matcher.matches());
		return matcher.matches();
	}
}
