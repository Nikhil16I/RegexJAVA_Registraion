package Interfaces;

import RegexRegistraion.RegexException;

public interface PasswordValidationInterface {
	public boolean UserPassword(String password) throws RegexException;

}
