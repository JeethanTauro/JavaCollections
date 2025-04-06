package ArrayList_tutorial;

import java.util.ArrayList;

public class ArrayList_03 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(40);
        num.add(30);
        num.add(20);
        num.add(-20);
        num.add(12);
        num.sort((a,b)->a-b); //ascending
        System.out.println(num);
        num.sort((a,b)->b-a); //descending
        System.out.println(num);

    }
}
