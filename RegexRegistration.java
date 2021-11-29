package RegexJAVA;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexRegistration {

	
	public static  boolean UserAttributes(String password) {
		String UserFirstName= "^[A-Z][a-z]{3,10}$";
	    String UserLastName="^[A-Z][a-z]{3,10}$";	    	    
	    String UserEmail="^[a-z]+([.][a-z]+)@[a-z]+[.][a-z]+([.][a-z]+)$";
	    String PhoneNumber="^[0-9]{2}[\\s][0-9]{10}";
	    String Password="^[0-9A-Za-z]{8,}$";
		Pattern pattern =Pattern.compile(Password);
		Matcher matcher = pattern.matcher(password);
		
	System.out.println(matcher.matches());
		return matcher.matches();
	}
}
