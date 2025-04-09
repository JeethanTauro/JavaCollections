package HashMaps_tutorial;

import java.util.HashMap;

public class HashMaps_01 {
    public static void main(String[] args) {
        HashMap<String, String> map_capital = new HashMap<>();
        map_capital.put("India","New Delhi");
        map_capital.put("USA","Washington DC");
        map_capital.put("UK","London");
        map_capital.put("UAE","Abu Dhabi");
        map_capital.put("Japan","Tokyo");
        System.out.println(map_capital);
        System.out.println(map_capital.get("USA")); // Washington DC
        System.out.println(map_capital.remove("UAE")); // Abu Dhabi
        System.out.println(map_capital);
        System.out.println(map_capital.keySet()); //[India, USA, UK, Japan]
        System.out.println(map_capital.values());
        System.out.println(map_capital.getOrDefault("Germany","Not Found"));

    }
}
