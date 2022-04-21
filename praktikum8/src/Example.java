import java.util.*;

public class Example {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet();

        stringSet.add("kylix");
        stringSet.add("samuel");
        stringSet.add("dewa");
        stringSet.add("abizard");
        stringSet.add("rayhan");
        stringSet.add("samuel");
        stringSet.add("kylix");

        System.out.println(Arrays.toString(stringSet.toArray()));

        List<String> list = new ArrayList<>();
        list.add("kylix");
        list.add("samuel");
        list.add("dewa");
        list.add("abizard");
        list.add("rayhan");
        list.add("samuel");
        list.add("kylix");

        System.out.println(Arrays.toString(list.toArray()));

        Map<String, String> integerMap = new HashMap<>();
        integerMap.put("205150201111038", "Kylix Eza S");
        integerMap.put("205150200111047", "Samuel Fernando");
        integerMap.put("205150201111036", "Samuel Fernando");

        System.out.println(integerMap.get("Kylix Eza S"));
    }
}
