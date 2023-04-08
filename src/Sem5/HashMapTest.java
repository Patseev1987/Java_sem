package Sem5;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    private static final Map<Integer,String> passportToSurname = new HashMap<>();
    public static void main(String[] args) {
        passportToSurname.put(1,"asd");
        passportToSurname.put(2,"as2342d");
        passportToSurname.put(3,"as234d");
        passportToSurname.put(4,"asd");
        passportToSurname.put(5,"assdsdfrtd");
        passportToSurname.put(6,"asddffgbvd");
        passportToSurname.put(7,"asbbvbbvd");
        System.out.println(passportToSurname);


        for (Map.Entry<Integer,String> entry : passportToSurname.entrySet()){
            if (entry.getValue().equals("asd")){
                System.out.println(entry);
            }
        }
    }
}
