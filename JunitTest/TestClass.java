package JunitTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import RegexJAVA.RegexRegistration;

public class TestClass {

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
	@Test
	public void Email_Valid() {
		RegexRegistration Validate = new RegexRegistration();
		boolean output= Validate.UserMailID("Google@gmail.com");
		assertEquals(true, output);
	}
	@Test
	public void Email_InValid() {
		RegexRegistration Validate = new RegexRegistration();
		boolean output= Validate.UserMailID("Googlegmail.com");
		assertEquals(false, output);
	}
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
