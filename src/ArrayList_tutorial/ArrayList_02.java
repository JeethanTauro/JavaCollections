package ArrayList_tutorial;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_02 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(20);
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("date");
        fruits.add("eggplant");
        fruits.add("fig");
        fruits.add("grape");
        Iterator<String> it  = fruits.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
