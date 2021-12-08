package RegexRegistraion;

public class RegexException extends Exception{
	
public RegexException(String string) {
		// TODO Auto-generated constructor stub
	super(string);
	}

public ExpectedType type;

public enum ExpectedType{
	NAME,LASTNAME,EMAIL,PASSWORD,MOBILENUMBER,
   }

}
