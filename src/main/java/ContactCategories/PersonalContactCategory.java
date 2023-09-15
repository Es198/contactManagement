package ContactCategories;

import java.util.HashMap;

public class PersonalContactCategory implements ContactCategory{
    HashMap<String,Contact> personalContacts = new HashMap<String, Contact>();//todo: change the name from int

    public void addContact(String contact){
        personalContacts.put(contact.getName(),contact);

    }




}
