package ContactCategories;

import Contact.Contact;
import java.util.HashMap;

public class PersonalContactCategory extends ContactCategory {
    HashMap<String,Contact> personalContacts = new HashMap<String, Contact>();

    public void addContact(Contact contact){
        personalContacts.put(contact.getName(),contact);

    }
    public void removeContact(String contactName){
        personalContacts.remove(contactName);

    }
    public void viewContacts(){
    for (Contact contact: personalContacts.values() ){
        System.out.println(contact);}
    }

    public Contact searchContacts(String name ){
        return personalContacts.get(name);
    }

}
