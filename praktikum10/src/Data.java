import java.util.LinkedHashMap;
import java.util.Map;

public class Data {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        Map<String, Integer> sortedMap = new LinkedHashMap<>();

        map.put("MATKUL111", 12);
        map.put("MATKUL333", 98);
        map.put("MATKUL222", 56);
        map.put("MATKUL444", 5);

        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

        System.out.println(sortedMap);
    }
}
