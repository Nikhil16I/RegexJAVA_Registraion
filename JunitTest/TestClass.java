package JunitTest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import RegexRegistraion.RegexRegistration;

@RunWith(Parameterized.class)
public class TestClass {


	String Input;
	boolean ExpectedResult;
	RegexRegistration validation;
	
	public TestClass(String input, boolean ExpectedResult) {
		super();
		this.Input = Input;
		this.ExpectedResult = ExpectedResult;
	}
	@Test
	public void FirstName_Valid() {
		RegexRegistration Validate = new RegexRegistration();
		boolean output= Validate.UserFirstName("Nikhil");
		assertEquals(true, output);
	}	
	@Test
	public void FirstName_InValid() {
		RegexRegistration Validate = new RegexRegistration();
		boolean output= Validate.UserFirstName("nikhil");
		assertEquals(false, output);
	}
	@Test
	public void LastName_Valid() {
		RegexRegistration Validate = new RegexRegistration();
		boolean output= Validate.UserLastName("Patil");
		assertEquals(true, output);
	}
	@Test
	public void LastName_InValid() {
		RegexRegistration Validate = new RegexRegistration();
		boolean output= Validate.UserLastName("patil");
		assertEquals(false, output);
	}
	@Parameters(name="Input()")
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
	}
	@Test
	public void testEmail() {
		RegexRegistration Validate = new RegexRegistration();
		boolean output = Validate.UserMailID(Input);
		assertEquals(ExpectedResult,output);
	}
	/*
	@Test
	public void Email_InValid() {
		RegexRegistration Validate = new RegexRegistration();
		boolean output= Validate.UserMailID("Googlegmail.com");
		assertEquals(false, output);
	}*/
	@Test
	public void PhoneNum_Valid() {
		RegexRegistration Validate = new RegexRegistration();
		boolean output= Validate.UserPhoneNumber("91 1234567890");
		assertEquals(true, output);
	}
	@Test
	public void PhoneNum_InValid() {
		RegexRegistration Validate = new RegexRegistration();
		boolean output= Validate.UserPhoneNumber("91 12345678");
		assertEquals(false, output);
	}
	@Test
	public void Password_Valid() {
		RegexRegistration Validate = new RegexRegistration();
		boolean output= Validate.UserPassword("passWord@127");
		assertEquals(true, output);
	}
	@Test
	public void Password_InValid() {
		RegexRegistration Validate = new RegexRegistration();
		boolean output= Validate.UserPassword("Poke@1");
		assertEquals(false, output);
	}
}
