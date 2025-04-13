package Enum_tutorial;

import java.util.Arrays;

public class Main {
    static void check(Status status){
        switch (status){
            case SUCCESS -> System.out.println("Success");
            case PENDING -> System.out.println("Pending");
            case FAILURE -> System.out.println("Failure");
        }
    }
    public static void main(String[] args) {
        int payment_val = (int)(10*(Math.random()));
        Status status;
        if(payment_val > 5) {
            status = Status.SUCCESS;
        }
        else if(payment_val<5){
            status = Status.FAILURE;
        }
        else{
            status = Status.PENDING;
        }
        System.out.println("Payment value: " + payment_val);
        check(status); //prints SUCCESS
        System.out.println(Arrays.toString(Status.values()));
        System.out.println(Status.valueOf("SUCCESS"));
        System.out.println(status.name());


    }
}
