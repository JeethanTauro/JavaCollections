package LinkedHashMap_tutorial.LRU_Cache;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    static void enterMap(LinkedHashMap<String , Integer> LRU , Scanner sc){
        System.out.println("Enter the number of values (max 5) : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter your key : " + (i+1));
            String key = sc.next();
            System.out.println("Enter the value : "+(i+1));
            int value = sc.nextInt();
            LRU.put(key , value);
        }
    }
    public static void main(String[] args) {
        LinkedHashMap<String , Integer> LRU = new LinkedHashMap<>(5, .75f, true);
        Scanner sc = new Scanner(System.in);
        enterMap(LRU , sc);

        System.out.println("Initial LRU : " +LRU);
        while (true) {
            System.out.println("Do you want to access any keys? (y/n) : ");
            String ans = sc.next();
            if(ans.equals("y")){
                System.out.println("Enter the key you want to access : ");
                String key = sc.next();
                LRU.get(key);
                System.out.println(LRU);
            }
            else if(ans.equals("n")){
                break;
            }
        }
        while (true){
            System.out.println("Do you want to add more ?(y/n) : ");
            String ans = sc.next();
            if(ans.equals("y"))
            {
                System.out.println("Enter the key : ");
                String key = sc.next();
                System.out.println("Enter the value : ");
                int value = sc.nextInt();
                LRU.put(key , value);
            }
            if(ans.equals("n")){
                break;
            }
            while(LRU.size() > 5) {
                Iterator<String> it = LRU.keySet().iterator();
                LRU.remove(it.next());
            }
            System.out.println(LRU);

        }
        System.out.println(LRU);
    }
}
