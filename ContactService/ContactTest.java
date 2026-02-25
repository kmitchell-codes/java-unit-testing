package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ContactTest {
	@Test
	public void testContactCreatesSuccessfully() {
	    Contact contact = new Contact("1234567890", "Karen", "Mitchell", "1234567890", "123 Main Street");

	    assertEquals("1234567890", contact.getContactId());
	    assertEquals("Karen", contact.getFirstName());
	    assertEquals("Mitchell", contact.getLastName());
	    assertEquals("1234567890", contact.getPhone());
	    assertEquals("123 Main Street", contact.getAddress());
	}
	
	@Test
	public void testContactIdTooLong() {
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("12345678901", "Karen", "Mitchell", "1234567890", "123 Main Street");
	    });
	}
	
	@Test
	public void testContactIdNull() {
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact(null, "Karen", "Mitchell", "1234567890", "123 Main Street");
	    });
	}

	@Test
	public void testFirstNameTooLong() {
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("123", "KarenKarenKa", "Mitchell", "1234567890", "123 Main Street");
	    });
	}

	@Test
	public void testFirstNameNull() {
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("123", null, "Mitchell", "1234567890", "123 Main Street");
	    });
	}

	@Test
	public void testLastNameTooLong() {
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("123", "Karen", "MitchellMitc", "1234567890", "123 Main Street");
	    });
	}

	@Test
	public void testLastNameNull() {
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("123", "Karen", null, "1234567890", "123 Main Street");
	    });
	}

	@Test
	public void testPhoneNot10Digits() {
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("123", "Karen", "Mitchell", "12345", "123 Main Street");
	    });
	}

	@Test
	public void testPhoneHasLetters() {
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("123", "Karen", "Mitchell", "12345abcde", "123 Main Street");
	    });
	}

	@Test
	public void testPhoneNull() {
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("123", "Karen", "Mitchell", null, "123 Main Street");
	    });
	}

	@Test
	public void testAddressTooLong() {
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("123", "Karen", "Mitchell", "1234567890",
	                "123 This Address Is Way Too Long For The Requirement");
	    });
	}

	@Test
	public void testAddressNull() {
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("123", "Karen", "Mitchell", "1234567890", null);
	    });
	}
	
	@Test
	public void testSetFirstNameUpdatesSuccessfully() {
	    Contact c = new Contact("1", "Karen", "Mitchell", "1234567890", "123 Main Street");
	    c.setFirstName("Karyn");
	    assertEquals("Karyn", c.getFirstName());
	}

	@Test
	public void testSetFirstNameInvalid() {
	    Contact c = new Contact("1", "Karen", "Mitchell", "1234567890", "123 Main Street");
	    assertThrows(IllegalArgumentException.class, () -> c.setFirstName(null));
	}

	@Test
	public void testSetLastNameUpdatesSuccessfully() {
	    Contact c = new Contact("1", "Karen", "Mitchell", "1234567890", "123 Main Street");
	    c.setLastName("Chavez");
	    assertEquals("Chavez", c.getLastName());
	}

	@Test
	public void testSetLastNameInvalid() {
	    Contact c = new Contact("1", "Karen", "Mitchell", "1234567890", "123 Main Street");
	    assertThrows(IllegalArgumentException.class, () -> c.setLastName("ThisIsWayTooLong"));
	}

	@Test
	public void testSetPhoneUpdatesSuccessfully() {
	    Contact c = new Contact("1", "Karen", "Mitchell", "1234567890", "123 Main Street");
	    c.setPhone("0987654321");
	    assertEquals("0987654321", c.getPhone());
	}

	@Test
	public void testSetPhoneInvalid() {
	    Contact c = new Contact("1", "Karen", "Mitchell", "1234567890", "123 Main Street");
	    assertThrows(IllegalArgumentException.class, () -> c.setPhone("12345abcde"));
	}

	@Test
	public void testSetAddressUpdatesSuccessfully() {
	    Contact c = new Contact("1", "Karen", "Mitchell", "1234567890", "123 Main Street");
	    c.setAddress("456 Primary Ave");
	    assertEquals("456 Primary Ave", c.getAddress());
	}

	@Test
	public void testSetAddressInvalid() {
	    Contact c = new Contact("1", "Karen", "Mitchell", "1234567890", "123 Main Street");
	    assertThrows(IllegalArgumentException.class, () ->
	            c.setAddress("This address is definitely going to be longer than thirty characters"));
	}
}
