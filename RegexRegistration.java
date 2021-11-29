package RegexJAVA;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexRegistration {

	
	public static  boolean UserAttributes(String MobNum) {
		String UserFirstName= "^[A-Z][a-z]{3,10}$";
	    String UserLastName="^[A-Z][a-z]{3,10}$";	    	    
	    String UserEmail="^[a-z]+([.][a-z]+)@[a-z]+[.][a-z]+([.][a-z]+)$";
	    String PhoneNumber="^[0-9]{2}[\\s][0-9]{10}";
	     
		Pattern pattern =Pattern.compile(PhoneNumber);
		Matcher matcher = pattern.matcher(MobNum);
		
	System.out.println(matcher.matches());
		return matcher.matches();
	}
}
