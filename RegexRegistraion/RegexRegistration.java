package RegexRegistraion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Interfaces.EmailValidationInterface;
import Interfaces.FirstNameValidationInterface;
import Interfaces.LastNameValidationInterface;
import Interfaces.PasswordValidationInterface;
import Interfaces.UserPhoneNumberInterface;

public class RegexRegistration {
	
	public static FirstNameValidationInterface firstNameValidationInterface =(String firstName)->{
		
		String FirstName= "^[A-Z][a-z]{3,10}$";
	    
		Pattern pattern =Pattern.compile(FirstName);
		Matcher matcher = pattern.matcher(firstName);
    
	if(matcher.matches()) {
		return true;
	}
	else {
		throw new RegexException("Invlaid Name Please input Valid Nmae"+RegexException.ExpectedType.NAME);
	  }
	};
	public LastNameValidationInterface lastNameValidationInterface = (String lastName)->{
	    String LastName="^[A-Z][a-z]{3,10}$";

		Pattern pattern =Pattern.compile(LastName);
		Matcher matcher = pattern.matcher(lastName);
		
		if(matcher.matches()) {
			return true;
		}
		else {
			throw new RegexException("Invalid Last Name please Input Valid Last Name"+RegexException.ExpectedType.LASTNAME);
		  }
	};
	public EmailValidationInterface emailValidationInterface =(String email)->{
	    String Mail="^[A-Za-z0-9-]+(.[A-Za-z0-9-]+)*@[^_\\W]+(.[^_\\W]+)?(?=(.[^_\\W]{3,}$|.[a-zA-Z]{2}$)).*$";//UC-09 For Sample Emails

	  Pattern pattern =Pattern.compile(Mail);
		Matcher matcher = pattern.matcher(email);
		
		if(matcher.matches()) {
			return true;
		}
		else {
			throw new RegexException("Inavlid MailId please Input Valid MailId"+RegexException.ExpectedType.EMAIL);
		  }
     };

	public UserPhoneNumberInterface numberInterface =(String MobNum)->{
	    String Phone="^[0-9]{2}[\\s][0-9]{10}";
	    
	  Pattern pattern =Pattern.compile(Phone);
		Matcher matcher = pattern.matcher(MobNum);
		
		if(matcher.matches()) {
			return true;
		}
		else {
			throw new RegexException("Invalid PhoneNumber Please Input Valid PhoneNumber"+RegexException.ExpectedType.MOBILENUMBER);
		  }
     };
	public PasswordValidationInterface passwordValidationInterface=(String password)->{
	    String Password="^(?=.*[0-9])(?=.*[!@#$%&^_()+}{?>:<]){1}+(?=.*[A-Z])([0-9A-Za-z]).{8,}$"; // Rule-4 At least one Special Character Number in Password

		Pattern pattern =Pattern.compile(Password);
		Matcher matcher = pattern.matcher(password);
    
		if(matcher.matches()) {
			return true;
		}
		else {
			throw new RegexException("Password is Invalid Input Valid Password"+RegexException.ExpectedType.PASSWORD);
		
		  }
    };  
}

