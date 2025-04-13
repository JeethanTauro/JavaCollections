package Enum_tutorial;

import java.util.Scanner;

public class AnotherMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day : ");
        String str = sc.next().toUpperCase();
        Day day = Day.valueOf(str);
        System.out.println(day);
        System.out.println(day.getDayName());
        System.out.println(day.getDayNo());

        String res = switch (day){
            case MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY -> "WEEKDAY";
            default -> "WEEKEND";

        };
        System.out.println(res);





        sc.close();
    }
}
