package Comparator_tutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparator_02 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Comparator<Integer> com = new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
              return ((o1%10)-o2%10);
            }
        };
        nums.add(11);
        nums.add(23);
        nums.add(42);
        nums.add(19);
//        Collections.sort(nums);
//        System.out.println(nums);
        Collections.sort(nums, com);
        System.out.println(nums);




        
    }
}
