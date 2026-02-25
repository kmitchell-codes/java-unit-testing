package contact;

import java.util.HashMap;
import java.util.Map;

/* ContactService class manages Contact objects in memory and
 * provides functionality to add, delete, retrieve, and modify contacts.
 */
public class ContactService {
	
	private Map<String, Contact> contacts = new HashMap<>(); // In-memory storage of contacts mapped by unique contact ID
	
	// Adds a new contact with a unique contact ID.
	public void addContact(Contact contact) {
	    if (contact == null) {
	        throw new IllegalArgumentException("Contact cannot be null");
	    }

	    String id = contact.getContactId();

	    if (contacts.containsKey(id)) {
	        throw new IllegalArgumentException("Contact ID already exists");
	    }

	    contacts.put(id, contact);
	}

	// Retrieves a contact using the contact ID.
	public Contact getContact(String contactId) {
	    return contacts.get(contactId);
	}
	
	// Deletes a contact using the contact ID.
	public void deleteContact(String contactId) {
	    contacts.remove(contactId);
	}
	
	// Updates a contact first name using the contact ID.
	public void updateFirstName(String contactId, String firstName) {
	    Contact contact = contacts.get(contactId);

	    if (contact == null) {
	        throw new IllegalArgumentException("Contact not found");
	    }

	    contact.setFirstName(firstName);
	}
	
	// Updates a contact last name using the contact ID.
	public void updateLastName(String contactId, String lastName) {
	    Contact contact = contacts.get(contactId);

	    if (contact == null) {
	        throw new IllegalArgumentException("Contact not found");
	    }

	    contact.setLastName(lastName);
	}

	// Updates a contact phone number using the contact ID.
	public void updatePhone(String contactId, String phone) {
	    Contact contact = contacts.get(contactId);

	    if (contact == null) {
	        throw new IllegalArgumentException("Contact not found");
	    }

	    contact.setPhone(phone);
	}

	// Updates a contact's address using the contact ID.
	public void updateAddress(String contactId, String address) {
	    Contact contact = contacts.get(contactId);

	    if (contact == null) {
	        throw new IllegalArgumentException("Contact not found");
	    }

	    contact.setAddress(address);
	}

}
