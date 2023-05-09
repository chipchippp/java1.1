package slot10;

import com.sun.scenario.effect.impl.prism.ps.PPSBlend_HARD_LIGHTPeer;

import java.util.ArrayList;

public class PhoneBook  extends Phone{
    ArrayList<String> PhoneList  = new ArrayList<>();

    @Override
    public void insertPhone(String name, String phone) {
        if (PhoneList.isEmpty()){
            PhoneList.add(name + ", " + phone);
        } else {
            boolean timthay = false;
            for (String pb: PhoneList){
                if (pb.contains(name)){
                    timthay= true;
                    if (!pb.contains(phone)){
                        PhoneList.set(PhoneList.indexOf(pb), pb + " : " + phone);
                    }
                    break;
                }
            }
            if (!timthay){
                PhoneList.add(name + ", " + phone);
            }
        }

    }

    @Override
    void removePhone(String name) {

    }

    @Override
    void updatePhone(String name, String newphone) {

    }

    @Override
    PhoneNumber searchPhone(String name) {
        return null;
    }

    @Override
    void sort() {

    }
}
