package ContactCategories;

import Contact.Contact;

import java.util.HashMap;

public class WorkContactCategory implements IContactCategories {
     HashMap<String, Contact> workContacts = new HashMap<>();


     @Override
     public void addContact(Contact contact) {
          workContacts.put(contact.getName(), contact);
     }


     @Override
     public void removeContact(String contactName) {
          workContacts.remove(contactName);
     }

     @Override
     public void viewContacts() {
          for (Contact contact : workContacts.values()) {
               System.out.println(contact);
          }

     }

     @Override
     public HashMap<String, Contact> searchContacts(String keyword) {

          return workContacts;
     }
}
