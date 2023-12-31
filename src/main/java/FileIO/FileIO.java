package FileIO;
import java.io.Serializable;

public class FileIO {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{ " + name + "\"" + "phoneNumber " + phoneNumber + "}";
    }
}
