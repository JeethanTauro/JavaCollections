package ArrayList_tutorial;
import java.util.ArrayList;

public class ArrayList_01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        System.out.println(list.contains(20)); //prints true
        System.out.println(list.indexOf(20)); //prints 1

        System.out.println(list.size());// prints 4
    }
}
