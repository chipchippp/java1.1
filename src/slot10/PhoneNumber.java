package slot10;

import java.util.ArrayList;

public class PhoneNumber {
    String name;
    String phoneList;

    public PhoneNumber(String name, String phoneList) {
        this.name = name;
        this.phoneList = phoneList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(String phoneList) {
        this.phoneList = phoneList;
    }
}
