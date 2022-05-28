import java.time.Duration;
import java.time.Instant;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Testing {

    public static void main(String[] args) {

        Instant start = Instant.now();

        String myName = "";
        for (int i = 0; i <= 100000; i++) {
            String call = "Hello my name is" + "Kylix Eza Saputra";
            myName = myName + call;
        }

        StringBuffer stringBuffer = new StringBuffer();
        /*for (int i = 0; i <= 150000; i++) {
            stringBuffer.append("Hello my name is");
            stringBuffer.append("Kylix Eza Saputra");
        }*/

        StringBuilder stringBuilder = new StringBuilder();
        /*for (int i = 0; i <= 150000; i++) {
            stringBuilder.append("Hello my name is");
            stringBuilder.append("Kylix Eza Saputra");
        }*/

        StringJoiner stringJoiner = new StringJoiner(",", "|", "?");
        stringJoiner.add("Kylix");
        stringJoiner.add("Eza");
        stringJoiner.add("Saputra");
        System.out.println(stringJoiner);


        StringTokenizer stringTokenizer = new StringTokenizer("Kylix,Eza,Saputra");
        //printTokens(stringTokenizer);

        Instant end = Instant.now();
        System.out.println(Duration.between(start, end));
    }

    /*private static void printTokens(StringTokenizer st) {
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }*/


}
