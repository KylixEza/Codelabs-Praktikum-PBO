import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Guidance {
    public static void main(String[] args) {
        new KHS();
    }
}

class KHS {

    private Map<MataKuliah, Integer> unsortedKHS = new LinkedHashMap<>();
    private Map<MataKuliah, Integer> sortedKHS = new LinkedHashMap<>();

    public KHS() {
        var path = Paths.get("praktikum12/src/khs.txt");
        var file = path.toFile();

        if (file.exists() && file.canRead()) {
            List<String> text = null;

            try {
                text = Files.readAllLines(path);
                for(String line: text) {
                    StringTokenizer tokenizer = new StringTokenizer(line, ",");
                    String kodeMataKuliah = tokenizer.nextToken();
                    String namaMataKuliah = tokenizer.nextToken();
                    Integer nilaiMataKuliah = Integer.valueOf(tokenizer.nextToken());

                    System.out.println(kodeMataKuliah + " " + namaMataKuliah + " " + nilaiMataKuliah);

                    MataKuliah mataKuliah = new MataKuliah(kodeMataKuliah, namaMataKuliah);
                    unsortedKHS.put(mataKuliah, nilaiMataKuliah);
                }
            } catch (IOException e) {
                System.err.println("Gagal membaca file");
            }

            for (var line : text) {
                System.out.println(line);
            }
        } else {
            System.out.println("File tidak ada atau tidak bisa dibaca");
        }
    }
}

class MataKuliah {
    String kodeMataKuliah;
    String namaMataKuliah;

    public MataKuliah(String kodeMataKuliah, String namaMataKuliah) {
        this.kodeMataKuliah = kodeMataKuliah;
        this.namaMataKuliah = namaMataKuliah;
    }
}
