package LinkedList_tutorial;

import java.util.LinkedList;

public class LinkedList_03 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.push(10);
        list.push(20);
        list.push(40);
        list.push(300);
        list.push(120);
        System.out.println(list); // [10, 20, 40, 300, 120]
        System.out.println(list.peek()); //10
        System.out.println(list.pop()); //10 removed
        System.out.println(list); // [20, 40, 300, 120]
        System.out.println(list.peek()); //20
        System.out.println(list.pop()); // 20
        System.out.println(list); // [40, 300, 120]

    }
}
