import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class SampleKHS {
    public static void main(String[] args) {
        Map<String, Integer> unsortedMap = new LinkedHashMap<>();
        Map<String, Integer> sortedMap = new LinkedHashMap<>();

        unsortedMap.put("MATKUL111", 82);
        unsortedMap.put("MATKUL222", 78);
        unsortedMap.put("MATKUL333", 97);
        unsortedMap.put("MATKUL444", 65);
        unsortedMap.put("MATKUL555", 50);

        unsortedMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.naturalOrder()))
                .forEachOrdered(result -> sortedMap.put(result.getKey(), result.getValue()));

        System.out.println(sortedMap);
    }
}
