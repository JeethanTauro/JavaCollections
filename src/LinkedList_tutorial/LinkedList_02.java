package LinkedList_tutorial;

import java.util.LinkedList;

public class LinkedList_02 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.offer(10);
        list.offer(20);
        list.offer(40);
        list.offer(300);
        list.offer(120);
        System.out.println(list); // [10, 20, 40, 300, 120]
        System.out.println(list.peek()); //10
        System.out.println(list.poll()); //10 removed
        System.out.println(list); // [20, 40, 300, 120]
        System.out.println(list.peek()); //20
        System.out.println(list.element()); // 20
        System.out.println(list.remove());// 20
        System.out.println(list); // [40, 300, 120]

    }
}
