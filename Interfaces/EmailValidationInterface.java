package Interfaces;

import RegexRegistraion.RegexException;

@FunctionalInterface
public interface EmailValidationInterface {
public boolean UserMailID(String email) throws RegexException;
}
