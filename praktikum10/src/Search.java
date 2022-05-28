import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Search {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("kylix");
        list.add("samuel");
        list.add("dewa");
        list.add("abizard");
        list.add("rayhan");

        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        int result = Collections.binarySearch(list, "samuel");
        System.out.println("samuel is located on index " + result);
    }
}
