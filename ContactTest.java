import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.Ignore;
import static org.junit.Assert.*;

public class ContactTest {

	@Test
	public void testContactClass() {
		Contact contact = new Contact("0000000000001", "Bronny H Carloon", "Alert Player Network III", "9101234545", "123 Kay Kay");
		assertTrue(contact.getAddress().equals("123 Kay Kay"));
		assertTrue(contact.getFirstName().equals("Bronny H Carloon"));
		assertTrue(contact.getID().equals("0000000000001"));
		assertTrue(contact.getLastName().equals("Alert Player Network III"));
		assertTrue(contact.getPhone().equals("9101234545"));
	}
	
	@Test
	public void testExceptions() {
		
		// id too short
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("001", "Bronny H Carloon", "Alert Player Network III", "9101234545", "123 Kay Kay");
		});
		
		// first name too short
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("0000000000001", "Bronny", "Alert Player Network III", "9101234545", "123 Kay Kay");
		});
		
		// last name too short
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("0000000000001", "Bronny H Carloon", "Alert", "9101234545", "123 Kay Kay");
		});
		
		
		// number is 11
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("0000000000001", "Bronny H Carloon", "Alert Player Network III", "91012345450", "123 Kay Kay");
		});
		
		
		// number is 9
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("0000000000001", "Johnny H Cartoon", "Alert Player Network III", "910123454", "123 Jay Way");
		});
		
		// address is too long
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("0000000000001", "Bronny H Carloon", "Alert Player Network III", "9101234545", "123123123123123123123123123123123123123 Kay Kay");
		});
		
		// id is null
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact(null, "Bronny H Carloon", "Alert Player Network III", "9101234545", "123 Kay Kay");
		});
		
		// first null
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("0000000000001", null, "Alert Player Network III", "9101234545", "123 Kay Kay");
		});
		
		// last null
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("0000000000001", "Bronny H Carloon", null, "9101234545", "123 Kay Kay");
		});
		
		// number is null
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("0000000000001", "Bronny H Carloon", "Alert Player Network III", null, "123 Kay Kay");
		});
		
		// address is null
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("0000000000001", "Bronny H Carloon", "Alert Player Network III", "9101234545", null);
		});
		
	}
		
		
	
}
