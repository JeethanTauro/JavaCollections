package SortedMap_tutorial;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap_01 {
    public static void main(String[] args) {

        SortedMap<String , Integer> map = new TreeMap<>(Comparator.reverseOrder());
        map.put("Key1" , 10);//sorted map>
        map.put("Key5" , 20);//sorted map>
        map.put("Key3" , 30);//sorted map>
        map.put("Key4" , 40);//sorted map>
        map.put("Key2" , 50);//sorted map>
        System.out.println(map); // {Key1=10, Key2=50, Key3=30, Key4=40, Key5=20}
        System.out.println(map.firstKey()); // Key1
        System.out.println(map.lastKey()); // Key5`
        System.out.println(map.headMap("Key3")); // {Key1=10, Key2=50}
        System.out.println(map.tailMap("Key2")); // {Key2=50, Key3=30, Key4=40, Key5=20}
        System.out.println(map.subMap("Key4" , "Key2")); // {Key2=50, Key3=30, Key4=40}

    }
}
