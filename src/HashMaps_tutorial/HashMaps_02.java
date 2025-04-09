package HashMaps_tutorial;

import java.util.HashMap;
import java.util.Map;

public class HashMaps_02 {
    public static void main(String[] args) {
        HashMap<String, String> map_capital = new HashMap<>();
        map_capital.put("India","New Delhi");
        map_capital.put("USA","Washington DC");
        map_capital.put("UK","London");
        map_capital.put("UAE","Abu Dhabi");
        map_capital.put("Japan","Tokyo");
        System.out.println(map_capital);

        for(String key : map_capital.keySet()){
            System.out.println(key);
        }
        for(String value : map_capital.values()){
            System.out.println(value);
        }
        for( Map.Entry<String, String> entry : map_capital.entrySet()){
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
        for(String key : map_capital.keySet()){
            System.out.println(key + " --> " + map_capital.get(key));
        }

    }
}
