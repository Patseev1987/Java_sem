package Sem3;

import java.util.ArrayList;

public class IntegerDeleter {
    public static void deliteInteger(){
        ArrayList list = new ArrayList<String>();
list.add("Hello");
list.add("World");
list.add(1);
list.add(5);
        for (int i = 0; i < list.size(); i++) {
if (list.get(i) instanceof Integer){
    list.remove(i);
    i--;
}
        }
        System.out.println(list);
    }
}
