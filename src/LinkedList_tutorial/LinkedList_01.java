package LinkedList_tutorial;
import java.util.*;
public class LinkedList_01 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(60);
        list.add(80);
        System.out.println(list);
        System.out.println(list.get(2)); //40
        System.out.println(list.contains(3)); //false
        System.out.println(list.size()); //5
        System.out.println(list.indexOf(60)); //3
        Object[] arr = list.toArray();
        for(Object a : arr){
            System.out.println(a);
        }




    }
}
