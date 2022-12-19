import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.Ignore;
import static org.junit.Assert.*;

public class ContactServiceTest {

	@Test
	public void testAddContact() {
		Contact contact = new Contact("0000000000001", "Bronny H Carloon", "Alert Player Network III", "9101234545", "123 Kay Kay");
		Contact contact2 = new Contact("0000000000002", "The Great Labowski", "Greatest Labowski IV", "9101234543", "125 Kay Kay");
		Contact contact3 = new Contact("0000000000003", "Alexander Haynes", "Wilmington Francis III", "9101234542", "127 Kay Kay");
		ContactService service = new ContactService();
		assertEquals(true, service.addContact(contact));
		assertEquals(true, service.addContact(contact2));
		assertEquals(false, service.addContact(contact2));
		assertEquals(true, service.addContact(contact3));
		assertEquals(false, service.addContact(contact3));

	}
	
	@Test
	public void testDeleteContact() {
		Contact contact = new Contact("0000000000001", "Bronny H Carloon", "Alert Player Network III", "9101234545", "123 Kay Kay");
		Contact contact2 = new Contact("0000000000002", "The Great Labowski", "Greatest Labowski IV", "9101234543", "125 Kay Kay");
		Contact contact3 = new Contact("0000000000003", "Alexander Haynes", "Wilmington Francis III", "9101234542", "127 Kay Kay");
		ContactService service = new ContactService();
		assertEquals(true, service.addContact(contact));
		assertEquals(true, service.addContact(contact2));
		assertEquals(true, service.addContact(contact3));
		assertEquals(true, service.deleteContact("0000000000001"));
		assertEquals(true, service.deleteContact("0000000000002"));
		assertEquals(true, service.deleteContact("0000000000003"));
	}
	
	@Test
	public void testUpdateContact() {
		Contact contact = new Contact("0000000000001", "Bronny H Carloon", "Alert Player Network III", "9101234545", "123 Kay Kay");
		Contact contact2 = new Contact("0000000000002", "The Great Labowski", "Greatest Labowski IV", "9101234543", "125 Kay Kay");
		Contact contact3 = new Contact("0000000000003", "Alexander Haynes", "Wilmington Francis III", "9101234542", "127 Kay Kay");
		ContactService service = new ContactService();
		assertEquals(true, service.addContact(contact));
		assertEquals(true, service.addContact(contact2));
		assertEquals(true, service.addContact(contact3));
		//update first
		assertEquals(true, service.updateContact("0000000000001", "Jerry H Springerston", "Alert Player Network III", "9101234545", "123 Kay Kay" ));
		assertEquals(contact.getFirstName(), "Jerry H Springerston");
		
		// update number
		assertEquals(true, service.updateContact("0000000000001", "Jerry H Springerston", "Alert Player Network III", "0000000000", "123 Kay Kay" ));
		assertEquals(contact.getPhone(), "0000000000");
		
		
		// update first, last
		assertEquals(true, service.updateContact("0000000000002", "The Great King Kong", "Ruler of Beasts", "9101234543", "125 Kay Kay"));
		assertEquals(contact2.getLastName(), "Ruler of Beasts");
		assertEquals(contact2.getFirstName(), "The Great King Kong");
		
		
		
		// update first, last, address
		assertEquals(true, service.updateContact("0000000000003", "Alexander Haynes", "Wilmington Francis III", "9101234542", "APPLEBEES"));
		assertEquals(contact3.getLastName(), "Wilmington Francis III");
		assertEquals(contact3.getFirstName(), "Alexander Haynes");
		assertEquals(contact3.getAddress(), "APPLEBEES");
	}
	
}
