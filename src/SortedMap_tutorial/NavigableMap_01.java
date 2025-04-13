package SortedMap_tutorial;

import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.NavigableMap;

public class NavigableMap_01 {
    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<>();
        map.put(10 , "A");
        map.put(20 , "B");
        map.put(30 , "C");
        map.put(40 , "D");
        map.put(50 , "E");
        map.put(60 , "F");
        map.put(70 , "G");
        map.put(80 , "H");
        map.put(90 , "I");
        map.put(100 , "J");
        Iterator<Integer> itKey = map.keySet().iterator();
        Iterator<String> itVal = map.values().iterator();
        System.out.println(map.lowerKey(50)); //40
        System.out.println(map.floorKey(50)); //40
        System.out.println(map.higherKey(50)); //60
        System.out.println(map.ceilingKey(50)); //60
        System.out.println(map.lowerEntry(50));
        System.out.println(map.ceilingEntry(50));
        System.out.println(map.floorEntry(50));
        System.out.println(map.lowerEntry(50));
        System.out.println(map.higherEntry(50));
        System.out.println(map.descendingMap());
        System.out.println(map.descendingKeySet());
        System.out.println(map.subMap(20,true,80,false));
        System.out.println(map.headMap(50,true));
        System.out.println(map.tailMap(40,false));
        System.out.println("{ ");
        while(itKey.hasNext()){
            System.out.println("    "+itKey.next()+"-->"+itVal.next());
        }
        System.out.println(" }");

    }
}
