package ContactCategories;

import Contact.Contact;

import java.util.HashMap;

public interface IContactCategories {

        void addContact(Contact contact);
        void removeContact(String contactName);
        void viewContacts();
        HashMap<String, Contact> searchContacts(String keyword);

}
