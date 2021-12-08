package JunitTest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import RegexRegistraion.RegexException;
import RegexRegistraion.RegexRegistration;

//@RunWith(Parameterized.class)
public class TestClass {

	/*String Input;
	boolean ExpectedResult;
	RegexRegistration validation;
	
	public TestClass(String input, boolean ExpectedResult) {
		super();
		this.Input = Input;
		this.ExpectedResult = ExpectedResult;*/
	
	private RegexRegistration TestException;
		@Before
		public void  ExceptionObj() {
			TestException= new RegexRegistration();
		}
	
	@Test
	public void FirstName_Valid() throws RegexException {
		boolean output= TestException.UserFirstName("Nikhil");
		assertEquals(true, output);
	}	
	@Test
	public void FirstName_InValid() throws RegexException {
		try {
			boolean output = TestException.UserFirstName("nikhil");
			assertEquals(false, output);			
		} catch (RegexException re) {
			re.printStackTrace();
		}
	}
	@Test
	public void LastName_Valid() throws RegexException {
		boolean output= TestException.UserLastName("Patil");
		assertEquals(true, output);
	}
	@Test
	public void LastName_InValid() throws RegexException {
		try {
		boolean output= TestException.UserLastName("patil");
		assertEquals(false, output);
	   }catch(RegexException re) {
		   re.printStackTrace();
	   }
	}

/*	@Parameters(name="Input()")
	public static Collection inputs() {
		return (Collection) Arrays.asList(new Object[][] {
			{"abc@yahoo.com", true},
			{"abc-100@yahoo.com", true},
			{"abc.100@yahoo.com", true},
			{"abc111@abc.com", true},
			{"abc-100@abc.net", true},
			{"abc.100@abc.com.au", true},
			{"abc@1.com", true},
			{"abc@gmail.com.com", true},
			{"abc+100@gmail.com", true},
			{"abc@.com.com" , false},
			{"abc123@gmail.a" , false},
			{"abc123@.com" , false},
			{"abc123@.com.com" , false},
			{".abc@abc.com" , false},
			{"abc()*@gmail.com" , false},
			{"abc@%*.com" , false},
			{"abc..2002@gmail.com" , false},
			{"abc.@gmail.com" , false},
			{"abc@abc@gmail.com" , false},
			{"abc@gmail.com.1a" , false},
			{"abc@gmail.com.aa.au^$" , false}
			} );
	}*/
	@Test
	public void testEmail() throws RegexException {
		boolean output = TestException.UserMailID("Google123@gmail.com");
		assertEquals(true,output);
	}
	
	@Test
	public void Email_InValid() {
		try {
	        boolean output= TestException.UserMailID("Googlegmail.com");
		assertEquals(false, output);
	   }catch (RegexException re) {
		   re.printStackTrace();
	   }
	}
	@Test
	public void PhoneNum_Valid() throws RegexException {
		boolean output= TestException.UserPhoneNumber("91 1234567890");
		assertEquals(true, output);
	}
	@Test
	public void PhoneNum_InValid() throws RegexException {
		try {
		boolean output= TestException.UserPhoneNumber("91 12345678");
		assertEquals(false, output);
	 }catch (RegexException re) {
		 re.printStackTrace();
	 }
  }
	@Test
	public void Password_Valid() throws RegexException {
		boolean output= TestException.UserPassword("passWord@127");
		assertEquals(true, output);
	}
	@Test
	public void Password_InValid() throws RegexException {
		try {
		boolean output= TestException.UserPassword("Poke@1");
		assertEquals(false, output);
	}catch(RegexException re) {
		re.printStackTrace();
	}
  }
}
