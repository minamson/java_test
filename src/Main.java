import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        listMapToListString();
    }

    private static void listMapToListString(){
        List<Map<String,Object>> mapList = new ArrayList<>();

        Map<String, Object> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 1);
        map1.put("c", 1);

        mapList.add(map1);

        Map<String, Object> map2 = new HashMap<>();
        map2.put("a", "a1");
        map2.put("b", "b1");
        map2.put("c", "c1");

        mapList.add(map2);

        System.out.println(mapList.toString());

        System.out.println("size =" + mapList.size());

        List<String> data = new ArrayList<>();
        for (Map<String, Object> map : mapList) {
            data.add(map.values().toString());
        }

        System.out.println(data.get(0).toString());
        System.out.println(data.get(1).toString());
    }

}



