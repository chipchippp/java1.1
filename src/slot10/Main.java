package slot10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        pb.insertPhone("Nvl", "0987654321");
        pb.insertPhone("Nvl", "0999482342");


        for (String pl : pb.PhoneList){
            System.out.println(pl);
        }
    }
}
