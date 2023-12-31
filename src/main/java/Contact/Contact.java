package Contact;

public class Contact {

    private String name;
    private String email;
    private int phoneNumber;

    private String contactCategory;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContactCategory() {
        return contactCategory;
    }

    public void setContactCategory(String contactCategory) {
        this.contactCategory = contactCategory;
    }

    public Contact(String name, String email, int phoneNumber, String contactCategory) {

        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.contactCategory = contactCategory;
    }

    public String toString() {
        return "name: " + name + ", " + "Email: " + email + ", " + "Phone number: " + phoneNumber + ", "
                + "Contact category: " + contactCategory;
    }
}

