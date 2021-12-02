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
	public static  boolean UserLastName(String lastName) {
	    String LastName="^[A-Z][a-z]{3,10}$";
	    
		Pattern pattern =Pattern.compile(LastName);
		Matcher matcher = pattern.matcher(lastName);
		
	System.out.println(matcher.matches());
		return true;
	}
	public static  boolean UserMailID(String email) {
	    String Mail="^[A-Za-z0-9_-]+([.][A-Za-z0-9_-]+)@[A-Za-z]+[A-Za-z]+([.][A-Za-z]+)$";

	  Pattern pattern =Pattern.compile(Mail);
		Matcher matcher = pattern.matcher(email);
		
	System.out.println(matcher.matches());
		return true;
     }
}

