import java.util.*;

public class Sorted {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("kylix");
        list.add("samuel");
        list.add("dewa");
        list.add("abizard");
        list.add("rayhan");

        //Reverse
        Collections.reverse(list);
        System.out.println(list);

        //Copy
        List<String> copiedList = Arrays.asList(new String[5]);
        Collections.copy(copiedList, list);
        System.out.println(copiedList);

        //Max
        System.out.println("Max: " + Collections.max(list));

        //Min
        System.out.println("Min: " + Collections.min(list));

        //Sorted Ascending
        list.sort(Comparator.naturalOrder());
        Collections.sort(list);
        System.out.println(list);

        //Sorted Descending
        list.sort(Comparator.reverseOrder());
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        //Fill
        Collections.fill(list, "hello");
        System.out.println(list);

    }
}
