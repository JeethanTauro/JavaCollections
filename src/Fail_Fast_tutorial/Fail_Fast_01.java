package Fail_Fast_tutorial;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Fail_Fast_01 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        nums.add(60);
        // concurrentModificationError
//        for(Integer n : nums){
//            if(n.equals(30)){
//                nums.remove(n);
//            }
//        }
        // this works
        Iterator<Integer> it = nums.iterator();
        while(it.hasNext()){
            if(it.next().equals(30)){
                it.remove();
            }
        }
        System.out.println(nums);
        /*
        So when you use list.remove(), you're modifying the list directly, but not updating the iterator’s state.
        The internal modCount of the list changes, but the iterator's expectedModCount does not match,
        so Java throws ConcurrentModificationException.
        it.remove() is designed to work with the iterator.
        It updates both the collection's structure and also adjusts the iterator’s internal state (expectedModCount) to match.
        Therefore, no exception is thrown.
        Think of the Iterator as someone reading a book, and modCount as the page number.
        If someone tears a page out of the book without telling the reader (like list.remove()),
        the reader gets confused.
        But if the reader tears the page out themselves (iterator.remove()),
        they know exactly what's happening and don’t get lost.
         */
    }
}
