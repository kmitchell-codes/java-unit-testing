package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ContactServiceTest {
	
	@Test
	public void testAddContact() {
	    ContactService service = new ContactService();

	    Contact contact = new Contact("1", "Karen", "Mitchell", "1234567890", "123 Main Street");

	    service.addContact(contact);

	    assertEquals(contact, service.getContact("1"));
	}
	
	@Test
	public void testAddContactDuplicateIdThrows() {
	    ContactService service = new ContactService();

	    Contact contact1 = new Contact("1", "Karen", "Mitchell", "1234567890", "123 Main Street");
	    Contact contact2 = new Contact("1", "Karyn", "Chavez", "0987654321", "456 Primary Ave");

	    service.addContact(contact1);

	    assertThrows(IllegalArgumentException.class, () -> {
	        service.addContact(contact2);
	    });
	}
	
	@Test
	public void testDeleteContact() {
	    ContactService service = new ContactService();

	    Contact contact = new Contact("1", "Karen", "Mitchell", "1234567890", "123 Main Street");
	    service.addContact(contact);

	    service.deleteContact("1");

	    assertNull(service.getContact("1"));
	}
	
	@Test
	public void testUpdateFirstName() {
	    ContactService service = new ContactService();

	    Contact contact = new Contact("1", "Karen", "Mitchell", "1234567890", "123 Main Street");
	    service.addContact(contact);

	    service.updateFirstName("1", "Karyn");

	    assertEquals("Kara", service.getContact("1").getFirstName());
	}
	
	@Test
	public void testUpdateLastName() {
	    ContactService service = new ContactService();

	    Contact contact = new Contact("1", "Karen", "Mitchell", "1234567890", "123 Main Street");
	    service.addContact(contact);

	    service.updateLastName("1", "Chavez");

	    assertEquals("Smith", service.getContact("1").getLastName());
	}

	@Test
	public void testUpdatePhone() {
	    ContactService service = new ContactService();

	    Contact contact = new Contact("1", "Karen", "Mitchell", "1234567890", "123 Main Street");
	    service.addContact(contact);

	    service.updatePhone("1", "0987654321");

	    assertEquals("0987654321", service.getContact("1").getPhone());
	}

	@Test
	public void testUpdateAddress() {
	    ContactService service = new ContactService();

	    Contact contact = new Contact("1", "Karen", "Mitchell", "1234567890", "123 Main Street");
	    service.addContact(contact);

	    service.updateAddress("1", "456 Primary Ave");

	    assertEquals("456 Oak Ave", service.getContact("1").getAddress());
	}
	
	@Test
	public void testUpdateMissingContactThrows() {
	    ContactService service = new ContactService();

	    assertThrows(IllegalArgumentException.class, () -> {
	        service.updateFirstName("999", "Karyn");
	    });
	}
	
	@Test
	public void testUpdatePhoneInvalidThrows() {
	    ContactService service = new ContactService();

	    Contact contact = new Contact("1", "Karen", "Mitchell", "1234567890", "123 Main Street");
	    service.addContact(contact);

	    assertThrows(IllegalArgumentException.class, () -> {
	        service.updatePhone("1", "12345"); // not 10 digits
	    });
	}

}
