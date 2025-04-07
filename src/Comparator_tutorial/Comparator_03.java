package Comparator_tutorial;

import java.util.ArrayList;
import java.util.Comparator;

public class Comparator_03 {
    public static void main(String[] args) {
        ArrayList<Integer> nums =  new ArrayList<>();
        nums.add(20);
        nums.add(10);
        nums.add(3);
        nums.add(-100);
        nums.add(12);
        nums.add(43);
        nums.sort(Comparator.comparing(Integer::intValue));
        System.out.println(nums);

    }
}
