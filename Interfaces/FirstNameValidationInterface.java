package Interfaces;

import RegexRegistraion.RegexException;

@FunctionalInterface
public interface FirstNameValidationInterface {
public boolean UserFirstName(String firstName) throws RegexException;
}
